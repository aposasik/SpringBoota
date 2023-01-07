package com.teicm.kerkinibackend.service.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaEidh;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXEidh;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaEidhRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnXEidhRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnXEidhSearchRepository;
import com.teicm.kerkinibackend.services.thhlastika.DeigmaThhlastikwnXEidhServiceImpl;
import com.teicm.kerkinibackend.v1.mappers.thhlastika.DeigmaThhlastikwnXEidhMapperImpl;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXEidhDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Pageable;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;

public class DeigmaThhlastikwnXEidhServiceImplTest {

    private DeigmaThhlastikwnXEidhServiceImpl deigmaThhlastikwnXEidhService;

    @Mock
    private DeigmaThhlastikwnXEidhRepository deigmaThhlastikwnXEidhRepository;

    @Mock
    private DeigmaThhlastikwnXEidhSearchRepository deigmaThhlastikwnXEidhSearchRepository;

    @Mock
    private DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    @Mock
    private CtThhlastikaEidhRepository ctThhlastikaEidhRepository;

    @Mock
    private DeigmaThhlastikwnXEidhMapperImpl deigmaThhlastikwnXEidhMapper;

    private DeigmaThhlastikwn deigmaThhlastikwn;

    private DeigmaThhlastikwn deigmaThhlastikwn2;

    private DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh;

    private CtThhlastikaEidh ctThhlastikaEidh;

    private CtThhlastikaEidh ctThhlastikaEidh2;

    private DeigmaThhlastikwnXEidhDTO deigmaThhlastikwnXEidhDTO;

