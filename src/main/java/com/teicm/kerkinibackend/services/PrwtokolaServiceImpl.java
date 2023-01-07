package com.teicm.kerkinibackend.services;

import com.teicm.kerkinibackend.domain.Prwtokola;
import com.teicm.kerkinibackend.repositories.PrwtokolaRepository;
import com.teicm.kerkinibackend.v1.mappers.PrwtokolaMapperImpl;
import com.teicm.kerkinibackend.v1.models.PrwtokolaDTO;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PrwtokolaServiceImpl implements PrwtokolaService{

    @Autowired
    PrwtokolaRepository prwtokolaRepository;

    PrwtokolaMapperImpl prwtokolaMapper = new PrwtokolaMapperImpl();

    // For Mockito Testing
    public void setPrwtokolaRepository(PrwtokolaRepository prwtokolaRepository) {
        this.prwtokolaRepository = prwtokolaRepository;
    }

    // For Mockito Testing
    public void setPrwtokolaMapper(PrwtokolaMapperImpl prwtokolaMapper) {
        this.prwtokolaMapper = prwtokolaMapper;
    }

    @Override
    public Prwtokola getById(Long id) {
        try {
            Optional<Prwtokola> prwtokolaOptional = prwtokolaRepository.findById(id);

            if (prwtokolaOptional.isPresent()){
                return prwtokolaOptional.get();
            } else {
                return null;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Prwtokola addPrwtokola(PrwtokolaDTO prwtokolaDTO) {
        try {
            return prwtokolaRepository.save(prwtokolaMapper.prwtokolaDTOToPrwtokola(prwtokolaDTO));
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean addPrwtokolaFromExcel(MultipartFile file) throws IOException {
        try {
            // Checking for the type of the MultipartFile sent
            if ((!Objects.equals(file.getContentType(), "application/vnd.ms-excel") ||
                    (!Objects.equals(file.getContentType(), "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")))){

                // Creating a stream of the file
                InputStream stream = file.getInputStream();

                // Creating a workbook of the stream
                XSSFWorkbook workbook = new XSSFWorkbook(stream);

                // Getting the first sheet of the workbook
                XSSFSheet sheet = workbook.getSheetAt(0);

                // Checking if the headers are correct
                XSSFRow row = sheet.getRow(0);
                if (row.getCell(0).getStringCellValue().equals("Περιγραφή")
                        &&row.getCell(1).getStringCellValue().equals("Πίνακας Δεδομένων")
                        &&row.getCell(2).getStringCellValue().equals("Παράθυρο Δεδομένων")) {

                    // Initializing - We are using the List to first parse through all the Cells and then start
                    // saving to the db (in case a Row would through and Exception later on, this
                    // way we are not saving any of the Rows avoiding problems)
                    List<Prwtokola> prwtokolaList = new ArrayList<>();

                    // Initializing
                    Prwtokola prwtokola;

                    // By-passing the headers
                    for (int i = 1; i < sheet.getPhysicalNumberOfRows() ; i++){
                        // Getting the row
                        row = sheet.getRow(i);

                        prwtokola = new Prwtokola();
                        prwtokola.setPerigrafh((row.getCell(0).getStringCellValue()));
                        prwtokola.setPinakasDedomenwn((row.getCell(1).getStringCellValue()));
                        prwtokola.setParathuroDedomenwn((row.getCell(2).getStringCellValue()));

                        prwtokolaList.add(prwtokola);
                    }

                    // Saving the generated new data to the db
                    for (Prwtokola prwtokolaToSave : prwtokolaList){
                        prwtokolaRepository.save(prwtokolaToSave);
                    }

                    return true;
                } else {
                    return false;
                }
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean deletePrwtokola(Long id) {
        try {
            Optional<Prwtokola> optionalPrwtokola = prwtokolaRepository.findById(id);

            if (optionalPrwtokola.isPresent()){
                prwtokolaRepository.delete(optionalPrwtokola.get());

                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean patchPrwtokola(Long id, PrwtokolaDTO prwtokolaDTO) {
        try {
            Optional<Prwtokola> optionalPrwtokola = prwtokolaRepository.findById(id);

            if (optionalPrwtokola.isPresent()){
                if (prwtokolaDTO.getParathuroDedomenwn() != null){
                    optionalPrwtokola.get().setParathuroDedomenwn(prwtokolaDTO.getParathuroDedomenwn());
                }
                if (prwtokolaDTO.getPerigrafh() != null){
                    optionalPrwtokola.get().setPerigrafh(prwtokolaDTO.getPerigrafh());
                }
                if (prwtokolaDTO.getPinakasDedomenwn() != null){
                    optionalPrwtokola.get().setPinakasDedomenwn(prwtokolaDTO.getPinakasDedomenwn());
                }

                prwtokolaRepository.save(optionalPrwtokola.get());

                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public ArrayList<BigInteger> getDistinctPrwtokolaIds() {
        try {
            return prwtokolaRepository.findDistinctByPrwtokolaIdOrderByPrwtokolaId();
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Page<Prwtokola> getAllByPaging(Integer page) {
        try {
            Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "id");
            return prwtokolaRepository.findAll(pageable);
        }catch (Exception e){
            throw e;
        }
    }

}
