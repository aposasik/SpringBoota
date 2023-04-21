package com.teicm.kerkinibackend.services.ornithopanida;

import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanidaXSpecies;
import com.teicm.kerkinibackend.v1.models.ornithopanida.DeigmaOrnithopanidaXSpeciesDTO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface DeigmaOrnithopanidaXSpeciesService
{
    DeigmaOrnithopanidaXSpecies getById(Long id);
    Set<DeigmaOrnithopanidaXSpeciesDTO> getDeigmaOrnithopanidaXSpeciesByDeigmaOrnithopanidaIs(Long id);
    DeigmaOrnithopanidaXSpeciesDTO addDeigmaOrnithopanidaXSpecies(DeigmaOrnithopanidaXSpeciesDTO deigmaOrnithopanidaXSpeciesDTO);
    boolean deleteDeigmaOrnithopanidaXSpecies(Long id);
    boolean patchDeigmaOrnithopanidaXspecies(Long id, DeigmaOrnithopanidaXSpeciesDTO deigmaOrnithopanidaXSpeciesDTO);
    Page<DeigmaOrnithopanidaXSpecies> getAllByPaging(Integer page);

}