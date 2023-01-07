package com.teicm.kerkinibackend.services.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXEidh;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXEidhAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXEidhDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXEidhSearchDTO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Set;

@Service
public interface DeigmaThhlastikwnXEidhService {

    DeigmaThhlastikwnXEidh getById(Long id);

    Set<DeigmaThhlastikwnXEidhDTO> getDeigmaThhlastikwnXEidhByDeigmaThhlastikwnIs(Long id);

    DeigmaThhlastikwnXEidhDTO addDeigmaThhlastikwnXEidh(DeigmaThhlastikwnXEidhDTO deigmaThhlastikwnXEidhDTO);

    boolean addDeigmaThhlastikwnXEidhFromExcel(MultipartFile file) throws IOException;

    boolean patchDeigmaThhlastikwnXEidh(Long id, DeigmaThhlastikwnXEidhDTO deigmaThhlastikwnXEidhDTO);

    boolean deleteDeigmaThhlastikwnXEidh(Long id);

    Page<DeigmaThhlastikwnXEidh> getAllByPaging(Integer page);

    DeigmaThhlastikwnXEidhSearchDTO searchDeigmaThhlastikwnXEidh(List<SearchCriteria> searchCriteriaList, int size, int page, String sort);

    List<DeigmaThhlastikwnXEidh> downloadDeigmaThhlastikwnXEidh(List<SearchCriteria> searchCriteriaList, String sort);

    DeigmaThhlastikwnXEidhAutocompletesDTO getDeigmaThhlastikwnXEidhAutocompletes();

}