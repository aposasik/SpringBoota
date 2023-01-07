package com.teicm.kerkinibackend.services.thhlastika;

import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaPressThreats;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaPressThreatDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaPressThreatsSearchDTO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public interface CtThhlastikaPressThreatsService {

    CtThhlastikaPressThreats findById(Long id);

    CtThhlastikaPressThreats findByActCodeEquals(String actCode);

    CtThhlastikaPressThreats addPressThreat(CtThhlastikaPressThreatDTO ctThhlastikaPressThreatDTO);

    boolean addPressThreatsFromExcel(MultipartFile file) throws IOException;

    boolean patchPressThreat(Long id, CtThhlastikaPressThreatDTO ctThhlastikaPressThreatDTO);

    boolean deletePressThreat(Long id);

    List<CtThhlastikaPressThreats> findAll();

    ArrayList<String> getAllActCodes();

    Page<CtThhlastikaPressThreats> getAllByPaging(Integer page);

    CtThhlastikaPressThreatsSearchDTO searchCtThhlastikaPressThreats(List<SearchCriteria> searchCriteriaList, int size, int page, String sort);

    List<CtThhlastikaPressThreats> downloadCtThhlastikaPressThreats(List<SearchCriteria> searchCriteriaList, String sort);
}
