package com.teicm.kerkinibackend.services.thhlastika;

import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaEidh;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaEidhSearchDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaEidosDTO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public interface CtThhlastikaEidhService {

    CtThhlastikaEidh addEidos(CtThhlastikaEidosDTO ctThhlastikaEidosDTO);

    boolean addEidhFromExcel(MultipartFile file) throws IOException;

    CtThhlastikaEidh findById(Long id);

    CtThhlastikaEidh findByEidos(String eidos);

    boolean patchEidos(Long id, CtThhlastikaEidosDTO ctThhlastikaEidosDTO);

    boolean deleteEidos(Long id);

    ArrayList<String> getAllEidh();

    Page<CtThhlastikaEidh> getAllByPaging(Integer page);

    CtThhlastikaEidhSearchDTO searchCtThhlastikaEidh(List<SearchCriteria> searchCriteriaList, int size, int page, String sort);

    List<CtThhlastikaEidh> downloadCtThhlastikaEidh(List<SearchCriteria> searchCriteriaList, String sort);

}
