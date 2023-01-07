package com.teicm.kerkinibackend.repository;

import com.teicm.kerkinibackend.KerkinibackendApplication;
import com.teicm.kerkinibackend.domain.Prwtokola;
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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;


// TODO: 12/21/2018 !! Find the problem behind the NEED FOR DUAL Deletion every time! (Problem exists: Only on testing)

@Transactional
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = KerkinibackendApplication.class)
@TestPropertySource(locations = "classpath:application-integrationtest.properties")
@RunWith(SpringRunner.class)
public class PrwtokolaRepositoryIT {

    @Autowired
    PrwtokolaRepository prwtokolaRepository;

    private Prwtokola prwtokola;

    private Prwtokola prwtokola1;

    private List<Prwtokola> prwtokolaInitialList;

    @Before
    public void setUp(){
        // Init Prwtokola for Deletion
        prwtokola = new Prwtokola();
        prwtokola.setPerigrafh("TestingPerigrafh");
        prwtokola.setPinakasDedomenwn("TestingPinakasDedomenwn");
        prwtokola.setParathuroDedomenwn("TestingParathuroDedomenwn");

        // Init Prwtokola2 for Deletion
        prwtokola1 = new Prwtokola();
        prwtokola1.setPerigrafh("TestingPerigrafh1");
        prwtokola1.setPinakasDedomenwn("TestingPinakasDedomenwn1");
        prwtokola1.setParathuroDedomenwn("TestingParathuroDedomenwn1");

        // Initializing the List
        prwtokolaInitialList = new ArrayList<>();
        prwtokolaInitialList.add(prwtokola);
        prwtokolaInitialList.add(prwtokola1);
    }

    @Test
    public void saveTest(){
        // Check by deletion for any previously stored data
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Save Prwtokola (making the id to be null since we are testing saving not patch
        Prwtokola prwtokolaReturned = prwtokolaRepository.save(prwtokola);

        // Delete prwtokola
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Assertions
        assertNotNull(prwtokolaReturned);
        assertEquals(prwtokola.getPerigrafh(), prwtokolaReturned.getPerigrafh());
        assertEquals(prwtokola.getPinakasDedomenwn(), prwtokolaReturned.getPinakasDedomenwn());
        assertEquals(prwtokola.getParathuroDedomenwn(), prwtokolaReturned.getParathuroDedomenwn());
    }

    @Test
    public void saveEmptyPerigrafhTest(){
        // Can't preCheck - delete for null Perigrafh
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Save Prwtokola (making the id to be null since we are testing saving not patch
        prwtokola.setPerigrafh(null);
        Prwtokola prwtokolaReturned = prwtokolaRepository.save(prwtokola);

        // Delete prwtokola
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Assertions
        assertNotNull(prwtokolaReturned);
        assertEquals(prwtokola.getPerigrafh(), prwtokolaReturned.getPerigrafh());
        assertEquals(prwtokola.getPinakasDedomenwn(), prwtokolaReturned.getPinakasDedomenwn());
        assertEquals(prwtokola.getParathuroDedomenwn(), prwtokolaReturned.getParathuroDedomenwn());
    }

    @Test
    public void saveEmptyPinakasTest(){
        // Check by deletion for any previously stored data
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Save Prwtokola (making the id to be null since we are testing saving not patch
        prwtokola.setPinakasDedomenwn(null);
        Prwtokola prwtokolaReturned = prwtokolaRepository.save(prwtokola);

        // Delete prwtokola
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Assertions
        assertNotNull(prwtokolaReturned);
        assertEquals(prwtokola.getPerigrafh(), prwtokolaReturned.getPerigrafh());
        assertEquals(prwtokola.getPinakasDedomenwn(), prwtokolaReturned.getPinakasDedomenwn());
        assertEquals(prwtokola.getParathuroDedomenwn(), prwtokolaReturned.getParathuroDedomenwn());
    }

    @Test
    public void saveEmptyParathuroTest(){
        // Check by deletion for any previously stored data
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Save Prwtokola (making the id to be null since we are testing saving not patch
        prwtokola.setParathuroDedomenwn(null);
        Prwtokola prwtokolaReturned = prwtokolaRepository.save(prwtokola);

        // Delete prwtokola
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Assertions
        assertNotNull(prwtokolaReturned);
        assertEquals(prwtokola.getPerigrafh(), prwtokolaReturned.getPerigrafh());
        assertEquals(prwtokola.getPinakasDedomenwn(), prwtokolaReturned.getPinakasDedomenwn());
        assertEquals(prwtokola.getParathuroDedomenwn(), prwtokolaReturned.getParathuroDedomenwn());
    }

    @Test
    public void findByIdTest(){
        // Check by deletion for any previously stored data
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Save Prwtokola (making the id to be null since we are testing saving not patch
        Optional<Prwtokola> optionalPrwtokolaReturned = prwtokolaRepository.findById(prwtokolaRepository.save(prwtokola).getId());

        if (optionalPrwtokolaReturned.isPresent()){
            // Delete prwtokola
            prwtokolaRepository.deleteAll();
            prwtokolaRepository.deleteAll();

            // Assertions
            assertNotNull(optionalPrwtokolaReturned.get());
            assertEquals(prwtokola.getPerigrafh(), optionalPrwtokolaReturned.get().getPerigrafh());
            assertEquals(prwtokola.getPinakasDedomenwn(), optionalPrwtokolaReturned.get().getPinakasDedomenwn());
            assertEquals(prwtokola.getParathuroDedomenwn(), optionalPrwtokolaReturned.get().getParathuroDedomenwn());
        }else {
            // If not present the test should fail
            fail();
        }
    }

    @Test
    public void findAllTest(){
        // Check by deletion for any previously stored data
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Save Prwtokola (making the id to be null since we are testing saving not patch
        prwtokolaRepository.save(prwtokola);
        prwtokolaRepository.save(prwtokola1);

        // Testing the method
        List<Prwtokola> prwtokolaList = prwtokolaRepository.findAll();

        // Delete prwtokola
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Assertions
        assertEquals(2, prwtokolaList.size());
    }

    @Test
    public void findAllPageableTest(){
        // Check by deletion for any previously stored data
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Save Prwtokola (making the id to be null since we are testing saving not patch
        prwtokolaRepository.save(prwtokola);
        prwtokolaRepository.save(prwtokola1);

        // Testing the method
        Pageable pageable = PageRequest.of(0, 1, Sort.Direction.DESC, "id");
        Page<Prwtokola> prwtokolaList = prwtokolaRepository.findAll(pageable);

        // Delete prwtokola
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Assertions
        assertEquals(1, prwtokolaList.getNumberOfElements());
        assertEquals(2, prwtokolaList.getTotalElements());
        assertEquals(2, prwtokolaList.getTotalPages());
    }

    @Test
    public void getDistinctIdsTest(){
        // Check by deletion for any previously stored data
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Save Prwtokola (making the id to be null since we are testing saving not patch
        prwtokolaRepository.save(prwtokola);
        prwtokolaRepository.save(prwtokola1);

        // Testing the method
        List<BigInteger> prwtokolaList = prwtokolaRepository.findDistinctByPrwtokolaIdOrderByPrwtokolaId();

        // Delete prwtokola
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();

        // Assertions
        assertEquals(2, prwtokolaList.size());
    }

}
