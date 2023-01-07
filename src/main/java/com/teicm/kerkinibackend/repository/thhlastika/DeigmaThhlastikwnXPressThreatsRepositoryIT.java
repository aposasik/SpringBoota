package com.teicm.kerkinibackend.repository.thhlastika;

import com.teicm.kerkinibackend.KerkinibackendApplication;
import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaPressThreats;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXPressThreats;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaPressThreatsRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnXPressThreatsRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Transactional
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = KerkinibackendApplication.class)
@TestPropertySource(locations = "classpath:application-integrationtest.properties")
@RunWith(SpringRunner.class)
public class DeigmaThhlastikwnXPressThreatsRepositoryIT {

    @Autowired
    DeigmaThhlastikwnXPressThreatsRepository deigmaThhlastikwnXPressThreatsRepository;

    @Autowired
    DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    @Autowired
    CtThhlastikaPressThreatsRepository ctThhlastikaPressThreatsRepository;

    private DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreats;

    private DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreats1;

    private DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreats2;

    private DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreats3;

    private CtThhlastikaPressThreats ctThhlastikaPressThreats;

    private CtThhlastikaPressThreats ctThhlastikaPressThreats1;

    private DeigmaThhlastikwn deigmaThhlastikwn;

    private DeigmaThhlastikwn deigmaThhlastikwn1;

    @Before
    public void setUp(){
        // Init deigmaThhlastikwnXPressThreats
        deigmaThhlastikwnXPressThreats = new DeigmaThhlastikwnXPressThreats();
        deigmaThhlastikwnXPressThreats.setPressThreat("TestingPressThreat");
        deigmaThhlastikwnXPressThreats.setKwdikosEidous("TestingKwdikosEidous");
        deigmaThhlastikwnXPressThreats.setImportance("TestingImportance");

        // Init deigmaThhlastikwnXPressThreats1
        deigmaThhlastikwnXPressThreats1 = new DeigmaThhlastikwnXPressThreats();
        deigmaThhlastikwnXPressThreats1.setPressThreat("TestingPressThreat1");
        deigmaThhlastikwnXPressThreats1.setKwdikosEidous("TestingKwdikosEidous1");
        deigmaThhlastikwnXPressThreats1.setImportance("TestingImportance1");

        // Init deigmaThhlastikwnXPressThreats2
        deigmaThhlastikwnXPressThreats2 = new DeigmaThhlastikwnXPressThreats();
        deigmaThhlastikwnXPressThreats2.setPressThreat("TestingPressThreat2");
        deigmaThhlastikwnXPressThreats2.setKwdikosEidous("TestingKwdikosEidous2");
        deigmaThhlastikwnXPressThreats2.setImportance("TestingImportance2");

        // Init deigmaThhlastikwnXPressThreats3 (For the Distincts test)
        deigmaThhlastikwnXPressThreats3 = new DeigmaThhlastikwnXPressThreats();
        deigmaThhlastikwnXPressThreats3.setPressThreat("TestingPressThreat2");
        deigmaThhlastikwnXPressThreats3.setKwdikosEidous("TestingKwdikosEidous2");
        deigmaThhlastikwnXPressThreats3.setImportance("TestingImportance2");

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

        // Init deigmaThhlastikwn
        deigmaThhlastikwn = new DeigmaThhlastikwn();
        deigmaThhlastikwn.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias");

        // Init deigmaThhlastikwn1
        deigmaThhlastikwn1 = new DeigmaThhlastikwn();
        deigmaThhlastikwn1.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias1");
    }

    @Test
    public void saveTest(){
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

        // Preparing and saving XPressThreats
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);

