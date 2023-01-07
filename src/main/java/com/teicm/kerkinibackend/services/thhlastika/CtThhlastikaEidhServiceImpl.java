package com.teicm.kerkinibackend.services.thhlastika;

import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaEidh;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaEidhRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaEidhSearchRepository;
import com.teicm.kerkinibackend.v1.mappers.thhlastika.CtThhlastikaEidhMapperImpl;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaEidhSearchDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaEidosDTO;
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
import java.util.*;

@Service
public class CtThhlastikaEidhServiceImpl implements CtThhlastikaEidhService {

    @Autowired
    CtThhlastikaEidhRepository ctThhlastikaEidhRepository;

    @Autowired
    CtThhlastikaEidhSearchRepository ctThhlastikaEidhSearchRepository;

    private CtThhlastikaEidhMapperImpl ctThhlastikaEidhMapper = new CtThhlastikaEidhMapperImpl();

    // For Mockito testing
    public void setCtThhlastikaEidhRepository(CtThhlastikaEidhRepository ctThhlastikaEidhRepository) {
        this.ctThhlastikaEidhRepository = ctThhlastikaEidhRepository;
    }

    // For Mockito testing
    public void setCtThhlastikaEidhSearchRepository(CtThhlastikaEidhSearchRepository ctThhlastikaEidhSearchRepository) {
        this.ctThhlastikaEidhSearchRepository = ctThhlastikaEidhSearchRepository;
    }

    // For Mockito testing
    public void setCtThhlastikaEidhMapper(CtThhlastikaEidhMapperImpl ctThhlastikaEidhMapper) {
        this.ctThhlastikaEidhMapper = ctThhlastikaEidhMapper;
    }

    @Override
    public CtThhlastikaEidh addEidos(CtThhlastikaEidosDTO ctThhlastikaEidosDTO) {
        return ctThhlastikaEidhRepository.save(ctThhlastikaEidhMapper.CtThhlastikaEidhDTOToCtThhlastikaEidh(ctThhlastikaEidosDTO));
    }

    @Override
    public boolean addEidhFromExcel(MultipartFile file) throws IOException {
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
                if (row.getCell(0).getStringCellValue().equals("Είδος")) {

                    // Initializing - We are using the List to first parse through all the Cells and then start
                    // saving to the db (in case a Row would through and Exception later on, this
                    // way we are not saving any of the Rows avoiding problems)
                    List<CtThhlastikaEidh> ctThhlastikaEidhList = new ArrayList<>();

                    // Initializing
                    CtThhlastikaEidh ctThhlastikaEidh;

                    // By-passing the headers
                    for (int i = 1; i < sheet.getPhysicalNumberOfRows() ; i++){
                        // Getting the row
                        row = sheet.getRow(i);

                        ctThhlastikaEidh = new CtThhlastikaEidh();
                        ctThhlastikaEidh.setEidos((row.getCell(0).getStringCellValue()));

                        ctThhlastikaEidhList.add(ctThhlastikaEidh);
                    }

                    // Saving the generated new data to the db
                    for (CtThhlastikaEidh ctThhlastikaEidhToSave : ctThhlastikaEidhList){
                        ctThhlastikaEidhRepository.save(ctThhlastikaEidhToSave);
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
    public CtThhlastikaEidh findById(Long id) {
        Optional<CtThhlastikaEidh> optional = ctThhlastikaEidhRepository.findById(id);
        return optional.orElse(null);
    }

    // 11/21/2018 Not needed as a solo Get request (needed as a helper though!)
    @Override
    public CtThhlastikaEidh findByEidos(String eidos) {
        return ctThhlastikaEidhRepository.findByEidosEquals(eidos);
    }

    @Override
    public boolean patchEidos(Long id, CtThhlastikaEidosDTO ctThhlastikaEidosDTO) {
        try {
            Optional<CtThhlastikaEidh> optionalCtThhlastikaEidh = ctThhlastikaEidhRepository.findById(id);

            if (optionalCtThhlastikaEidh.isPresent()){
                if (ctThhlastikaEidosDTO.getEidos() != null){
                    optionalCtThhlastikaEidh.get().setEidos(ctThhlastikaEidosDTO.getEidos());
                }

                ctThhlastikaEidhRepository.save(optionalCtThhlastikaEidh.get());

                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean deleteEidos(Long id) {
        try {
            Optional<CtThhlastikaEidh> optionalCtThhlastikaEidh = ctThhlastikaEidhRepository.findById(id);

            if (optionalCtThhlastikaEidh.isPresent()){
                ctThhlastikaEidhRepository.delete(optionalCtThhlastikaEidh.get());

                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public ArrayList<String> getAllEidh() {
        try {
            return ctThhlastikaEidhRepository.findDistinctByEidosOrderByEidos();
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Page<CtThhlastikaEidh> getAllByPaging(Integer page) {
        try {
            Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "id");
            return ctThhlastikaEidhRepository.findAll(pageable);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public CtThhlastikaEidhSearchDTO searchCtThhlastikaEidh(List<SearchCriteria> searchCriteriaList, int size, int page, String sort) {
        try {
            return ctThhlastikaEidhSearchRepository.searchCtThhlastikaEidh(searchCriteriaList, size, page, sort);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<CtThhlastikaEidh> downloadCtThhlastikaEidh(List<SearchCriteria> searchCriteriaList, String sort) {
        try {
            return ctThhlastikaEidhSearchRepository.downloadCtThhlastikaEidh(searchCriteriaList, sort);
        }catch (Exception e){
            throw e;
        }    }

}
