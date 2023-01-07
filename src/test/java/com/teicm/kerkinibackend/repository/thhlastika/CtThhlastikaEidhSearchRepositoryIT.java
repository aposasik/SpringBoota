package com.teicm.kerkinibackend.repository.thhlastika;

import com.teicm.kerkinibackend.KerkinibackendApplication;
import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaEidh;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaEidhRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaEidhSearchRepository;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaEidhSearchDTO;
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

@Transactional
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = KerkinibackendApplication.class)
@TestPropertySource(locations = "classpath:application-integrationtest.properties")
@RunWith(SpringRunner.class)
public class CtThhlastikaEidhSearchRepositoryIT {

    @Autowired
    CtThhlastikaEidhRepository ctThhlastikaEidhRepository;

    @Autowired
    CtThhlastikaEidhSearchRepository ctThhlastikaEidhSearchRepository;

    private List<CtThhlastikaEidh> ctThhlastikaEidhList;

    private CtThhlastikaEidh ctThhlastikaEidh;

    private CtThhlastikaEidh ctThhlastikaEidh1;

    private CtThhlastikaEidh ctThhlastikaEidh2;

    private CtThhlastikaEidh ctThhlastikaEidh3;

    private CtThhlastikaEidh ctThhlastikaEidh4;

    private List<SearchCriteria> searchCriteriaList;

    private SearchCriteria searchCriteria;

    @Before
    public void setUp(){
        // Init ctThhlastikaEidh
        ctThhlastikaEidh = new CtThhlastikaEidh();
        ctThhlastikaEidh.setEidos("TestingEidos");

        // Init ctThhlastikaEidh1
        ctThhlastikaEidh1 = new CtThhlastikaEidh();
        ctThhlastikaEidh1.setEidos("TestingEidos1");

        // Init ctThhlastikaEidh2
        ctThhlastikaEidh2 = new CtThhlastikaEidh();
        ctThhlastikaEidh2.setEidos("TestingEidos2");

        // Init ctThhlastikaEidh3
        ctThhlastikaEidh3 = new CtThhlastikaEidh();
        ctThhlastikaEidh3.setEidos("TestingEidos3");

        // Init ctThhlastikaEidh4
        ctThhlastikaEidh4 = new CtThhlastikaEidh();
        ctThhlastikaEidh4.setEidos("TestingEidos4");

        // Init SearchCriteria
        searchCriteria = new SearchCriteria();
        searchCriteria.setKey("eidos");
        searchCriteria.setOperation("~");
        searchCriteria.setValue("TestingEidos1;TestingEidos2;TestingEidos3;");

        // Init List<CtThhlastikaEidh
        ctThhlastikaEidhList = new ArrayList<>();

        // Init List<SearchCriteria>
        searchCriteriaList = new ArrayList<>();
    }

