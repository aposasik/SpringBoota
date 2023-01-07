package com.teicm.kerkinibackend.service.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaPressThreats;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaPressThreatsRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaPressThreatsSearchRepository;
import com.teicm.kerkinibackend.services.thhlastika.CtThhlastikaPressThreatsServiceImpl;
import com.teicm.kerkinibackend.v1.mappers.thhlastika.CtThhlastikaPressThreatsMapperImpl;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaPressThreatDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;

public class CtThhlastikaPressThreatsServiceImplTest {

    private CtThhlastikaPressThreatsServiceImpl ctThhlastikaPressThreatsService;

    @Mock
    private CtThhlastikaPressThreatsRepository ctThhlastikaPressThreatsRepository;

    @Mock
    private CtThhlastikaPressThreatsSearchRepository ctThhlastikaPressThreatsSearchRepository;

    @Mock
    private CtThhlastikaPressThreatsMapperImpl ctThhlastikaPressThreatsMapper = new CtThhlastikaPressThreatsMapperImpl();

    private CtThhlastikaPressThreatDTO ctThhlastikaPressThreatDTO;

    private CtThhlastikaPressThreatDTO ctThhlastikaPressThreatPatchDTO;

    private CtThhlastikaPressThreats ctThhlastikaPressThreats;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);

        ctThhlastikaPressThreatsService = new CtThhlastikaPressThreatsServiceImpl();
        ctThhlastikaPressThreatsService.setCtThhlastikaPressThreatsRepository(ctThhlastikaPressThreatsRepository);
        ctThhlastikaPressThreatsService.setCtThhlastikaPressThreatsSearchRepository(ctThhlastikaPressThreatsSearchRepository);
        ctThhlastikaPressThreatsService.setCtThhlastikaPressThreatsMapper(ctThhlastikaPressThreatsMapper);

        // Init CtPressThreatDTO
        ctThhlastikaPressThreatDTO = new CtThhlastikaPressThreatDTO();
        ctThhlastikaPressThreatDTO.setActCode("TestingActCode");
        ctThhlastikaPressThreatDTO.setDescriptionEn("TestingDescriptionEn");
        ctThhlastikaPressThreatDTO.setRemarks("TestingRemarks");

        // Init CtPressThreatPatchDTO
        ctThhlastikaPressThreatPatchDTO = new CtThhlastikaPressThreatDTO();
        ctThhlastikaPressThreatPatchDTO.setActCode("TestingPatchActCode");
        ctThhlastikaPressThreatPatchDTO.setDescriptionEn("TestingPatchDescriptionEn");
        ctThhlastikaPressThreatPatchDTO.setRemarks("TestingPatchRemarks");

        // Init CtPressThreat
        ctThhlastikaPressThreats = new CtThhlastikaPressThreats();
        ctThhlastikaPressThreats.setId(1l);
        ctThhlastikaPressThreats.setActCode("TestingActCode");
        ctThhlastikaPressThreats.setDescriptionEn("TestingDescriptionEn");
        ctThhlastikaPressThreats.setRemarks("TestingRemarks");
    }

    @Test
    void findByIdTest(){
        Mockito.when(ctThhlastikaPressThreatsRepository.findById(ctThhlastikaPressThreats.getId())).thenReturn(Optional.of(ctThhlastikaPressThreats));

        CtThhlastikaPressThreats ctThhlastikaPressThreatsActual = ctThhlastikaPressThreatsService.findById(ctThhlastikaPressThreats.getId());

        Mockito.verify(ctThhlastikaPressThreatsRepository, Mockito.times(1)).findById(ctThhlastikaPressThreats.getId());
        assertEquals(ctThhlastikaPressThreats.getId(), ctThhlastikaPressThreatsActual.getId());
        assertEquals(ctThhlastikaPressThreats.getRemarks(), ctThhlastikaPressThreatsActual.getRemarks());
        assertEquals(ctThhlastikaPressThreats.getActCode(), ctThhlastikaPressThreatsActual.getActCode());
        assertEquals(ctThhlastikaPressThreats.getDescriptionEn(), ctThhlastikaPressThreatsActual.getDescriptionEn());
    }

    @Test
    void findByActCodeEqualsTest(){
        Mockito.when(ctThhlastikaPressThreatsRepository.findByActCodeEquals(ctThhlastikaPressThreats.getActCode())).thenReturn(ctThhlastikaPressThreats);

        CtThhlastikaPressThreats ctThhlastikaPressThreatsActual = ctThhlastikaPressThreatsService.findByActCodeEquals("TestingActCode");

        Mockito.verify(ctThhlastikaPressThreatsRepository, Mockito.times(1)).findByActCodeEquals("TestingActCode");
        assertEquals(ctThhlastikaPressThreats.getId(), ctThhlastikaPressThreatsActual.getId());
        assertEquals(ctThhlastikaPressThreats.getActCode(), ctThhlastikaPressThreatsActual.getActCode());
        assertEquals(ctThhlastikaPressThreats.getDescriptionEn(), ctThhlastikaPressThreatsActual.getDescriptionEn());
        assertEquals(ctThhlastikaPressThreats.getRemarks(), ctThhlastikaPressThreatsActual.getRemarks());
    }

    @Test
    void addPressThreatTest(){
        Mockito.when(ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreatsMapper.
                CtThhlastikaPressThreatsDTOToCtThhlastikaPressThreats(ctThhlastikaPressThreatDTO))).thenReturn(ctThhlastikaPressThreats);

        CtThhlastikaPressThreats ctThhlastikaPressThreatsActual = ctThhlastikaPressThreatsService.addPressThreat(ctThhlastikaPressThreatDTO);

        assertEquals(ctThhlastikaPressThreats.getActCode(), ctThhlastikaPressThreatsActual.getActCode());
        assertEquals(ctThhlastikaPressThreats.getDescriptionEn(), ctThhlastikaPressThreatsActual.getDescriptionEn());
        assertEquals(ctThhlastikaPressThreats.getRemarks(), ctThhlastikaPressThreatsActual.getRemarks());

        Mockito.verify(ctThhlastikaPressThreatsRepository, Mockito.times(1)).save(ctThhlastikaPressThreatsMapper.
                CtThhlastikaPressThreatsDTOToCtThhlastikaPressThreats(ctThhlastikaPressThreatDTO));
    }

    @Test
    void patchPressThreatTest(){
        Mockito.when(ctThhlastikaPressThreatsRepository.findById(ctThhlastikaPressThreats.getId())).thenReturn(Optional.of(ctThhlastikaPressThreats));

        boolean patchFlag = ctThhlastikaPressThreatsService.patchPressThreat(ctThhlastikaPressThreats.getId(), ctThhlastikaPressThreatPatchDTO);

        Mockito.verify(ctThhlastikaPressThreatsRepository, Mockito.times(1)).findById(ctThhlastikaPressThreats.getId());
        Mockito.verify(ctThhlastikaPressThreatsRepository, Mockito.times(1)).save(any());
        assertTrue(patchFlag);
    }

    @Test
    void deletePressThreatTest(){
        Mockito.when(ctThhlastikaPressThreatsRepository.findById(ctThhlastikaPressThreats.getId())).thenReturn(Optional.of(ctThhlastikaPressThreats));

        boolean patchFlag = ctThhlastikaPressThreatsService.deletePressThreat(ctThhlastikaPressThreats.getId());

        Mockito.verify(ctThhlastikaPressThreatsRepository, Mockito.times(1)).findById(ctThhlastikaPressThreats.getId());
        Mockito.verify(ctThhlastikaPressThreatsRepository, Mockito.times(1)).delete(ctThhlastikaPressThreats);
        assertTrue(patchFlag);
    }

    @Test
    void findAllTest(){
        ctThhlastikaPressThreatsService.findAll();

        Mockito.verify(ctThhlastikaPressThreatsRepository, Mockito.times(1)).findAll();
    }

    @Test
    void getAllActCodesTest(){
        ctThhlastikaPressThreatsService.getAllActCodes();

        Mockito.verify(ctThhlastikaPressThreatsRepository, Mockito.times(1)).findDistinctByActCodeOrderByActCode();
    }

    @Test
    void getAllByPagingTest(){
        ctThhlastikaPressThreatsService.getAllByPaging(0);

        Mockito.verify(ctThhlastikaPressThreatsRepository, Mockito.times(1)).findAll((Pageable) any());
    }

    @Test
    void searchCtThhlastikaPressThreatsTest(){
        List<SearchCriteria> searchCriteriaList = new ArrayList<>();
        ctThhlastikaPressThreatsService.searchCtThhlastikaPressThreats(searchCriteriaList, 10, 0, "ASC");

        Mockito.verify(ctThhlastikaPressThreatsSearchRepository, Mockito.times(1)).
                searchCtThhlastikaPressThreats(searchCriteriaList, 10, 0, "ASC");
    }

    @Test
    void downloadCtThhlastikaPressThreatsTest(){
        List<SearchCriteria> searchCriteriaList = new ArrayList<>();
        ctThhlastikaPressThreatsService.downloadCtThhlastikaPressThreats(searchCriteriaList, "ASC");

        Mockito.verify(ctThhlastikaPressThreatsSearchRepository, Mockito.times(1)).
                downloadCtThhlastikaPressThreats(searchCriteriaList, "ASC");
    }

}
