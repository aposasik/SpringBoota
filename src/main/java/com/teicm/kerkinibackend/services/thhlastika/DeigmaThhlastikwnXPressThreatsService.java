package com.teicm.kerkinibackend.services.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXPressThreats;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXPressThreatDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXPressThreatsAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXPressThreatsSearchDTO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Set;

@Service
public interface DeigmaThhlastikwnXPressThreatsService {

    DeigmaThhlastikwnXPressThreats getById(Long id);

    Set<DeigmaThhlastikwnXPressThreatDTO> getDeigmaThhlastikwnXPressThreatsByDeigmaThhlastikwnIs(Long id);

    DeigmaThhlastikwnXPressThreatDTO addDeigmaThhlastikwnXPressThreats(DeigmaThhlastikwnXPressThreatDTO deigmaThhlastikwnXPressThreatDTO);

    boolean addDeigmaThhlastikwnXPressThreatsFromExcel(MultipartFile file) throws IOException;

    boolean patchDeigmaThhlastikwnXPressThreats(Long id, DeigmaThhlastikwnXPressThreatDTO deigmaThhlastikwnXPressThreatDTO);

    boolean deleteDeigmaThhlastikwnXPressThreats(Long id);

    Page<DeigmaThhlastikwnXPressThreats> getAllByPaging(Integer page);

    DeigmaThhlastikwnXPressThreatsSearchDTO searchDeigmaThhlastikwnXPressThreats(List<SearchCriteria> searchCriteriaList, int size, int page, String sort);

    List<DeigmaThhlastikwnXPressThreats> downloadDeigmaThhlastikwnXPressThreats(List<SearchCriteria> searchCriteriaList, String sort);

    DeigmaThhlastikwnXPressThreatsAutocompletesDTO getDeigmaThhlastikwnXPressThreatsAutocompletes();
}
