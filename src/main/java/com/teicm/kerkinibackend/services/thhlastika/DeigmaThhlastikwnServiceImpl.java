package com.teicm.kerkinibackend.services.thhlastika;

import com.teicm.kerkinibackend.domain.*;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.repositories.DeigmataRepository;
import com.teicm.kerkinibackend.repositories.PrwtokolaRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnSearchRepository;
import com.teicm.kerkinibackend.v1.mappers.thhlastika.DeigmaThhlastikwnMapperImpl;
import com.teicm.kerkinibackend.v1.models.DeigmaGoogleMarkersDTO;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnSearchDTO;
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
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DeigmaThhlastikwnServiceImpl implements DeigmaThhlastikwnService {

    @Autowired
    private DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    @Autowired
    private PrwtokolaRepository prwtokolaRepository;

    @Autowired
    private DeigmataRepository deigmataRepository;

    @Autowired
    private DeigmaThhlastikwnSearchRepository deigmaThhlastikwnSearchRepository;

    private DeigmaThhlastikwnMapperImpl deigmaThhlastikwnMapper = new DeigmaThhlastikwnMapperImpl();

    // For Mockito testing
    public void setDeigmaThhlastikwnRepository(DeigmaThhlastikwnRepository deigmaThhlastikwnRepository) {
        this.deigmaThhlastikwnRepository = deigmaThhlastikwnRepository;
    }

    // For Mockito testing
    public void setDeigmaThhlastikwnSearchRepository(DeigmaThhlastikwnSearchRepository deigmaThhlastikwnSearchRepository) {
        this.deigmaThhlastikwnSearchRepository = deigmaThhlastikwnSearchRepository;
    }

    // For Mockito testing
    public void setPrwtokolaRepository(PrwtokolaRepository prwtokolaRepository) {
        this.prwtokolaRepository = prwtokolaRepository;
    }

    // For Mockito testing
    public void setDeigmataRepository(DeigmataRepository deigmataRepository) {
        this.deigmataRepository = deigmataRepository;
    }

    // For Mockito testing
    public void setDeigmaThhlastikwnMapper(DeigmaThhlastikwnMapperImpl deigmaThhlastikwnMapper) {
        this.deigmaThhlastikwnMapper = deigmaThhlastikwnMapper;
    }

    @Override
    public DeigmaThhlastikwn addDeigmaThhlastikwn(DeigmaThhlastikwnDTO deigmaThhlastikwnDTO) {
        // Creating the Deigmata
        Deigmata deigmata = new Deigmata();

        // Find Prwtokola with specified Id to set it onto Deigmata
        Optional<Prwtokola> prwtokola = prwtokolaRepository.findById(deigmaThhlastikwnDTO.getPrwtokolaId());
        if (prwtokola.isPresent()){
            prwtokola.get().addDeigma(deigmata);
        } else {
            throw new RuntimeException("There was no Prwtokola found with id of " + deigmaThhlastikwnDTO.getPrwtokolaId());
        }

        // Creating the DeigmaThhlastikwn
        DeigmaThhlastikwn deigmaThhlastikwn = deigmaThhlastikwnMapper.deigmaThhlastikwnDTOToDeigmaThhlastikwn(deigmaThhlastikwnDTO);

        // Setting the DeigmaThhlastikwn onto the Deigmata and vice-versa
        deigmaThhlastikwn.setDeigmata(deigmata);
        deigmata.setDeigmaThhlastikwn(deigmaThhlastikwn);

        // Saving the Deigmata to the db (automatically we also save the DeigmataThhlastikwn through cascading)
        Deigmata savedDeigmata = deigmataRepository.save(deigmata);

        // Returning the saved DeigmaThhlastikwn
        return deigmaThhlastikwnRepository.findDeigmaThhlastikwnById(savedDeigmata.getDeigmaThhlastikwn().getId());
    }

    // TODO: 12/14/2018 Test in depth for null Cells etc.
    @Override
    public boolean addDeigmaThhlastikwnFromExcel(MultipartFile file) throws IOException {
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
                if (row.getCell(0).getStringCellValue().equals("Πρωτόκολλο")
                        &&row.getCell(1).getStringCellValue().equals("Κωδικός Δειγματοληψίας")
                        &&row.getCell(2).getStringCellValue().equals("Χρηματοδότηση")
                        &&row.getCell(3).getStringCellValue().equals("Ερευνητής")
                        &&row.getCell(4).getStringCellValue().equals("Τοποθεσία")
                        &&row.getCell(5).getStringCellValue().equals("Ημερομηνία")
                        &&row.getCell(6).getStringCellValue().equals("Ώρα")
                        &&row.getCell(7).getStringCellValue().equals("Διάρκεια")
                        &&row.getCell(8).getStringCellValue().equals("Τύπος Βλάστησης")
                        &&row.getCell(9).getStringCellValue().equals("Τύπος Οικοτόπου")
                        &&row.getCell(10).getStringCellValue().equals("Επιφάνεια Δειγματοληψίας")
                        &&row.getCell(11).getStringCellValue().equals("Latitude EGSA")
                        &&row.getCell(12).getStringCellValue().equals("Longitude EGSA")
                        &&row.getCell(13).getStringCellValue().equals("Latitude WGS84")
                        &&row.getCell(14).getStringCellValue().equals("Longitude WGS84")
                        &&row.getCell(15).getStringCellValue().equals("Κελί Πλέγματος")
                        &&row.getCell(16).getStringCellValue().equals("Κωδικός Natura")
                        &&row.getCell(17).getStringCellValue().equals("Μέθοδος Δειγματοληψίας")
                        &&row.getCell(18).getStringCellValue().equals("Παρατηρήσεις")
                        &&row.getCell(19).getStringCellValue().equals("Νομός")) {

                    // Initializing - We are using the List to first parse through all the Cells and then start
                    // saving to the db (in case a Row would through and Exception later on, this
                    // way we are not saving any of the Rows avoiding problems)
                    List<Deigmata> deigmataList = new ArrayList<>();

                    // Initializing
                    Deigmata deigmata;
                    DeigmaThhlastikwn deigmaThhlastikwn;

                    // Helper Data formatter for converting from Numerics to Strings
                    DataFormatter dataFormatter = new DataFormatter();

                    // By-passing the headers
                    for (int i = 1; i < sheet.getPhysicalNumberOfRows() ; i++){
                        // Getting the row
                        row = sheet.getRow(i);

                        deigmata = new Deigmata();
                        deigmaThhlastikwn = new DeigmaThhlastikwn();

                        // Checking if Prwtokola Cell is empty
                        String formatedPrwtokola = dataFormatter.formatCellValue(row.getCell(0));
                        Optional<Prwtokola> optionalPrwtokola = prwtokolaRepository.findById(Long.parseLong(formatedPrwtokola));

                        // Setting Prwtokola
                        if (optionalPrwtokola.isPresent()){
                            deigmata.setPrwtokola(optionalPrwtokola.get());
                        } else {
                            throw new IllegalArgumentException("Prwtokola with Id of : " + (int) row.getCell(0).getNumericCellValue() + " does not exist.");
                        }

                        // Kwdikos Deigmatolhpsias
                        deigmaThhlastikwn.setKwdikosDeigmatolhpsias(row.getCell(1).getStringCellValue());
                        // Xrhmatodothsh
                        deigmaThhlastikwn.setXrhmatodothsh(row.getCell(2).getStringCellValue());
                        // Ereunhths
                        deigmaThhlastikwn.setEreunhths(row.getCell(3).getStringCellValue());
                        // Topothesia
                        deigmaThhlastikwn.setTopothesia(row.getCell(4).getStringCellValue());
                        // Date
                        String formatedDate = row.getCell(5).getStringCellValue().replace("'", "");
                        deigmaThhlastikwn.setDate(LocalDate.parse(formatedDate));
                        // Time
                        String formatedTime = dataFormatter.formatCellValue(row.getCell(6));
                        deigmaThhlastikwn.setTime(LocalTime.parse(formatedTime));
                        // Diarkeia
                        deigmaThhlastikwn.setDiarkeia(row.getCell(7).getStringCellValue());
                        // Tupos Vlasthshs
                        deigmaThhlastikwn.setTuposVlasthshs(row.getCell(8).getStringCellValue());
                        // Tupos Oikotopou
                        deigmaThhlastikwn.setTuposOikotopou(row.getCell(9).getStringCellValue());
                        // Epifaneia Deigmatolhpsias
                        deigmaThhlastikwn.setEpifaneiaDeigmatolhpsias((int) row.getCell(10).getNumericCellValue());
                        // LatitudeEGSA
                        deigmaThhlastikwn.setLatitudeEGSA(row.getCell(11).getNumericCellValue());
                        // LongitudeEGSA
                        deigmaThhlastikwn.setLongitudeEGSA(row.getCell(12).getNumericCellValue());
                        // LatitudeWGS84
                        deigmaThhlastikwn.setLatitudeWGS84(row.getCell(13).getNumericCellValue());
                        // LongitudeWGS84
                        deigmaThhlastikwn.setLongitudeWGS84(row.getCell(14).getNumericCellValue());
                        // Grid cell
                        deigmaThhlastikwn.setGridCell(row.getCell(15).getStringCellValue());
                        // Kwdikos Natura
                        deigmaThhlastikwn.setKwdikosNatura(row.getCell(16).getStringCellValue());
                        // Methodos Deigmatolhpsias
                        deigmaThhlastikwn.setMethodosDeigmatolhpsias(row.getCell(17).getStringCellValue());
                        // Parathrhseis
                        deigmaThhlastikwn.setParathrhseis(row.getCell(18).getStringCellValue());
                        // Nomos
                        deigmaThhlastikwn.setNomos(row.getCell(19).getStringCellValue());

                        // Set Deigmata to DeigmaThhlastikwn
                        deigmaThhlastikwn.setDeigmata(deigmata);

                        // Setting DeigmaThhlastikwn to Deigmata
                        deigmata.setDeigmaThhlastikwn(deigmaThhlastikwn);

                        deigmataList.add(deigmata);
                    }

                    // Saving the generated new data to the db
                    for (Deigmata deigmataToSave: deigmataList) {
                        deigmataRepository.save(deigmataToSave);
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
    public boolean patchDeigmaThhlastikwn(Long id, DeigmaThhlastikwnDTO deigmaThhlastikwnDTO) {
        try {
            Optional<DeigmaThhlastikwn> optionalDeigmaThhlastikwn = deigmaThhlastikwnRepository.findById(id);

            if (optionalDeigmaThhlastikwn.isPresent()){
                if (deigmaThhlastikwnDTO.getDiarkeia() != null){
                    optionalDeigmaThhlastikwn.get().setDiarkeia(deigmaThhlastikwnDTO.getDiarkeia());
                }
                if (deigmaThhlastikwnDTO.getEpifaneiaDeigmatolhpsias() != null){
                    optionalDeigmaThhlastikwn.get().setEpifaneiaDeigmatolhpsias(deigmaThhlastikwnDTO.getEpifaneiaDeigmatolhpsias());
                }
                if (deigmaThhlastikwnDTO.getEreunhths() != null){
                    optionalDeigmaThhlastikwn.get().setEreunhths(deigmaThhlastikwnDTO.getEreunhths());
                }
                if (deigmaThhlastikwnDTO.getGridCell() != null){
                    optionalDeigmaThhlastikwn.get().setGridCell(deigmaThhlastikwnDTO.getGridCell());
                }
                if (deigmaThhlastikwnDTO.getKwdikosDeigmatolhpsias() != null){
                    optionalDeigmaThhlastikwn.get().setKwdikosDeigmatolhpsias(deigmaThhlastikwnDTO.getKwdikosDeigmatolhpsias());
                }
                if (deigmaThhlastikwnDTO.getKwdikosNatura() != null){
                    optionalDeigmaThhlastikwn.get().setKwdikosNatura(deigmaThhlastikwnDTO.getKwdikosNatura());
                }
                if (deigmaThhlastikwnDTO.getLatitudeEGSA() != null){
                    optionalDeigmaThhlastikwn.get().setLatitudeEGSA(deigmaThhlastikwnDTO.getLatitudeEGSA());
                }
                if (deigmaThhlastikwnDTO.getLongitudeEGSA() != null){
                    optionalDeigmaThhlastikwn.get().setLongitudeEGSA(deigmaThhlastikwnDTO.getLongitudeEGSA());
                }
                if (deigmaThhlastikwnDTO.getLatitudeWGS84() != null){
                    optionalDeigmaThhlastikwn.get().setLatitudeWGS84(deigmaThhlastikwnDTO.getLatitudeWGS84());
                }
                if (deigmaThhlastikwnDTO.getLongitudeWGS84() != null){
                    optionalDeigmaThhlastikwn.get().setLongitudeWGS84(deigmaThhlastikwnDTO.getLongitudeWGS84());
                }
                if (deigmaThhlastikwnDTO.getMethodosDeigmatolhpsias() != null){
                    optionalDeigmaThhlastikwn.get().setMethodosDeigmatolhpsias(deigmaThhlastikwnDTO.getMethodosDeigmatolhpsias());
                }
                if (deigmaThhlastikwnDTO.getNomos() != null){
                    optionalDeigmaThhlastikwn.get().setNomos(deigmaThhlastikwnDTO.getNomos());
                }
                if (deigmaThhlastikwnDTO.getParathrhseis() != null){
                    optionalDeigmaThhlastikwn.get().setParathrhseis(deigmaThhlastikwnDTO.getParathrhseis());
                }
                if (deigmaThhlastikwnDTO.getTopothesia() != null){
                    optionalDeigmaThhlastikwn.get().setTopothesia(deigmaThhlastikwnDTO.getTopothesia());
                }
                if (deigmaThhlastikwnDTO.getTuposOikotopou() != null){
                    optionalDeigmaThhlastikwn.get().setTuposOikotopou(deigmaThhlastikwnDTO.getTuposOikotopou());
                }
                if (deigmaThhlastikwnDTO.getXrhmatodothsh() != null){
                    optionalDeigmaThhlastikwn.get().setXrhmatodothsh(deigmaThhlastikwnDTO.getXrhmatodothsh());
                }
                if (deigmaThhlastikwnDTO.getTuposVlasthshs() != null){
                    optionalDeigmaThhlastikwn.get().setTuposVlasthshs(deigmaThhlastikwnDTO.getTuposVlasthshs());
                }
                if (deigmaThhlastikwnDTO.getDate() != null){
                    optionalDeigmaThhlastikwn.get().setDate(LocalDate.parse(deigmaThhlastikwnDTO.getDate()));
                }
                if (deigmaThhlastikwnDTO.getTime() != null){
                    optionalDeigmaThhlastikwn.get().setTime(LocalTime.parse(deigmaThhlastikwnDTO.getTime()));
                }

                deigmaThhlastikwnRepository.save(optionalDeigmaThhlastikwn.get());

                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean uploadPicture(Long id, MultipartFile file) throws IOException {
        try {
            Optional<DeigmaThhlastikwn> optionalDeigmaThhlastikwn = deigmaThhlastikwnRepository.findById(id);

            if (optionalDeigmaThhlastikwn.isPresent() && file != null && !Objects.equals(file.getContentType(), "application/pdf")
                    && !Objects.equals(file.getContentType(), "application/msword") && !Objects.equals(file.getContentType(), "application/vnd.ms-excel")
                    && !Objects.equals(file.getContentType(), "application/vnd.openxmlformats-officedocument.wordprocessingml.document")
                    && !Objects.equals(file.getContentType(), "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
                    && !Objects.equals(file.getContentType(), "application/vnd.ms-powerpoint")
                    && !Objects.equals(file.getContentType(), "application/vnd.openxmlformats-officedocument.presentationml.presentation")
                    && !Objects.equals(file.getContentType(), "application/vnd.ms-access")){
                Pictures pictures = new Pictures();

                String name = StringUtils.cleanPath(file.getOriginalFilename());
                pictures.setPictureName(name);
                pictures.setPictureType(file.getContentType());
                pictures.setData(file.getBytes());

                optionalDeigmaThhlastikwn.get().addPicture(pictures);

                deigmaThhlastikwnRepository.save(optionalDeigmaThhlastikwn.get());
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean uploadFile(Long id, MultipartFile file) throws IOException {
        try {
            Optional<DeigmaThhlastikwn> optionalDeigmaThhlastikwn = deigmaThhlastikwnRepository.findById(id);

            if (optionalDeigmaThhlastikwn.isPresent() && file != null && !Objects.equals(file.getContentType(), "image/jpeg")
                    && !Objects.equals(file.getContentType(), "image/png")
                    && !Objects.equals(file.getContentType(), "image/gif")
                    && !Objects.equals(file.getContentType(), "image/x-ms-bmp")){
                Files fileToUpload = new Files();

                String name = StringUtils.cleanPath(file.getOriginalFilename());
                fileToUpload.setFileName(name);
                fileToUpload.setFileType(file.getContentType());
                fileToUpload.setData(file.getBytes());

                optionalDeigmaThhlastikwn.get().addFile(fileToUpload);

                deigmaThhlastikwnRepository.save(optionalDeigmaThhlastikwn.get());
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean deleteDeigmaThhlastikwn(Long id) {
        try {
            Optional<DeigmaThhlastikwn> optionalDeigmaThhlastikwn = deigmaThhlastikwnRepository.findById(id);

            if (optionalDeigmaThhlastikwn.isPresent()){
                deigmaThhlastikwnRepository.delete(optionalDeigmaThhlastikwn.get());
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public DeigmaThhlastikwn findDeigmaThhlastikwnById(Long id) {
        return deigmaThhlastikwnRepository.findDeigmaThhlastikwnById(id);
    }

    @Override
    public List<DeigmaGoogleMarkersDTO> getAllGeoLocations() {
        try {
            // Getting all without null markers
            List<DeigmaThhlastikwn> deigmaThhlastikwnList = deigmaThhlastikwnRepository.findAllByLongitudeWGS84IsNotNullAndLatitudeWGS84IsNotNullOrderByIdDesc();

            // If found any, then map them to a List of DTOs
            if (deigmaThhlastikwnList.size() != 0){
                return deigmaThhlastikwnMapper.deigmaThhlastikwnToDeigmaGoogleMarkersDTO(deigmaThhlastikwnList);
            }else {
                return null;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Page<DeigmaThhlastikwn> getAllByPaging(Integer page) {
        try {
            Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "id");
            return deigmaThhlastikwnRepository.findAll(pageable);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public DeigmaThhlastikwnSearchDTO searchDeigmaThhlastikwn(List<SearchCriteria> searchCriteriaList, int size, int page, String sort) {
        try {
            return deigmaThhlastikwnSearchRepository.searchDeigmataThhlastikwn(searchCriteriaList, size, page, sort);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<DeigmaThhlastikwn> downloadDeigmaThhlastikwn(List<SearchCriteria> searchCriteriaList, String sort) {
        try {
            return deigmaThhlastikwnSearchRepository.downloadDeigmataThhlastikwn(searchCriteriaList, sort);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public DeigmaThhlastikwnAutocompletesDTO getDeigmaThhlastikwnAutocompletes() {
        try {
            ArrayList<String> kwdikosDeigmatolhpsiasList = deigmaThhlastikwnRepository.findDistinctByKwdikosDeigmatosOrderByKwdikosDeigmatos();
            ArrayList<String> xrhmatodothshList = deigmaThhlastikwnRepository.findDistinctByXrhmatodothshOrderByXrhmatodothsh();
            ArrayList<String> ereunhthsList = deigmaThhlastikwnRepository.findDistinctByEreunhthsOrderByEreunhths();
            ArrayList<String> topothesiaList = deigmaThhlastikwnRepository.findDistinctByTopothesiaOrderByTopothesia();
            ArrayList<String> diarkeiaList = deigmaThhlastikwnRepository.findDistinctByDiarkeiaOrderByDiarkeia();
            ArrayList<String> tuposVlasthshsList = deigmaThhlastikwnRepository.findDistinctByTuposVlasthshsOrderByTuposVlasthshs();
            ArrayList<String> tuposOikotopouList = deigmaThhlastikwnRepository.findDistinctByTuposOikotopouOrderByTuposOikotopou();


            ArrayList<String> gridCellList = deigmaThhlastikwnRepository.findDistinctByGridCellOrderByGridCell();
            ArrayList<String> kwdikosNaturaList = deigmaThhlastikwnRepository.findDistinctByKwdikosNaturaOrderByKwdikosNatura();
            ArrayList<String> methodosDeigmatolhpsiasList = deigmaThhlastikwnRepository.findDistinctByMethodosDeigmatolhpsiasOrderByMethodosDeigmatolhpsias();

            ArrayList<Double> latitudeEGSAList = deigmaThhlastikwnRepository.findDistinctByLatitudeEGSAOrderByLatitudeEGSA();
            ArrayList<Double> longitudeEGSAList = deigmaThhlastikwnRepository.findDistinctByLongitudeEGSAOrderByLongitudeEGSA();
            ArrayList<Double> latitudeWGS84List = deigmaThhlastikwnRepository.findDistinctByLatitudeWGS84OrderByLatitudeWGS84();
            ArrayList<Double> longitudeWGS84List = deigmaThhlastikwnRepository.findDistinctByLongitudeWGS84OrderByLongitudeWGS84();

            // For parathrhseis we will not return a list of them
            ArrayList<String> nomosList = deigmaThhlastikwnRepository.findDistinctByNomosOrderByNomos();

            return deigmaThhlastikwnMapper.mapListsToDeigmaThhlastikwnAutocompletesDTO(kwdikosDeigmatolhpsiasList, xrhmatodothshList, ereunhthsList, topothesiaList, diarkeiaList, tuposVlasthshsList, tuposOikotopouList, gridCellList, kwdikosNaturaList, methodosDeigmatolhpsiasList, latitudeEGSAList, longitudeEGSAList, latitudeWGS84List, longitudeWGS84List, nomosList);
        }catch (Exception e){
            throw e;
        }
    }

}
