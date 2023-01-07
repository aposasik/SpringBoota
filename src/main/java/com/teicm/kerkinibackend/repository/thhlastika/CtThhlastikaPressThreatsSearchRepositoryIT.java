package com.teicm.kerkinibackend.repository.thhlastika;

import com.teicm.kerkinibackend.KerkinibackendApplication;
import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaPressThreats;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaPressThreatsRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaPressThreatsSearchRepository;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaPressThreatsSearchDTO;
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
public class CtThhlastikaPressThreatsSearchRepositoryIT {

    @Autowired
    CtThhlastikaPressThreatsRepository ctThhlastikaPressThreatsRepository;

    @Autowired
    CtThhlastikaPressThreatsSearchRepository ctThhlastikaPressThreatsSearchRepository;

    private List<CtThhlastikaPressThreats> ctThhlastikaPressThreatsList;

    private CtThhlastikaPressThreats ctThhlastikaPressThreats;

    private CtThhlastikaPressThreats ctThhlastikaPressThreats1;

    private CtThhlastikaPressThreats ctThhlastikaPressThreats2;

    private CtThhlastikaPressThreats ctThhlastikaPressThreats3;

    private CtThhlastikaPressThreats ctThhlastikaPressThreats4;

    private List<SearchCriteria> searchCriteriaList;

    private SearchCriteria searchCriteria;

    private SearchCriteria searchCriteria1;

    private SearchCriteria searchCriteria2;

    private SearchCriteria searchCriteriaNotCorrectOnRemarks;

    private SearchCriteria searchCriteriaSemiCorrectOnRemarks;

    private SearchCriteria searchCriteriaNotCorrectOnDescriptionEn;

    private SearchCriteria searchCriteriaSemiCorrectOnDescriptionEn;

    @Before
    public void setUp(){
        // Init ctThhlastikaPressThreats
        ctThhlastikaPressThreats = new CtThhlastikaPressThreats();
        ctThhlastikaPressThreats.setActCode("TestingActCode");
        ctThhlastikaPressThreats.setDescriptionEn("TestingDescriptionEn");
        ctThhlastikaPressThreats.setRemarks("TestingRemarks");

        // Init ctThhlastikaPressThreats
        ctThhlastikaPressThreats1 = new CtThhlastikaPressThreats();
        ctThhlastikaPressThreats1.setActCode("TestingActCode1");
        ctThhlastikaPressThreats1.setDescriptionEn("TestingDescriptionEn1");
        ctThhlastikaPressThreats1.setRemarks("TestingRemarks1");

        // Init ctThhlastikaPressThreats
        ctThhlastikaPressThreats2 = new CtThhlastikaPressThreats();
        ctThhlastikaPressThreats2.setActCode("TestingActCode2");
        ctThhlastikaPressThreats2.setDescriptionEn("TestingDescriptionEn2");
        ctThhlastikaPressThreats2.setRemarks("TestingRemarks2");

        // Init ctThhlastikaPressThreats
        ctThhlastikaPressThreats3 = new CtThhlastikaPressThreats();
        ctThhlastikaPressThreats3.setActCode("TestingActCode3");
        ctThhlastikaPressThreats3.setDescriptionEn("TestingDescriptionEn3");
        ctThhlastikaPressThreats3.setRemarks("TestingRemarks3");

        // Init ctThhlastikaPressThreats
        ctThhlastikaPressThreats4 = new CtThhlastikaPressThreats();
        ctThhlastikaPressThreats4.setActCode("TestingActCode4");
        ctThhlastikaPressThreats4.setDescriptionEn("TestingDescriptionEn4");
        ctThhlastikaPressThreats4.setRemarks("TestingRemarks4");

        // Init SearchCriteria
        searchCriteria = new SearchCriteria();
        searchCriteria.setKey("actCode");
        searchCriteria.setOperation("~");
        searchCriteria.setValue("TestingActCode1;TestingActCode2;TestingActCode3;");

        // Init SearchCriteria
        searchCriteria1 = new SearchCriteria();
        searchCriteria1.setKey("descriptionEn");
        searchCriteria1.setOperation("~");
        searchCriteria1.setValue("TestingDescriptionEn1;TestingDescriptionEn2;TestingDescriptionEn3;");

        // Init SearchCriteria
        searchCriteria2 = new SearchCriteria();
        searchCriteria2.setKey("remarks");
        searchCriteria2.setOperation("~");
        searchCriteria2.setValue("TestingRemarks1;TestingRemarks2;TestingRemarks3;");

        // Init SearchCriteria
        searchCriteriaNotCorrectOnRemarks = new SearchCriteria();
        searchCriteriaNotCorrectOnRemarks.setKey("remarks");
        searchCriteriaNotCorrectOnRemarks.setOperation("~");
        searchCriteriaNotCorrectOnRemarks.setValue("TestingRemarksNotCorrect1;TestingRemarksNotCorrect2;TestingRemarksNotCorrect3;TestingRemarks4;");

        // Init SearchCriteria
        searchCriteriaSemiCorrectOnRemarks = new SearchCriteria();
        searchCriteriaSemiCorrectOnRemarks.setKey("remarks");
        searchCriteriaSemiCorrectOnRemarks.setOperation("~");
        searchCriteriaSemiCorrectOnRemarks.setValue("TestingRemarksNotCorrect1;TestingRemarks1;TestingRemarksNotCorrect2;TestingRemarksNotCorrect3;TestingRemarks4;");

        // Init SearchCriteria
        searchCriteriaNotCorrectOnDescriptionEn = new SearchCriteria();
        searchCriteriaNotCorrectOnDescriptionEn.setKey("descriptionEn");
        searchCriteriaNotCorrectOnDescriptionEn.setOperation("~");
        searchCriteriaNotCorrectOnDescriptionEn.setValue("TestingDescriptionEnNotCorrect1;TestingDescriptionEnNotCorrect2;TestingDescriptionEnNotCorrect3;TestingDescriptionEn4;");

        // Init SearchCriteria
        searchCriteriaSemiCorrectOnDescriptionEn = new SearchCriteria();
        searchCriteriaSemiCorrectOnDescriptionEn.setKey("descriptionEn");
        searchCriteriaSemiCorrectOnDescriptionEn.setOperation("~");
        searchCriteriaSemiCorrectOnDescriptionEn.setValue("TestingDescriptionEnNotCorrect1;TestingDescriptionEn1;TestingDescriptionEnNotCorrect2;TestingDescriptionEn4;");

        // Init List<CtThhlastikaPressThreats
        ctThhlastikaPressThreatsList = new ArrayList<>();

        // Init List<SearchCriteria>
        searchCriteriaList = new ArrayList<>();

    }

