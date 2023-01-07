package com.teicm.kerkinibackend.services.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaPressThreats;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXPressThreats;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaPressThreatsRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnXPressThreatsRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnXPressThreatsSearchRepository;
import com.teicm.kerkinibackend.v1.mappers.thhlastika.DeigmaThhlastikwnXPressThreatsMapperImpl;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXPressThreatDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXPressThreatsAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXPressThreatsSearchDTO;
import org.apache.poi.ss.usermodel.DataFormatter;
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
import java.util.*;

@Service
public class DeigmaThhlastikwnXPressThreatsServiceImpl implements DeigmaThhlastikwnXPressThreatsService{

    @Autowired
    private DeigmaThhlastikwnXPressThreatsRepository deigmaThhlastikwnXPressThreatsRepository;

    @Autowired
    private DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    @Autowired
    private CtThhlastikaPressThreatsRepository ctThhlastikaPressThreatsRepository;

    @Autowired
    DeigmaThhlastikwnXPressThreatsSearchRepository deigmaThhlastikwnXPressThreatsSearchRepository;

    private DeigmaThhlastikwnXPressThreatsMapperImpl deigmaThhlastikwnXPressThreatsMapper = new DeigmaThhlastikwnXPressThreatsMapperImpl();

    // For Mockito testing
    public void setDeigmaThhlastikwnXPressThreatsRepository(DeigmaThhlastikwnXPressThreatsRepository deigmaThhlastikwnXPressThreatsRepository) {
        this.deigmaThhlastikwnXPressThreatsRepository = deigmaThhlastikwnXPressThreatsRepository;
    }

    // For Mockito testing
    public void setDeigmaThhlastikwnXPressThreatsSearchRepository(DeigmaThhlastikwnXPressThreatsSearchRepository deigmaThhlastikwnXPressThreatsSearchRepository) {
        this.deigmaThhlastikwnXPressThreatsSearchRepository = deigmaThhlastikwnXPressThreatsSearchRepository;
    }

    // For Mockito testing
    public void setDeigmaThhlastikwnRepository(DeigmaThhlastikwnRepository deigmaThhlastikwnRepository) {
        this.deigmaThhlastikwnRepository = deigmaThhlastikwnRepository;
    }

    // For Mockito testing
    public void setCtThhlastikaPressThreatsRepository(CtThhlastikaPressThreatsRepository ctThhlastikaPressThreatsRepository) {
        this.ctThhlastikaPressThreatsRepository = ctThhlastikaPressThreatsRepository;
    }

    // For Mockito testing
    public void setDeigmaThhlastikwnXPressThreatsMapper(DeigmaThhlastikwnXPressThreatsMapperImpl deigmaThhlastikwnXPressThreatsMapper) {
        this.deigmaThhlastikwnXPressThreatsMapper = deigmaThhlastikwnXPressThreatsMapper;
    }

