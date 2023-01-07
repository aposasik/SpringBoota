package com.teicm.kerkinibackend.service.thhlastika;

import com.teicm.kerkinibackend.domain.Deigmata;
import com.teicm.kerkinibackend.domain.Prwtokola;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.repositories.DeigmataRepository;
import com.teicm.kerkinibackend.repositories.PrwtokolaRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnSearchRepository;
import com.teicm.kerkinibackend.services.thhlastika.DeigmaThhlastikwnServiceImpl;
import com.teicm.kerkinibackend.v1.mappers.thhlastika.DeigmaThhlastikwnMapperImpl;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;

public class DeigmaThhlastikwnServiceImplTest {

    DeigmaThhlastikwnServiceImpl deigmaThhlastikwnService;

    @Mock
    private DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    @Mock
    private DeigmaThhlastikwnSearchRepository deigmaThhlastikwnSearchRepository;

    @Mock
    private DeigmataRepository deigmataRepository;

    @Mock
    private PrwtokolaRepository prwtokolaRepository;

    @Mock
    private DeigmaThhlastikwnMapperImpl deigmaThhlastikwnMapper;

    private DeigmaThhlastikwnDTO deigmaThhlastikwnDTO;

    private DeigmaThhlastikwnDTO deigmaThhlastikwnPatchDTO;

    private Prwtokola prwtokola;

    private DeigmaThhlastikwn deigmaThhlastikwn;

    private DeigmaThhlastikwn deigmaThhlastikwnReturned;