    @Test
    public void searchCtThhlastikaPressThreatsSortDescTest(){
        // Delete previously stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned3 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats3);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned4 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats4);

        // Preparing expected ( 2 and 3 because we are having a sorting of Desc )
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned2);
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned3);
        ctThhlastikaPressThreatsList.sort(CtThhlastikaPressThreats.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        CtThhlastikaPressThreatsSearchDTO ctThhlastikaPressThreatsSearchDTO = ctThhlastikaPressThreatsSearchRepository
                .searchCtThhlastikaPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Delete test - saves
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertNotNull(ctThhlastikaPressThreatsReturned3);
        assertNotNull(ctThhlastikaPressThreatsReturned4);
        assertNotNull(ctThhlastikaPressThreatsSearchDTO);
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().size());
        assertEquals(Long.valueOf(3), ctThhlastikaPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, ctThhlastikaPressThreatsSearchDTO.getPage());
        assertEquals("Desc", ctThhlastikaPressThreatsSearchDTO.getSort());
        assertFalse(ctThhlastikaPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(ctThhlastikaPressThreatsSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaPressThreatsList.get(0).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getRemarks());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getRemarks());
    }

    @Test
    public void searchCtThhlastikaPressThreatsSortAscTest(){
        // Delete previously stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned3 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats3);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned4 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats4);

        // Preparing expected ( 1 and 2 because we are having a sorting of Asc )
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned1);
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned2);
        ctThhlastikaPressThreatsList.sort(CtThhlastikaPressThreats.ASC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        CtThhlastikaPressThreatsSearchDTO ctThhlastikaPressThreatsSearchDTO = ctThhlastikaPressThreatsSearchRepository
                .searchCtThhlastikaPressThreats(searchCriteriaList, 2, 0, "Asc");

        // Delete test - saves
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertNotNull(ctThhlastikaPressThreatsReturned3);
        assertNotNull(ctThhlastikaPressThreatsReturned4);
        assertNotNull(ctThhlastikaPressThreatsSearchDTO);
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().size());
        assertEquals(Long.valueOf(3), ctThhlastikaPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, ctThhlastikaPressThreatsSearchDTO.getPage());
        assertEquals("Asc", ctThhlastikaPressThreatsSearchDTO.getSort());
        assertFalse(ctThhlastikaPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(ctThhlastikaPressThreatsSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaPressThreatsList.get(0).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getRemarks());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getRemarks());
    }

    @Test
    public void searchCtThhlastikaPressThreatsMoreSearchCriteriaThanExistsTest(){
        // Delete previously stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned3 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats3);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned4 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats4);

        // Preparing expected ( 2 and 3 because we are having a sorting of Desc )
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned2);
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned3);
        ctThhlastikaPressThreatsList.sort(CtThhlastikaPressThreats.DESC_ORDER);

        // Preparing to test with A SPECIFIC SearchCriteriaList
        SearchCriteria searchCriteria = new SearchCriteria("actCode", "~", "TestingActCode1;TestingActCode2;TestingActCode3;TestingActCode100");
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        CtThhlastikaPressThreatsSearchDTO ctThhlastikaPressThreatsSearchDTO = ctThhlastikaPressThreatsSearchRepository
                .searchCtThhlastikaPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Delete test - saves
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertNotNull(ctThhlastikaPressThreatsReturned3);
        assertNotNull(ctThhlastikaPressThreatsReturned4);
        assertNotNull(ctThhlastikaPressThreatsSearchDTO);
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().size());
        assertEquals(Long.valueOf(3), ctThhlastikaPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, ctThhlastikaPressThreatsSearchDTO.getPage());
        assertEquals("Desc", ctThhlastikaPressThreatsSearchDTO.getSort());
        assertFalse(ctThhlastikaPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(ctThhlastikaPressThreatsSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaPressThreatsList.get(0).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getRemarks());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getRemarks());
    }

    @Test
    public void searchCtThhlastikaPressThreatsEmptySearchCriteriaTest(){
        // Delete previously stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned3 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats3);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned4 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats4);

        // Preparing expected ( 3 and 4 because we are having a sorting of Desc )
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned3);
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned4);
        ctThhlastikaPressThreatsList.sort(CtThhlastikaPressThreats.DESC_ORDER);

        // Preparing to test with Empty Search Criterias

        // Get - test method
        CtThhlastikaPressThreatsSearchDTO ctThhlastikaPressThreatsSearchDTO = ctThhlastikaPressThreatsSearchRepository
                .searchCtThhlastikaPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Delete test - saves
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertNotNull(ctThhlastikaPressThreatsReturned3);
        assertNotNull(ctThhlastikaPressThreatsReturned4);
        assertNotNull(ctThhlastikaPressThreatsSearchDTO);
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().size());
        assertEquals(Long.valueOf(5), ctThhlastikaPressThreatsSearchDTO.getTotalResults());
        assertEquals(3, ctThhlastikaPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, ctThhlastikaPressThreatsSearchDTO.getPage());
        assertEquals("Desc", ctThhlastikaPressThreatsSearchDTO.getSort());
        assertFalse(ctThhlastikaPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(ctThhlastikaPressThreatsSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaPressThreatsList.get(0).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getRemarks());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getRemarks());
    }

    @Test
    public void searchCtThhlastikaPressThreatsEmptySearchCriteriaAndPage2Test(){
        // Delete previously stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned3 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats3);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned4 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats4);

        // Preparing expected ( 1 and 2 because we are having a sorting of Desc )
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned1);
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned2);
        ctThhlastikaPressThreatsList.sort(CtThhlastikaPressThreats.DESC_ORDER);

        // Preparing to test with Empty Search Criterias

        // Get - test method
        CtThhlastikaPressThreatsSearchDTO ctThhlastikaPressThreatsSearchDTO = ctThhlastikaPressThreatsSearchRepository
                .searchCtThhlastikaPressThreats(searchCriteriaList, 2, 1, "Desc");

        // Delete test - saves
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertNotNull(ctThhlastikaPressThreatsReturned3);
        assertNotNull(ctThhlastikaPressThreatsReturned4);
        assertNotNull(ctThhlastikaPressThreatsSearchDTO);
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().size());
        assertEquals(Long.valueOf(5), ctThhlastikaPressThreatsSearchDTO.getTotalResults());
        assertEquals(3, ctThhlastikaPressThreatsSearchDTO.getTotalPages());
        assertEquals(1, ctThhlastikaPressThreatsSearchDTO.getPage());
        assertEquals("Desc", ctThhlastikaPressThreatsSearchDTO.getSort());
        assertTrue(ctThhlastikaPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(ctThhlastikaPressThreatsSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaPressThreatsList.get(0).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getRemarks());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getRemarks());
    }

    @Test
    public void searchCtThhlastikaPressThreatsEmptySearchCriteriaAndPage3Test(){
        // Delete previously stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned3 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats3);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned4 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats4);

        // Preparing expected ( 1 and 2 because we are having a sorting of Desc )
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned);
        ctThhlastikaPressThreatsList.sort(CtThhlastikaPressThreats.DESC_ORDER);

        // Preparing to test with Empty Search Criterias

        // Get - test method
        CtThhlastikaPressThreatsSearchDTO ctThhlastikaPressThreatsSearchDTO = ctThhlastikaPressThreatsSearchRepository
                .searchCtThhlastikaPressThreats(searchCriteriaList, 2, 2, "Desc");

        // Delete test - saves
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertNotNull(ctThhlastikaPressThreatsReturned3);
        assertNotNull(ctThhlastikaPressThreatsReturned4);
        assertNotNull(ctThhlastikaPressThreatsSearchDTO);
        assertEquals(1, ctThhlastikaPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(1, ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().size());
        assertEquals(Long.valueOf(5), ctThhlastikaPressThreatsSearchDTO.getTotalResults());
        assertEquals(3, ctThhlastikaPressThreatsSearchDTO.getTotalPages());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getPage());
        assertEquals("Desc", ctThhlastikaPressThreatsSearchDTO.getSort());
        assertTrue(ctThhlastikaPressThreatsSearchDTO.isHasPreviousPage());
        assertFalse(ctThhlastikaPressThreatsSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaPressThreatsList.get(0).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getRemarks());
    }

    @Test
    public void searchCtThhlastikaPressThreatsSortDescCriteriaDescriptionEnTest(){
        // Delete previously stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned3 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats3);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned4 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats4);

        // Preparing expected ( 2 and 3 because we are having a sorting of Desc )
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned2);
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned3);
        ctThhlastikaPressThreatsList.sort(CtThhlastikaPressThreats.DESC_ORDER);

        // Preparing to test for descriptionEn
        searchCriteriaList.add(searchCriteria1);

        // Get - test method
        CtThhlastikaPressThreatsSearchDTO ctThhlastikaPressThreatsSearchDTO = ctThhlastikaPressThreatsSearchRepository
                .searchCtThhlastikaPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Delete test - saves
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertNotNull(ctThhlastikaPressThreatsReturned3);
        assertNotNull(ctThhlastikaPressThreatsReturned4);
        assertNotNull(ctThhlastikaPressThreatsSearchDTO);
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().size());
        assertEquals(Long.valueOf(3), ctThhlastikaPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, ctThhlastikaPressThreatsSearchDTO.getPage());
        assertEquals("Desc", ctThhlastikaPressThreatsSearchDTO.getSort());
        assertFalse(ctThhlastikaPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(ctThhlastikaPressThreatsSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaPressThreatsList.get(0).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getRemarks());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getRemarks());
    }

    @Test
    public void searchCtThhlastikaPressThreatsSortAscCriteriaDescriptionEnTest(){
        // Delete previously stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned3 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats3);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned4 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats4);

        // Preparing expected ( 1 and 2 because we are having a sorting of Asc )
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned1);
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned2);
        ctThhlastikaPressThreatsList.sort(CtThhlastikaPressThreats.ASC_ORDER);

        // Preparing to test for descriptionEn
        searchCriteriaList.add(searchCriteria1);

        // Get - test method
        CtThhlastikaPressThreatsSearchDTO ctThhlastikaPressThreatsSearchDTO = ctThhlastikaPressThreatsSearchRepository
                .searchCtThhlastikaPressThreats(searchCriteriaList, 2, 0, "Asc");

        // Delete test - saves
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertNotNull(ctThhlastikaPressThreatsReturned3);
        assertNotNull(ctThhlastikaPressThreatsReturned4);
        assertNotNull(ctThhlastikaPressThreatsSearchDTO);
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().size());
        assertEquals(Long.valueOf(3), ctThhlastikaPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, ctThhlastikaPressThreatsSearchDTO.getPage());
        assertEquals("Asc", ctThhlastikaPressThreatsSearchDTO.getSort());
        assertFalse(ctThhlastikaPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(ctThhlastikaPressThreatsSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaPressThreatsList.get(0).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getRemarks());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getRemarks());
    }

    @Test
    public void searchCtThhlastikaPressThreatsMoreSearchCriteriaThanExistsCriteriaDescriptionEnTest(){
        // Delete previously stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned3 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats3);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned4 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats4);

        // Preparing expected ( 2 and 3 because we are having a sorting of Desc )
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned2);
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned3);
        ctThhlastikaPressThreatsList.sort(CtThhlastikaPressThreats.DESC_ORDER);

        // Preparing to test with A SPECIFIC SearchCriteriaList for descriptionEn
        SearchCriteria searchCriteria = new SearchCriteria("descriptionEn", "~", "TestingDescriptionEn1;TestingDescriptionEn2;TestingDescriptionEn3;TestingDescriptionEn100;");
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        CtThhlastikaPressThreatsSearchDTO ctThhlastikaPressThreatsSearchDTO = ctThhlastikaPressThreatsSearchRepository
                .searchCtThhlastikaPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Delete test - saves
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertNotNull(ctThhlastikaPressThreatsReturned3);
        assertNotNull(ctThhlastikaPressThreatsReturned4);
        assertNotNull(ctThhlastikaPressThreatsSearchDTO);
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().size());
        assertEquals(Long.valueOf(3), ctThhlastikaPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, ctThhlastikaPressThreatsSearchDTO.getPage());
        assertEquals("Desc", ctThhlastikaPressThreatsSearchDTO.getSort());
        assertFalse(ctThhlastikaPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(ctThhlastikaPressThreatsSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaPressThreatsList.get(0).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getRemarks());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getRemarks());
    }

    @Test
    public void searchCtThhlastikaPressThreatsSortDescCriteriaRemarksTest(){
        // Delete previously stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned3 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats3);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned4 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats4);

        // Preparing expected ( 2 and 3 because we are having a sorting of Desc )
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned2);
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned3);
        ctThhlastikaPressThreatsList.sort(CtThhlastikaPressThreats.DESC_ORDER);

        // Preparing to test for descriptionEn
        searchCriteriaList.add(searchCriteria2);

        // Get - test method
        CtThhlastikaPressThreatsSearchDTO ctThhlastikaPressThreatsSearchDTO = ctThhlastikaPressThreatsSearchRepository
                .searchCtThhlastikaPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Delete test - saves
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertNotNull(ctThhlastikaPressThreatsReturned3);
        assertNotNull(ctThhlastikaPressThreatsReturned4);
        assertNotNull(ctThhlastikaPressThreatsSearchDTO);
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().size());
        assertEquals(Long.valueOf(3), ctThhlastikaPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, ctThhlastikaPressThreatsSearchDTO.getPage());
        assertEquals("Desc", ctThhlastikaPressThreatsSearchDTO.getSort());
        assertFalse(ctThhlastikaPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(ctThhlastikaPressThreatsSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaPressThreatsList.get(0).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getRemarks());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getRemarks());
    }

    @Test
    public void searchCtThhlastikaPressThreatsSortAscCriteriaRemarksTest(){
        // Delete previously stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned3 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats3);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned4 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats4);

        // Preparing expected ( 1 and 2 because we are having a sorting of Asc )
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned1);
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned2);
        ctThhlastikaPressThreatsList.sort(CtThhlastikaPressThreats.ASC_ORDER);

        // Preparing to test for descriptionEn
        searchCriteriaList.add(searchCriteria2);

        // Get - test method
        CtThhlastikaPressThreatsSearchDTO ctThhlastikaPressThreatsSearchDTO = ctThhlastikaPressThreatsSearchRepository
                .searchCtThhlastikaPressThreats(searchCriteriaList, 2, 0, "Asc");

        // Delete test - saves
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertNotNull(ctThhlastikaPressThreatsReturned3);
        assertNotNull(ctThhlastikaPressThreatsReturned4);
        assertNotNull(ctThhlastikaPressThreatsSearchDTO);
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().size());
        assertEquals(Long.valueOf(3), ctThhlastikaPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, ctThhlastikaPressThreatsSearchDTO.getPage());
        assertEquals("Asc", ctThhlastikaPressThreatsSearchDTO.getSort());
        assertFalse(ctThhlastikaPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(ctThhlastikaPressThreatsSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaPressThreatsList.get(0).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getRemarks());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getRemarks());
    }

    @Test
    public void searchCtThhlastikaPressThreatsMoreSearchCriteriaThanExistsCriteriaRemarksTest(){
        // Delete previously stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned3 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats3);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned4 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats4);

        // Preparing expected ( 2 and 3 because we are having a sorting of Desc )
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned2);
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned3);
        ctThhlastikaPressThreatsList.sort(CtThhlastikaPressThreats.DESC_ORDER);

        // Preparing to test with A SPECIFIC SearchCriteriaList for descriptionEn
        SearchCriteria searchCriteria = new SearchCriteria("remarks", "~", "TestingRemarks1;TestingRemarks2;TestingRemarks3;TestingRemarks100;");
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        CtThhlastikaPressThreatsSearchDTO ctThhlastikaPressThreatsSearchDTO = ctThhlastikaPressThreatsSearchRepository
                .searchCtThhlastikaPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Delete test - saves
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertNotNull(ctThhlastikaPressThreatsReturned3);
        assertNotNull(ctThhlastikaPressThreatsReturned4);
        assertNotNull(ctThhlastikaPressThreatsSearchDTO);
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().size());
        assertEquals(Long.valueOf(3), ctThhlastikaPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, ctThhlastikaPressThreatsSearchDTO.getPage());
        assertEquals("Desc", ctThhlastikaPressThreatsSearchDTO.getSort());
        assertFalse(ctThhlastikaPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(ctThhlastikaPressThreatsSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaPressThreatsList.get(0).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getRemarks());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getRemarks());
    }

    @Test
    public void searchCtThhlastikaPressThreatsCriteriaNotEqualAndsForActCodeDescriptionEn(){
        // Delete previously stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned3 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats3);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned4 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats4);

        // Preparing to test for a search request where the user searches for incompatible Ands (of attributes)
        searchCriteriaList.add(searchCriteria);
        searchCriteriaList.add(searchCriteriaNotCorrectOnDescriptionEn);

        // Get - test method
        CtThhlastikaPressThreatsSearchDTO ctThhlastikaPressThreatsSearchDTO = ctThhlastikaPressThreatsSearchRepository
                .searchCtThhlastikaPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Delete test - saves
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertNotNull(ctThhlastikaPressThreatsReturned3);
        assertNotNull(ctThhlastikaPressThreatsReturned4);
        assertNotNull(ctThhlastikaPressThreatsSearchDTO);
        assertNotNull(ctThhlastikaPressThreatsSearchDTO);
        assertEquals(0, ctThhlastikaPressThreatsSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchCtThhlastikaPressThreatsCriteriaNotEqualAndsForActCodeRemarks(){
        // Delete previously stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned3 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats3);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned4 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats4);

        // Preparing to test for a search request where the user searches for incompatible Ands (of attributes)
        searchCriteriaList.add(searchCriteria);
        searchCriteriaList.add(searchCriteriaNotCorrectOnRemarks);

        // Get - test method
        CtThhlastikaPressThreatsSearchDTO ctThhlastikaPressThreatsSearchDTO = ctThhlastikaPressThreatsSearchRepository
                .searchCtThhlastikaPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Delete test - saves
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertNotNull(ctThhlastikaPressThreatsReturned3);
        assertNotNull(ctThhlastikaPressThreatsReturned4);
        assertNotNull(ctThhlastikaPressThreatsSearchDTO);
        assertNotNull(ctThhlastikaPressThreatsSearchDTO);
        assertEquals(0, ctThhlastikaPressThreatsSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchCtThhlastikaPressThreatsCriteriaSemiEqualAndsForActCodeDescriptionEn(){
        // Delete previously stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned3 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats3);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned4 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats4);

        // Preparing expected ( 1 because only one And predicate from all of them and the Or predicates are compatible )
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned1);
        ctThhlastikaPressThreatsList.sort(CtThhlastikaPressThreats.DESC_ORDER);

        // Preparing to test for a search request where the user searches for incompatible Ands (of attributes)
        searchCriteriaList.add(searchCriteria);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnDescriptionEn);

        // Get - test method
        CtThhlastikaPressThreatsSearchDTO ctThhlastikaPressThreatsSearchDTO = ctThhlastikaPressThreatsSearchRepository
                .searchCtThhlastikaPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Delete test - saves
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertNotNull(ctThhlastikaPressThreatsReturned3);
        assertNotNull(ctThhlastikaPressThreatsReturned4);
        assertNotNull(ctThhlastikaPressThreatsSearchDTO);
        assertEquals(1, ctThhlastikaPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(1, ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().size());
        assertEquals(Long.valueOf(1), ctThhlastikaPressThreatsSearchDTO.getTotalResults());
        assertEquals(1, ctThhlastikaPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, ctThhlastikaPressThreatsSearchDTO.getPage());
        assertEquals("Desc", ctThhlastikaPressThreatsSearchDTO.getSort());
        assertFalse(ctThhlastikaPressThreatsSearchDTO.isHasPreviousPage());
        assertFalse(ctThhlastikaPressThreatsSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaPressThreatsList.get(0).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getRemarks());
    }

    @Test
    public void searchCtThhlastikaPressThreatsCriteriaSemiEqualAndsForActCodeRemarks(){
        // Delete previously stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned3 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats3);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned4 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats4);

        // Preparing expected ( 1 because only one And predicate from all of them and the Or predicates are compatible )
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned1);
        ctThhlastikaPressThreatsList.sort(CtThhlastikaPressThreats.DESC_ORDER);

        // Preparing to test for a search request where the user searches for incompatible Ands (of attributes)
        searchCriteriaList.add(searchCriteria);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnRemarks);

        // Get - test method
        CtThhlastikaPressThreatsSearchDTO ctThhlastikaPressThreatsSearchDTO = ctThhlastikaPressThreatsSearchRepository
                .searchCtThhlastikaPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Delete test - saves
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertNotNull(ctThhlastikaPressThreatsReturned3);
        assertNotNull(ctThhlastikaPressThreatsReturned4);
        assertNotNull(ctThhlastikaPressThreatsSearchDTO);
        assertEquals(1, ctThhlastikaPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(1, ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().size());
        assertEquals(Long.valueOf(1), ctThhlastikaPressThreatsSearchDTO.getTotalResults());
        assertEquals(1, ctThhlastikaPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, ctThhlastikaPressThreatsSearchDTO.getPage());
        assertEquals("Desc", ctThhlastikaPressThreatsSearchDTO.getSort());
        assertFalse(ctThhlastikaPressThreatsSearchDTO.isHasPreviousPage());
        assertFalse(ctThhlastikaPressThreatsSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaPressThreatsList.get(0).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getRemarks());
    }

    @Test
    public void searchCtThhlastikaPressThreatsSortDescCriteriaAllActCodePressThreatRemarksTest(){
        // Delete previously stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned3 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats3);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned4 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats4);

        // Preparing expected ( 2 and 3 because we are having a sorting of Desc )
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned2);
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned3);
        ctThhlastikaPressThreatsList.sort(CtThhlastikaPressThreats.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteria);
        searchCriteriaList.add(searchCriteria1);
        searchCriteriaList.add(searchCriteria2);

        // Get - test method
        CtThhlastikaPressThreatsSearchDTO ctThhlastikaPressThreatsSearchDTO = ctThhlastikaPressThreatsSearchRepository
                .searchCtThhlastikaPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Delete test - saves
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertNotNull(ctThhlastikaPressThreatsReturned3);
        assertNotNull(ctThhlastikaPressThreatsReturned4);
        assertNotNull(ctThhlastikaPressThreatsSearchDTO);
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().size());
        assertEquals(Long.valueOf(3), ctThhlastikaPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, ctThhlastikaPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, ctThhlastikaPressThreatsSearchDTO.getPage());
        assertEquals("Desc", ctThhlastikaPressThreatsSearchDTO.getSort());
        assertFalse(ctThhlastikaPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(ctThhlastikaPressThreatsSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaPressThreatsList.get(0).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(0).getRemarks());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getId(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getDescriptionEn(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getRemarks(), ctThhlastikaPressThreatsSearchDTO.getCtThhlastikaPressThreatsList().get(1).getRemarks());
    }

    @Test
    public void downloadCtThhlastikaPressThreatsSortDescTest(){
        // Delete previously stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned3 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats3);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned4 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats4);

        // Preparing expected ( 1, 2 and 3 because we are having a sorting of Desc )
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned1);
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned2);
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned3);
        ctThhlastikaPressThreatsList.sort(CtThhlastikaPressThreats.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        List<CtThhlastikaPressThreats> ctThhlastikaPressThreatsListReturned = ctThhlastikaPressThreatsSearchRepository
                .downloadCtThhlastikaPressThreats(searchCriteriaList, "Desc");

        // Delete test - saves
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertNotNull(ctThhlastikaPressThreatsReturned3);
        assertNotNull(ctThhlastikaPressThreatsReturned4);
        assertNotNull(ctThhlastikaPressThreatsListReturned);
        assertEquals(ctThhlastikaPressThreatsList.size(), ctThhlastikaPressThreatsListReturned.size());
        assertEquals(3, ctThhlastikaPressThreatsListReturned.size());

        assertEquals(ctThhlastikaPressThreatsList.get(0).getId(), ctThhlastikaPressThreatsListReturned.get(0).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getDescriptionEn(), ctThhlastikaPressThreatsListReturned.get(0).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getRemarks(), ctThhlastikaPressThreatsListReturned.get(0).getRemarks());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getId(), ctThhlastikaPressThreatsListReturned.get(1).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getDescriptionEn(), ctThhlastikaPressThreatsListReturned.get(1).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getRemarks(), ctThhlastikaPressThreatsListReturned.get(1).getRemarks());
        assertEquals(ctThhlastikaPressThreatsList.get(2).getId(), ctThhlastikaPressThreatsListReturned.get(2).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(2).getDescriptionEn(), ctThhlastikaPressThreatsListReturned.get(2).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(2).getRemarks(), ctThhlastikaPressThreatsListReturned.get(2).getRemarks());
    }

    @Test
    public void downloadCtThhlastikaPressThreatsSortAscTest(){
        // Delete previously stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned3 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats3);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned4 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats4);

        // Preparing expected ( 1, 2 and 3 because we are having a sorting of Asc )
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned1);
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned2);
        ctThhlastikaPressThreatsList.add(ctThhlastikaPressThreatsReturned3);
        ctThhlastikaPressThreatsList.sort(CtThhlastikaPressThreats.ASC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        List<CtThhlastikaPressThreats> ctThhlastikaPressThreatsListReturned = ctThhlastikaPressThreatsSearchRepository
                .downloadCtThhlastikaPressThreats(searchCriteriaList, "Asc");

        // Delete test - saves
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertNotNull(ctThhlastikaPressThreatsReturned3);
        assertNotNull(ctThhlastikaPressThreatsReturned4);
        assertNotNull(ctThhlastikaPressThreatsListReturned);
        assertEquals(ctThhlastikaPressThreatsList.size(), ctThhlastikaPressThreatsListReturned.size());
        assertEquals(3, ctThhlastikaPressThreatsListReturned.size());

        assertEquals(ctThhlastikaPressThreatsList.get(0).getId(), ctThhlastikaPressThreatsListReturned.get(0).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getDescriptionEn(), ctThhlastikaPressThreatsListReturned.get(0).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(0).getRemarks(), ctThhlastikaPressThreatsListReturned.get(0).getRemarks());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getId(), ctThhlastikaPressThreatsListReturned.get(1).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getDescriptionEn(), ctThhlastikaPressThreatsListReturned.get(1).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(1).getRemarks(), ctThhlastikaPressThreatsListReturned.get(1).getRemarks());
        assertEquals(ctThhlastikaPressThreatsList.get(2).getId(), ctThhlastikaPressThreatsListReturned.get(2).getId());
        assertEquals(ctThhlastikaPressThreatsList.get(2).getDescriptionEn(), ctThhlastikaPressThreatsListReturned.get(2).getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsList.get(2).getRemarks(), ctThhlastikaPressThreatsListReturned.get(2).getRemarks());
    }

}