    @Override
    public DeigmaThhlastikwnXPressThreats getById(Long id) {
        try {
            Optional<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsOptional = deigmaThhlastikwnXPressThreatsRepository
                    .findById(id);

            if (deigmaThhlastikwnXPressThreatsOptional.isPresent()){
                return deigmaThhlastikwnXPressThreatsOptional.get();
            } else {
                return null;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Set<DeigmaThhlastikwnXPressThreatDTO> getDeigmaThhlastikwnXPressThreatsByDeigmaThhlastikwnIs(Long id) {
        try {
            // Finding the needed DeigmaThhlastikwn through the given Id
            Optional<DeigmaThhlastikwn> optionalDeigmaThhlastikwn = deigmaThhlastikwnRepository.findById(id);

            // Initializing the Set<DTOs>
            Set<DeigmaThhlastikwnXPressThreatDTO> deigmaThhlastikwnXPressThreatDTOS = new HashSet<>();

            // Asking for the desired data and mapping them into DTOs (for the 2 extra fields)
            if (optionalDeigmaThhlastikwn.isPresent()){
                for (DeigmaThhlastikwnXPressThreats XPressThreat:
                        deigmaThhlastikwnXPressThreatsRepository.findDeigmaThhlastikwnXPressThreatsByDeigmaThhlastikwnIs(optionalDeigmaThhlastikwn.get())) {

                    deigmaThhlastikwnXPressThreatDTOS.add(deigmaThhlastikwnXPressThreatsMapper.deigmaThhlastikwnXPressThreatstToDeigmaThhlastikwnXPressThreatDTO(XPressThreat));
                }
            }

            return deigmaThhlastikwnXPressThreatDTOS;
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public DeigmaThhlastikwnXPressThreatDTO addDeigmaThhlastikwnXPressThreats(DeigmaThhlastikwnXPressThreatDTO deigmaThhlastikwnXPressThreatDTO) {
        try {
            DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreats = deigmaThhlastikwnXPressThreatsMapper
                    .deigmaThhlastikwnXPressThreatsDTOtToDeigmaThhlastikwnXPressThreats(deigmaThhlastikwnXPressThreatDTO);

            Optional<DeigmaThhlastikwn> optionalDeigmaThhlastikwn = deigmaThhlastikwnRepository
                    .findById(deigmaThhlastikwnXPressThreatDTO.getDeigmaThhlastikwnId());

            // If Ct exists already
            if (deigmaThhlastikwnXPressThreatDTO.getCtActCode() != null){
                CtThhlastikaPressThreats ctThhlastikaPressThreats = ctThhlastikaPressThreatsRepository
                        .findByActCodeEquals(deigmaThhlastikwnXPressThreatDTO.getCtActCode());

                if (ctThhlastikaPressThreats == null){
                    throw new RuntimeException("There was no ct Press Threat found with actCode of " + deigmaThhlastikwnXPressThreatDTO.getCtActCode());
                } else {
                    // Updating the CtThhlastikaPressThreats in the db along with saving the new DeigmaThhlastikwnXPressThreats automatically through hibernate.
                    ctThhlastikaPressThreats.addXPressThreat(deigmaThhlastikwnXPressThreats);
                }
            }

            // Updating the DeigmaThhlastikwn in the db
            if (optionalDeigmaThhlastikwn.isPresent()){
                optionalDeigmaThhlastikwn.get().addPressThreat(deigmaThhlastikwnXPressThreats);
            } else {
                throw new RuntimeException("There was no deigmaThhlastikwn found with id of " + deigmaThhlastikwnXPressThreatDTO.getDeigmaThhlastikwnId());
            }

            return deigmaThhlastikwnXPressThreatsMapper.deigmaThhlastikwnXPressThreatstToDeigmaThhlastikwnXPressThreatDTO(
                    deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats));
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean addDeigmaThhlastikwnXPressThreatsFromExcel(MultipartFile file) throws IOException {
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
                if (row.getCell(0).getStringCellValue().equals("Δείγμα Θηλαστικών Id")
                        &&row.getCell(1).getStringCellValue().equals("Ct Πίεση")
                        &&row.getCell(2).getStringCellValue().equals("Κωδικός Είδους")
                        &&row.getCell(3).getStringCellValue().equals("Τύπος Πίεσης")
                        &&row.getCell(4).getStringCellValue().equals("Σημασία")) {

                    // Initializing - We are using the List to first parse through all the Cells and then start
                    // saving to the db (in case a Row would through and Exception later on, this
                    // way we are not saving any of the Rows avoiding problems)
                    List<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsList = new ArrayList<>();

                    // Initializing
                    DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreats;

                    // Helper Data formatter for converting from Numerics to Strings
                    DataFormatter dataFormatter = new DataFormatter();

                    // By-passing the headers
                    for (int i = 1; i < sheet.getPhysicalNumberOfRows() ; i++){
                        // Getting the row
                        row = sheet.getRow(i);

                        deigmaThhlastikwnXPressThreats = new DeigmaThhlastikwnXPressThreats();

                        deigmaThhlastikwnXPressThreats.setKwdikosEidous((row.getCell(2).getStringCellValue()));
                        deigmaThhlastikwnXPressThreats.setPressThreat((row.getCell(3).getStringCellValue()));
                        deigmaThhlastikwnXPressThreats.setImportance((row.getCell(4).getStringCellValue()));

                        // Formatting the cell(0) do get the id of DeigmaThhlastikwn properly to find it in the db
                        String formatedDeigmaIdCell = dataFormatter.formatCellValue(row.getCell(0));
                        Optional<DeigmaThhlastikwn> optionalDeigmaThhlastikwn = deigmaThhlastikwnRepository.findById(Long.parseLong(formatedDeigmaIdCell));

                        // If DeigmaThhlastikwn exists
                        if (optionalDeigmaThhlastikwn.isPresent()){
                            optionalDeigmaThhlastikwn.get().addPressThreat(deigmaThhlastikwnXPressThreats);
                        } else {
                            throw new IllegalArgumentException("Deigma Thhlastikwn with Id of : " + (int) row.getCell(0).getNumericCellValue() + " does not exist.");
                        }

                        // If Ct with such actCode exists
                        if (!row.getCell(1).getStringCellValue().isEmpty()){
                            CtThhlastikaPressThreats ctThhlastikaPressThreats = ctThhlastikaPressThreatsRepository.findByActCodeEquals(row.getCell(1).getStringCellValue());

                            // In case it was specified but was wrong
                            if (ctThhlastikaPressThreats == null){
                                throw new RuntimeException("The specified Ct " + row.getCell(1).getStringCellValue() + " was not found in the db");
                            }

                            ctThhlastikaPressThreats.addXPressThreat(deigmaThhlastikwnXPressThreats);
                        } else {
                            throw new RuntimeException("The Ct Press Threats was found empty");
                        }

                        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreats);
                    }

                    // Saving the generated new data to the db
                    for (DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsToSave : deigmaThhlastikwnXPressThreatsList){
                        deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreatsToSave);
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
    public boolean patchDeigmaThhlastikwnXPressThreats(Long id, DeigmaThhlastikwnXPressThreatDTO deigmaThhlastikwnXPressThreatDTO) {
        try {
            Optional<DeigmaThhlastikwnXPressThreats> optionalDeigmaThhlastikwnXPressThreats = deigmaThhlastikwnXPressThreatsRepository.findById(id);

            if (optionalDeigmaThhlastikwnXPressThreats.isPresent()){
                if (deigmaThhlastikwnXPressThreatDTO.getImportance() != null){
                    optionalDeigmaThhlastikwnXPressThreats.get().setImportance(deigmaThhlastikwnXPressThreatDTO.getImportance());
                }
                if (deigmaThhlastikwnXPressThreatDTO.getKwdikosEidous() != null){
                    optionalDeigmaThhlastikwnXPressThreats.get().setKwdikosEidous(deigmaThhlastikwnXPressThreatDTO.getKwdikosEidous());
                }
                if (deigmaThhlastikwnXPressThreatDTO.getPressThreat() != null){
                    optionalDeigmaThhlastikwnXPressThreats.get().setPressThreat(deigmaThhlastikwnXPressThreatDTO.getPressThreat());
                }
                // If DeigmaThhlastikwnId is not null and we need to change it (remove old from set add new to other DeigmaThhlastikwn set)
                if (deigmaThhlastikwnXPressThreatDTO.getDeigmaThhlastikwnId() != null){

                    // If new exists : Finding the DeigmaThhlastikwn through the given Id to which Set we will add now
                    Optional<DeigmaThhlastikwn> newOptionalDeigmaThhlastikwn = deigmaThhlastikwnRepository.findById(deigmaThhlastikwnXPressThreatDTO.getDeigmaThhlastikwnId());

                    // Adding onto the set and setting it on the XPressThreats side
                    if (newOptionalDeigmaThhlastikwn.isPresent()){
                        // Find the old DeigmaThhlastikwn to remove from it
                        Optional<DeigmaThhlastikwn> optionalDeigmaThhlastikwn = deigmaThhlastikwnRepository.findById(optionalDeigmaThhlastikwnXPressThreats.get().getDeigmaThhlastikwn().getId());

                        if (optionalDeigmaThhlastikwn.isPresent()){
                            optionalDeigmaThhlastikwn.get().removeXPressThreats(optionalDeigmaThhlastikwnXPressThreats.get());
                        } else {
                            throw new RuntimeException("The DeigmaThhlastikwn with id of " + optionalDeigmaThhlastikwnXPressThreats.get().getDeigmaThhlastikwn().getId() + " was not found");
                        }
                        // Adding to the new after removing from the older one
                        newOptionalDeigmaThhlastikwn.get().addPressThreat(optionalDeigmaThhlastikwnXPressThreats.get());
                    } else {
                        throw new RuntimeException("The DeigmaThhlastikwn with id of " + deigmaThhlastikwnXPressThreatDTO.getDeigmaThhlastikwnId() + " was not found");
                    }
                }

                // If Ct is not null and we need to change it (remove old from set add new to other Ct set)
                if (deigmaThhlastikwnXPressThreatDTO.getCtActCode() != null){

                    // If new exists : Finding the Ct through the given actCode to which Set we will add now
                    CtThhlastikaPressThreats newOptionalCtThhlastikaPressThreats = ctThhlastikaPressThreatsRepository.findByActCodeEquals(deigmaThhlastikwnXPressThreatDTO.getCtActCode());

                    // Adding onto the set and setting it on the XPressThreats side
                    if (newOptionalCtThhlastikaPressThreats != null){
                        // Find the old Ct to remove from it
                        Optional<CtThhlastikaPressThreats> optionalCtThhlastikaPressThreats = ctThhlastikaPressThreatsRepository.findById(optionalDeigmaThhlastikwnXPressThreats.get().getCtThhlastikaPressThreats().getId());

                        if (optionalCtThhlastikaPressThreats.isPresent()){
                            optionalCtThhlastikaPressThreats.get().removeXPressThreats(optionalDeigmaThhlastikwnXPressThreats.get());
                        } else {
                            throw new RuntimeException("The CtPressThreats with actCode of " + optionalDeigmaThhlastikwnXPressThreats.get().getCtThhlastikaPressThreats().getActCode() + " was not found");
                        }
                        // Adding to the new after removing from the older one
                        newOptionalCtThhlastikaPressThreats.addXPressThreat(optionalDeigmaThhlastikwnXPressThreats.get());
                    } else {
                        throw new RuntimeException("The CtPressThreats with actCode of " + deigmaThhlastikwnXPressThreatDTO.getCtActCode() + " was not found");
                    }
                }
                // Saving-Patching to the db
                deigmaThhlastikwnXPressThreatsRepository.save(optionalDeigmaThhlastikwnXPressThreats.get());
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean deleteDeigmaThhlastikwnXPressThreats(Long id) {
        try {
            Optional<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreats = deigmaThhlastikwnXPressThreatsRepository.findById(id);

            if (deigmaThhlastikwnXPressThreats.isPresent()){
                // Deleting the requested DeigmaThhlastikwnXEidh
                deigmaThhlastikwnXPressThreatsRepository.delete(deigmaThhlastikwnXPressThreats.get());

                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Page<DeigmaThhlastikwnXPressThreats> getAllByPaging(Integer page) {
        try {
            Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "id");
            return deigmaThhlastikwnXPressThreatsRepository.findAll(pageable);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public DeigmaThhlastikwnXPressThreatsSearchDTO searchDeigmaThhlastikwnXPressThreats(List<SearchCriteria> searchCriteriaList, int size, int page, String sort) {
        try {
            return deigmaThhlastikwnXPressThreatsSearchRepository.searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, size, page, sort);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<DeigmaThhlastikwnXPressThreats> downloadDeigmaThhlastikwnXPressThreats(List<SearchCriteria> searchCriteriaList, String sort) {
        try {
            return deigmaThhlastikwnXPressThreatsSearchRepository.downloadDeigmaThhlastikwnXPressThreats(searchCriteriaList, sort);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public DeigmaThhlastikwnXPressThreatsAutocompletesDTO getDeigmaThhlastikwnXPressThreatsAutocompletes() {
        try {
            ArrayList<BigInteger> deigmaThhlastikwnIdList = deigmaThhlastikwnXPressThreatsRepository.findDistinctByDeigmaThhlastikwnIdOrderByDeigmaThhlastikwnId();
            ArrayList<String> kwdikosEidousList = deigmaThhlastikwnXPressThreatsRepository.findDistinctByKwdikosEidousOrderByKwdikosEidous();
            ArrayList<String> pressThreatList = deigmaThhlastikwnXPressThreatsRepository.findDistinctByPressThreatOrderByPressThreat();
            ArrayList<String> importanceList = deigmaThhlastikwnXPressThreatsRepository.findDistinctByImportanceOrderByImportance();
            // For ctActCodes we are getting all the distinct actCodes generally
            // not just those that have deigmaX saved.
            ArrayList<String> ctActCodeList = ctThhlastikaPressThreatsRepository.findDistinctByActCodeOrderByActCode();

            return deigmaThhlastikwnXPressThreatsMapper.mapListsToDeigmaThhlastikwnXPressThreatsAutocompletesDTO(deigmaThhlastikwnIdList, kwdikosEidousList, pressThreatList, importanceList, ctActCodeList);
        }catch (Exception e){
            throw e;
        }
    }
}
