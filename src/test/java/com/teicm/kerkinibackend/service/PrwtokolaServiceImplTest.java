package com.teicm.kerkinibackend.service;

import com.teicm.kerkinibackend.domain.Prwtokola;
import com.teicm.kerkinibackend.repositories.PrwtokolaRepository;
import com.teicm.kerkinibackend.services.PrwtokolaServiceImpl;
import com.teicm.kerkinibackend.v1.mappers.PrwtokolaMapperImpl;
import com.teicm.kerkinibackend.v1.models.PrwtokolaDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class PrwtokolaServiceImplTest {

    private PrwtokolaServiceImpl prwtokolaService;

    @Mock
    private PrwtokolaRepository prwtokolaRepository;

    @Mock
    private PrwtokolaMapperImpl prwtokolaMapper;

    private PrwtokolaDTO prwtokolaDTO;

    private Prwtokola prwtokola;

    private PrwtokolaDTO prwtokolaPatchDTO;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
        prwtokolaService = new PrwtokolaServiceImpl();
        prwtokolaService.setPrwtokolaRepository(prwtokolaRepository);
        prwtokolaService.setPrwtokolaMapper(prwtokolaMapper);

        // Init DTO
        prwtokolaDTO = new PrwtokolaDTO();
        prwtokolaDTO.setPerigrafh("TestingPerigrafh");
        prwtokolaDTO.setPinakasDedomenwn("TestingPinakasDedomenwn");
        prwtokolaDTO.setParathuroDedomenwn("TestingParathuroDedomenwn");

        // Init Prwtokola
        prwtokola = new Prwtokola();
        prwtokola.setId(1l);
        prwtokola.setPerigrafh(prwtokolaDTO.getPerigrafh());
        prwtokola.setPinakasDedomenwn(prwtokolaDTO.getPinakasDedomenwn());
        prwtokola.setParathuroDedomenwn(prwtokolaDTO.getParathuroDedomenwn());

        //Init DTO for patch (different)
        prwtokolaPatchDTO = new PrwtokolaDTO();
        prwtokolaPatchDTO.setPerigrafh("PerigrafhPatchDTO");
        prwtokolaPatchDTO.setParathuroDedomenwn("ParathuroDedomenwnPatchDTO");
        prwtokolaPatchDTO.setPinakasDedomenwn("PinakasDedomenwnPatchDTO");
    }

    @Test
    void getByIdTest(){
        Mockito.when(prwtokolaRepository.findById(prwtokola.getId())).thenReturn(Optional.of(prwtokola));

        Prwtokola prwtokolaFindActual = prwtokolaService.getById(prwtokola.getId());

        assertEquals(prwtokola.getPerigrafh(), prwtokolaFindActual.getPerigrafh());
        assertEquals(prwtokola.getParathuroDedomenwn(), prwtokolaFindActual.getParathuroDedomenwn());
        assertEquals(prwtokola.getPinakasDedomenwn(), prwtokolaFindActual.getPinakasDedomenwn());

        Mockito.verify(prwtokolaRepository, times(1)).findById(prwtokola.getId());
    }

    @Test
    void addPrwtokolaTest(){
        Mockito.when(prwtokolaRepository.save(prwtokolaMapper.prwtokolaDTOToPrwtokola(prwtokolaDTO))).thenReturn(prwtokola);

        Prwtokola prwtokolaActual = prwtokolaService.addPrwtokola(prwtokolaDTO);

        assertEquals(prwtokola.getPerigrafh(), prwtokolaActual.getPerigrafh());
        assertEquals(prwtokola.getParathuroDedomenwn(), prwtokolaActual.getParathuroDedomenwn());
        assertEquals(prwtokola.getPinakasDedomenwn(), prwtokolaActual.getPinakasDedomenwn());

        Mockito.verify(prwtokolaRepository, times(1)).save(prwtokolaMapper.prwtokolaDTOToPrwtokola(prwtokolaDTO));
    }

    @Test
    void deletePrwtokolaTest(){
        Mockito.when(prwtokolaRepository.findById(prwtokola.getId())).thenReturn(Optional.of(prwtokola));

        boolean deleteFlag = prwtokolaService.deletePrwtokola(prwtokola.getId());

        Mockito.verify(prwtokolaRepository, times(1)).findById(prwtokola.getId());
        Mockito.verify(prwtokolaRepository, times(1)).delete(prwtokola);
        assertTrue(deleteFlag);
    }

    @Test
    void patchPrwtokolaTest(){
        Mockito.when(prwtokolaRepository.findById(prwtokola.getId())).thenReturn(Optional.of(prwtokola));

        boolean patchFlag = prwtokolaService.patchPrwtokola(prwtokola.getId(), prwtokolaPatchDTO);

        Mockito.verify(prwtokolaRepository, times(1)).findById(prwtokola.getId());
        Mockito.verify(prwtokolaRepository, times(1)).save(prwtokola);
        assertTrue(patchFlag);
    }

    @Test
    void getDistinctPrwtokolaIdsTest(){
        prwtokolaService.getDistinctPrwtokolaIds();

        Mockito.verify(prwtokolaRepository, times(1)).findDistinctByPrwtokolaIdOrderByPrwtokolaId();
    }

    @Test
    void getAllByPagingTest(){
        prwtokolaService.getAllByPaging(0);

        Mockito.verify(prwtokolaRepository, times(1)).findAll((Pageable) any());
    }

}
