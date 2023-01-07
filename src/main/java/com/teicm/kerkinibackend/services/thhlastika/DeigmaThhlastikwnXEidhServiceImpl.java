package com.teicm.kerkinibackend.services.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaEidh;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXEidh;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaEidhRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnXEidhRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnXEidhSearchRepository;
import com.teicm.kerkinibackend.v1.mappers.thhlastika.DeigmaThhlastikwnXEidhMapperImpl;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXEidhAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXEidhDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXEidhSearchDTO;
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
public class DeigmaThhlastikwnXEidhServiceImpl implements DeigmaThhlastikwnXEidhService {

    @Autowired
    private DeigmaThhlastikwnXEidhRepository deigmaThhlastikwnXEidhRepository;

    @Autowired
    private DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    @Autowired
    private CtThhlastikaEidhRepository ctThhlastikaEidhRepository;

    @Autowired
    private DeigmaThhlastikwnXEidhSearchRepository deigmaThhlastikwnXEidhSearchRepository;

    private DeigmaThhlastikwnXEidhMapperImpl deigmaThhlastikwnXEidhMapper = new DeigmaThhlastikwnXEidhMapperImpl();

    // For Mockito testing
    public void setDeigmaThhlastikwnXEidhRepository(DeigmaThhlastikwnXEidhRepository deigmaThhlastikwnXEidhRepository) {
        this.deigmaThhlastikwnXEidhRepository = deigmaThhlastikwnXEidhRepository;
    }

    // For Mockito testing
    public void setDeigmaThhlastikwnXEidhSearchRepository(DeigmaThhlastikwnXEidhSearchRepository deigmaThhlastikwnXEidhSearchRepository) {
        this.deigmaThhlastikwnXEidhSearchRepository = deigmaThhlastikwnXEidhSearchRepository;
    }

    // For Mockito testing
    public void setDeigmaThhlastikwnRepository(DeigmaThhlastikwnRepository deigmaThhlastikwnRepository) {
        this.deigmaThhlastikwnRepository = deigmaThhlastikwnRepository;
    }

    // For Mockito testing
    public void setCtThhlastikaEidhRepository(CtThhlastikaEidhRepository ctThhlastikaEidhRepository) {
        this.ctThhlastikaEidhRepository = ctThhlastikaEidhRepository;
    }

    // For Mockito testing
    public void setDeigmaThhlastikwnXEidhMapper(DeigmaThhlastikwnXEidhMapperImpl deigmaThhlastikwnXEidhMapper) {
        this.deigmaThhlastikwnXEidhMapper = deigmaThhlastikwnXEidhMapper;
    }

