package com.teicm.kerkinibackend.repository.thhlastika;

import com.teicm.kerkinibackend.KerkinibackendApplication;
import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaPressThreats;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXPressThreats;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaPressThreatsRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnXPressThreatsRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnXPressThreatsSearchRepository;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXPressThreatsSearchDTO;
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
public class DeigmaThhlastikwnXPressThreatsSearchRepositoryIT {

    @Autowired
    DeigmaThhlastikwnXPressThreatsRepository deigmaThhlastikwnXPressThreatsRepository;

    @Autowired
    DeigmaThhlastikwnXPressThreatsSearchRepository deigmaThhlastikwnXPressThreatsSearchRepository;

    @Autowired
    DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    @Autowired
    CtThhlastikaPressThreatsRepository ctThhlastikaPressThreatsRepository;

    private List<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsList;

    private DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreats;

    private DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreats1;

    private DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreats2;

    private DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreats3;

    private DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreats4;

    private DeigmaThhlastikwn deigmaThhlastikwn;

    private DeigmaThhlastikwn deigmaThhlastikwn1;

    private DeigmaThhlastikwn deigmaThhlastikwn2;

    private CtThhlastikaPressThreats ctThhlastikaPressThreats;

    private CtThhlastikaPressThreats ctThhlastikaPressThreats1;

    private CtThhlastikaPressThreats ctThhlastikaPressThreats2;

    private List<SearchCriteria> searchCriteriaList;

    private SearchCriteria searchCriteria;

    private SearchCriteria searchCriteria1;

    private SearchCriteria searchCriteria2;

    private SearchCriteria searchCriteriaDeigmaThhlastikwn;

    private SearchCriteria searchCriteriaCt;

    private SearchCriteria searchCriteriaNotCorrectOnDeigmaThhlastikwnId;

    private SearchCriteria searchCriteriaSemiCorrectOnDeigmaThhlastikwnId;

    private SearchCriteria searchCriteriaNotCorrectOnCtActCode;

    private SearchCriteria searchCriteriaSemiCorrectOnCtActCode;

    private SearchCriteria searchCriteriaNotCorrectOnPressThreat;

    private SearchCriteria searchCriteriaSemiCorrectOnPressThreat;

    private SearchCriteria searchCriteriaNotCorrectOnImportance;

    private SearchCriteria searchCriteriaSemiCorrectOnImportance;