    private Deigmata deigmata;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);

        deigmaThhlastikwnService = new DeigmaThhlastikwnServiceImpl();
        deigmaThhlastikwnService.setDeigmaThhlastikwnRepository(deigmaThhlastikwnRepository);
        deigmaThhlastikwnService.setDeigmaThhlastikwnSearchRepository(deigmaThhlastikwnSearchRepository);
        deigmaThhlastikwnService.setPrwtokolaRepository(prwtokolaRepository);
        deigmaThhlastikwnService.setDeigmataRepository(deigmataRepository);
        deigmaThhlastikwnService.setDeigmaThhlastikwnMapper(deigmaThhlastikwnMapper);

        // Init DeigmaThhlastikwnDTO
        deigmaThhlastikwnDTO = new DeigmaThhlastikwnDTO();
        deigmaThhlastikwnDTO.setPrwtokolaId(1l);

        // Init DeigmaThhlstikwnPatchDTO
        deigmaThhlastikwnPatchDTO = new DeigmaThhlastikwnDTO();
        deigmaThhlastikwnPatchDTO.setEreunhths("TestingEreunhthsPatch");
        deigmaThhlastikwnPatchDTO.setDate("2020-12-18");
        deigmaThhlastikwnPatchDTO.setTime("20:56:10");
        deigmaThhlastikwnPatchDTO.setDiarkeia("TestingDiarkeiaPatch");
        deigmaThhlastikwnPatchDTO.setEpifaneiaDeigmatolhpsias(5);
        deigmaThhlastikwnPatchDTO.setGridCell("TestingGridCellPatch");
        deigmaThhlastikwnPatchDTO.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsiasPatch");
        deigmaThhlastikwnPatchDTO.setKwdikosNatura("TestingKwdikosNaturaPatch");
        deigmaThhlastikwnPatchDTO.setLatitudeEGSA(373069.647269);
        deigmaThhlastikwnPatchDTO.setLongitudeEGSA(3171345.69667);
        deigmaThhlastikwnPatchDTO.setLatitudeWGS84(47.66384);
        deigmaThhlastikwnPatchDTO.setLongitudeWGS84(41.42891);
        deigmaThhlastikwnPatchDTO.setMethodosDeigmatolhpsias("TestingMethodosDeigmatolhpsiasPatch");
        deigmaThhlastikwnPatchDTO.setNomos("TestingNomosPatch");
        deigmaThhlastikwnPatchDTO.setParathrhseis("TestingParathrhseisPatch");
        deigmaThhlastikwnPatchDTO.setTopothesia("TestingTopothesiaPatch");
        deigmaThhlastikwnPatchDTO.setTuposOikotopou("TestingTuposOikotopouPatch");
        deigmaThhlastikwnPatchDTO.setTuposVlasthshs("TestingTuposVlasthshsPatch");
        deigmaThhlastikwnPatchDTO.setXrhmatodothsh("TestingXrhmatodothshPatch");

        // Init Prwtokola
        prwtokola = new Prwtokola();
        prwtokola.setId(1l);

        // Init DeigmaThhlastikwn
        deigmaThhlastikwn = new DeigmaThhlastikwn();
        deigmaThhlastikwn.setEreunhths("TestingEreunhths");
        deigmaThhlastikwn.setDate(LocalDate.parse("2018-12-18"));
        deigmaThhlastikwn.setTime(LocalTime.parse("13:56:10"));
        deigmaThhlastikwn.setDiarkeia("TestingDiarkeia");
        deigmaThhlastikwn.setEpifaneiaDeigmatolhpsias(10);
        deigmaThhlastikwn.setGridCell("TestingGridCell");
        deigmaThhlastikwn.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias");
        deigmaThhlastikwn.setKwdikosNatura("TestingKwdikosNatura");
        deigmaThhlastikwn.setLatitudeEGSA(273069.647269);
        deigmaThhlastikwn.setLongitudeEGSA(4171345.69667);
        deigmaThhlastikwn.setLatitudeWGS84(37.66384);
        deigmaThhlastikwn.setLongitudeWGS84(21.42891);
        deigmaThhlastikwn.setMethodosDeigmatolhpsias("TestingMethodosDeigmatolhpsias");
        deigmaThhlastikwn.setNomos("TestingNomos");
        deigmaThhlastikwn.setParathrhseis("TestingParathrhseis");
        deigmaThhlastikwn.setTopothesia("TestingTopothesia");
        deigmaThhlastikwn.setTuposOikotopou("TestingTuposOikotopou");
        deigmaThhlastikwn.setTuposVlasthshs("TestingTuposVlasthshs");
        deigmaThhlastikwn.setXrhmatodothsh("TestingXrhmatodothsh");


        // Init DeigmaThhlastikwnReturned
        deigmaThhlastikwnReturned = new DeigmaThhlastikwn();
        deigmaThhlastikwnReturned.setId(1l);
