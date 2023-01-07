package com.teicm.kerkinibackend.services.ornithopanida;


import com.teicm.kerkinibackend.domain.ornithopanida.CTOrnithopanidaPressuresAndThreats;
import com.teicm.kerkinibackend.v1.models.ornithopanida.CTOrnithopanidaPressuresAndThreatsDTO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface CTOrnithopanidaPressuresAndThreatsService
{
    List<CTOrnithopanidaPressuresAndThreats> findAll();

    CTOrnithopanidaPressuresAndThreats findById(Long id);

    Page<CTOrnithopanidaPressuresAndThreats> getAllByPaging(Integer page);

    boolean patchPressThreat(Long id, CTOrnithopanidaPressuresAndThreatsDTO ctOrnithopanidaPressuresAndThreatsDTO);

    boolean deletePressThreats(Long id);

    ArrayList<String> getAllActCodes();

    CTOrnithopanidaPressuresAndThreats addPressThreat(CTOrnithopanidaPressuresAndThreatsDTO ctOrnithopanidaPressuresAndThreatsDTO);
}
