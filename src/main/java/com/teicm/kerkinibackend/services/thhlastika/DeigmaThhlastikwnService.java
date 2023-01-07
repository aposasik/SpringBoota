package com.teicm.kerkinibackend.services.thhlastika;

import com.teicm.kerkinibackend.v1.models.DeigmaGoogleMarkersDTO;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnSearchDTO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface DeigmaThhlastikwnService {

    DeigmaThhlastikwn addDeigmaThhlastikwn(DeigmaThhlastikwnDTO deigmaThhlastikwnDTO);

    boolean addDeigmaThhlastikwnFromExcel(MultipartFile file) throws IOException;

    boolean patchDeigmaThhlastikwn(Long id, DeigmaThhlastikwnDTO deigmaThhlastikwnDTO);

    boolean uploadPicture(Long id, MultipartFile file) throws IOException;

    boolean uploadFile(Long id, MultipartFile file) throws IOException;

    boolean deleteDeigmaThhlastikwn(Long id);

    DeigmaThhlastikwn findDeigmaThhlastikwnById(Long id);

    List<DeigmaGoogleMarkersDTO> getAllGeoLocations();

    Page<DeigmaThhlastikwn> getAllByPaging(Integer page);

    DeigmaThhlastikwnSearchDTO searchDeigmaThhlastikwn(List<SearchCriteria> searchCriteriaList, int size, int page, String sort);

    List<DeigmaThhlastikwn> downloadDeigmaThhlastikwn(List<SearchCriteria> searchCriteriaList, String sort);

    DeigmaThhlastikwnAutocompletesDTO getDeigmaThhlastikwnAutocompletes();

}
