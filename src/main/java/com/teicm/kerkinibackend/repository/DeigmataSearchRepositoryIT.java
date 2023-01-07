package com.teicm.kerkinibackend.repository;

import com.teicm.kerkinibackend.KerkinibackendApplication;
import com.teicm.kerkinibackend.domain.Deigmata;
import com.teicm.kerkinibackend.domain.Prwtokola;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.repositories.DeigmataRepository;
import com.teicm.kerkinibackend.repositories.DeigmataSearchRepository;
import com.teicm.kerkinibackend.repositories.PrwtokolaRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnRepository;
import com.teicm.kerkinibackend.v1.models.DeigmataSearchDTO;
import com.teicm.kerkinibackend.v1.models.DeigmataSearchHelperDTO;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@Transactional
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = KerkinibackendApplication.class)
@TestPropertySource(locations = "classpath:application-integrationtest.properties")
@RunWith(SpringRunner.class)
public class DeigmataSearchRepositoryIT {

    // TODO: 1/19/2019 The Search() methods could be farther in depth tested by sorting somehow the expected DTO list so that it could work always and use it to AssertEqual farther between the expected and the returned data.

    @Autowired
    DeigmataRepository deigmataRepository;

    @Autowired
    DeigmataSearchRepository deigmataSearchRepository;

    @Autowired
    DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    @Autowired
    PrwtokolaRepository prwtokolaRepository;

    private Deigmata deigmata;

    private Deigmata deigmata1;

    private Deigmata deigmata2;

    private Deigmata deigmata3;

    private Deigmata deigmata4;

    private DeigmaThhlastikwn deigmaThhlastikwn;

    private DeigmaThhlastikwn deigmaThhlastikwn1;

    private DeigmaThhlastikwn deigmaThhlastikwn2;

    private DeigmaThhlastikwn deigmaThhlastikwn3;

    private DeigmaThhlastikwn deigmaThhlastikwn4;

    private Prwtokola prwtokola;

    private Prwtokola prwtokola1;

    private Prwtokola prwtokola2;

    private Prwtokola prwtokola3;

    private Prwtokola prwtokola4;

    private DeigmataSearchDTO deigmataSearchDTO;

    private List<DeigmataSearchHelperDTO> deigmataSearchHelperDTOList;

    private DeigmataSearchHelperDTO deigmataSearchHelperDTO;

    private DeigmataSearchHelperDTO deigmataSearchHelperDTO1;

    private DeigmataSearchHelperDTO deigmataSearchHelperDTO2;

    private List<SearchCriteria> searchCriteriaList;

    private SearchCriteria searchCriteriaCorrectPrwtokola;

    private SearchCriteria searchCriteriaSemiCorrectPrwtokola;

    private SearchCriteria searchCriteriaNotCorrectPrwtokola;


