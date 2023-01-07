package com.teicm.kerkinibackend.services.ornithopanida;

import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanidaXPresAndThreats;
import com.teicm.kerkinibackend.v1.models.ornithopanida.DeigmaOrnithopanidaXPresAndThreatsDTO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Set;

@Service
public interface DeigmaOrnithopanidaXPresAndThreatsService
{
    List<DeigmaOrnithopanidaXPresAndThreats> findAll();

    DeigmaOrnithopanidaXPresAndThreats getById(Long id);

    Page<DeigmaOrnithopanidaXPresAndThreats> getAllByPaging(Integer page);

    Set<DeigmaOrnithopanidaXPresAndThreatsDTO> getDeigmaOrnithopanidaXPressThreatsByDeigmaOrnithopanidaIs(Long id);

    DeigmaOrnithopanidaXPresAndThreatsDTO addDeigmaOrnithopanidaXPressAndThreats(DeigmaOrnithopanidaXPresAndThreatsDTO deigmaOrnithopanidaXPresAndThreatsDTO);

    boolean patchDeigmaOrnithopanidaXPresAndThreats(Long id, DeigmaOrnithopanidaXPresAndThreatsDTO deigmaOrnithopanidaXPresAndThreatsDTO);

    boolean deleteDeigmaOrnithopanidaXPresAndThreats(Long id);
}