package com.teicm.kerkinibackend.service;

import com.teicm.kerkinibackend.domain.Deigmata;
import com.teicm.kerkinibackend.domain.Prwtokola;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.repositories.DeigmataRepository;
import com.teicm.kerkinibackend.repositories.PrwtokolaRepository;
import com.teicm.kerkinibackend.services.DeigmataServiceImpl;
import com.teicm.kerkinibackend.v1.models.DeigmataDTO;
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

public class DeigmataServiceImplTest {

    private DeigmataServiceImpl deigmataService;

    @Mock
    private DeigmataRepository deigmataRepository;

    @Mock
    private PrwtokolaRepository prwtokolaRepository;

    private Deigmata deigmata;

    private Prwtokola prwtokola;

    private Prwtokola prwtokolaPatch;

    private DeigmaThhlastikwn deigmaThhlastikwn;

    private DeigmataDTO deigmataDTO;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);

        deigmataService = new DeigmataServiceImpl();
        deigmataService.setDeigmataRepository(deigmataRepository);
        deigmataService.setPrwtokolaRepository(prwtokolaRepository);

        // Init Prwtokola
        prwtokola = new Prwtokola();
        prwtokola.setId(1l);
        prwtokola.setPerigrafh("PerigrafhTesting");
        prwtokola.setParathuroDedomenwn("ParathuroDedomenwnTesting");
        prwtokola.setPinakasDedomenwn("PinakasDedomenwnTesting");
//        prwtokola.addDeigma(deigmata);

        // Init PrwtokolaPatch
        prwtokolaPatch = new Prwtokola();
        prwtokolaPatch.setId(2l);
        prwtokolaPatch.setPerigrafh("PerigrafhTesting2");
        prwtokolaPatch.setParathuroDedomenwn("ParathuroDedomenwnTesting2");
        prwtokolaPatch.setPinakasDedomenwn("PinakasDedomenwnTesting2");

        // Init DeigmaThhlastikwn
        deigmaThhlastikwn = new DeigmaThhlastikwn();
        deigmaThhlastikwn.setId(1l);

        // Init Deigmata
        deigmata = new Deigmata();
        deigmata.setId(1l);
        deigmata.setPrwtokola(prwtokola);
        deigmata.setDeigmaThhlastikwn(deigmaThhlastikwn);

        // Init DeigmataDTO
        deigmataDTO = new DeigmataDTO();
        deigmataDTO.setKwdikosPrwtokolou(2l);
    }

    @Test
    void getByIdTest(){
        Mockito.when(deigmataRepository.findById(deigmata.getId())).thenReturn(Optional.of(deigmata));

        Deigmata deigmataActual = deigmataService.getById(deigmata.getId());

        Mockito.verify(deigmataRepository, Mockito.times(1)).findById(deigmata.getId());
        assertEquals(deigmata.getId(), deigmataActual.getId());
        assertEquals(deigmata.getDeigmaThhlastikwn(), deigmataActual.getDeigmaThhlastikwn());
        assertEquals(deigmata.getPrwtokola(), deigmataActual.getPrwtokola());
    }

    @Test
    void deleteDeigmataTest(){
        Mockito.when(deigmataRepository.findById(deigmata.getId())).thenReturn(Optional.of(deigmata));

        boolean deleteFlag = deigmataService.deleteDeigmata(deigmata.getId());

        Mockito.verify(deigmataRepository, Mockito.times(1)).findById(deigmata.getId());
        Mockito.verify(deigmataRepository, Mockito.times(1)).deleteById(deigmata.getId());
        assertTrue(deleteFlag);
    }

    @Test
    void patchDeigmataTest(){
        Mockito.when(deigmataRepository.findById(deigmata.getId())).thenReturn(Optional.of(deigmata));

        Mockito.when(prwtokolaRepository.findById(prwtokola.getId())).thenReturn(Optional.of(prwtokola));

        Mockito.when(prwtokolaRepository.findById(prwtokolaPatch.getId())).thenReturn(Optional.of(prwtokolaPatch));

        boolean patchFlag = deigmataService.patchDeigmata(deigmata.getId(), deigmataDTO);

        Mockito.verify(deigmataRepository, Mockito.times(1)).findById(deigmata.getId());
        Mockito.verify(prwtokolaRepository, Mockito.times(1)).findById(prwtokola.getId());
        Mockito.verify(prwtokolaRepository, Mockito.times(1)).findById(prwtokolaPatch.getId());
        Mockito.verify(deigmataRepository, Mockito.times(1)).save(any());
        assertTrue(patchFlag);
    }

    @Test
    void getAllByPagingTest(){
        deigmataService.getAllByPaging(0);

        Mockito.verify(deigmataRepository, Mockito.times(1)).findAll((Pageable) any());
    }

    @Test
    void getAutocompletesTest(){
        deigmataService.getAutocompletes();

        Mockito.verify(deigmataRepository, Mockito.times(1)).findDistinctByPrwtokolaIdOrderByPrwtokolaId();
    }

    @Test
    void getDeigmataByPrwtokolaTest(){
        Mockito.when(prwtokolaRepository.findById(prwtokola.getId())).thenReturn(Optional.of(prwtokola));

        deigmataService.getDeigmataByPrwtokola(1l);

        Mockito.verify(prwtokolaRepository, Mockito.times(1)).findById(1l);
        Mockito.verify(deigmataRepository, Mockito.times(1)).findDeigmataByPrwtokolaIs(prwtokola);
    }

}