    @Before
    public void setUp(){

        // Init prwtokola
        prwtokola = new Prwtokola();
        prwtokola.setPerigrafh("TestingPerigrafh");
        prwtokola.setPinakasDedomenwn("TestingPinakasDedomenwn");
        prwtokola.setParathuroDedomenwn("TestingParathuroDedomenwn");

        // Init prwtokola
        prwtokola1 = new Prwtokola();
        prwtokola1.setPerigrafh("TestingPerigrafh1");
        prwtokola1.setPinakasDedomenwn("TestingPinakasDedomenwn1");
        prwtokola1.setParathuroDedomenwn("TestingParathuroDedomenwn1");

        // Init prwtokola
        prwtokola2 = new Prwtokola();
        prwtokola2.setPerigrafh("TestingPerigrafh2");
        prwtokola2.setPinakasDedomenwn("TestingPinakasDedomenwn2");
        prwtokola2.setParathuroDedomenwn("TestingParathuroDedomenwn2");

        // Init prwtokola
        prwtokola3 = new Prwtokola();
        prwtokola3.setPerigrafh("TestingPerigrafh3");
        prwtokola3.setPinakasDedomenwn("TestingPinakasDedomenwn3");
        prwtokola3.setParathuroDedomenwn("TestingParathuroDedomenwn3");

        // Init prwtokola
        prwtokola4 = new Prwtokola();
        prwtokola4.setPerigrafh("TestingPerigrafh4");
        prwtokola4.setPinakasDedomenwn("TestingPinakasDedomenwn4");
        prwtokola4.setParathuroDedomenwn("TestingParathuroDedomenwn4");

        // Init DeigmaThhlastikwn
        deigmaThhlastikwn = new DeigmaThhlastikwn();
        deigmaThhlastikwn.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias");

        // Init DeigmaThhlastikwn
        deigmaThhlastikwn1 = new DeigmaThhlastikwn();
        deigmaThhlastikwn1.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias1");

        // Init DeigmaThhlastikwn
        deigmaThhlastikwn2 = new DeigmaThhlastikwn();
        deigmaThhlastikwn2.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias2");

        // Init DeigmaThhlastikwn
        deigmaThhlastikwn3 = new DeigmaThhlastikwn();
        deigmaThhlastikwn3.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias3");

        // Init DeigmaThhlastikwn
        deigmaThhlastikwn4 = new DeigmaThhlastikwn();
        deigmaThhlastikwn4.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias4");


        // Init deigmata
        deigmata = new Deigmata();

        // Init deigmata
        deigmata1 = new Deigmata();

        // Init deigmata
        deigmata2 = new Deigmata();

        // Init deigmata
        deigmata3 = new Deigmata();

        // Init deigmata
        deigmata4 = new Deigmata();


        // Init SearchCriteria
        searchCriteriaCorrectPrwtokola = new SearchCriteria();
        searchCriteriaCorrectPrwtokola.setKey("prwtokola");
        searchCriteriaCorrectPrwtokola.setOperation("~");
//        searchCriteriaCorrectPrwtokola.setValue("1;2;3;");

        // Init SearchCriteria
        searchCriteriaSemiCorrectPrwtokola = new SearchCriteria();
        searchCriteriaSemiCorrectPrwtokola.setKey("prwtokola");
        searchCriteriaSemiCorrectPrwtokola.setOperation("~");
//        searchCriteriaSemiCorrectPrwtokola.setValue("2;");

        // Init SearchCriteria
        searchCriteriaNotCorrectPrwtokola = new SearchCriteria();
        searchCriteriaNotCorrectPrwtokola.setKey("prwtokola");
        searchCriteriaNotCorrectPrwtokola.setOperation("~");
//        searchCriteriaNotCorrectPrwtokola.setValue("6;10;");

        // Init DeigmaSearchHelperDTO
        deigmataSearchHelperDTO = new DeigmataSearchHelperDTO();

        // Init DeigmaSearchHelperDTO
        deigmataSearchHelperDTO1 = new DeigmataSearchHelperDTO();

        // Init DeigmaSearchHelperDTO
        deigmataSearchHelperDTO2 = new DeigmataSearchHelperDTO();

        // Init SearchCriteria List
        searchCriteriaList = new ArrayList<>();

        deigmataSearchHelperDTOList = new ArrayList<>();

    }

