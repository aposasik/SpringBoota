package com.teicm.kerkinibackend.repository.thhlastika;

import com.teicm.kerkinibackend.KerkinibackendApplication;
import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaEidh;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaEidhRepository;
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

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

@Transactional
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = KerkinibackendApplication.class)
@TestPropertySource(locations = "classpath:application-integrationtest.properties")
@RunWith(SpringRunner.class)
public class CtThhlastikaEidhRepositoryIT {

    @Autowired
    CtThhlastikaEidhRepository ctThhlastikaEidhRepository;

    private CtThhlastikaEidh ctThhlastikaEidh;

    private CtThhlastikaEidh ctThhlastikaEidh1;

    @Before
    public void setUp(){
        // Init ctThhlastikaEidh
        ctThhlastikaEidh = new CtThhlastikaEidh();
        ctThhlastikaEidh.setEidos("TestingEidos");

        // Init ctThhlastikaEidh1
        ctThhlastikaEidh1 = new CtThhlastikaEidh();
        ctThhlastikaEidh1.setEidos("TestingEidos1");

    }

    @Test
    public void saveTest(){
        // Delete stored data
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Saving
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Delete saved testing data
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(ctThhlastikaEidhReturned);
        assertEquals(ctThhlastikaEidh.getEidos(), ctThhlastikaEidhReturned.getEidos());
    }

    @Test
    public void findDistinctByEidosOrderByEidosTest(){
        // Delete stored data
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Saving
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);

        ArrayList<String> eidhReturnedArrayList = ctThhlastikaEidhRepository.findDistinctByEidosOrderByEidos();

        // Delete stored data
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(ctThhlastikaEidhReturned);
        assertNotNull(ctThhlastikaEidhReturned1);
        assertEquals(2, eidhReturnedArrayList.size());
        assertEquals(ctThhlastikaEidh.getEidos(), eidhReturnedArrayList.get(0));
        assertEquals(ctThhlastikaEidh1.getEidos(), eidhReturnedArrayList.get(1));
    }

    @Test
    public void findByEidosEqualsTest(){
        // Delete stored data
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Saving
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);

        // Test the method
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.findByEidosEquals(ctThhlastikaEidh.getEidos());

        // Delete stored data
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(ctThhlastikaEidhReturned);
        assertNotNull(ctThhlastikaEidhReturned1);
        assertNotNull(ctThhlastikaEidhReturned2);
        assertEquals(ctThhlastikaEidh.getEidos(), ctThhlastikaEidhReturned2.getEidos());
        assertNotEquals(ctThhlastikaEidh1, ctThhlastikaEidhReturned2.getEidos());
    }

    @Test
    public void findAllTest(){
        // Delete stored data
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Saving
        ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);

        // Test the method
        List<CtThhlastikaEidh> ctThhlastikaEidhReturnedArrayList = ctThhlastikaEidhRepository.findAll();

        // Delete stored data
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Assertions
        assertEquals(2, ctThhlastikaEidhReturnedArrayList.size());
    }

    @Test
    public void findAllPageableTest(){
        // Delete stored data
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Saving
        ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);

        // Test the method
        Pageable pageable = PageRequest.of(0, 1, Sort.Direction.DESC, "id");
        Page<CtThhlastikaEidh> ctThhlastikaEidhReturnedPage = ctThhlastikaEidhRepository.findAll(pageable);

        // Delete stored data
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Assertions
        assertEquals(1, ctThhlastikaEidhReturnedPage.getNumberOfElements());
        assertEquals(2, ctThhlastikaEidhReturnedPage.getTotalPages());
        assertEquals(2, ctThhlastikaEidhReturnedPage.getTotalElements());
    }

}