//        deigmaThhlastikwnReturned.setDeigmata();

        // Init Deigmata
        deigmata = new Deigmata();
        deigmata.setId(1l);
        deigmata.setPrwtokola(prwtokola);
        deigmata.setDeigmaThhlastikwn(deigmaThhlastikwn);
    }
    @Test
    void addDeigmaThhlastikwnTest(){
        Mockito.when(prwtokolaRepository.findById(prwtokola.getId())).thenReturn(Optional.of(prwtokola));

        Mockito.when(deigmaThhlastikwnMapper.deigmaThhlastikwnDTOToDeigmaThhlastikwn(deigmaThhlastikwnDTO)).thenReturn(deigmaThhlastikwn);

        Mockito.when(deigmataRepository.save(any())).thenReturn(deigmata);

        Mockito.when(deigmaThhlastikwnRepository.findDeigmaThhlastikwnById(any())).thenReturn(deigmaThhlastikwnReturned);

        deigmaThhlastikwnService.addDeigmaThhlastikwn(deigmaThhlastikwnDTO);

        Mockito.verify(prwtokolaRepository, Mockito.times(1)).findById(prwtokola.getId());
        Mockito.verify(deigmaThhlastikwnMapper, Mockito.times(1)).deigmaThhlastikwnDTOToDeigmaThhlastikwn(deigmaThhlastikwnDTO);
        Mockito.verify(deigmataRepository, Mockito.times(1)).save(any());
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findDeigmaThhlastikwnById(any());
    }

    @Test
    void patchDeigmaThhlastikwnTest(){
        Mockito.when(deigmaThhlastikwnRepository.findById(deigmaThhlastikwn.getId())).thenReturn(Optional.of(deigmaThhlastikwn));

        boolean patchFlag = deigmaThhlastikwnService.patchDeigmaThhlastikwn(deigmaThhlastikwn.getId(), deigmaThhlastikwnPatchDTO);

        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findById(deigmaThhlastikwn.getId());
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).save(any());
        assertTrue(patchFlag);
    }

    @Test
    void deleteDeigmaThhlastikwnTest(){
        Mockito.when(deigmaThhlastikwnRepository.findById(deigmaThhlastikwn.getId())).thenReturn(Optional.of(deigmaThhlastikwn));

        boolean deleteFlag = deigmaThhlastikwnService.deleteDeigmaThhlastikwn(deigmaThhlastikwn.getId());

        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findById(deigmaThhlastikwn.getId());
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).delete(deigmaThhlastikwn);
        assertTrue(deleteFlag);
    }

    @Test
    void findDeigmaThhlastikwnByIdTest(){
        deigmaThhlastikwnService.findDeigmaThhlastikwnById(1l);

        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findDeigmaThhlastikwnById(1l);
    }

    @Test
    void getAllGeoLocations(){
        deigmaThhlastikwnService.getAllGeoLocations();

        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findAllByLongitudeWGS84IsNotNullAndLatitudeWGS84IsNotNullOrderByIdDesc();
    }

    @Test
    void getAllByPaging(){
        deigmaThhlastikwnService.getAllByPaging(0);

        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findAll((Pageable) any());
    }

    @Test
    void searchDeigmaThhlastikwn(){
        List<SearchCriteria> searchCriteriaList = new ArrayList<>();
        deigmaThhlastikwnService.searchDeigmaThhlastikwn(searchCriteriaList, 10, 0, "ASC");

        Mockito.verify(deigmaThhlastikwnSearchRepository, Mockito.times(1))
                .searchDeigmataThhlastikwn(searchCriteriaList, 10, 0, "ASC");
    }

    @Test
    void downloadDeigmaThhlastikwn(){
        List<SearchCriteria> searchCriteriaList = new ArrayList<>();
        deigmaThhlastikwnService.downloadDeigmaThhlastikwn(searchCriteriaList,"ASC");

        Mockito.verify(deigmaThhlastikwnSearchRepository, Mockito.times(1))
                .downloadDeigmataThhlastikwn(searchCriteriaList,"ASC");
    }

    @Test
    void getDeigmaThhlastikwnAutocompletes(){
        deigmaThhlastikwnService.getDeigmaThhlastikwnAutocompletes();

        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findDistinctByKwdikosDeigmatosOrderByKwdikosDeigmatos();
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findDistinctByKwdikosDeigmatosOrderByKwdikosDeigmatos();
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findDistinctByXrhmatodothshOrderByXrhmatodothsh();
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findDistinctByEreunhthsOrderByEreunhths();
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findDistinctByTopothesiaOrderByTopothesia();
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findDistinctByDiarkeiaOrderByDiarkeia();
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findDistinctByTuposVlasthshsOrderByTuposVlasthshs();
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findDistinctByTuposOikotopouOrderByTuposOikotopou();
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findDistinctByGridCellOrderByGridCell();
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findDistinctByKwdikosNaturaOrderByKwdikosNatura();
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findDistinctByMethodosDeigmatolhpsiasOrderByMethodosDeigmatolhpsias();
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findDistinctByLatitudeEGSAOrderByLatitudeEGSA();
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findDistinctByLongitudeEGSAOrderByLongitudeEGSA();
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findDistinctByLatitudeWGS84OrderByLatitudeWGS84();
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findDistinctByLongitudeWGS84OrderByLongitudeWGS84();
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findDistinctByNomosOrderByNomos();
    }

}