    private DeigmaThhlastikwnXEidhDTO deigmaThhlastikwnXEidhPatchDTO;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);

        deigmaThhlastikwnXEidhService = new DeigmaThhlastikwnXEidhServiceImpl();
        deigmaThhlastikwnXEidhService.setDeigmaThhlastikwnXEidhRepository(deigmaThhlastikwnXEidhRepository);
        deigmaThhlastikwnXEidhService.setDeigmaThhlastikwnXEidhSearchRepository(deigmaThhlastikwnXEidhSearchRepository);
        deigmaThhlastikwnXEidhService.setDeigmaThhlastikwnRepository(deigmaThhlastikwnRepository);
        deigmaThhlastikwnXEidhService.setCtThhlastikaEidhRepository(ctThhlastikaEidhRepository);
        deigmaThhlastikwnXEidhService.setDeigmaThhlastikwnXEidhMapper(deigmaThhlastikwnXEidhMapper);

        // Init DeigmaThhlastikwn
        deigmaThhlastikwn = new DeigmaThhlastikwn();
        deigmaThhlastikwn.setId(1l);

        // Init DeigmaThhlastikwn2
        deigmaThhlastikwn2 = new DeigmaThhlastikwn();
        deigmaThhlastikwn2.setId(2l);

        // Init CtEidos
        ctThhlastikaEidh = new CtThhlastikaEidh();
        ctThhlastikaEidh.setId(1l);
        ctThhlastikaEidh.setEidos("Testing");

        // Init CtEidos2
        ctThhlastikaEidh2 = new CtThhlastikaEidh();
        ctThhlastikaEidh2.setId(2l);
        ctThhlastikaEidh2.setEidos("Testing2");

        // Init DeigmaThhlastikwnXEidh
        deigmaThhlastikwnXEidh = new DeigmaThhlastikwnXEidh();
        deigmaThhlastikwnXEidh.setId(1l);
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwn);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidh);
        deigmaThhlastikwnXEidh.setEokParII(true);
        deigmaThhlastikwnXEidh.setEokParIV(false);
        deigmaThhlastikwnXEidh.setEokParV(false);
        deigmaThhlastikwnXEidh.setFulo("TestFulo");
        deigmaThhlastikwnXEidh.setHlikia("TestHlikia");
        deigmaThhlastikwnXEidh.setParathrhseis("Testing Parathrhseis");
        deigmaThhlastikwnXEidh.setPlhthos(3);
        deigmaThhlastikwnXEidh.setSxetikhAfthonia("TestSxetikhAfthonia");

        // Init DeigmaThhlastikwnXEidhDTO
        deigmaThhlastikwnXEidhDTO = new DeigmaThhlastikwnXEidhDTO();
        deigmaThhlastikwnXEidhDTO.setDeigmaThhlastikwnId(deigmaThhlastikwn.getId());
        deigmaThhlastikwnXEidhDTO.setCtEidos(ctThhlastikaEidh.getEidos());
        deigmaThhlastikwnXEidhDTO.setEokParII(true);
        deigmaThhlastikwnXEidhDTO.setEokParIV(false);
        deigmaThhlastikwnXEidhDTO.setEokParV(false);
        deigmaThhlastikwnXEidhDTO.setFulo("TestFulo");
        deigmaThhlastikwnXEidhDTO.setHlikia("TestHlikia");
        deigmaThhlastikwnXEidhDTO.setParathrhseis("Testing Parathrhseis");
        deigmaThhlastikwnXEidhDTO.setPlhthos(3);
        deigmaThhlastikwnXEidhDTO.setSxetikhAfthonia("TestSxetikhAfthonia");

        // Init DeigmaThhlastikwnXEidhPatchDTO
        deigmaThhlastikwnXEidhPatchDTO = new DeigmaThhlastikwnXEidhDTO();
        deigmaThhlastikwnXEidhPatchDTO.setDeigmaThhlastikwnId(deigmaThhlastikwn2.getId());
        deigmaThhlastikwnXEidhPatchDTO.setCtEidos(ctThhlastikaEidh2.getEidos());
        deigmaThhlastikwnXEidhPatchDTO.setEokParII(true);
        deigmaThhlastikwnXEidhPatchDTO.setEokParIV(false);
        deigmaThhlastikwnXEidhPatchDTO.setEokParV(false);
        deigmaThhlastikwnXEidhPatchDTO.setFulo("TestFulo");
        deigmaThhlastikwnXEidhPatchDTO.setHlikia("TestHlikia");
        deigmaThhlastikwnXEidhPatchDTO.setParathrhseis("Testing Parathrhseis");
        deigmaThhlastikwnXEidhPatchDTO.setPlhthos(3);
        deigmaThhlastikwnXEidhPatchDTO.setSxetikhAfthonia("TestSxetikhAfthonia");
    }

    @Test
    void getByIdTest(){
        Mockito.when(deigmaThhlastikwnXEidhRepository.findById(deigmaThhlastikwnXEidh.getId())).thenReturn(Optional.of(deigmaThhlastikwnXEidh));

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhActual = deigmaThhlastikwnXEidhService
                .getById(deigmaThhlastikwnXEidh.getId());

        Mockito.verify(deigmaThhlastikwnXEidhRepository, Mockito.times(1)).findById(deigmaThhlastikwnXEidh.getId());
        assertEquals(deigmaThhlastikwnXEidh.getId(), deigmaThhlastikwnXEidhActual.getId());
        assertEquals(deigmaThhlastikwnXEidh.getDeigmaThhlastikwn(), deigmaThhlastikwnXEidhActual.getDeigmaThhlastikwn());
        assertEquals(deigmaThhlastikwnXEidh.getCtThhlastikaEidh(), deigmaThhlastikwnXEidhActual.getCtThhlastikaEidh());
        assertEquals(deigmaThhlastikwnXEidh.getSxetikhAfthonia(), deigmaThhlastikwnXEidhActual.getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidh.getParathrhseis(), deigmaThhlastikwnXEidhActual.getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidh.getHlikia(), deigmaThhlastikwnXEidhActual.getHlikia());
        assertEquals(deigmaThhlastikwnXEidh.getFulo(), deigmaThhlastikwnXEidhActual.getFulo());
        assertEquals(deigmaThhlastikwnXEidh.getPlhthos(), deigmaThhlastikwnXEidhActual.getPlhthos());
        assertEquals(deigmaThhlastikwnXEidh.getEokParII(), deigmaThhlastikwnXEidhActual.getEokParII());
        assertEquals(deigmaThhlastikwnXEidh.getEokParIV(), deigmaThhlastikwnXEidhActual.getEokParIV());
        assertEquals(deigmaThhlastikwnXEidh.getEokParV(), deigmaThhlastikwnXEidhActual.getEokParV());
    }

    @Test
    void getDeigmaThhlastikwnXEidhByDeigmaThhlastikwnIsTest(){
        Mockito.when(deigmaThhlastikwnRepository.findById(deigmaThhlastikwn.getId())).thenReturn(Optional.of(deigmaThhlastikwn));

        Set<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidhSet = new HashSet<>();
        deigmaThhlastikwnXEidhSet.add(deigmaThhlastikwnXEidh);
        Mockito.when(deigmaThhlastikwnXEidhRepository.findDeigmaThhlastikwnXEidhByDeigmaThhlastikwnIs(deigmaThhlastikwn)).thenReturn(deigmaThhlastikwnXEidhSet);

        Mockito.when(deigmaThhlastikwnXEidhMapper.deigmaThhlastikwnXEidhToDeigmaThhlastikwnXEidhDTO(deigmaThhlastikwnXEidh)).thenReturn(deigmaThhlastikwnXEidhDTO);

        Set<DeigmaThhlastikwnXEidhDTO> deigmaThhlastikwnXEidhDTOSetReturned = deigmaThhlastikwnXEidhService.getDeigmaThhlastikwnXEidhByDeigmaThhlastikwnIs(deigmaThhlastikwn.getId());

        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findById(deigmaThhlastikwn.getId());
        Mockito.verify(deigmaThhlastikwnXEidhRepository, Mockito.times(1)).findDeigmaThhlastikwnXEidhByDeigmaThhlastikwnIs(deigmaThhlastikwn);
        Mockito.verify(deigmaThhlastikwnXEidhMapper, Mockito.times(1)).deigmaThhlastikwnXEidhToDeigmaThhlastikwnXEidhDTO(deigmaThhlastikwnXEidh);
        assertEquals(1,deigmaThhlastikwnXEidhDTOSetReturned.size());
    }

    // Could be farther tested if necessary
    @Test
    void addDeigmaThhlastikwnXEidhTest(){
        Mockito.when(deigmaThhlastikwnXEidhMapper.deigmaThhlastikwnXEidhDTOToDeigmaThhlastikwnXEidh(deigmaThhlastikwnXEidhDTO)).thenReturn(deigmaThhlastikwnXEidh);

        Mockito.when(deigmaThhlastikwnRepository.findById(deigmaThhlastikwn.getId())).thenReturn(Optional.of(deigmaThhlastikwn));

        Mockito.when(ctThhlastikaEidhRepository.findByEidosEquals(deigmaThhlastikwnXEidhDTO.getCtEidos())).thenReturn(ctThhlastikaEidh);

        Mockito.when(deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh)).thenReturn(deigmaThhlastikwnXEidh);

        Mockito.when(deigmaThhlastikwnXEidhMapper.deigmaThhlastikwnXEidhToDeigmaThhlastikwnXEidhDTO(deigmaThhlastikwnXEidh)).thenReturn(deigmaThhlastikwnXEidhDTO);

        deigmaThhlastikwnXEidhService.addDeigmaThhlastikwnXEidh(deigmaThhlastikwnXEidhDTO);

        Mockito.verify(deigmaThhlastikwnXEidhMapper, Mockito.times(1)).deigmaThhlastikwnXEidhDTOToDeigmaThhlastikwnXEidh(deigmaThhlastikwnXEidhDTO);
        Mockito.verify(deigmaThhlastikwnXEidhMapper, Mockito.times(1)).deigmaThhlastikwnXEidhToDeigmaThhlastikwnXEidhDTO(deigmaThhlastikwnXEidh);
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findById(deigmaThhlastikwn.getId());
        Mockito.verify(ctThhlastikaEidhRepository, Mockito.times(1)).findByEidosEquals(deigmaThhlastikwnXEidhDTO.getCtEidos());
        Mockito.verify(deigmaThhlastikwnXEidhRepository, Mockito.times(1)).save(deigmaThhlastikwnXEidh);
    }

    @Test
    void patchDeigmaThhlastikwnXEidhTest(){
        Mockito.when(deigmaThhlastikwnXEidhRepository.findById(deigmaThhlastikwnXEidh.getId())).thenReturn(Optional.of(deigmaThhlastikwnXEidh));

        Mockito.when(deigmaThhlastikwnRepository.findById(deigmaThhlastikwnXEidhPatchDTO.getDeigmaThhlastikwnId())).thenReturn(Optional.of(deigmaThhlastikwn2));

        Mockito.when(deigmaThhlastikwnRepository.findById(deigmaThhlastikwnXEidh.getDeigmaThhlastikwn().getId())).thenReturn(Optional.of(deigmaThhlastikwn));


        Mockito.when(ctThhlastikaEidhRepository.findByEidosEquals(deigmaThhlastikwnXEidhPatchDTO.getCtEidos())).thenReturn(ctThhlastikaEidh2);

        Mockito.when(ctThhlastikaEidhRepository.findById(deigmaThhlastikwnXEidh.getCtThhlastikaEidh().getId())).thenReturn(Optional.of(ctThhlastikaEidh));

        boolean patchFlag = deigmaThhlastikwnXEidhService.patchDeigmaThhlastikwnXEidh(deigmaThhlastikwnXEidh.getId(), deigmaThhlastikwnXEidhPatchDTO);

        Mockito.verify(deigmaThhlastikwnXEidhRepository, Mockito.times(1)).findById(deigmaThhlastikwnXEidh.getId());
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findById(deigmaThhlastikwnXEidhPatchDTO.getDeigmaThhlastikwnId());
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findById(deigmaThhlastikwnXEidh.getDeigmaThhlastikwn().getId());
        Mockito.verify(ctThhlastikaEidhRepository, Mockito.times(1)).findByEidosEquals(deigmaThhlastikwnXEidhPatchDTO.getCtEidos());
        Mockito.verify(ctThhlastikaEidhRepository, Mockito.times(1)).findById(1l);
        Mockito.verify(deigmaThhlastikwnXEidhRepository, Mockito.times(1)).save(deigmaThhlastikwnXEidh);
        assertTrue(patchFlag);
    }

    @Test
    void deleteDeigmaThhlastikwnXEidhTest(){
        Mockito.when(deigmaThhlastikwnXEidhRepository.findById(deigmaThhlastikwnXEidh.getId())).thenReturn(Optional.of(deigmaThhlastikwnXEidh));

        boolean deleteFlag = deigmaThhlastikwnXEidhService.deleteDeigmaThhlastikwnXEidh(deigmaThhlastikwnXEidh.getId());

        Mockito.verify(deigmaThhlastikwnXEidhRepository, Mockito.times(1)).findById(deigmaThhlastikwnXEidh.getId());
        Mockito.verify(deigmaThhlastikwnXEidhRepository, Mockito.times(1)).delete(deigmaThhlastikwnXEidh);
        assertTrue(deleteFlag);
    }

    @Test
    void getAllByPagingTest(){
        deigmaThhlastikwnXEidhService.getAllByPaging(0);

        Mockito.verify(deigmaThhlastikwnXEidhRepository, Mockito.times(1)).findAll((Pageable) any());
    }

    @Test
    void searchDeigmaThhlastikwnXEidhTest(){
        List<SearchCriteria> searchCriteriaList = new ArrayList<>();
        deigmaThhlastikwnXEidhService.searchDeigmaThhlastikwnXEidh(searchCriteriaList, 10, 0, "ASC");

        Mockito.verify(deigmaThhlastikwnXEidhSearchRepository, Mockito.times(1))
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 10, 0, "ASC");
    }

    @Test
    void downloadDeigmaThhlastikwnXEidhTest(){
        List<SearchCriteria> searchCriteriaList = new ArrayList<>();
        deigmaThhlastikwnXEidhService.downloadDeigmaThhlastikwnXEidh(searchCriteriaList,"ASC");

        Mockito.verify(deigmaThhlastikwnXEidhSearchRepository, Mockito.times(1))
                .downloadDeigmaThhlastikwnXEidh(searchCriteriaList, "ASC");
    }

    @Test
    void getDeigmaThhlastikwnXEidhAutocompletes(){
        deigmaThhlastikwnXEidhService.getDeigmaThhlastikwnXEidhAutocompletes();

        Mockito.verify(deigmaThhlastikwnXEidhRepository, Mockito.times(1)).findDistinctByDeigmaThhlastikwnIdOrderByDeigmaThhlastikwnId();
        Mockito.verify(ctThhlastikaEidhRepository, Mockito.times(1)).findDistinctByEidosOrderByEidos();
        Mockito.verify(deigmaThhlastikwnXEidhRepository, Mockito.times(1)).findDistinctBySxetikhAfthoniaOrderBySxetikhAfthonia();
        Mockito.verify(deigmaThhlastikwnXEidhRepository, Mockito.times(1)).findDistinctByHlikiaOrderByHlikia();
        Mockito.verify(deigmaThhlastikwnXEidhRepository, Mockito.times(1)).findDistinctByFuloOrderByFulo();
    }

}