    @Test
    public void searchDeigmataSortDescTest(){
        // Delete previously stored data
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Preparing deigmata
        Prwtokola prwtokolaReturned = prwtokolaRepository.save(prwtokola);
        Prwtokola prwtokolaReturned1 = prwtokolaRepository.save(prwtokola1);
        Prwtokola prwtokolaReturned2 = prwtokolaRepository.save(prwtokola2);
        Prwtokola prwtokolaReturned3 = prwtokolaRepository.save(prwtokola3);
        Prwtokola prwtokolaReturned4 = prwtokolaRepository.save(prwtokola4);

        deigmata.setDeigmaThhlastikwn(deigmaThhlastikwn);
        deigmaThhlastikwn.setDeigmata(deigmata);
        deigmata.setPrwtokola(prwtokolaReturned);

        deigmata1.setDeigmaThhlastikwn(deigmaThhlastikwn1);
        deigmaThhlastikwn1.setDeigmata(deigmata1);
        deigmata1.setPrwtokola(prwtokolaReturned);

        deigmata2.setDeigmaThhlastikwn(deigmaThhlastikwn2);
        deigmaThhlastikwn2.setDeigmata(deigmata2);
        deigmata2.setPrwtokola(prwtokolaReturned);


        deigmata3.setDeigmaThhlastikwn(deigmaThhlastikwn3);
        deigmaThhlastikwn3.setDeigmata(deigmata3);
        deigmata3.setPrwtokola(prwtokolaReturned3);

        deigmata4.setDeigmaThhlastikwn(deigmaThhlastikwn4);
        deigmaThhlastikwn4.setDeigmata(deigmata4);
        deigmata4.setPrwtokola(prwtokolaReturned4);

        Deigmata deigmataReturned = deigmataRepository.save(deigmata);
        Deigmata deigmataReturned1 = deigmataRepository.save(deigmata1);
        Deigmata deigmataReturned2 = deigmataRepository.save(deigmata2);
        Deigmata deigmataReturned3 = deigmataRepository.save(deigmata3);
        Deigmata deigmataReturned4 = deigmataRepository.save(deigmata4);

        // Preparing the expected List ( 1 2 because we are having a sorting of Desc )
//        deigmataSearchHelperDTO.setId(deigmataReturned1.getId());
//        deigmataSearchHelperDTO.setDeigmaThhlastikwnId(deigmataReturned1.getDeigmaThhlastikwn().getId());
//        deigmataSearchHelperDTO.setPrwtokolaId(deigmataReturned1.getPrwtokola().getId());
//
//        deigmataSearchHelperDTO1.setId(deigmataReturned2.getId());
//        deigmataSearchHelperDTO1.setDeigmaThhlastikwnId(deigmataReturned2.getDeigmaThhlastikwn().getId());
//        deigmataSearchHelperDTO1.setPrwtokolaId(deigmataReturned2.getPrwtokola().getId());

        // Preparing expecting Cant Sort the DTOs (since they are not Domains) so i am not using in asserting

        // Preparing to test
        searchCriteriaCorrectPrwtokola.setValue(prwtokolaReturned.getId() + ";" + prwtokolaReturned1.getId() + ";" + prwtokolaReturned2.getId() + ";");
        searchCriteriaList.add(searchCriteriaCorrectPrwtokola);

        // Get - test method
        DeigmataSearchDTO deigmataSearchDTO = deigmataSearchRepository
                .searchDeigmata(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        assertNotNull(deigmataReturned);
        assertNotNull(deigmataReturned1);
        assertNotNull(deigmataReturned2);
        assertNotNull(deigmataReturned3);
        assertNotNull(deigmataReturned4);
        assertNotNull(deigmataSearchDTO);
        assertEquals(2, deigmataSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmataSearchDTO.getDeigmataList().size());
        assertEquals(Long.valueOf(3), deigmataSearchDTO.getTotalResults());
        assertEquals(2, deigmataSearchDTO.getTotalPages());
        assertEquals(0, deigmataSearchDTO.getPage());
        assertEquals("Desc", deigmataSearchDTO.getSort());
        assertFalse(deigmataSearchDTO.isHasPreviousPage());
        assertTrue(deigmataSearchDTO.isHasNextPage());
    }

    @Test
    public void searchDeigmataSortAscTest(){
        // Delete previously stored data
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Preparing deigmata
        Prwtokola prwtokolaReturned = prwtokolaRepository.save(prwtokola);
        Prwtokola prwtokolaReturned1 = prwtokolaRepository.save(prwtokola1);
        Prwtokola prwtokolaReturned2 = prwtokolaRepository.save(prwtokola2);
        Prwtokola prwtokolaReturned3 = prwtokolaRepository.save(prwtokola3);
        Prwtokola prwtokolaReturned4 = prwtokolaRepository.save(prwtokola4);

        deigmata.setDeigmaThhlastikwn(deigmaThhlastikwn);
        deigmaThhlastikwn.setDeigmata(deigmata);
        deigmata.setPrwtokola(prwtokolaReturned);

        deigmata1.setDeigmaThhlastikwn(deigmaThhlastikwn1);
        deigmaThhlastikwn1.setDeigmata(deigmata1);
        deigmata1.setPrwtokola(prwtokolaReturned);

        deigmata2.setDeigmaThhlastikwn(deigmaThhlastikwn2);
        deigmaThhlastikwn2.setDeigmata(deigmata2);
        deigmata2.setPrwtokola(prwtokolaReturned);


        deigmata3.setDeigmaThhlastikwn(deigmaThhlastikwn3);
        deigmaThhlastikwn3.setDeigmata(deigmata3);
        deigmata3.setPrwtokola(prwtokolaReturned3);

        deigmata4.setDeigmaThhlastikwn(deigmaThhlastikwn4);
        deigmaThhlastikwn4.setDeigmata(deigmata4);
        deigmata4.setPrwtokola(prwtokolaReturned4);

        Deigmata deigmataReturned = deigmataRepository.save(deigmata);
        Deigmata deigmataReturned1 = deigmataRepository.save(deigmata1);
        Deigmata deigmataReturned2 = deigmataRepository.save(deigmata2);
        Deigmata deigmataReturned3 = deigmataRepository.save(deigmata3);
        Deigmata deigmataReturned4 = deigmataRepository.save(deigmata4);

        // Preparing the expected List ( 2 3 because we are having a sorting of Asc )
//        deigmataSearchHelperDTO1.setId(deigmataReturned1.getId());
//        deigmataSearchHelperDTO1.setDeigmaThhlastikwnId(deigmataReturned1.getDeigmaThhlastikwn().getId());
//        deigmataSearchHelperDTO1.setPrwtokolaId(deigmataReturned1.getPrwtokola().getId());
//
//        deigmataSearchHelperDTO2.setId(deigmataReturned2.getId());
//        deigmataSearchHelperDTO2.setDeigmaThhlastikwnId(deigmataReturned2.getDeigmaThhlastikwn().getId());
//        deigmataSearchHelperDTO2.setPrwtokolaId(deigmataReturned2.getPrwtokola().getId());

        // Preparing expecting Cant Sort the DTOs (since they are not Domains) so i am not using in asserting

        // Preparing to test
        searchCriteriaCorrectPrwtokola.setValue(prwtokolaReturned.getId() + ";" + prwtokolaReturned1.getId() + ";" + prwtokolaReturned2.getId() + ";");
        searchCriteriaList.add(searchCriteriaCorrectPrwtokola);

        // Get - test method
        DeigmataSearchDTO deigmataSearchDTO = deigmataSearchRepository
                .searchDeigmata(searchCriteriaList, 2, 0, "Asc");

        // Deleting test - saves
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        assertNotNull(deigmataReturned);
        assertNotNull(deigmataReturned1);
        assertNotNull(deigmataReturned2);
        assertNotNull(deigmataReturned3);
        assertNotNull(deigmataReturned4);
        assertNotNull(deigmataSearchDTO);
        assertEquals(2, deigmataSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmataSearchDTO.getDeigmataList().size());
        assertEquals(Long.valueOf(3), deigmataSearchDTO.getTotalResults());
        assertEquals(2, deigmataSearchDTO.getTotalPages());
        assertEquals(0, deigmataSearchDTO.getPage());
        assertEquals("Asc", deigmataSearchDTO.getSort());
        assertFalse(deigmataSearchDTO.isHasPreviousPage());
        assertTrue(deigmataSearchDTO.isHasNextPage());
    }

    @Test
    public void searchDeigmataSortDescPage2Test(){
        // Delete previously stored data
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Preparing deigmata
        Prwtokola prwtokolaReturned = prwtokolaRepository.save(prwtokola);
        Prwtokola prwtokolaReturned1 = prwtokolaRepository.save(prwtokola1);
        Prwtokola prwtokolaReturned2 = prwtokolaRepository.save(prwtokola2);
        Prwtokola prwtokolaReturned3 = prwtokolaRepository.save(prwtokola3);
        Prwtokola prwtokolaReturned4 = prwtokolaRepository.save(prwtokola4);

        deigmata.setDeigmaThhlastikwn(deigmaThhlastikwn);
        deigmaThhlastikwn.setDeigmata(deigmata);
        deigmata.setPrwtokola(prwtokolaReturned);

        deigmata1.setDeigmaThhlastikwn(deigmaThhlastikwn1);
        deigmaThhlastikwn1.setDeigmata(deigmata1);
        deigmata1.setPrwtokola(prwtokolaReturned);

        deigmata2.setDeigmaThhlastikwn(deigmaThhlastikwn2);
        deigmaThhlastikwn2.setDeigmata(deigmata2);
        deigmata2.setPrwtokola(prwtokolaReturned);


        deigmata3.setDeigmaThhlastikwn(deigmaThhlastikwn3);
        deigmaThhlastikwn3.setDeigmata(deigmata3);
        deigmata3.setPrwtokola(prwtokolaReturned3);

        deigmata4.setDeigmaThhlastikwn(deigmaThhlastikwn4);
        deigmaThhlastikwn4.setDeigmata(deigmata4);
        deigmata4.setPrwtokola(prwtokolaReturned4);

        Deigmata deigmataReturned = deigmataRepository.save(deigmata);
        Deigmata deigmataReturned1 = deigmataRepository.save(deigmata1);
        Deigmata deigmataReturned2 = deigmataRepository.save(deigmata2);
        Deigmata deigmataReturned3 = deigmataRepository.save(deigmata3);
        Deigmata deigmataReturned4 = deigmataRepository.save(deigmata4);

        // Preparing the expected List ( 1 2 because we are having a sorting of Desc )
//        deigmataSearchHelperDTO.setId(deigmataReturned1.getId());
//        deigmataSearchHelperDTO.setDeigmaThhlastikwnId(deigmataReturned1.getDeigmaThhlastikwn().getId());
//        deigmataSearchHelperDTO.setPrwtokolaId(deigmataReturned1.getPrwtokola().getId());
//
//        deigmataSearchHelperDTO1.setId(deigmataReturned2.getId());
//        deigmataSearchHelperDTO1.setDeigmaThhlastikwnId(deigmataReturned2.getDeigmaThhlastikwn().getId());
//        deigmataSearchHelperDTO1.setPrwtokolaId(deigmataReturned2.getPrwtokola().getId());

        // Preparing expecting Cant Sort the DTOs (since they are not Domains) so i am not using in asserting

        // Preparing to test
        searchCriteriaCorrectPrwtokola.setValue(prwtokolaReturned.getId() + ";" + prwtokolaReturned1.getId() + ";" + prwtokolaReturned2.getId() + ";");
        searchCriteriaList.add(searchCriteriaCorrectPrwtokola);

        // Get - test method
        DeigmataSearchDTO deigmataSearchDTO = deigmataSearchRepository
                .searchDeigmata(searchCriteriaList, 2, 1, "Desc");

        // Deleting test - saves
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        assertNotNull(deigmataReturned);
        assertNotNull(deigmataReturned1);
        assertNotNull(deigmataReturned2);
        assertNotNull(deigmataReturned3);
        assertNotNull(deigmataReturned4);
        assertNotNull(deigmataSearchDTO);
        assertEquals(1, deigmataSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmataSearchDTO.getDeigmataList().size());
        assertEquals(Long.valueOf(3), deigmataSearchDTO.getTotalResults());
        assertEquals(2, deigmataSearchDTO.getTotalPages());
        assertEquals(1, deigmataSearchDTO.getPage());
        assertEquals("Desc", deigmataSearchDTO.getSort());
        assertTrue(deigmataSearchDTO.isHasPreviousPage());
        assertFalse(deigmataSearchDTO.isHasNextPage());
    }

    @Test
    public void searchDeigmataSortDescSemiCorrectSearchCriteriaOnPrwtokolaTest(){
        // Delete previously stored data
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Preparing deigmata
        Prwtokola prwtokolaReturned = prwtokolaRepository.save(prwtokola);
        Prwtokola prwtokolaReturned1 = prwtokolaRepository.save(prwtokola1);
        Prwtokola prwtokolaReturned2 = prwtokolaRepository.save(prwtokola2);
        Prwtokola prwtokolaReturned3 = prwtokolaRepository.save(prwtokola3);
        Prwtokola prwtokolaReturned4 = prwtokolaRepository.save(prwtokola4);

        deigmata.setDeigmaThhlastikwn(deigmaThhlastikwn);
        deigmaThhlastikwn.setDeigmata(deigmata);
        deigmata.setPrwtokola(prwtokolaReturned);

        deigmata1.setDeigmaThhlastikwn(deigmaThhlastikwn1);
        deigmaThhlastikwn1.setDeigmata(deigmata1);
        deigmata1.setPrwtokola(prwtokolaReturned1);

        deigmata2.setDeigmaThhlastikwn(deigmaThhlastikwn2);
        deigmaThhlastikwn2.setDeigmata(deigmata2);
        deigmata2.setPrwtokola(prwtokolaReturned);


        deigmata3.setDeigmaThhlastikwn(deigmaThhlastikwn3);
        deigmaThhlastikwn3.setDeigmata(deigmata3);
        deigmata3.setPrwtokola(prwtokolaReturned3);

        deigmata4.setDeigmaThhlastikwn(deigmaThhlastikwn4);
        deigmaThhlastikwn4.setDeigmata(deigmata4);
        deigmata4.setPrwtokola(prwtokolaReturned4);

        Deigmata deigmataReturned = deigmataRepository.save(deigmata);
        Deigmata deigmataReturned1 = deigmataRepository.save(deigmata1);
        Deigmata deigmataReturned2 = deigmataRepository.save(deigmata2);
        Deigmata deigmataReturned3 = deigmataRepository.save(deigmata3);
        Deigmata deigmataReturned4 = deigmataRepository.save(deigmata4);

        // Preparing the expected List ( 1 2 because we are having a sorting of Desc )
//        deigmataSearchHelperDTO.setId(deigmataReturned1.getId());
//        deigmataSearchHelperDTO.setDeigmaThhlastikwnId(deigmataReturned1.getDeigmaThhlastikwn().getId());
//        deigmataSearchHelperDTO.setPrwtokolaId(deigmataReturned1.getPrwtokola().getId());
//
//        deigmataSearchHelperDTO1.setId(deigmataReturned2.getId());
//        deigmataSearchHelperDTO1.setDeigmaThhlastikwnId(deigmataReturned2.getDeigmaThhlastikwn().getId());
//        deigmataSearchHelperDTO1.setPrwtokolaId(deigmataReturned2.getPrwtokola().getId());

        // Preparing expecting Cant Sort the DTOs (since they are not Domains) so i am not using in asserting

        // Preparing to test
        searchCriteriaSemiCorrectPrwtokola.setValue(prwtokolaReturned1.getId() + ";");
        searchCriteriaList.add(searchCriteriaSemiCorrectPrwtokola);

        // Get - test method
        DeigmataSearchDTO deigmataSearchDTO = deigmataSearchRepository
                .searchDeigmata(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        assertNotNull(deigmataReturned);
        assertNotNull(deigmataReturned1);
        assertNotNull(deigmataReturned2);
        assertNotNull(deigmataReturned3);
        assertNotNull(deigmataReturned4);
        assertNotNull(deigmataSearchDTO);
        assertEquals(1, deigmataSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmataSearchDTO.getDeigmataList().size());
        assertEquals(Long.valueOf(1), deigmataSearchDTO.getTotalResults());
        assertEquals(1, deigmataSearchDTO.getTotalPages());
        assertEquals(0, deigmataSearchDTO.getPage());
        assertEquals("Desc", deigmataSearchDTO.getSort());
        assertFalse(deigmataSearchDTO.isHasPreviousPage());
        assertFalse(deigmataSearchDTO.isHasNextPage());
    }

    @Test
    public void searchDeigmataSortDescNotCorrectSearchCriteriaOnPrwtokolaTest(){
        // Delete previously stored data
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Preparing deigmata
        Prwtokola prwtokolaReturned = prwtokolaRepository.save(prwtokola);
        Prwtokola prwtokolaReturned1 = prwtokolaRepository.save(prwtokola1);
        Prwtokola prwtokolaReturned2 = prwtokolaRepository.save(prwtokola2);
        Prwtokola prwtokolaReturned3 = prwtokolaRepository.save(prwtokola3);
        Prwtokola prwtokolaReturned4 = prwtokolaRepository.save(prwtokola4);

        deigmata.setDeigmaThhlastikwn(deigmaThhlastikwn);
        deigmaThhlastikwn.setDeigmata(deigmata);
        deigmata.setPrwtokola(prwtokolaReturned);

        deigmata1.setDeigmaThhlastikwn(deigmaThhlastikwn1);
        deigmaThhlastikwn1.setDeigmata(deigmata1);
        deigmata1.setPrwtokola(prwtokolaReturned1);

        deigmata2.setDeigmaThhlastikwn(deigmaThhlastikwn2);
        deigmaThhlastikwn2.setDeigmata(deigmata2);
        deigmata2.setPrwtokola(prwtokolaReturned2);


        deigmata3.setDeigmaThhlastikwn(deigmaThhlastikwn3);
        deigmaThhlastikwn3.setDeigmata(deigmata3);
        deigmata3.setPrwtokola(prwtokolaReturned2);

        deigmata4.setDeigmaThhlastikwn(deigmaThhlastikwn4);
        deigmaThhlastikwn4.setDeigmata(deigmata4);
        deigmata4.setPrwtokola(prwtokolaReturned2);

        Deigmata deigmataReturned = deigmataRepository.save(deigmata);
        Deigmata deigmataReturned1 = deigmataRepository.save(deigmata1);
        Deigmata deigmataReturned2 = deigmataRepository.save(deigmata2);
        Deigmata deigmataReturned3 = deigmataRepository.save(deigmata3);
        Deigmata deigmataReturned4 = deigmataRepository.save(deigmata4);

        // Preparing the expected List ( 1 2 because we are having a sorting of Desc )
//        deigmataSearchHelperDTO.setId(deigmataReturned1.getId());
//        deigmataSearchHelperDTO.setDeigmaThhlastikwnId(deigmataReturned1.getDeigmaThhlastikwn().getId());
//        deigmataSearchHelperDTO.setPrwtokolaId(deigmataReturned1.getPrwtokola().getId());
//
//        deigmataSearchHelperDTO1.setId(deigmataReturned2.getId());
//        deigmataSearchHelperDTO1.setDeigmaThhlastikwnId(deigmataReturned2.getDeigmaThhlastikwn().getId());
//        deigmataSearchHelperDTO1.setPrwtokolaId(deigmataReturned2.getPrwtokola().getId());

        // Preparing expecting Cant Sort the DTOs (since they are not Domains) so i am not using in asserting

        // Preparing to test
        searchCriteriaNotCorrectPrwtokola.setValue(prwtokolaReturned3.getId() + ";" + prwtokolaReturned4.getId() + ";");
        searchCriteriaList.add(searchCriteriaNotCorrectPrwtokola);

        // Get - test method
        DeigmataSearchDTO deigmataSearchDTO = deigmataSearchRepository
                .searchDeigmata(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        assertNotNull(deigmataReturned);
        assertNotNull(deigmataReturned1);
        assertNotNull(deigmataReturned2);
        assertNotNull(deigmataReturned3);
        assertNotNull(deigmataReturned4);
        assertNotNull(deigmataSearchDTO);
        assertEquals(0, deigmataSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void downloadDeigmataSortDescTest(){
        // Delete previously stored data
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Preparing deigmata
        Prwtokola prwtokolaReturned = prwtokolaRepository.save(prwtokola);
        Prwtokola prwtokolaReturned1 = prwtokolaRepository.save(prwtokola1);
        Prwtokola prwtokolaReturned2 = prwtokolaRepository.save(prwtokola2);
        Prwtokola prwtokolaReturned3 = prwtokolaRepository.save(prwtokola3);
        Prwtokola prwtokolaReturned4 = prwtokolaRepository.save(prwtokola4);

        deigmata.setDeigmaThhlastikwn(deigmaThhlastikwn);
        deigmaThhlastikwn.setDeigmata(deigmata);
        deigmata.setPrwtokola(prwtokolaReturned);

        deigmata1.setDeigmaThhlastikwn(deigmaThhlastikwn1);
        deigmaThhlastikwn1.setDeigmata(deigmata1);
        deigmata1.setPrwtokola(prwtokolaReturned);

        deigmata2.setDeigmaThhlastikwn(deigmaThhlastikwn2);
        deigmaThhlastikwn2.setDeigmata(deigmata2);
        deigmata2.setPrwtokola(prwtokolaReturned);


        deigmata3.setDeigmaThhlastikwn(deigmaThhlastikwn3);
        deigmaThhlastikwn3.setDeigmata(deigmata3);
        deigmata3.setPrwtokola(prwtokolaReturned3);

        deigmata4.setDeigmaThhlastikwn(deigmaThhlastikwn4);
        deigmaThhlastikwn4.setDeigmata(deigmata4);
        deigmata4.setPrwtokola(prwtokolaReturned4);

        Deigmata deigmataReturned = deigmataRepository.save(deigmata);
        Deigmata deigmataReturned1 = deigmataRepository.save(deigmata1);
        Deigmata deigmataReturned2 = deigmataRepository.save(deigmata2);
        Deigmata deigmataReturned3 = deigmataRepository.save(deigmata3);
        Deigmata deigmataReturned4 = deigmataRepository.save(deigmata4);

        // Preparing the expected List ( 1 2 because we are having a sorting of Desc )
//        deigmataSearchHelperDTO.setId(deigmataReturned1.getId());
//        deigmataSearchHelperDTO.setDeigmaThhlastikwnId(deigmataReturned1.getDeigmaThhlastikwn().getId());
//        deigmataSearchHelperDTO.setPrwtokolaId(deigmataReturned1.getPrwtokola().getId());
//
//        deigmataSearchHelperDTO1.setId(deigmataReturned2.getId());
//        deigmataSearchHelperDTO1.setDeigmaThhlastikwnId(deigmataReturned2.getDeigmaThhlastikwn().getId());
//        deigmataSearchHelperDTO1.setPrwtokolaId(deigmataReturned2.getPrwtokola().getId());

        // Preparing expecting Cant Sort the DTOs (since they are not Domains) so i am not using in asserting

        // Preparing to test
        searchCriteriaCorrectPrwtokola.setValue(prwtokolaReturned.getId() + ";" + prwtokolaReturned1.getId() + ";" + prwtokolaReturned2.getId() + ";");
        searchCriteriaList.add(searchCriteriaCorrectPrwtokola);

        // Get - test method
        List<DeigmataSearchHelperDTO> deigmataSearchDTO = deigmataSearchRepository
                .downloadDeigmata(searchCriteriaList, "Desc");

        // Deleting test - saves
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        assertNotNull(deigmataReturned);
        assertNotNull(deigmataReturned1);
        assertNotNull(deigmataReturned2);
        assertNotNull(deigmataReturned3);
        assertNotNull(deigmataReturned4);
        assertNotNull(deigmataSearchDTO);
        assertEquals(3, deigmataSearchDTO.size());
    }

}
