package com.teicm.kerkinibackend.service.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaPressThreats;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXPressThreats;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaPressThreatsRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnXPressThreatsRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnXPressThreatsSearchRepository;
import com.teicm.kerkinibackend.services.thhlastika.DeigmaThhlastikwnXPressThreatsServiceImpl;
import com.teicm.kerkinibackend.v1.mappers.thhlastika.DeigmaThhlastikwnXPressThreatsMapperImpl;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXPressThreatDTO;
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

public class DeigmaThhlastikwnXPressThreatsServiceImplTest {

    private DeigmaThhlastikwnXPressThreatsServiceImpl deigmaThhlastikwnXPressThreatsService;

    @Mock
    private DeigmaThhlastikwnXPressThreatsRepository deigmaThhlastikwnXPressThreatsRepository;

    @Mock
    private DeigmaThhlastikwnXPressThreatsSearchRepository deigmaThhlastikwnXPressThreatsSearchRepository;

    @Mock
    private DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    @Mock
    private CtThhlastikaPressThreatsRepository ctThhlastikaPressThreatsRepository;

    @Mock
    private DeigmaThhlastikwnXPressThreatsMapperImpl deigmaThhlastikwnXPressThreatsMapper;

    private DeigmaThhlastikwn deigmaThhlastikwn;

    private DeigmaThhlastikwn deigmaThhlastikwn2;

    private DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreats;

    private CtThhlastikaPressThreats ctThhlastikaPressThreats;

    private CtThhlastikaPressThreats ctThhlastikaPressThreats2;

    private DeigmaThhlastikwnXPressThreatDTO deigmaThhlastikwnXPressThreatDTO;

