package com.teicm.kerkinibackend.repository.thhlastika;

import com.teicm.kerkinibackend.KerkinibackendApplication;
import com.teicm.kerkinibackend.domain.Deigmata;
import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaEidh;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXEidh;
import com.teicm.kerkinibackend.repositories.DeigmataRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaEidhRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnXEidhRepository;
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
public class DeigmaThhlastikwnXEidhRepositoryIT {

    @Autowired
    DeigmaThhlastikwnXEidhRepository deigmaThhlastikwnXEidhRepository;

    @Autowired
    DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    @Autowired
    CtThhlastikaEidhRepository ctThhlastikaEidhRepository;

    private DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh;

    private DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh1;

    private DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh2;

    private DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh3;

    private CtThhlastikaEidh ctThhlastikaEidh;

    private CtThhlastikaEidh ctThhlastikaEidh1;

    private DeigmaThhlastikwn deigmaThhlastikwn;

    private DeigmaThhlastikwn deigmaThhlastikwn1;

    @Before
    public void setUp(){
        // Init deigmaThhlastikwnXEidh
        deigmaThhlastikwnXEidh = new DeigmaThhlastikwnXEidh();
        deigmaThhlastikwnXEidh.setParathrhseis("TestingParathrhseis");
        deigmaThhlastikwnXEidh.setSxetikhAfthonia("TestingSxetikhAfthonia");
        deigmaThhlastikwnXEidh.setHlikia("TestingHlikia");
        deigmaThhlastikwnXEidh.setFulo("TestingFulo");

        // Init deigmaThhlastikwnXEidh1
        deigmaThhlastikwnXEidh1 = new DeigmaThhlastikwnXEidh();
        deigmaThhlastikwnXEidh1.setParathrhseis("TestingParathrhseis1");
        deigmaThhlastikwnXEidh1.setSxetikhAfthonia("TestingSxetikhAfthonia1");
        deigmaThhlastikwnXEidh1.setHlikia("TestingHlikia1");
        deigmaThhlastikwnXEidh1.setFulo("TestingFulo1");

        // Init deigmaThhlastikwnXEidh2
        deigmaThhlastikwnXEidh2 = new DeigmaThhlastikwnXEidh();
        deigmaThhlastikwnXEidh2.setParathrhseis("TestingParathrhseis2");
        deigmaThhlastikwnXEidh2.setSxetikhAfthonia("TestingSxetikhAfthonia2");
        deigmaThhlastikwnXEidh2.setHlikia("TestingHlikia2");
        deigmaThhlastikwnXEidh2.setFulo("TestingFulo2");

        // Init deigmaThhlastikwnXEidh3 (For Distinct test)
        deigmaThhlastikwnXEidh3 = new DeigmaThhlastikwnXEidh();
        deigmaThhlastikwnXEidh3.setParathrhseis("TestingParathrhseis2");
        deigmaThhlastikwnXEidh3.setSxetikhAfthonia("TestingSxetikhAfthonia2");
        deigmaThhlastikwnXEidh3.setHlikia("TestingHlikia2");
        deigmaThhlastikwnXEidh3.setFulo("TestingFulo2");

        // Init ctThhlastikaEidh
        ctThhlastikaEidh = new CtThhlastikaEidh();
        ctThhlastikaEidh.setEidos("TestingEidos");

        // Init ctThhlastikaEidh
        ctThhlastikaEidh1 = new CtThhlastikaEidh();
        ctThhlastikaEidh1.setEidos("TestingEidos1");

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
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing and saving XEidh
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);

