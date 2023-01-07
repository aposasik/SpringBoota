package com.teicm.kerkinibackend.repository.thhlastika;

import com.teicm.kerkinibackend.KerkinibackendApplication;
import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaPressThreats;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaPressThreatsRepository;
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
import static org.junit.Assert.assertNotNull;

@Transactional
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = KerkinibackendApplication.class)
@TestPropertySource(locations = "classpath:application-integrationtest.properties")
@RunWith(SpringRunner.class)
public class CtThhlastikaPressThreatsRepositoryIT {

    @Autowired
    CtThhlastikaPressThreatsRepository ctThhlastikaPressThreatsRepository;

    private CtThhlastikaPressThreats ctThhlastikaPressThreats;

    private CtThhlastikaPressThreats ctThhlastikaPressThreats1;

    @Before
    public void setUp(){
        // Init ctThhlastikaPressThreats
        ctThhlastikaPressThreats = new CtThhlastikaPressThreats();
        ctThhlastikaPressThreats.setActCode("TestingActCode");
        ctThhlastikaPressThreats.setRemarks("TestingRemarks");
        ctThhlastikaPressThreats.setDescriptionEn("TestingDescriptionEn");

        // Init ctThhlastikaPressThreats1
        ctThhlastikaPressThreats1 = new CtThhlastikaPressThreats();
        ctThhlastikaPressThreats1.setActCode("TestingActCode1");
        ctThhlastikaPressThreats1.setRemarks("TestingRemarks1");
        ctThhlastikaPressThreats1.setDescriptionEn("TestingDescriptionEn1");

    }

    @Test
    public void saveTest(){
        // Delete stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Saving
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);

        // Delete saved testing data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertEquals(ctThhlastikaPressThreats.getActCode(), ctThhlastikaPressThreatsReturned.getActCode());
        assertEquals(ctThhlastikaPressThreats.getRemarks(), ctThhlastikaPressThreatsReturned.getRemarks());
        assertEquals(ctThhlastikaPressThreats.getDescriptionEn(), ctThhlastikaPressThreatsReturned.getDescriptionEn());
    }

    @Test
    public void findDistinctByEidosOrderByEidosTest(){
        // Delete stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Saving
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);

        ArrayList<String> actCodesReturnedArrayList = ctThhlastikaPressThreatsRepository.findDistinctByActCodeOrderByActCode();

        // Delete stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertEquals(2, actCodesReturnedArrayList.size());
        assertEquals(ctThhlastikaPressThreats.getActCode(), actCodesReturnedArrayList.get(0));
        assertEquals(ctThhlastikaPressThreats1.getActCode(), actCodesReturnedArrayList.get(1));
    }

    @Test
    public void findByEidosEqualsTest(){
        // Delete stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Saving
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned1 = ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);

        // Test the method
        CtThhlastikaPressThreats ctThhlastikaPressThreatsReturned2 = ctThhlastikaPressThreatsRepository.findByActCodeEquals(ctThhlastikaPressThreats.getActCode());

        // Delete stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        assertNotNull(ctThhlastikaPressThreatsReturned);
        assertNotNull(ctThhlastikaPressThreatsReturned1);
        assertNotNull(ctThhlastikaPressThreatsReturned2);
        assertEquals(ctThhlastikaPressThreats.getActCode(), ctThhlastikaPressThreatsReturned2.getActCode());
        assertEquals(ctThhlastikaPressThreats.getRemarks(), ctThhlastikaPressThreatsReturned2.getRemarks());
        assertEquals(ctThhlastikaPressThreats.getDescriptionEn(), ctThhlastikaPressThreatsReturned2.getDescriptionEn());
    }

    @Test
    public void findAllTest(){
        // Delete stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Saving
        ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);

        // Test the method
        List<CtThhlastikaPressThreats> ctThhlastikaPressThreatsReturnedArrayList = ctThhlastikaPressThreatsRepository.findAll();

        // Delete stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Assertions
        assertEquals(2, ctThhlastikaPressThreatsReturnedArrayList.size());
    }

    @Test
    public void findAllPageableTest(){
        // Delete stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Saving
        ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats);
        ctThhlastikaPressThreatsRepository.save(ctThhlastikaPressThreats1);

        // Test the method
        Pageable pageable = PageRequest.of(0, 1, Sort.Direction.DESC, "id");
        Page<CtThhlastikaPressThreats> ctThhlastikaPressThreatsReturnedPage = ctThhlastikaPressThreatsRepository.findAll(pageable);

        // Delete stored data
        ctThhlastikaPressThreatsRepository.deleteAll();
        ctThhlastikaPressThreatsRepository.deleteAll();

        // Assertions
        assertEquals(1, ctThhlastikaPressThreatsReturnedPage.getNumberOfElements());
        assertEquals(2, ctThhlastikaPressThreatsReturnedPage.getTotalPages());
        assertEquals(2, ctThhlastikaPressThreatsReturnedPage.getTotalElements());
    }

}
