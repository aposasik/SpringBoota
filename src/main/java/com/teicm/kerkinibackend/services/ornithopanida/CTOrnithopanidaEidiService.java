package com.teicm.kerkinibackend.services.ornithopanida;

import com.teicm.kerkinibackend.domain.ornithopanida.CTOrnithopanidaEidi;
import com.teicm.kerkinibackend.v1.models.ornithopanida.CTOrnithopanidaEidiDTO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.ArrayList;

@Service
public interface CTOrnithopanidaEidiService
{
    CTOrnithopanidaEidi addEidos(CTOrnithopanidaEidiDTO ctOrnithopanidaEidiDTO);

    boolean addEidhFromExcel(MultipartFile file) throws IOException;

    CTOrnithopanidaEidi findById(Long id);

    CTOrnithopanidaEidi findByEidos(String eidos);

    boolean patchEidos(Long id, CTOrnithopanidaEidiDTO ctOrnithopanidaEidiDTO);

    boolean deleteEidos(Long id);

    ArrayList<String> getAllEidh();

    Page<CTOrnithopanidaEidi> getAllByPaging(Integer page);

    // leipei ena search dto  CtThhlastikaEidhSearchDTO searchCtThhlastikaEidh(List<SearchCriteria> searchCriteriaList, int size, int page, String sort);

   // List<CtThhlastikaEidh> downloadCtThhlastikaEidh(List<SearchCriteria> searchCriteriaList, String sort);
}
