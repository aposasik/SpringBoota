package com.teicm.kerkinibackend.services.ornithopanida;

import com.teicm.kerkinibackend.v1.models.ornithopanida.DeigmaOrnithopanidaDTO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanida;

@Service
public interface DeigmaOrnithopanidaService
{
     DeigmaOrnithopanida addDeigmaOrnithopanida(DeigmaOrnithopanidaDTO deigmaOrnithopanidaDTO);
     List<DeigmaOrnithopanida> findAll();
     DeigmaOrnithopanida findById(Long id);
     boolean patchDeigmaOrnithopanida(Long id, DeigmaOrnithopanidaDTO deigmaOrnithopanidaDTO);
     boolean deleteDeigmaOrnithopanida(Long id);
     Page<DeigmaOrnithopanida> getAllByPaging(Integer page);
}