    @Test
    public void searchCtThhlastikaEidhSortDescTest(){
        // Delete previously stored data
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);
        CtThhlastikaEidh ctThhlastikaEidhReturned3 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh3);
        CtThhlastikaEidh ctThhlastikaEidhReturned4 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh4);

        // Preparing expected ( 2 and 3 because we are having a sorting of Desc )
        ctThhlastikaEidhList.add(ctThhlastikaEidhReturned2);
        ctThhlastikaEidhList.add(ctThhlastikaEidhReturned3);
        ctThhlastikaEidhList.sort(CtThhlastikaEidh.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        CtThhlastikaEidhSearchDTO ctThhlastikaEidhSearchDTO = ctThhlastikaEidhSearchRepository
                .searchCtThhlastikaEidh(searchCriteriaList, 2, 0, "Desc");

        // Delete test-saves
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(ctThhlastikaEidhReturned);
        assertNotNull(ctThhlastikaEidhReturned1);
        assertNotNull(ctThhlastikaEidhReturned2);
        assertNotNull(ctThhlastikaEidhReturned3);
        assertNotNull(ctThhlastikaEidhReturned4);
        assertNotNull(ctThhlastikaEidhSearchDTO);
        assertEquals(2, ctThhlastikaEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().size());
        assertEquals(Long.valueOf(3), ctThhlastikaEidhSearchDTO.getTotalResults());
        assertEquals(2, ctThhlastikaEidhSearchDTO.getTotalPages());
        assertEquals(0, ctThhlastikaEidhSearchDTO.getPage());
        assertEquals("Desc", ctThhlastikaEidhSearchDTO.getSort());
        assertFalse(ctThhlastikaEidhSearchDTO.isHasPreviousPage());
        assertTrue(ctThhlastikaEidhSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaEidhList.get(0).getId(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(0).getId());
        assertEquals(ctThhlastikaEidhList.get(0).getEidos(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(0).getEidos());
        assertEquals(ctThhlastikaEidhList.get(1).getId(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(1).getId());
        assertEquals(ctThhlastikaEidhList.get(1).getEidos(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(1).getEidos());
    }

    @Test
    public void searchCtThhlastikaEidhSortAscTest(){
        // Delete previously stored data
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);
        CtThhlastikaEidh ctThhlastikaEidhReturned3 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh3);
        CtThhlastikaEidh ctThhlastikaEidhReturned4 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh4);

        // Preparing expected ( 2 and 3 because we are having a sorting of Asc )
        ctThhlastikaEidhList.add(ctThhlastikaEidhReturned1);
        ctThhlastikaEidhList.add(ctThhlastikaEidhReturned2);
        ctThhlastikaEidhList.sort(CtThhlastikaEidh.ASC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        CtThhlastikaEidhSearchDTO ctThhlastikaEidhSearchDTO = ctThhlastikaEidhSearchRepository
                .searchCtThhlastikaEidh(searchCriteriaList, 2, 0, "Asc");

        // Delete test-saves
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(ctThhlastikaEidhReturned);
        assertNotNull(ctThhlastikaEidhReturned1);
        assertNotNull(ctThhlastikaEidhReturned2);
        assertNotNull(ctThhlastikaEidhReturned3);
        assertNotNull(ctThhlastikaEidhReturned4);
        assertNotNull(ctThhlastikaEidhSearchDTO);
        assertEquals(2, ctThhlastikaEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().size());
        assertEquals(Long.valueOf(3), ctThhlastikaEidhSearchDTO.getTotalResults());
        assertEquals(2, ctThhlastikaEidhSearchDTO.getTotalPages());
        assertEquals(0, ctThhlastikaEidhSearchDTO.getPage());
        assertEquals("Asc", ctThhlastikaEidhSearchDTO.getSort());
        assertFalse(ctThhlastikaEidhSearchDTO.isHasPreviousPage());
        assertTrue(ctThhlastikaEidhSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaEidhList.get(0).getId(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(0).getId());
        assertEquals(ctThhlastikaEidhList.get(0).getEidos(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(0).getEidos());
        assertEquals(ctThhlastikaEidhList.get(1).getId(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(1).getId());
        assertEquals(ctThhlastikaEidhList.get(1).getEidos(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(1).getEidos());
    }

    @Test
    public void searchCtThhlastikaEidhMoreSearchCriteriaThanExistsTest(){
        // Delete previously stored data
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);
        CtThhlastikaEidh ctThhlastikaEidhReturned3 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh3);
        CtThhlastikaEidh ctThhlastikaEidhReturned4 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh4);

        // Preparing expected ( 2 and 3 because we are having a sorting of Desc )
        ctThhlastikaEidhList.add(ctThhlastikaEidhReturned2);
        ctThhlastikaEidhList.add(ctThhlastikaEidhReturned3);
        ctThhlastikaEidhList.sort(CtThhlastikaEidh.DESC_ORDER);

        // Preparing to test with A SPECIFIC SearchCriteriaList
        SearchCriteria searchCriteria = new SearchCriteria("eidos", "~", "TestingEidos1;TestingEidos2;TestingEidos3;TestingEidos100");
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        CtThhlastikaEidhSearchDTO ctThhlastikaEidhSearchDTO = ctThhlastikaEidhSearchRepository
                .searchCtThhlastikaEidh(searchCriteriaList, 2, 0, "Desc");

        // Delete test-saves
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(ctThhlastikaEidhReturned);
        assertNotNull(ctThhlastikaEidhReturned1);
        assertNotNull(ctThhlastikaEidhReturned2);
        assertNotNull(ctThhlastikaEidhReturned3);
        assertNotNull(ctThhlastikaEidhReturned4);
        assertNotNull(ctThhlastikaEidhSearchDTO);
        assertEquals(2, ctThhlastikaEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().size());
        assertEquals(Long.valueOf(3), ctThhlastikaEidhSearchDTO.getTotalResults());
        assertEquals(2, ctThhlastikaEidhSearchDTO.getTotalPages());
        assertEquals(0, ctThhlastikaEidhSearchDTO.getPage());
        assertEquals("Desc", ctThhlastikaEidhSearchDTO.getSort());
        assertFalse(ctThhlastikaEidhSearchDTO.isHasPreviousPage());
        assertTrue(ctThhlastikaEidhSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaEidhList.get(0).getId(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(0).getId());
        assertEquals(ctThhlastikaEidhList.get(0).getEidos(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(0).getEidos());
        assertEquals(ctThhlastikaEidhList.get(1).getId(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(1).getId());
        assertEquals(ctThhlastikaEidhList.get(1).getEidos(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(1).getEidos());
    }

    @Test
    public void searchCtThhlastikaEidhEmptySearchCriteriaTest(){
        // Delete previously stored data
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);
        CtThhlastikaEidh ctThhlastikaEidhReturned3 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh3);
        CtThhlastikaEidh ctThhlastikaEidhReturned4 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh4);

        // Preparing expected ( 3 and 4 because we are having a sorting of Desc )
        ctThhlastikaEidhList.add(ctThhlastikaEidhReturned3);
        ctThhlastikaEidhList.add(ctThhlastikaEidhReturned4);
        ctThhlastikaEidhList.sort(CtThhlastikaEidh.DESC_ORDER);

        // Preparing to test( Leaving the SearchCriteriaList empty to test it )

        // Get - test method
        CtThhlastikaEidhSearchDTO ctThhlastikaEidhSearchDTO = ctThhlastikaEidhSearchRepository
                .searchCtThhlastikaEidh(searchCriteriaList, 2, 0, "Desc");

        // Delete test-saves
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(ctThhlastikaEidhReturned);
        assertNotNull(ctThhlastikaEidhReturned1);
        assertNotNull(ctThhlastikaEidhReturned2);
        assertNotNull(ctThhlastikaEidhReturned3);
        assertNotNull(ctThhlastikaEidhReturned4);
        assertNotNull(ctThhlastikaEidhSearchDTO);
        assertEquals(2, ctThhlastikaEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().size());
        assertEquals(Long.valueOf(5), ctThhlastikaEidhSearchDTO.getTotalResults());
        assertEquals(3, ctThhlastikaEidhSearchDTO.getTotalPages());
        assertEquals(0, ctThhlastikaEidhSearchDTO.getPage());
        assertEquals("Desc", ctThhlastikaEidhSearchDTO.getSort());
        assertFalse(ctThhlastikaEidhSearchDTO.isHasPreviousPage());
        assertTrue(ctThhlastikaEidhSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaEidhList.get(0).getId(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(0).getId());
        assertEquals(ctThhlastikaEidhList.get(0).getEidos(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(0).getEidos());
        assertEquals(ctThhlastikaEidhList.get(1).getId(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(1).getId());
        assertEquals(ctThhlastikaEidhList.get(1).getEidos(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(1).getEidos());
    }

    @Test
    public void searchCtThhlastikaEidhEmptySearchCriteriaAndPage2Test(){
        // Delete previously stored data
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);
        CtThhlastikaEidh ctThhlastikaEidhReturned3 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh3);
        CtThhlastikaEidh ctThhlastikaEidhReturned4 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh4);

        // Preparing expected ( 1 and 2 because we are having a sorting of Desc )
        ctThhlastikaEidhList.add(ctThhlastikaEidhReturned1);
        ctThhlastikaEidhList.add(ctThhlastikaEidhReturned2);
        ctThhlastikaEidhList.sort(CtThhlastikaEidh.DESC_ORDER);

        // Preparing to test( Leaving the SearchCriteriaList empty to test it )

        // Get - test method
        CtThhlastikaEidhSearchDTO ctThhlastikaEidhSearchDTO = ctThhlastikaEidhSearchRepository
                .searchCtThhlastikaEidh(searchCriteriaList, 2, 1, "Desc");

        // Delete test-saves
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(ctThhlastikaEidhReturned);
        assertNotNull(ctThhlastikaEidhReturned1);
        assertNotNull(ctThhlastikaEidhReturned2);
        assertNotNull(ctThhlastikaEidhReturned3);
        assertNotNull(ctThhlastikaEidhReturned4);
        assertNotNull(ctThhlastikaEidhSearchDTO);
        assertEquals(2, ctThhlastikaEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().size());
        assertEquals(Long.valueOf(5), ctThhlastikaEidhSearchDTO.getTotalResults());
        assertEquals(3, ctThhlastikaEidhSearchDTO.getTotalPages());
        assertEquals(1, ctThhlastikaEidhSearchDTO.getPage());
        assertEquals("Desc", ctThhlastikaEidhSearchDTO.getSort());
        assertTrue(ctThhlastikaEidhSearchDTO.isHasPreviousPage());
        assertTrue(ctThhlastikaEidhSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaEidhList.get(0).getId(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(0).getId());
        assertEquals(ctThhlastikaEidhList.get(0).getEidos(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(0).getEidos());
        assertEquals(ctThhlastikaEidhList.get(1).getId(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(1).getId());
        assertEquals(ctThhlastikaEidhList.get(1).getEidos(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(1).getEidos());
    }

    @Test
    public void searchCtThhlastikaEidhEmptySearchCriteriaAndPage3Test(){
        // Delete previously stored data
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);
        CtThhlastikaEidh ctThhlastikaEidhReturned3 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh3);
        CtThhlastikaEidh ctThhlastikaEidhReturned4 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh4);

        // Preparing expected ( 0 because we are having a sorting of Desc )
        ctThhlastikaEidhList.add(ctThhlastikaEidhReturned);
        ctThhlastikaEidhList.sort(CtThhlastikaEidh.DESC_ORDER);

        // Preparing to test( Leaving the SearchCriteriaList empty to test it )

        // Get - test method
        CtThhlastikaEidhSearchDTO ctThhlastikaEidhSearchDTO = ctThhlastikaEidhSearchRepository
                .searchCtThhlastikaEidh(searchCriteriaList, 2, 2, "Desc");

        // Delete test-saves
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(ctThhlastikaEidhReturned);
        assertNotNull(ctThhlastikaEidhReturned1);
        assertNotNull(ctThhlastikaEidhReturned2);
        assertNotNull(ctThhlastikaEidhReturned3);
        assertNotNull(ctThhlastikaEidhReturned4);
        assertNotNull(ctThhlastikaEidhSearchDTO);
        assertEquals(1, ctThhlastikaEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().size());
        assertEquals(Long.valueOf(5), ctThhlastikaEidhSearchDTO.getTotalResults());
        assertEquals(3, ctThhlastikaEidhSearchDTO.getTotalPages());
        assertEquals(2, ctThhlastikaEidhSearchDTO.getPage());
        assertEquals("Desc", ctThhlastikaEidhSearchDTO.getSort());
        assertTrue(ctThhlastikaEidhSearchDTO.isHasPreviousPage());
        assertFalse(ctThhlastikaEidhSearchDTO.isHasNextPage());

        assertEquals(ctThhlastikaEidhList.get(0).getId(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(0).getId());
        assertEquals(ctThhlastikaEidhList.get(0).getEidos(), ctThhlastikaEidhSearchDTO.getCtThhlastikaEidhList().get(0).getEidos());
    }

    @Test
    public void downloadCtThhlastikaEidhSortDescTest(){
        // Delete previously stored data
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);
        CtThhlastikaEidh ctThhlastikaEidhReturned3 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh3);
        CtThhlastikaEidh ctThhlastikaEidhReturned4 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh4);

        // Preparing expected ( 1, 2, 3 because we are having a sorting of Desc using the searchCriteria )
        ctThhlastikaEidhList.add(ctThhlastikaEidhReturned1);
        ctThhlastikaEidhList.add(ctThhlastikaEidhReturned2);
        ctThhlastikaEidhList.add(ctThhlastikaEidhReturned3);
        ctThhlastikaEidhList.sort(CtThhlastikaEidh.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        List<CtThhlastikaEidh> ctThhlastikaEidhListReturned = ctThhlastikaEidhSearchRepository
                .downloadCtThhlastikaEidh(searchCriteriaList, "Desc");

        // Delete test-saves
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(ctThhlastikaEidhReturned);
        assertNotNull(ctThhlastikaEidhReturned1);
        assertNotNull(ctThhlastikaEidhReturned2);
        assertNotNull(ctThhlastikaEidhReturned3);
        assertNotNull(ctThhlastikaEidhReturned4);
        assertNotNull(ctThhlastikaEidhListReturned);
        assertEquals(ctThhlastikaEidhList.size(), ctThhlastikaEidhListReturned.size());
        assertEquals(3, ctThhlastikaEidhListReturned.size());

        assertEquals(ctThhlastikaEidhList.get(0).getId(), ctThhlastikaEidhListReturned.get(0).getId());
        assertEquals(ctThhlastikaEidhList.get(0).getEidos(), ctThhlastikaEidhListReturned.get(0).getEidos());
        assertEquals(ctThhlastikaEidhList.get(1).getId(), ctThhlastikaEidhListReturned.get(1).getId());
        assertEquals(ctThhlastikaEidhList.get(1).getEidos(), ctThhlastikaEidhListReturned.get(1).getEidos());
        assertEquals(ctThhlastikaEidhList.get(2).getId(), ctThhlastikaEidhListReturned.get(2).getId());
        assertEquals(ctThhlastikaEidhList.get(2).getEidos(), ctThhlastikaEidhListReturned.get(2).getEidos());
    }

    @Test
    public void downloadCtThhlastikaEidhSortAscTest(){
        // Delete previously stored data
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);
        CtThhlastikaEidh ctThhlastikaEidhReturned3 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh3);
        CtThhlastikaEidh ctThhlastikaEidhReturned4 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh4);

        // Preparing expected ( 1, 2, 3 because we are having a sorting of Asc using the searchCriteria )
        ctThhlastikaEidhList.add(ctThhlastikaEidhReturned1);
        ctThhlastikaEidhList.add(ctThhlastikaEidhReturned2);
        ctThhlastikaEidhList.add(ctThhlastikaEidhReturned3);
        ctThhlastikaEidhList.sort(CtThhlastikaEidh.ASC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        List<CtThhlastikaEidh> ctThhlastikaEidhListReturned = ctThhlastikaEidhSearchRepository
                .downloadCtThhlastikaEidh(searchCriteriaList, "Asc");

        // Delete test-saves
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(ctThhlastikaEidhReturned);
        assertNotNull(ctThhlastikaEidhReturned1);
        assertNotNull(ctThhlastikaEidhReturned2);
        assertNotNull(ctThhlastikaEidhReturned3);
        assertNotNull(ctThhlastikaEidhReturned4);
        assertNotNull(ctThhlastikaEidhListReturned);
        assertEquals(ctThhlastikaEidhList.size(), ctThhlastikaEidhListReturned.size());
        assertEquals(3, ctThhlastikaEidhListReturned.size());

        assertEquals(ctThhlastikaEidhList.get(0).getId(), ctThhlastikaEidhListReturned.get(0).getId());
        assertEquals(ctThhlastikaEidhList.get(0).getEidos(), ctThhlastikaEidhListReturned.get(0).getEidos());
        assertEquals(ctThhlastikaEidhList.get(1).getId(), ctThhlastikaEidhListReturned.get(1).getId());
        assertEquals(ctThhlastikaEidhList.get(1).getEidos(), ctThhlastikaEidhListReturned.get(1).getEidos());
        assertEquals(ctThhlastikaEidhList.get(2).getId(), ctThhlastikaEidhListReturned.get(2).getId());
        assertEquals(ctThhlastikaEidhList.get(2).getEidos(), ctThhlastikaEidhListReturned.get(2).getEidos());
    }

}
