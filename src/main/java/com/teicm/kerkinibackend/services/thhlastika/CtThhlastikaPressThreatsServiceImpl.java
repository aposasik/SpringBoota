package com.teicm.kerkinibackend.services.thhlastika;

import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaPressThreats;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaPressThreatsRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaPressThreatsSearchRepository;
import com.teicm.kerkinibackend.v1.mappers.thhlastika.CtThhlastikaPressThreatsMapperImpl;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaPressThreatDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaPressThreatsSearchDTO;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CtThhlastikaPressThreatsServiceImpl implements CtThhlastikaPressThreatsService {

    @Autowired
    private CtThhlastikaPressThreatsRepository ctThhlastikaPressThreatsRepository;

    @Autowired
    private CtThhlastikaPressThreatsSearchRepository ctThhlastikaPressThreatsSearchRepository;

    private CtThhlastikaPressThreatsMapperImpl ctThhlastikaPressThreatsMapper = new CtThhlastikaPressThreatsMapperImpl();

    // For Mockito testing
    public void setCtThhlastikaPressThreatsRepository(CtThhlastikaPressThreatsRepository ctThhlastikaPressThreatsRepository) {
        this.ctThhlastikaPressThreatsRepository = ctThhlastikaPressThreatsRepository;
    }

    // For Mockito testing
    public void setCtThhlastikaPressThreatsSearchRepository(CtThhlastikaPressThreatsSearchRepository ctThhlastikaPressThreatsSearchRepository) {
        this.ctThhlastikaPressThreatsSearchRepository = ctThhlastikaPressThreatsSearchRepository;
    }

    // For Mockito testing
    public void setCtThhlastikaPressThreatsMapper(CtThhlastikaPressThreatsMapperImpl ctThhlastikaPressThreatsMapper) {
        this.ctThhlastikaPressThreatsMapper = ctThhlastikaPressThreatsMapper;
    }

    @Override
    public CtThhlastikaPressThreats findById(Long id) {
        Optional<CtThhlastikaPressThreats> optional = ctThhlastikaPressThreatsRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public CtThhlastikaPressThreats findByActCodeEquals(String actCode) {
        return ctThhlastikaPressThreatsRepository.findByActCodeEquals(actCode);
    }

    @Override
    public CtThhlastikaPressThreats addPressThreat(CtThhlastikaPressThreatDTO ctThhlastikaPressThreatDTO) {
        return ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreatsMapper.CtThhlastikaPressThreatsDTOToCtThhlastikaPressThreats(ctThhlastikaPressThreatDTO));
    }

    @Override
    public boolean addPressThreatsFromExcel(MultipartFile file) throws IOException {
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
                if (row.getCell(0).getStringCellValue().equals("Κωδικός Act Code")
                        && row.getCell(1).getStringCellValue().equals("Περιγραφή")
                        && row.getCell(2).getStringCellValue().equals("Παρατηρήσεις")) {
                    // Initializing - We are using the List to first parse through all the Cells and then start
                    // saving to the db (in case a Row would through and Exception later on, this
                    // way we are not saving any of the Rows avoiding problems)
                    List<CtThhlastikaPressThreats> ctThhlastikaPressThreatsList = new ArrayList<>();

                    // Initializing
                    CtThhlastikaPressThreats ctThhlastikaPressThreats;

                    // By-passing the headers
                    for (int i = 1; i < sheet.getPhysicalNumberOfRows() ; i++){
                        // Getting the row
                        row = sheet.getRow(i);

                        ctThhlastikaPressThreats = new CtThhlastikaPressThreats();
                        ctThhlastikaPressThreats.setActCode((row.getCell(0).getStringCellValue()));
                        ctThhlastikaPressThreats.setDescriptionEn((row.getCell(1).getStringCellValue()));
                        ctThhlastikaPressThreats.setRemarks((row.getCell(2).getStringCellValue()));

                        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreats);
                    }

                    // Saving the generated new data to the db
                    for (CtThhlastikaPressThreats ctThhlastikaPressThreatsToSave : ctThhlastikaPressThreatsList){
                        ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreatsToSave);
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
    public boolean patchPressThreat(Long id, CtThhlastikaPressThreatDTO ctThhlastikaPressThreatDTO) {
        try {
            Optional<CtThhlastikaPressThreats> optionalCtThhlastikaPressThreats = ctThhlastikaPressThreatsRepository.findById(id);

            if (optionalCtThhlastikaPressThreats.isPresent()){
                if (ctThhlastikaPressThreatDTO.getActCode() != null){
                    optionalCtThhlastikaPressThreats.get().setActCode(ctThhlastikaPressThreatDTO.getActCode());
                }
                if (ctThhlastikaPressThreatDTO.getDescriptionEn() != null){
                    optionalCtThhlastikaPressThreats.get().setDescriptionEn(ctThhlastikaPressThreatDTO.getDescriptionEn());
                }
                if (ctThhlastikaPressThreatDTO.getRemarks() != null){
                    optionalCtThhlastikaPressThreats.get().setRemarks(ctThhlastikaPressThreatDTO.getRemarks());
                }

                ctThhlastikaPressThreatsRepository.save(optionalCtThhlastikaPressThreats.get());

                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean deletePressThreat(Long id) {
        try {
            Optional<CtThhlastikaPressThreats> optionalCtThhlastikaPressThreats = ctThhlastikaPressThreatsRepository.findById(id);

            if (optionalCtThhlastikaPressThreats.isPresent()){
                ctThhlastikaPressThreatsRepository.delete(optionalCtThhlastikaPressThreats.get());

                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<CtThhlastikaPressThreats> findAll() {
        return ctThhlastikaPressThreatsRepository.findAll();
    }

    @Override
    public ArrayList<String> getAllActCodes() {
        return ctThhlastikaPressThreatsRepository.findDistinctByActCodeOrderByActCode();
    }

    @Override
    public Page<CtThhlastikaPressThreats> getAllByPaging(Integer page)
    {
        try
        {
            Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "id");
            return ctThhlastikaPressThreatsRepository.findAll(pageable);
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    @Override
    public CtThhlastikaPressThreatsSearchDTO searchCtThhlastikaPressThreats(List<SearchCriteria> searchCriteriaList, int size, int page, String sort) {
        try {
            return ctThhlastikaPressThreatsSearchRepository.searchCtThhlastikaPressThreats(searchCriteriaList, size, page, sort);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<CtThhlastikaPressThreats> downloadCtThhlastikaPressThreats(List<SearchCriteria> searchCriteriaList, String sort) {
        try {
            return ctThhlastikaPressThreatsSearchRepository.downloadCtThhlastikaPressThreats(searchCriteriaList, sort);
        }catch (Exception e){
            throw e;
        }    }
}
