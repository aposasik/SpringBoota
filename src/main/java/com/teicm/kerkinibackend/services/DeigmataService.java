package com.teicm.kerkinibackend.services;

import com.teicm.kerkinibackend.domain.Deigmata;
import com.teicm.kerkinibackend.v1.models.DeigmataDTO;
import com.teicm.kerkinibackend.v1.models.DeigmataSearchDTO;
import com.teicm.kerkinibackend.v1.models.DeigmataSearchHelperDTO;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Set;

@Service
public interface DeigmataService {

    Deigmata getById(Long id);

    boolean deleteDeigmata(Long id);

    boolean patchDeigmata(Long id, DeigmataDTO deigmataDTO);

    Page<Deigmata> getAllByPaging(Integer page);

    Set<Deigmata> getDeigmataByPrwtokola(Long id);

    List<BigInteger> getAutocompletes();

    DeigmataSearchDTO searchDeigmata(List<SearchCriteria> searchCriteriaList, int size, int page, String sort);

    List<DeigmataSearchHelperDTO> downloadDeigmata(List<SearchCriteria> searchCriteriaList, String sort);

}
