package com.teicm.kerkinibackend.service.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaEidh;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaEidhRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaEidhSearchRepository;
import com.teicm.kerkinibackend.services.thhlastika.CtThhlastikaEidhServiceImpl;
import com.teicm.kerkinibackend.v1.mappers.thhlastika.CtThhlastikaEidhMapperImpl;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaEidosDTO;
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

public class CtThhlastikaEidhServiceImplTest {

    private CtThhlastikaEidhServiceImpl ctThhlastikaEidhService;

    @Mock
    private CtThhlastikaEidhRepository ctThhlastikaEidhRepository;

    @Mock
    private CtThhlastikaEidhSearchRepository ctThhlastikaEidhSearchRepository;

    @Mock
    private CtThhlastikaEidhMapperImpl ctThhlastikaEidhMapper;

    private CtThhlastikaEidosDTO ctThhlastikaEidosDTO;

    private CtThhlastikaEidosDTO ctThhlastikaEidosPatchDTO;

    private CtThhlastikaEidh ctThhlastikaEidh;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);

        ctThhlastikaEidhService = new CtThhlastikaEidhServiceImpl();
        ctThhlastikaEidhService.setCtThhlastikaEidhRepository(ctThhlastikaEidhRepository);
        ctThhlastikaEidhService.setCtThhlastikaEidhSearchRepository(ctThhlastikaEidhSearchRepository);
        ctThhlastikaEidhService.setCtThhlastikaEidhMapper(ctThhlastikaEidhMapper);

        // Init CtEidosDTO
        ctThhlastikaEidosDTO = new CtThhlastikaEidosDTO();
        ctThhlastikaEidosDTO.setEidos("TestingEidos");

        // Init CtEidosPatchDTO
        ctThhlastikaEidosPatchDTO = new CtThhlastikaEidosDTO();
        ctThhlastikaEidosPatchDTO.setEidos("TestingPatchEidos");

        // Init CtEidh
        ctThhlastikaEidh = new CtThhlastikaEidh();
        ctThhlastikaEidh.setId(1l);
        ctThhlastikaEidh.setEidos("TestingEidos");
    }

    @Test
    void addEidosTest(){
        Mockito.when(ctThhlastikaEidhRepository.save(ctThhlastikaEidhMapper.CtThhlastikaEidhDTOToCtThhlastikaEidh(ctThhlastikaEidosDTO))).thenReturn(ctThhlastikaEidh);

        CtThhlastikaEidh ctThhlastikaEidhActual = ctThhlastikaEidhService.addEidos(ctThhlastikaEidosDTO);

        assertEquals(ctThhlastikaEidh.getEidos(), ctThhlastikaEidhActual.getEidos());

        Mockito.verify(ctThhlastikaEidhRepository, Mockito.times(1)).save(ctThhlastikaEidhMapper.CtThhlastikaEidhDTOToCtThhlastikaEidh(ctThhlastikaEidosDTO));
    }

    @Test
    void findByIdTest(){
        Mockito.when(ctThhlastikaEidhRepository.findById(ctThhlastikaEidh.getId())).thenReturn(Optional.of(ctThhlastikaEidh));

        CtThhlastikaEidh ctThhlastikaEidhActual = ctThhlastikaEidhService.findById(ctThhlastikaEidh.getId());

        Mockito.verify(ctThhlastikaEidhRepository, Mockito.times(1)).findById(ctThhlastikaEidh.getId());
        assertEquals(ctThhlastikaEidh.getId(), ctThhlastikaEidhActual.getId());
        assertEquals(ctThhlastikaEidh.getEidos(), ctThhlastikaEidhActual.getEidos());
    }

    @Test
    void findByEidosTest(){
        Mockito.when(ctThhlastikaEidhRepository.findByEidosEquals(ctThhlastikaEidh.getEidos())).thenReturn(ctThhlastikaEidh);

        CtThhlastikaEidh ctThhlastikaEidhActual = ctThhlastikaEidhService.findByEidos("TestingEidos");

        Mockito.verify(ctThhlastikaEidhRepository, Mockito.times(1)).findByEidosEquals("TestingEidos");
        assertEquals(ctThhlastikaEidh.getId(), ctThhlastikaEidhActual.getId());
        assertEquals(ctThhlastikaEidh.getEidos(), ctThhlastikaEidhActual.getEidos());
    }

    @Test
    void patchEidosTest(){
        Mockito.when(ctThhlastikaEidhRepository.findById(ctThhlastikaEidh.getId())).thenReturn(Optional.of(ctThhlastikaEidh));

        boolean patchFlag = ctThhlastikaEidhService.patchEidos(ctThhlastikaEidh.getId(), ctThhlastikaEidosPatchDTO);

        Mockito.verify(ctThhlastikaEidhRepository, Mockito.times(1)).findById(ctThhlastikaEidh.getId());
        Mockito.verify(ctThhlastikaEidhRepository, Mockito.times(1)).save(any());
        assertTrue(patchFlag);
    }

    @Test
    void deleteEidosTest(){
        Mockito.when(ctThhlastikaEidhRepository.findById(ctThhlastikaEidh.getId())).thenReturn(Optional.of(ctThhlastikaEidh));

        boolean deleteFlag = ctThhlastikaEidhService.deleteEidos(ctThhlastikaEidh.getId());

        Mockito.verify(ctThhlastikaEidhRepository, Mockito.times(1)).findById(ctThhlastikaEidh.getId());
        Mockito.verify(ctThhlastikaEidhRepository, Mockito.times(1)).delete(ctThhlastikaEidh);
        assertTrue(deleteFlag);
    }

    @Test
    void getAllEidhTest(){
        ctThhlastikaEidhService.getAllEidh();

        Mockito.verify(ctThhlastikaEidhRepository, Mockito.times(1)).findDistinctByEidosOrderByEidos();
    }

    @Test
    void getAllByPagingTest(){
        ctThhlastikaEidhService.getAllByPaging(0);

        Mockito.verify(ctThhlastikaEidhRepository, Mockito.times(1)).findAll((Pageable) any());
    }

    @Test
    void searchCtThhlastikaEidhTest(){
        List<SearchCriteria> searchCriteriaList = new ArrayList<>();
        ctThhlastikaEidhService.searchCtThhlastikaEidh(searchCriteriaList, 10, 0, "ASC");

        Mockito.verify(ctThhlastikaEidhSearchRepository, Mockito.times(1)).searchCtThhlastikaEidh(searchCriteriaList, 10, 0, "ASC");
    }

    @Test
    void downloadCtThhlastikaEidhTest(){
        List<SearchCriteria> searchCriteriaList = new ArrayList<>();
        ctThhlastikaEidhService.downloadCtThhlastikaEidh(searchCriteriaList, "ASC");

        Mockito.verify(ctThhlastikaEidhSearchRepository, Mockito.times(1)).downloadCtThhlastikaEidh(searchCriteriaList,"ASC");
    }

}