        // Delete test-saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertEquals(deigmaThhlastikwnReturned.getId(), deigmaThhlastikwnXPressThreatsReturned.getDeigmaThhlastikwn().getId());
        assertEquals(deigmaThhlastikwnReturned.getKwdikosDeigmatolhpsias(), deigmaThhlastikwnXPressThreatsReturned.getDeigmaThhlastikwn().getKwdikosDeigmatolhpsias());
        assertEquals(ctThhlastikaPressThreatsReturned.getId(), deigmaThhlastikwnXPressThreatsReturned.getCtThhlastikaPressThreats().getId());
        assertEquals(ctThhlastikaPressThreatsReturned.getActCode(), deigmaThhlastikwnXPressThreatsReturned.getCtThhlastikaPressThreats().getActCode());
        assertEquals(ctThhlastikaPressThreatsReturned.getDescriptionEn(), deigmaThhlastikwnXPressThreatsReturned.getCtThhlastikaPressThreats().getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsReturned.getRemarks(), deigmaThhlastikwnXPressThreatsReturned.getCtThhlastikaPressThreats().getRemarks());
    }

    @Test
    public void findDeigmaThhlastikwnXEidhByDeigmaThhlastikwnIsTest(){
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

        // Preparing and saving XPressThreats
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreats);

        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreats);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);

        // Get - test method
        Set<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsReturnedSet = deigmaThhlastikwnXPressThreatsRepository.findDeigmaThhlastikwnXPressThreatsByDeigmaThhlastikwnIs(deigmaThhlastikwnReturned);

        // Delete test-saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertEquals(1, deigmaThhlastikwnXPressThreatsReturnedSet.size());
        assertEquals(deigmaThhlastikwnReturned.getId(), deigmaThhlastikwnXPressThreatsReturned.getDeigmaThhlastikwn().getId());
        assertEquals(deigmaThhlastikwnReturned.getKwdikosDeigmatolhpsias(), deigmaThhlastikwnXPressThreatsReturned.getDeigmaThhlastikwn().getKwdikosDeigmatolhpsias());
        assertEquals(ctThhlastikaPressThreatsReturned.getId(), deigmaThhlastikwnXPressThreatsReturned.getCtThhlastikaPressThreats().getId());
        assertEquals(ctThhlastikaPressThreatsReturned.getActCode(), deigmaThhlastikwnXPressThreatsReturned.getCtThhlastikaPressThreats().getActCode());
        assertEquals(ctThhlastikaPressThreatsReturned.getDescriptionEn(), deigmaThhlastikwnXPressThreatsReturned.getCtThhlastikaPressThreats().getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatsReturned.getRemarks(), deigmaThhlastikwnXPressThreatsReturned.getCtThhlastikaPressThreats().getRemarks());
    }

    @Test
    public void findAll(){
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

        // Preparing and saving XPressThreats
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreats);

        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreats);

        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreats);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository.save(deigmaThhlastikwnXPressThreats2);

        // Get - test method
        Pageable pageable = PageRequest.of(0, 2, Sort.Direction.DESC, "id");
        Page<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsPageReturned = deigmaThhlastikwnXPressThreatsRepository.findAll(pageable);

        // Delete test-saves
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertEquals(2, deigmaThhlastikwnXPressThreatsPageReturned.getNumberOfElements());
        assertEquals(2, deigmaThhlastikwnXPressThreatsPageReturned.getTotalPages());
        assertEquals(3, deigmaThhlastikwnXPressThreatsPageReturned.getTotalElements());
    }

    @Test
    public void findDistinctByDigmaThhlastikwnIdsOrderByDeigmaThhlastikwnId(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);

        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXPressThreats1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXPressThreats2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository
                .save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository
                .save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository
                .save(deigmaThhlastikwnXPressThreats2);

        ArrayList<BigInteger> deigmaThhlastikwnIdsList = deigmaThhlastikwnXPressThreatsRepository.findDistinctByDeigmaThhlastikwnIdOrderByDeigmaThhlastikwnId();

        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertEquals(2, deigmaThhlastikwnIdsList.size());
    }

    @Test
    public void findDistinctByCtIdsOrderByCtIds(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Saving
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);

        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned);
        deigmaThhlastikwnXPressThreats1.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned1);
        deigmaThhlastikwnXPressThreats2.setCtThhlastikaPressThreats(ctThhlastikaPressThreatsReturned1);

        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository
                .save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository
                .save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository
                .save(deigmaThhlastikwnXPressThreats2);

        ArrayList<Long> ctIdsList = deigmaThhlastikwnXPressThreatsRepository.findDistinctByCtPressThreatsIdOrderByPressThreatsId();

        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreats);
        assertNotNull(ctThhlastikaPressThreats1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertEquals(2, ctIdsList.size());
    }

    @Test
    public void findDistinctByKwdikosEidousOrderByKwdikosEidous(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();

        // Saving
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository
                .save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository
                .save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository
                .save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository
                .save(deigmaThhlastikwnXPressThreats3);

        ArrayList<String> kwdikosEidousList = deigmaThhlastikwnXPressThreatsRepository.findDistinctByKwdikosEidousOrderByKwdikosEidous();

        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertEquals(3, kwdikosEidousList.size());
    }

    @Test
    public void findDistinctByPressThreatOrderByPressThreat(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();

        // Saving
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository
                .save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository
                .save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository
                .save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository
                .save(deigmaThhlastikwnXPressThreats3);

        ArrayList<String> pressThreatsList = deigmaThhlastikwnXPressThreatsRepository.findDistinctByPressThreatOrderByPressThreat();

        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertEquals(3, pressThreatsList.size());
    }

    @Test
    public void findDistinctByImportanceOrderByImportance(){
        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();

        // Saving
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned = deigmaThhlastikwnXPressThreatsRepository
                .save(deigmaThhlastikwnXPressThreats);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned1 = deigmaThhlastikwnXPressThreatsRepository
                .save(deigmaThhlastikwnXPressThreats1);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned2 = deigmaThhlastikwnXPressThreatsRepository
                .save(deigmaThhlastikwnXPressThreats2);
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsReturned3 = deigmaThhlastikwnXPressThreatsRepository
                .save(deigmaThhlastikwnXPressThreats3);

        ArrayList<String> importanceList = deigmaThhlastikwnXPressThreatsRepository.findDistinctByImportanceOrderByImportance();

        // Delete previously stored data
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();
        deigmaThhlastikwnXPressThreatsRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXPressThreatsReturned);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned1);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned2);
        assertNotNull(deigmaThhlastikwnXPressThreatsReturned3);
        assertEquals(3, importanceList.size());
    }

}
