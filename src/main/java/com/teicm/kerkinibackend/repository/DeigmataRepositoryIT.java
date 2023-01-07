package com.teicm.kerkinibackend.repository;

import com.teicm.kerkinibackend.KerkinibackendApplication;
import com.teicm.kerkinibackend.domain.Deigmata;
import com.teicm.kerkinibackend.domain.Prwtokola;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.repositories.DeigmataRepository;
import com.teicm.kerkinibackend.repositories.PrwtokolaRepository;
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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@Transactional
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = KerkinibackendApplication.class)
@TestPropertySource(locations = "classpath:application-integrationtest.properties")
@RunWith(SpringRunner.class)
public class DeigmataRepositoryIT {

    @Autowired
    DeigmataRepository deigmataRepository;

    @Autowired
    PrwtokolaRepository prwtokolaRepository;

    private Deigmata deigmata;

    private Deigmata deigmata1;

    private Set<Deigmata> deigmataSet;

    private DeigmaThhlastikwn deigmaThhlastikwn;

    private DeigmaThhlastikwn deigmaThhlastikwn1;

    private Prwtokola prwtokola;

    @Before
    public void setUp(){
        // Init DeigmaThhlastikwn
        deigmaThhlastikwn = new DeigmaThhlastikwn();
        deigmaThhlastikwn.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias");

        // Init DeigmaThhlastikwn1
        deigmaThhlastikwn1 = new DeigmaThhlastikwn();
        deigmaThhlastikwn1.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias1");

        // Init Deigmata and set each other
        deigmata = new Deigmata();
        deigmata.setDeigmaThhlastikwn(deigmaThhlastikwn);
        deigmaThhlastikwn.setDeigmata(deigmata);

        // Init Deigmata1 and set each other
        deigmata1 = new Deigmata();
        deigmata1.setDeigmaThhlastikwn(deigmaThhlastikwn1);
        deigmaThhlastikwn1.setDeigmata(deigmata1);

        deigmataSet = new HashSet<>();
        deigmataSet.add(deigmata);
        deigmataSet.add(deigmata1);

        // Init Prwtokola
        prwtokola = new Prwtokola();
        prwtokola.setPerigrafh("TestingPerigrafh");
    }

    @Test
    public void saveTest(){
        // Delete previously stored
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();

        // Save Deigmata
        Deigmata deigmataReturned = deigmataRepository.save(deigmata);

        // Delete before assertion
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();

        assertNotNull(deigmataReturned);
        assertEquals(deigmaThhlastikwn.getKwdikosDeigmatolhpsias(), deigmataReturned.getDeigmaThhlastikwn().getKwdikosDeigmatolhpsias());
    }

    @Test
    public void findDeigmataByPrwtokolaIsTest(){
        // Delete previously stored
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Adding deigmata to prwtokola
        prwtokola.addDeigma(deigmata);
        prwtokola.addDeigma(deigmata1);

        // Saving
        Prwtokola prwtokolaReturned = prwtokolaRepository.save(prwtokola);
        Deigmata deigmataReturned = deigmataRepository.save(deigmata);
        Deigmata deigmataReturned1 = deigmataRepository.save(deigmata1);

        Set<Deigmata> deigmataReturnedSet = deigmataRepository.findDeigmataByPrwtokolaIs(prwtokolaReturned);

        // Delete all the testing saved data
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        assertNotNull(prwtokolaReturned);
        assertNotNull(deigmataReturned);
        assertNotNull(deigmataReturned1);
        assertNotNull(deigmataSet);
        assertEquals(deigmataSet.size(), deigmataReturnedSet.size());
    }

    @Test
    public void findAllTest(){
        // Check by deletion for any previously stored data
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();

        // Save Deigmata (making the id to be null since we are testing saving not patch
        deigmataRepository.save(deigmata);
        deigmataRepository.save(deigmata1);

        // Testing the method
        List<Deigmata> deigmataList = deigmataRepository.findAll();

        // Delete deigmata
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();

        // Assertions
        assertEquals(2, deigmataList.size());
    }

    @Test
    public void findAllPageableTest(){
        // Check by deletion for any previously stored data
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();

        // Save Deigmata (making the id to be null since we are testing saving not patch
        deigmataRepository.save(deigmata);
        deigmataRepository.save(deigmata1);

        // Testing the method
        Pageable pageable = PageRequest.of(0, 1, Sort.Direction.DESC, "id");
        Page<Deigmata> deigmataList = deigmataRepository.findAll(pageable);

        // Delete deigmata
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();

        // Assertions
        assertEquals(1, deigmataList.getNumberOfElements());
        assertEquals(2, deigmataList.getTotalPages());
        assertEquals(2, deigmataList.getTotalElements());
    }

}