    @Before
    public void setUp(){
        // Init deigmaThhlastikwnXPressThreats
        deigmaThhlastikwnXPressThreats = new DeigmaThhlastikwnXPressThreats();
        deigmaThhlastikwnXPressThreats.setKwdikosEidous("TestingKwdikosEidous");
        deigmaThhlastikwnXPressThreats.setPressThreat("TestingPressThreat");
        deigmaThhlastikwnXPressThreats.setImportance("TestingImportance");

        // Init deigmaThhlastikwnXPressThreats
        deigmaThhlastikwnXPressThreats1 = new DeigmaThhlastikwnXPressThreats();
        deigmaThhlastikwnXPressThreats1.setKwdikosEidous("TestingKwdikosEidous1");
        deigmaThhlastikwnXPressThreats1.setPressThreat("TestingPressThreat1");
        deigmaThhlastikwnXPressThreats1.setImportance("TestingImportance1");

        // Init deigmaThhlastikwnXPressThreats
        deigmaThhlastikwnXPressThreats2 = new DeigmaThhlastikwnXPressThreats();
        deigmaThhlastikwnXPressThreats2.setKwdikosEidous("TestingKwdikosEidous2");
        deigmaThhlastikwnXPressThreats2.setPressThreat("TestingPressThreat2");
        deigmaThhlastikwnXPressThreats2.setImportance("TestingImportance2");

        // Init deigmaThhlastikwnXPressThreats
        deigmaThhlastikwnXPressThreats3 = new DeigmaThhlastikwnXPressThreats();
        deigmaThhlastikwnXPressThreats3.setKwdikosEidous("TestingKwdikosEidous3");
        deigmaThhlastikwnXPressThreats3.setPressThreat("TestingPressThreat3");
        deigmaThhlastikwnXPressThreats3.setImportance("TestingImportance3");

        // Init deigmaThhlastikwnXPressThreats
        deigmaThhlastikwnXPressThreats4 = new DeigmaThhlastikwnXPressThreats();
        deigmaThhlastikwnXPressThreats4.setKwdikosEidous("TestingKwdikosEidous4");
        deigmaThhlastikwnXPressThreats4.setPressThreat("TestingPressThreat4");
        deigmaThhlastikwnXPressThreats4.setImportance("TestingImportance4");

        // Init deigmaThhlastikwn
        deigmaThhlastikwn = new DeigmaThhlastikwn();
        deigmaThhlastikwn.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias");

        // Init deigmaThhlastikwn
        deigmaThhlastikwn1 = new DeigmaThhlastikwn();
        deigmaThhlastikwn1.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias1");

        // Init deigmaThhlastikwn
        deigmaThhlastikwn2 = new DeigmaThhlastikwn();
        deigmaThhlastikwn2.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias2");

        // Init ctThhlastikaPressThreat
        ctThhlastikaPressThreats = new CtThhlastikaPressThreats();
        ctThhlastikaPressThreats.setActCode("TestingActCode");
        ctThhlastikaPressThreats.setDescriptionEn("TestingDescriptionEn");
        ctThhlastikaPressThreats.setRemarks("TestingRemarks");

        // Init ctThhlastikaPressThreat
        ctThhlastikaPressThreats1 = new CtThhlastikaPressThreats();
        ctThhlastikaPressThreats1.setActCode("TestingActCode1");
        ctThhlastikaPressThreats1.setDescriptionEn("TestingDescriptionEn1");
        ctThhlastikaPressThreats1.setRemarks("TestingRemarks1");

        // Init ctThhlastikaPressThreat
        ctThhlastikaPressThreats2 = new CtThhlastikaPressThreats();
        ctThhlastikaPressThreats2.setActCode("TestingActCode2");
        ctThhlastikaPressThreats2.setDescriptionEn("TestingDescriptionEn2");
        ctThhlastikaPressThreats2.setRemarks("TestingRemarks2");

        // Init searchCriteria
        searchCriteria = new SearchCriteria();
        searchCriteria.setKey("kwdikosEidous");
        searchCriteria.setOperation("~");
        searchCriteria.setValue("TestingKwdikosEidous1;TestingKwdikosEidous2;TestingKwdikosEidous3;");

        // Init searchCriteria
        searchCriteria1 = new SearchCriteria();
        searchCriteria1.setKey("pressThreat");
        searchCriteria1.setOperation("~");
        searchCriteria1.setValue("TestingPressThreat1;TestingPressThreat2;TestingPressThreat3;");

        // Init searchCriteria
        searchCriteria2 = new SearchCriteria();
        searchCriteria2.setKey("importance");
        searchCriteria2.setOperation("~");
        searchCriteria2.setValue("TestingImportance1;TestingImportance2;TestingImportance3;");

        // Init searchCriteria
        searchCriteriaNotCorrectOnPressThreat = new SearchCriteria();
        searchCriteriaNotCorrectOnPressThreat.setKey("pressThreat");
        searchCriteriaNotCorrectOnPressThreat.setOperation("~");
        searchCriteriaNotCorrectOnPressThreat.setValue("TestingPressThreat;TestingPressThreat4;TestingPressThreat100;");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnPressThreat = new SearchCriteria();
        searchCriteriaSemiCorrectOnPressThreat.setKey("pressThreat");
        searchCriteriaSemiCorrectOnPressThreat.setOperation("~");
        searchCriteriaSemiCorrectOnPressThreat.setValue("TestingPressThreat;TestingPressThreat1;TestingPressThreat4;TestingPressThreat100;");

        // Init searchCriteria
        searchCriteriaNotCorrectOnImportance = new SearchCriteria();
        searchCriteriaNotCorrectOnImportance.setKey("importance");
        searchCriteriaNotCorrectOnImportance.setOperation("~");
        searchCriteriaNotCorrectOnImportance.setValue("TestingImportance;TestingImportance4;TestingImportance100;");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnImportance = new SearchCriteria();
        searchCriteriaSemiCorrectOnImportance.setKey("importance");
        searchCriteriaSemiCorrectOnImportance.setOperation("~");
        searchCriteriaSemiCorrectOnImportance.setValue("TestingImportance;TestingImportance1;TestingImportance4;TestingImportance100;");




        // Init searchCriteria
        searchCriteriaDeigmaThhlastikwn = new SearchCriteria();
        searchCriteriaDeigmaThhlastikwn.setKey("deigmaThhlastikwn");
        searchCriteriaDeigmaThhlastikwn.setOperation("~");
        // --- Value to be set in each of tests depending on the returned DeigmaThhlastikwn
        searchCriteriaDeigmaThhlastikwn.setValue(null);

        // Init searchCriteria
        searchCriteriaCt = new SearchCriteria();
        searchCriteriaCt.setKey("ctThhlastikaPressThreats");
        searchCriteriaCt.setOperation("~");
        // --- Value to be set in each of tests depending on the returned CtThhlastikaPressThreats
        searchCriteriaCt.setValue(null);

        // Init searchCriteria
        searchCriteriaNotCorrectOnDeigmaThhlastikwnId = new SearchCriteria();
        searchCriteriaNotCorrectOnDeigmaThhlastikwnId.setKey("deigmaThhlastikwn");
        searchCriteriaNotCorrectOnDeigmaThhlastikwnId.setOperation("~");
        // --- Value to be set in each of tests depending on the returned DeigmaThhlastikwn
        searchCriteriaNotCorrectOnDeigmaThhlastikwnId.setValue(null);

        // Init searchCriteria
        searchCriteriaNotCorrectOnCtActCode = new SearchCriteria();
        searchCriteriaNotCorrectOnCtActCode.setKey("ctThhlastikaPressThreats");
        searchCriteriaNotCorrectOnCtActCode.setOperation("~");
        // --- Value to be set in each of tests depending on the returned CtThhlastikaPressThreats
        searchCriteriaNotCorrectOnCtActCode.setValue(null);

        // Init searchCriteria
        searchCriteriaSemiCorrectOnDeigmaThhlastikwnId = new SearchCriteria();
        searchCriteriaSemiCorrectOnDeigmaThhlastikwnId.setKey("deigmaThhlastikwn");
        searchCriteriaSemiCorrectOnDeigmaThhlastikwnId.setOperation("~");
        // --- Value to be set in each of tests depending on the returned DeigmaThhlastikwn
        searchCriteriaSemiCorrectOnDeigmaThhlastikwnId.setValue(null);

        // Init searchCriteria
        searchCriteriaSemiCorrectOnCtActCode = new SearchCriteria();
        searchCriteriaSemiCorrectOnCtActCode.setKey("ctThhlastikaPressThreats");
        searchCriteriaSemiCorrectOnCtActCode.setOperation("~");
        // --- Value to be set in each of tests depending on the returned CtThhlastikaPressThreats
        searchCriteriaSemiCorrectOnCtActCode.setValue(null);



        // Init List<SearchCriteria>
        searchCriteriaList = new ArrayList<>();

        // Init List<DeigmaThhlastikwnXPressThreats>
        deigmaThhlastikwnXPressThreatsList = new ArrayList<>();
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsSortDescTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned2);
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned3);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsSortAscTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Asc )
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned1);
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned2);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.ASC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Asc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Asc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsMoreCriteriasThanExistsTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned2);
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned3);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaMoreThanExists = new SearchCriteria();
        searchCriteriaMoreThanExists.setKey("kwdikosEidous");
        searchCriteriaMoreThanExists.setOperation("~");
        searchCriteriaMoreThanExists.setValue("TestingKwdikosEidous1;TestingKwdikosEidous2;TestingKwdikosEidous3;TestingKwdikosEidous100;");
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsMoreEmptyCriteriasTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List ( 3 and 4 because we are having a sorting of Desc )
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned3);
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned4);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test Testing Empty Criterias

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(5), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(3, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsMoreEmptyCriteriasPage2Test(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned1);
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned2);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test Testing Empty Criterias

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 1, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(5), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(3, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertTrue(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsMoreEmptyCriteriasPage3Test(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List ( 0 because we are having a sorting of Desc )
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test Testing Empty Criterias

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 2, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(5), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(3, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertTrue(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsSortDescCriteriaPressThreatTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned2);
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned3);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test for PressThreats
        searchCriteriaList.add(searchCriteria1);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsSortAscCriteriaPressThreatTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Asc )
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned1);
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned2);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.ASC_ORDER);

        // Preparing to test for PressThreats
        searchCriteriaList.add(searchCriteria1);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Asc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Asc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsCriteriaPressThreatsMoreCriteriasThanExistTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned2);
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned3);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test for PressThreats more than exists
        SearchCriteria searchCriteriaMoreThanExists = new SearchCriteria();
        searchCriteriaMoreThanExists.setKey("pressThreat");
        searchCriteriaMoreThanExists.setOperation("~");
        searchCriteriaMoreThanExists.setValue("TestingPressThreat1;TestingPressThreat2;TestingPressThreat3;TestingPressThreat100;");
        searchCriteriaList.add(searchCriteriaMoreThanExists);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsSortAscCriteriaImportanceTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Asc )
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned1);
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned2);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.ASC_ORDER);

        // Preparing to test for Importance
        searchCriteriaList.add(searchCriteria2);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Asc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Asc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsSortDescCriteriaImportanceTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned2);
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned3);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test for Importance
        searchCriteriaList.add(searchCriteria2);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsCriteriaImportanceMoreThanExistsTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned2);
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned3);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test for Importance
        SearchCriteria searchCriteriaImportanceMoreThanExist = new SearchCriteria();
        searchCriteriaImportanceMoreThanExist.setKey("importance");
        searchCriteriaImportanceMoreThanExist.setOperation("~");
        searchCriteriaImportanceMoreThanExist.setValue("TestingImportance1;TestingImportance2;TestingImportance3;TestingImportance100;");
        searchCriteriaList.add(searchCriteriaImportanceMoreThanExist);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsSortDescCriteriaDeigmaThhlastikwnTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List ( 1 because we are having a sorting of Desc )
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned1);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test for DeigmaThhlastikwn Id
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsSortDescCriteriaCtActCodeTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned1);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List ( 1 because we are having a sorting of Desc )
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned1);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test for Ct ActCode
        SearchCriteria searchCriteriaCtId = new SearchCriteria("ctThhlastikaPressThreats", "~", ctThhlastikaPressThreatsReturned1.getActCode() + ";");
        searchCriteriaList.add(searchCriteriaCtId);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsSortDescCriteriaDeigmaThhlastikwnKwdikosEidousTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List ( 1 because we are having a sorting of Desc )
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned1);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test for DeigmaThhlastikwn Id and KwdikosEidous
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";");
        searchCriteriaList.add(searchCriteria);
        searchCriteriaList.add(searchCriteriaDeigmaId);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsSortDescCriteriaCtIdKwdikosEidousTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned1);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List ( 1 because we are having a sorting of Desc )
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned1);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test for Ct ActCode and KwdikosEidous
        SearchCriteria searchCriteriaCtId = new SearchCriteria("ctThhlastikaPressThreats", "~", ctThhlastikaPressThreatsReturned1.getActCode() + ";");
        searchCriteriaList.add(searchCriteria);
        searchCriteriaList.add(searchCriteriaCtId);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsSortDescCriteriaNotEqualAndsForDeigmaThhlastikwnKwdikosEidousTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned1);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test for DeigmaThhlastikwn Id and KwdikosEidous (Should not find any since we are testing for wrong And predicates!!)
        searchCriteriaNotCorrectOnDeigmaThhlastikwnId.setValue("100;");
        searchCriteriaList.add(searchCriteriaNotCorrectOnDeigmaThhlastikwnId);
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsSortDescCriteriaNotEqualAndsForCtIdKwdikosEidousTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned1);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned1);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test for Ct ActCode and KwdikosEidous (Should not find any since we are testing for wrong And predicates!!)
        searchCriteriaNotCorrectOnCtActCode.setValue("TestingNotEqualsActCode");
        searchCriteriaList.add(searchCriteria);
        searchCriteriaList.add(searchCriteriaNotCorrectOnCtActCode);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsSortDescCriteriaNotEqualAndsForPressThreatKwdikosEidousTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned1);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test for PressThreat Id and KwdikosEidous (Should not find any since we are testing for wrong And predicates!!)
        searchCriteriaList.add(searchCriteriaNotCorrectOnPressThreat);
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsSortDescCriteriaNotEqualAndsForImportanceKwdikosEidousTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned1);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned1);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test for Importance and KwdikosEidous (Should not find any since we are testing for wrong And predicates!!)
        searchCriteriaList.add(searchCriteria);
        searchCriteriaList.add(searchCriteriaNotCorrectOnImportance);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsSortDescCriteriaSemiEqualAndsForDeigmaThhlastikwnKwdikosEidousTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned1);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test for DeigmaThhlastikwn Id and KwdikosEidous (Should find 1 since we are testing for half wrong And predicates!!)
        searchCriteriaSemiCorrectOnDeigmaThhlastikwnId.setValue(deigmaThhlastikwnReturned1.getId() + ";");
        searchCriteriaList.add(searchCriteriaSemiCorrectOnDeigmaThhlastikwnId);
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsSortDescCriteriaSemiEqualAndsForCtIdKwdikosEidousTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned1);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned1);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test for Ct ActCode and KwdikosEidous (Should not find any since we are testing for wrong And predicates!!)
        searchCriteriaSemiCorrectOnCtActCode.setValue(ctThhlastikaPressThreatsReturned1.getActCode());
        searchCriteriaList.add(searchCriteria);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnCtActCode);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsSortDescCriteriaSemiEqualAndsForPressThreatKwdikosEidousTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned1);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test for PressThreat and KwdikosEidous (Should find 1 since we are testing for half wrong And predicates!!)
        searchCriteriaList.add(searchCriteriaSemiCorrectOnPressThreat);
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsSortDescCriteriaSemiEqualAndsForImportanceKwdikosEidousTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned1);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned1);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test for Importance and KwdikosEidous (Should not find any since we are testing for wrong And predicates!!)
        searchCriteriaList.add(searchCriteria);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnImportance);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
    }

    @Test
    public void searchDeigmaThhlastikwnPressThreatsSortDescCriteriaAllKwdikosEidousPressThreatImportanceDeigmaThhlastikwnCtActCodeTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats2);

        // Preparing XPressThreats for save ( EXPECTING ONLY 1 - 2 - 3 )
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned1);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned2);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned2);
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned3);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test for ALL
        searchCriteriaDeigmaThhlastikwn.setValue(deigmaThhlastikwn.getId() + ";" + deigmaThhlastikwn1.getId() + ";" + deigmaThhlastikwn2.getId() + ";");
        searchCriteriaCt.setValue(ctThhlastikaPressThreatsReturned.getActCode() + ";" + ctThhlastikaPressThreatsReturned1.getActCode() + ";" + ctThhlastikaPressThreatsReturned2.getActCode() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaThhlastikwn);
        searchCriteriaList.add(searchCriteriaCt);
        searchCriteriaList.add(searchCriteria);
        searchCriteriaList.add(searchCriteria1);
        searchCriteriaList.add(searchCriteria2);

        // Get - test method
        DeigmaThhlastikwnXPressThreatsSearchDTO deigmaThhlastikwnXPressThreatsSearchDTO = deigmaThhlastikwnXPressThreatsSearchRepository
                .searchDeigmaThhlastikwnXPressThreats(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsSearchDTO);
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXPressThreatsSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXPressThreatsSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXPressThreatsSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXPressThreatsSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXPressThreatsSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXPressThreatsSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(0).getImportance());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getId(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getPressThreat(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getImportance(), deigmaThhlastikwnXPressThreatsSearchDTO.getDeigmaThhlastikwnXPressThreatsList().get(1).getImportance());
    }

    @Test
    public void downloadDeigmaThhlastikwnPressThreatsSortDescTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List ( 1 and 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned1);
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned2);
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned3);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        List<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsListReturned = deigmaThhlastikwnXPressThreatsSearchRepository
                .downloadDeigmaThhlastikwnXPressThreats(searchCriteriaList, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsList);
        assertEquals(3, deigmaThhlastikwnXPressThreatsList.size());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsListReturned.get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsListReturned.get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsListReturned.get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsListReturned.get(0).getImportance());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getId(), deigmaThhlastikwnXPressThreatsListReturned.get(1).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsListReturned.get(1).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getPressThreat(), deigmaThhlastikwnXPressThreatsListReturned.get(1).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getImportance(), deigmaThhlastikwnXPressThreatsListReturned.get(1).getImportance());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(2).getId(), deigmaThhlastikwnXPressThreatsListReturned.get(2).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(2).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsListReturned.get(2).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(2).getPressThreat(), deigmaThhlastikwnXPressThreatsListReturned.get(2).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(2).getImportance(), deigmaThhlastikwnXPressThreatsListReturned.get(2).getImportance());
    }

    @Test
    public void downloadDeigmaThhlastikwnPressThreatsSortAscTest(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats3.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats4.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats3);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned4 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats4);

        // Preparing the expected List ( 1 and 2 and 3 because we are having a sorting of Asc )
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned1);
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned2);
        deigmaThhlastikwnXPressThreatsList.add(deigmaThhlastikwnXPressThreatsReturned3);
        deigmaThhlastikwnXPressThreatsList.sort(DeigmaThhlastikwnXPressThreats.ASC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteria);

        // Get - test method
        List<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsListReturned = deigmaThhlastikwnXPressThreatsSearchRepository
                .downloadDeigmaThhlastikwnXPressThreats(searchCriteriaList, "Asc");

        // Deleting test - saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned4);
        assertNotNull(deigmaThhlastikwnXPressThreatsList);
        assertEquals(3, deigmaThhlastikwnXPressThreatsList.size());

        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getId(), deigmaThhlastikwnXPressThreatsListReturned.get(0).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsListReturned.get(0).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getPressThreat(), deigmaThhlastikwnXPressThreatsListReturned.get(0).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(0).getImportance(), deigmaThhlastikwnXPressThreatsListReturned.get(0).getImportance());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getId(), deigmaThhlastikwnXPressThreatsListReturned.get(1).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsListReturned.get(1).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getPressThreat(), deigmaThhlastikwnXPressThreatsListReturned.get(1).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(1).getImportance(), deigmaThhlastikwnXPressThreatsListReturned.get(1).getImportance());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(2).getId(), deigmaThhlastikwnXPressThreatsListReturned.get(2).getId());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(2).getKwdikosEidous(), deigmaThhlastikwnXPressThreatsListReturned.get(2).getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(2).getPressThreat(), deigmaThhlastikwnXPressThreatsListReturned.get(2).getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatsList.get(2).getImportance(), deigmaThhlastikwnXPressThreatsListReturned.get(2).getImportance());
    }

}