        // Delete test-saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(ctThhlastikaEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertEquals(deigmaThhlastikwnReturned.getId(), deigmaThhlastikwnXEidhReturned.getDeigmaThhlastikwn().getId());
        assertEquals(deigmaThhlastikwnReturned.getKwdikosDeigmatolhpsias(), deigmaThhlastikwnXEidhReturned.getDeigmaThhlastikwn().getKwdikosDeigmatolhpsias());
        assertEquals(ctThhlastikaEidhReturned.getId(), deigmaThhlastikwnXEidhReturned.getCtThhlastikaEidh().getId());
        assertEquals(ctThhlastikaEidhReturned.getEidos(), deigmaThhlastikwnXEidhReturned.getCtThhlastikaEidh().getEidos());
    }

    @Test
    public void findDeigmaThhlastikwnXEidhByDeigmaThhlastikwnIsTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing and saving XEidh
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidh);

        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidh);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);

        // Get - test method
        Set<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidhReturnedSet = deigmaThhlastikwnXEidhRepository.findDeigmaThhlastikwnXEidhByDeigmaThhlastikwnIs(deigmaThhlastikwnReturned);

        // Delete test-saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(ctThhlastikaEidhReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertEquals(1, deigmaThhlastikwnXEidhReturnedSet.size());
        assertEquals(deigmaThhlastikwnReturned.getId(), deigmaThhlastikwnXEidhReturned.getDeigmaThhlastikwn().getId());
        assertEquals(deigmaThhlastikwnReturned.getKwdikosDeigmatolhpsias(), deigmaThhlastikwnXEidhReturned.getDeigmaThhlastikwn().getKwdikosDeigmatolhpsias());
        assertEquals(ctThhlastikaEidhReturned.getId(), deigmaThhlastikwnXEidhReturned.getCtThhlastikaEidh().getId());
        assertEquals(ctThhlastikaEidhReturned.getEidos(), deigmaThhlastikwnXEidhReturned.getCtThhlastikaEidh().getEidos());
    }

    @Test
    public void findAll(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing and saving XEidh
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidh);

        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidh);

        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidh);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);

        // Get - test method
        Pageable pageable = PageRequest.of(0, 2, Sort.Direction.DESC, "id");
        Page<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidhPageReturned = deigmaThhlastikwnXEidhRepository.findAll(pageable);

        // Delete test-saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(ctThhlastikaEidhReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertEquals(2, deigmaThhlastikwnXEidhPageReturned.getNumberOfElements());
        assertEquals(2, deigmaThhlastikwnXEidhPageReturned.getTotalPages());
        assertEquals(3, deigmaThhlastikwnXEidhPageReturned.getTotalElements());
    }

    @Test
    public void findDistinctByDigmaThhlastikwnIdsOrderByDeigmaThhlastikwnId(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);

        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository
                .save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository
                .save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository
                .save(deigmaThhlastikwnXEidh2);

        ArrayList<BigInteger> deigmaThhlastikwnIdsList = deigmaThhlastikwnXEidhRepository.findDistinctByDeigmaThhlastikwnIdOrderByDeigmaThhlastikwnId();

        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertEquals(2, deigmaThhlastikwnIdsList.size());
    }

    @Test
    public void findDistinctByCtIdsOrderByCtIds(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Saving
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);

        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository
                .save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository
                .save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository
                .save(deigmaThhlastikwnXEidh2);

        ArrayList<Long> ctIdsList = deigmaThhlastikwnXEidhRepository.findDistinctByCtEidhIdOrderByEidhId();

        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(ctThhlastikaEidhReturned);
        assertNotNull(ctThhlastikaEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertEquals(2, ctIdsList.size());
    }

    @Test
    public void findDistinctBySxetikhAfthoniaOrderBySxetikhAfthonia(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();

        // Saving
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository
                .save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository
                .save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository
                .save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository
                .save(deigmaThhlastikwnXEidh3);

        ArrayList<String> sxetikhAfthoniaList = deigmaThhlastikwnXEidhRepository.findDistinctBySxetikhAfthoniaOrderBySxetikhAfthonia();

        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertEquals(3, sxetikhAfthoniaList.size());
    }

    @Test
    public void findDistinctByHlikiaOrderByHlikia(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();

        // Saving
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository
                .save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository
                .save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository
                .save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository
                .save(deigmaThhlastikwnXEidh3);

        ArrayList<String> hlikiaList = deigmaThhlastikwnXEidhRepository.findDistinctByHlikiaOrderByHlikia();

        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertEquals(3, hlikiaList.size());
    }

    @Test
    public void findDistinctByFuloOrderByFulo(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();

        // Saving
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository
                .save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository
                .save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository
                .save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository
                .save(deigmaThhlastikwnXEidh3);

        ArrayList<String> fuloList = deigmaThhlastikwnXEidhRepository.findDistinctByFuloOrderByFulo();

        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertEquals(3, fuloList.size());
    }


}