    private DeigmaThhlastikwnXPressThreatDTO deigmaThhlastikwnXPressThreatPatchDTO;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);

        deigmaThhlastikwnXPressThreatsService = new DeigmaThhlastikwnXPressThreatsServiceImpl();
        deigmaThhlastikwnXPressThreatsService.setDeigmaThhlastikwnXPressThreatsRepository(deigmaThhlastikwnXPressThreatsRepository);
        deigmaThhlastikwnXPressThreatsService.setDeigmaThhlastikwnXPressThreatsSearchRepository(deigmaThhlastikwnXPressThreatsSearchRepository);
        deigmaThhlastikwnXPressThreatsService.setDeigmaThhlastikwnRepository(deigmaThhlastikwnRepository);
        deigmaThhlastikwnXPressThreatsService.setCtThhlastikaPressThreatsRepository(ctThhlastikaPressThreatsRepository);
        deigmaThhlastikwnXPressThreatsService.setDeigmaThhlastikwnXPressThreatsMapper(deigmaThhlastikwnXPressThreatsMapper);

        // Init DeigmaThhlastikwn
        deigmaThhlastikwn = new DeigmaThhlastikwn();
        deigmaThhlastikwn.setId(1l);

        // Init DeigmaThhlastikwn2
        deigmaThhlastikwn2 = new DeigmaThhlastikwn();
        deigmaThhlastikwn2.setId(2l);

        // Init CtPressThreats
        ctThhlastikaPressThreats = new CtThhlastikaPressThreats();
        ctThhlastikaPressThreats.setId(1l);
        ctThhlastikaPressThreats.setActCode("Testing");

        // Init CtPressThreats2
        ctThhlastikaPressThreats2 = new CtThhlastikaPressThreats();
        ctThhlastikaPressThreats2.setId(2l);
        ctThhlastikaPressThreats2.setActCode("Testing2");

        // Init XPressThreats
        deigmaThhlastikwnXPressThreats = new DeigmaThhlastikwnXPressThreats();
        deigmaThhlastikwnXPressThreats.setId(1l);
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwn);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreats);
        deigmaThhlastikwnXPressThreats.setImportance("TestingImportance");
        deigmaThhlastikwnXPressThreats.setKwdikosEidous("TestingKwdikosEidous");
        deigmaThhlastikwnXPressThreats.setPressThreat("TestingPressThreat");

        // Init DTO
        deigmaThhlastikwnXPressThreatDTO = new DeigmaThhlastikwnXPressThreatDTO();
        deigmaThhlastikwnXPressThreatDTO.setDeigmaThhlastikwnId(deigmaThhlastikwn.getId());
        deigmaThhlastikwnXPressThreatDTO.setCtActCode(ctThhlastikaPressThreats.getActCode());
        deigmaThhlastikwnXPressThreatDTO.setImportance("TestingImportance");
        deigmaThhlastikwnXPressThreatDTO.setKwdikosEidous("TestingKwdikosEidous");
        deigmaThhlastikwnXPressThreatDTO.setPressThreat("TestingPressThreat");

        // Init PatchDTO
        deigmaThhlastikwnXPressThreatPatchDTO = new DeigmaThhlastikwnXPressThreatDTO();
        deigmaThhlastikwnXPressThreatPatchDTO.setDeigmaThhlastikwnId(deigmaThhlastikwn2.getId());
        deigmaThhlastikwnXPressThreatPatchDTO.setCtActCode(ctThhlastikaPressThreats2.getActCode());
        deigmaThhlastikwnXPressThreatPatchDTO.setImportance("TestingImportance");
        deigmaThhlastikwnXPressThreatPatchDTO.setKwdikosEidous("TestingKwdikosEidous");
        deigmaThhlastikwnXPressThreatPatchDTO.setPressThreat("TestingPressThreat");
    }

    @Test
    void getByIdTest(){
        Mockito.when(deigmaThhlastikwnXPressThreatsRepository.findById(deigmaThhlastikwnXPressThreats.getId())).thenReturn(Optional.of(deigmaThhlastikwnXPressThreats));

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsActual = deigmaThhlastikwnXPressThreatsService
                .getById(deigmaThhlastikwnXPressThreats.getId());

        Mockito.verify(deigmaThhlastikwnXPressThreatsRepository, Mockito.times(1)).findById(deigmaThhlastikwnXPressThreats.getId());
        assertEquals(deigmaThhlastikwnXPressThreats.getId(), deigmaThhlastikwnXPressThreatsActual.getId());
        assertEquals(deigmaThhlastikwnXPressThreats.getDeigmaThhlastikwn(), deigmaThhlastikwnXPressThreatsActual.getDeigmaThhlastikwn());
        assertEquals(deigmaThhlastikwnXPressThreats.getCtThhlastikaPressThreats(), deigmaThhlastikwnXPressThreatsActual.getCtThhlastikaPressThreats());
        assertEquals(deigmaThhlastikwnXPressThreats.getKwdikosEidous(), deigmaThhlastikwnXPressThreatsActual.getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreats.getPressThreat(), deigmaThhlastikwnXPressThreatsActual.getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreats.getImportance(), deigmaThhlastikwnXPressThreatsActual.getImportance());
    }

    @Test
    void getDeigmaThhlastikwnXPressThreatsByDeigmaThhlastikwnIs(){
        Mockito.when(deigmaThhlastikwnRepository.findById(deigmaThhlastikwn.getId())).thenReturn(Optional.of(deigmaThhlastikwn));

        Set<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsSet = new HashSet<>();
        deigmaThhlastikwnXPressThreatsSet.add(deigmaThhlastikwnXPressThreats);
        Mockito.when(deigmaThhlastikwnXPressThreatsRepository.findDeigmaThhlastikwnXPressThreatsByDeigmaThhlastikwnIs(deigmaThhlastikwn)).thenReturn(deigmaThhlastikwnXPressThreatsSet);

        Mockito.when(deigmaThhlastikwnXPressThreatsMapper.deigmaThhlastikwnXPressThreatstToDeigmaThhlastikwnXPressThreatDTO(deigmaThhlastikwnXPressThreats)).thenReturn(deigmaThhlastikwnXPressThreatDTO);

        Set<DeigmaThhlastikwnXPressThreatDTO> deigmaThhlastikwnXPressThreatsDTOSetReturned = deigmaThhlastikwnXPressThreatsService.getDeigmaThhlastikwnXPressThreatsByDeigmaThhlastikwnIs(deigmaThhlastikwn.getId());

        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findById(deigmaThhlastikwn.getId());
        Mockito.verify(deigmaThhlastikwnXPressThreatsRepository, Mockito.times(1)).findDeigmaThhlastikwnXPressThreatsByDeigmaThhlastikwnIs(deigmaThhlastikwn);
        Mockito.verify(deigmaThhlastikwnXPressThreatsMapper, Mockito.times(1)).deigmaThhlastikwnXPressThreatstToDeigmaThhlastikwnXPressThreatDTO(deigmaThhlastikwnXPressThreats);
        assertEquals(1,deigmaThhlastikwnXPressThreatsDTOSetReturned.size());
    }

    @Test
    void addDeigmaThhlastikwnXPressThreatsTest(){
        Mockito.when(deigmaThhlastikwnXPressThreatsMapper.deigmaThhlastikwnXPressThreatsDTOtToDeigmaThhlastikwnXPressThreats(deigmaThhlastikwnXPressThreatDTO)).thenReturn(deigmaThhlastikwnXPressThreats);

        Mockito.when(deigmaThhlastikwnRepository.findById(deigmaThhlastikwn.getId())).thenReturn(Optional.of(deigmaThhlastikwn));

        Mockito.when(ctThhlastikaPressThreatsRepository.findByActCodeEquals(deigmaThhlastikwnXPressThreatDTO.getCtActCode())).thenReturn(ctThhlastikaPressThreats);

        Mockito.when(deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats)).thenReturn(deigmaThhlastikwnXPressThreats);

        Mockito.when(deigmaThhlastikwnXPressThreatsMapper.deigmaThhlastikwnXPressThreatstToDeigmaThhlastikwnXPressThreatDTO(deigmaThhlastikwnXPressThreats)).thenReturn(deigmaThhlastikwnXPressThreatDTO);

        deigmaThhlastikwnXPressThreatsService.addDeigmaThhlastikwnXPressThreats(deigmaThhlastikwnXPressThreatDTO);

        Mockito.verify(deigmaThhlastikwnXPressThreatsMapper, Mockito.times(1)).deigmaThhlastikwnXPressThreatsDTOtToDeigmaThhlastikwnXPressThreats(deigmaThhlastikwnXPressThreatDTO);
        Mockito.verify(deigmaThhlastikwnXPressThreatsMapper, Mockito.times(1)).deigmaThhlastikwnXPressThreatstToDeigmaThhlastikwnXPressThreatDTO(deigmaThhlastikwnXPressThreats);
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findById(deigmaThhlastikwn.getId());
        Mockito.verify(ctThhlastikaPressThreatsRepository, Mockito.times(1)).findByActCodeEquals(deigmaThhlastikwnXPressThreatDTO.getCtActCode());
        Mockito.verify(deigmaThhlastikwnXPressThreatsRepository, Mockito.times(1)).save(deigmaThhlastikwnXPressThreats);
    }

    @Test
    void patchDeigmaThhlastikwnXPressThreatsTest(){
        Mockito.when(deigmaThhlastikwnXPressThreatsRepository.findById(deigmaThhlastikwnXPressThreats.getId())).thenReturn(Optional.of(deigmaThhlastikwnXPressThreats));

        Mockito.when(deigmaThhlastikwnRepository.findById(deigmaThhlastikwnXPressThreatPatchDTO.getDeigmaThhlastikwnId())).thenReturn(Optional.of(deigmaThhlastikwn2));

        Mockito.when(deigmaThhlastikwnRepository.findById(deigmaThhlastikwnXPressThreats.getDeigmaThhlastikwn().getId())).thenReturn(Optional.of(deigmaThhlastikwn));


        Mockito.when(ctThhlastikaPressThreatsRepository.findByActCodeEquals(deigmaThhlastikwnXPressThreatPatchDTO.getCtActCode())).thenReturn(ctThhlastikaPressThreats2);

        Mockito.when(ctThhlastikaPressThreatsRepository.findById(deigmaThhlastikwnXPressThreats.getCtThhlastikaPressThreats().getId())).thenReturn(Optional.of(ctThhlastikaPressThreats));

        boolean patchFlag = deigmaThhlastikwnXPressThreatsService.patchDeigmaThhlastikwnXPressThreats(deigmaThhlastikwnXPressThreats.getId(), deigmaThhlastikwnXPressThreatPatchDTO);

        Mockito.verify(deigmaThhlastikwnXPressThreatsRepository, Mockito.times(1)).findById(deigmaThhlastikwnXPressThreats.getId());
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findById(deigmaThhlastikwnXPressThreatPatchDTO.getDeigmaThhlastikwnId());
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findById(deigmaThhlastikwnXPressThreats.getDeigmaThhlastikwn().getId());
        Mockito.verify(ctThhlastikaPressThreatsRepository, Mockito.times(1)).findByActCodeEquals(deigmaThhlastikwnXPressThreatPatchDTO.getCtActCode());
        Mockito.verify(ctThhlastikaPressThreatsRepository, Mockito.times(1)).findById(1l);
        Mockito.verify(deigmaThhlastikwnXPressThreatsRepository, Mockito.times(1)).save(deigmaThhlastikwnXPressThreats);
        assertTrue(patchFlag);
    }

    @Test
    void deleteDeigmaThhlastikwnXPressThreatsTest(){
        Mockito.when(deigmaThhlastikwnXPressThreatsRepository.findById(deigmaThhlastikwnXPressThreats.getId())).thenReturn(Optional.of(deigmaThhlastikwnXPressThreats));

        boolean deleteFlag = deigmaThhlastikwnXPressThreatsService.deleteDeigmaThhlastikwnXPressThreats(deigmaThhlastikwnXPressThreats.getId());

        Mockito.verify(deigmaThhlastikwnXPressThreatsRepository, Mockito.times(1)).findById(deigmaThhlastikwnXPressThreats.getId());
        Mockito.verify(deigmaThhlastikwnXPressThreatsRepository, Mockito.times(1)).delete(deigmaThhlastikwnXPressThreats);
        assertTrue(deleteFlag);
    }

    @Test
    void getAllByPagingTest(){
        deigmaThhlastikwnXPressThreatsService.getAllByPaging(0);

        Mockito.verify(deigmaThhlastikwnXPressThreatsRepository, Mockito.times(1)).findAll((Pageable) any());
    }

    @Test
    void searchDeigmaThhlastikwnXEidhTest(){
        List<SearchCriteria> searchCriteriaList = new ArrayList<>();
        deigmaThhlastikwnXPressThreatsService.searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 10, 0, "ASC");

        Mockito.verify(deigmaThhlastikwnXPressThreatsSearchRepository, Mockito.times(1))
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 10, 0, "ASC");
    }

    @Test
    void downloadDeigmaThhlastikwnXEidhTest(){
        List<SearchCriteria> searchCriteriaList = new ArrayList<>();
        deigmaThhlastikwnXPressThreatsService.downloadDeigmaThhlastikwnXPressThreats(searchCriteriaList,"ASC");

        Mockito.verify(deigmaThhlastikwnXPressThreatsSearchRepository, Mockito.times(1))
                .downloadDeigmaThhlastikwnXPressThreats(searchCriteriaList, "ASC");
    }

    @Test
    void getDeigmaThhlastikwnXPressThreatsAutocompletes(){
        deigmaThhlastikwnXPressThreatsService.getDeigmaThhlastikwnXPressThreatsAutocompletes();

        Mockito.verify(deigmaThhlastikwnXPressThreatsRepository, Mockito.times(1)).findDistinctByDeigmaThhlastikwnIdOrderByDeigmaThhlastikwnId();
        Mockito.verify(ctThhlastikaPressThreatsRepository, Mockito.times(1)).findDistinctByActCodeOrderByActCode();
        Mockito.verify(deigmaThhlastikwnXPressThreatsRepository, Mockito.times(1)).findDistinctByKwdikosEidousOrderByKwdikosEidous();
        Mockito.verify(deigmaThhlastikwnXPressThreatsRepository, Mockito.times(1)).findDistinctByPressThreatOrderByPressThreat();
        Mockito.verify(deigmaThhlastikwnXPressThreatsRepository, Mockito.times(1)).findDistinctByImportanceOrderByImportance();
    }

}