    @Override
    public DeigmaThhlastikwnXEidh getById(Long id) {
        try {
            Optional<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidhOptional = deigmaThhlastikwnXEidhRepository
                    .findById(id);

            if (deigmaThhlastikwnXEidhOptional.isPresent()){
                return deigmaThhlastikwnXEidhOptional.get();
            } else {
                return null;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Set<DeigmaThhlastikwnXEidhDTO> getDeigmaThhlastikwnXEidhByDeigmaThhlastikwnIs(Long id) {
        try {
            // Finding the needed DeigmaThhlastikwn through the given Id
            Optional<DeigmaThhlastikwn> optionalDeigmaThhlastikwn = deigmaThhlastikwnRepository.findById(id);

            // Initializing the Set<DTOs>
            Set<DeigmaThhlastikwnXEidhDTO> deigmaThhlastikwnXEidhDTOS = new HashSet<>();

            // Asking for the desired data and mapping them into DTOs (for the 2 extra fields)
            if (optionalDeigmaThhlastikwn.isPresent()){
                for (DeigmaThhlastikwnXEidh XEidh:
                        deigmaThhlastikwnXEidhRepository.findDeigmaThhlastikwnXEidhByDeigmaThhlastikwnIs(optionalDeigmaThhlastikwn.get())) {

                    deigmaThhlastikwnXEidhDTOS.add(deigmaThhlastikwnXEidhMapper
                            .deigmaThhlastikwnXEidhToDeigmaThhlastikwnXEidhDTO(XEidh));
                }
            }

            return deigmaThhlastikwnXEidhDTOS;
        }catch (Exception e){
            throw e;
        }

    }

    @Override
    public DeigmaThhlastikwnXEidhDTO addDeigmaThhlastikwnXEidh(DeigmaThhlastikwnXEidhDTO deigmaThhlastikwnXEidhDTO) {
        try {
            // Generating the new XEidh
            DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh = deigmaThhlastikwnXEidhMapper
                    .deigmaThhlastikwnXEidhDTOToDeigmaThhlastikwnXEidh(deigmaThhlastikwnXEidhDTO);

            // Getting the DeigmaThhlastikwn by Id
            Optional<DeigmaThhlastikwn> optionalDeigmaThhlastikwn = deigmaThhlastikwnRepository
                    .findById(deigmaThhlastikwnXEidhDTO.getDeigmaThhlastikwnId());

            // Getting the Ct with the specified `eidos`
            if (deigmaThhlastikwnXEidhDTO.getCtEidos() != null){
                CtThhlastikaEidh ctThhlastikaEidh = ctThhlastikaEidhRepository.findByEidosEquals(deigmaThhlastikwnXEidhDTO.getCtEidos());

                if (ctThhlastikaEidh == null){
                    throw new RuntimeException("There was no Ct Eidos found with eidos of " + deigmaThhlastikwnXEidhDTO.getCtEidos());
                }
                // Updating (adding the new XEidh)
                ctThhlastikaEidh.addXEidos(deigmaThhlastikwnXEidh);
            }

            // Updating the DeigmaThhlastikwn with the new XEidh
            if (optionalDeigmaThhlastikwn.isPresent()){
                optionalDeigmaThhlastikwn.get().addXEidh(deigmaThhlastikwnXEidh);
            } else {
                throw new RuntimeException("There was no deigmaThhlastikwn found with id of " + deigmaThhlastikwnXEidhDTO.getDeigmaThhlastikwnId());
            }

            // Saving the new XEidh to the db with the connections, then the XEidh that returns we map it to a DTO (to add two fields) and return it.
            return deigmaThhlastikwnXEidhMapper.deigmaThhlastikwnXEidhToDeigmaThhlastikwnXEidhDTO(
                    deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh));
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean addDeigmaThhlastikwnXEidhFromExcel(MultipartFile file) throws IOException {
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
                        &&row.getCell(1).getStringCellValue().equals("Ct Είδος")
                        &&row.getCell(2).getStringCellValue().equals("Σχετική Αφθονία")
                        &&row.getCell(3).getStringCellValue().equals("Παρατηρήσεις")
                        &&row.getCell(4).getStringCellValue().equals("Ηλικία")
                        &&row.getCell(5).getStringCellValue().equals("Φύλο")
                        &&row.getCell(6).getStringCellValue().equals("Πλήθος")
                        &&row.getCell(7).getStringCellValue().equals("EokParII")
                        &&row.getCell(8).getStringCellValue().equals("EokParIV")
                        &&row.getCell(9).getStringCellValue().equals("EokParV")) {

                    // Initializing - We are using the List to first parse through all the Cells and then start
                    // saving to the db (in case a Row would through and Exception later on, this
                    // way we are not saving any of the Rows avoiding problems)
                    List<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidhList = new ArrayList<>();

                    // Initializing
                    DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh;

                    // Helper Data formatter for converting from Numerics to Strings
                    DataFormatter dataFormatter = new DataFormatter();

                    // By-passing the headers
                    for (int i = 1; i < sheet.getPhysicalNumberOfRows() ; i++){
                        // Getting the row
                        row = sheet.getRow(i);

                        deigmaThhlastikwnXEidh = new DeigmaThhlastikwnXEidh();

                        deigmaThhlastikwnXEidh.setSxetikhAfthonia((row.getCell(2).getStringCellValue()));
                        deigmaThhlastikwnXEidh.setParathrhseis((row.getCell(3).getStringCellValue()));
                        deigmaThhlastikwnXEidh.setHlikia((row.getCell(4).getStringCellValue()));
                        deigmaThhlastikwnXEidh.setFulo((row.getCell(5).getStringCellValue()));
                        deigmaThhlastikwnXEidh.setPlhthos((int) row.getCell(6).getNumericCellValue());
                        deigmaThhlastikwnXEidh.setEokParII((row.getCell(7).getBooleanCellValue()));
                        deigmaThhlastikwnXEidh.setEokParIV((row.getCell(8).getBooleanCellValue()));
                        deigmaThhlastikwnXEidh.setEokParV((row.getCell(9).getBooleanCellValue()));

                        // Formatting the cell(0) do get the id of DeigmaThhlastikwn properly to find it in the db
                        String formatedDeigmaIdCell = dataFormatter.formatCellValue(row.getCell(0));
                        Optional<DeigmaThhlastikwn> optionalDeigmaThhlastikwn = deigmaThhlastikwnRepository.findById(Long.parseLong(formatedDeigmaIdCell));


                        // If DeigmaThhlastikwn exists
                        if (optionalDeigmaThhlastikwn.isPresent()) {
                            optionalDeigmaThhlastikwn.get().addXEidh(deigmaThhlastikwnXEidh);
                        } else {
                            throw new IllegalArgumentException("Deigma Thhlastikwn with Id of : " + (int) row.getCell(0).getNumericCellValue() + " does not exist.");
                        }

                        CtThhlastikaEidh ctThhlastikaEidh;
                        // If Ct with such Eidos exists
                        if (!row.getCell(1).getStringCellValue().isEmpty()){
                            ctThhlastikaEidh = ctThhlastikaEidhRepository.findByEidosEquals(row.getCell(1).getStringCellValue());

                            // In case it was specified but was wrong
                            if (ctThhlastikaEidh == null){
                                throw new RuntimeException("The specified Ct " + row.getCell(1).getStringCellValue() + " was not found in the db");
                            }

                            ctThhlastikaEidh.addXEidos(deigmaThhlastikwnXEidh);
                        } else {
                            throw new RuntimeException("The Ct Eidos was found empty");
                        }

                        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidh);
                    }

                    // Saving the generated new data to the db
                    for (DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhToSave : deigmaThhlastikwnXEidhList){
                        deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidhToSave);
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
    public boolean patchDeigmaThhlastikwnXEidh(Long id, DeigmaThhlastikwnXEidhDTO deigmaThhlastikwnXEidhDTO) {
        try {
            Optional<DeigmaThhlastikwnXEidh> optionalDeigmaThhlastikwnXEidh = deigmaThhlastikwnXEidhRepository.findById(id);

            if (optionalDeigmaThhlastikwnXEidh.isPresent()){
                if (deigmaThhlastikwnXEidhDTO.getEokParII() != null){
                    optionalDeigmaThhlastikwnXEidh.get().setEokParII(deigmaThhlastikwnXEidhDTO.getEokParII());
                }
                if (deigmaThhlastikwnXEidhDTO.getEokParIV() != null){
                    optionalDeigmaThhlastikwnXEidh.get().setEokParIV(deigmaThhlastikwnXEidhDTO.getEokParIV());
                }
                if (deigmaThhlastikwnXEidhDTO.getEokParV() != null){
                    optionalDeigmaThhlastikwnXEidh.get().setEokParV(deigmaThhlastikwnXEidhDTO.getEokParV());
                }
                if (deigmaThhlastikwnXEidhDTO.getFulo() != null){
                    optionalDeigmaThhlastikwnXEidh.get().setFulo(deigmaThhlastikwnXEidhDTO.getFulo());
                }
                if (deigmaThhlastikwnXEidhDTO.getHlikia() != null){
                    optionalDeigmaThhlastikwnXEidh.get().setHlikia(deigmaThhlastikwnXEidhDTO.getHlikia());
                }
                if (deigmaThhlastikwnXEidhDTO.getParathrhseis() != null){
                    optionalDeigmaThhlastikwnXEidh.get().setParathrhseis(deigmaThhlastikwnXEidhDTO.getParathrhseis());
                }
                if (deigmaThhlastikwnXEidhDTO.getPlhthos() != null){
                    optionalDeigmaThhlastikwnXEidh.get().setPlhthos(deigmaThhlastikwnXEidhDTO.getPlhthos());
                }
                if (deigmaThhlastikwnXEidhDTO.getSxetikhAfthonia() != null){
                    optionalDeigmaThhlastikwnXEidh.get().setSxetikhAfthonia(deigmaThhlastikwnXEidhDTO.getSxetikhAfthonia());
                }
                if (deigmaThhlastikwnXEidhDTO.getDeigmaThhlastikwnId() != null){
                    // Checking if the new DeigmaThhlastikwn exists
                    Optional<DeigmaThhlastikwn> newOptionalDeigmaThhlastikwn = deigmaThhlastikwnRepository.findById(deigmaThhlastikwnXEidhDTO.getDeigmaThhlastikwnId());

                    if (newOptionalDeigmaThhlastikwn.isPresent()){
                        // Finding the older one to prepare remove of XEidh from Set
                        Optional<DeigmaThhlastikwn> optionalDeigmaThhlastikwn = deigmaThhlastikwnRepository.findById(optionalDeigmaThhlastikwnXEidh.get().getDeigmaThhlastikwn().getId());

                        // Removing from Set
                        if (optionalDeigmaThhlastikwn.isPresent()){
                            optionalDeigmaThhlastikwn.get().removeXEidh(optionalDeigmaThhlastikwnXEidh.get());
                        } else {
                            throw new RuntimeException("The DeigmaThhlastikwn with id of " + optionalDeigmaThhlastikwnXEidh.get().getDeigmaThhlastikwn().getId() + " was not found");
                        }
                        // Adding it to the new DeigmaThhlastikwn Set and setting it onto it
                        newOptionalDeigmaThhlastikwn.get().addXEidh(optionalDeigmaThhlastikwnXEidh.get());
                    } else {
                        throw new RuntimeException("The DeigmaThhlastikwn with id of " + deigmaThhlastikwnXEidhDTO.getDeigmaThhlastikwnId() + " was not found");
                    }
                }
                if (deigmaThhlastikwnXEidhDTO.getCtEidos() != null){
                    // Checking if the new Ct exists
                    CtThhlastikaEidh newOptionalCtThhlastikaEidh = ctThhlastikaEidhRepository.findByEidosEquals(deigmaThhlastikwnXEidhDTO.getCtEidos());

                    if (newOptionalCtThhlastikaEidh != null){
                        // Finding the older one to prepare remove of XEidh from Set
                        Optional<CtThhlastikaEidh> optionalCtThhlastikaEidh = ctThhlastikaEidhRepository.findById(optionalDeigmaThhlastikwnXEidh.get().getCtThhlastikaEidh().getId());

                        //Removing from Set
                        if (optionalCtThhlastikaEidh.isPresent()){
                            optionalCtThhlastikaEidh.get().removeXEidos(optionalDeigmaThhlastikwnXEidh.get());
                        } else {
                            throw new RuntimeException("The CtThhlastikaEidh with eidos of " + deigmaThhlastikwnXEidhDTO.getCtEidos() + " was not found");
                        }
                        // Adding it to the new Ct Set and setting it onto it
                        newOptionalCtThhlastikaEidh.addXEidos(optionalDeigmaThhlastikwnXEidh.get());
                    } else {
                        throw new RuntimeException("The CtThhlastikaEidh with eidos of " + optionalDeigmaThhlastikwnXEidh.get().getCtThhlastikaEidh().getEidos() + " was not found");
                    }
                }
                deigmaThhlastikwnXEidhRepository.save(optionalDeigmaThhlastikwnXEidh.get());
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean deleteDeigmaThhlastikwnXEidh(Long id) {
        try {
            // If it exists
            Optional<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidh = deigmaThhlastikwnXEidhRepository.findById(id);

            if (deigmaThhlastikwnXEidh.isPresent()){
                // Deleting the requested DeigmaThhlastikwnXEidh
                deigmaThhlastikwnXEidhRepository.delete(deigmaThhlastikwnXEidh.get());

                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Page<DeigmaThhlastikwnXEidh> getAllByPaging(Integer page) {
        try {
            Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "id");
            return deigmaThhlastikwnXEidhRepository.findAll(pageable);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public DeigmaThhlastikwnXEidhSearchDTO searchDeigmaThhlastikwnXEidh(List<SearchCriteria> searchCriteriaList, int size, int page, String sort) {
        try {
            return deigmaThhlastikwnXEidhSearchRepository.searchDeigmaThhlastikwnXEidh(searchCriteriaList, size, page, sort);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<DeigmaThhlastikwnXEidh> downloadDeigmaThhlastikwnXEidh(List<SearchCriteria> searchCriteriaList, String sort) {
        try {
            return deigmaThhlastikwnXEidhSearchRepository.downloadDeigmaThhlastikwnXEidh(searchCriteriaList, sort);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public DeigmaThhlastikwnXEidhAutocompletesDTO getDeigmaThhlastikwnXEidhAutocompletes() {
        try {
            ArrayList<BigInteger> deigmaThhlastikwnIdList = deigmaThhlastikwnXEidhRepository.findDistinctByDeigmaThhlastikwnIdOrderByDeigmaThhlastikwnId();
            ArrayList<String> ctEidosList = ctThhlastikaEidhRepository.findDistinctByEidosOrderByEidos();
            ArrayList<String> sxetikhAfthoniaList = deigmaThhlastikwnXEidhRepository.findDistinctBySxetikhAfthoniaOrderBySxetikhAfthonia();
            // Not using for parathrhseis
            ArrayList<String> hlikiaList = deigmaThhlastikwnXEidhRepository.findDistinctByHlikiaOrderByHlikia();
            ArrayList<String> fuloList = deigmaThhlastikwnXEidhRepository.findDistinctByFuloOrderByFulo();

            return deigmaThhlastikwnXEidhMapper.mapListsToDeigmaThhlastikwnXEidhAutocompletesDTO(deigmaThhlastikwnIdList, ctEidosList, sxetikhAfthoniaList, hlikiaList, fuloList);
        }catch (Exception e){
            throw e;
        }
    }
}
