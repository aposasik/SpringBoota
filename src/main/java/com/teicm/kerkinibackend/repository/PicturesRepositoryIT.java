package com.teicm.kerkinibackend.repository;

import com.teicm.kerkinibackend.KerkinibackendApplication;
import com.teicm.kerkinibackend.domain.Pictures;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.repositories.PicturesRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnRepository;
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
import java.util.Set;

import static org.junit.Assert.*;

@Transactional
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = KerkinibackendApplication.class)
@TestPropertySource(locations = "classpath:application-integrationtest.properties")
@RunWith(SpringRunner.class)
public class PicturesRepositoryIT {

    @Autowired
    PicturesRepository picturesRepository;

    @Autowired
    DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    private Pictures pictures;

    private Pictures pictures1;

    private Pictures pictures2;

    private Set<Pictures> picturesSet;

    private DeigmaThhlastikwn deigmaThhlastikwn;

    @Before
    public void setUp(){
        // Init pictures
        pictures = new Pictures();
        pictures.setPictureName("TestingName");
        pictures.setPictureType("TestingType");
        pictures.setData(new byte[100]);

        // Init pictures1
        pictures1 = new Pictures();
        pictures1.setPictureName("TestingName1");
        pictures1.setPictureType("TestingType1");
        pictures1.setData(new byte[200]);

        // Init pictures2
        pictures2 = new Pictures();
        pictures2.setPictureName("TestingName2");
        pictures2.setPictureType("TestingType2");
        pictures2.setData(new byte[300]);

        // Init Set
        picturesSet = new HashSet<>();
        picturesSet.add(pictures);
        picturesSet.add(pictures1);

        // Init DeigmaThhlastikwn
        deigmaThhlastikwn = new DeigmaThhlastikwn();
        deigmaThhlastikwn.setEreunhths("TestingEreunhths");
        deigmaThhlastikwn.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias");
        deigmaThhlastikwn.addPicture(pictures);
        deigmaThhlastikwn.addPicture(pictures1);
    }

    @Test
    public void saveTest(){
        // Check by deletion for any previously stored data
        picturesRepository.deleteAll();
        picturesRepository.deleteAll();

        // Save Pictures
        Pictures pictureReturned = picturesRepository.save(pictures2);

        // Delete Pictures
        picturesRepository.deleteAll();
        picturesRepository.deleteAll();

        // Assertions
        assertNotNull(pictureReturned);
        assertEquals(pictures2.getPictureName(), pictureReturned.getPictureName());
        assertEquals(pictures2.getPictureType(), pictureReturned.getPictureType());
        assertEquals(pictures2.getData(), pictureReturned.getData());
    }

    @Test
    public void findPicturesByDeigmaThhlastikwnIsTest(){
        // Check by deletion for any previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        picturesRepository.deleteAll();
        picturesRepository.deleteAll();

        // Save DeigmaThhlastikwn
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);

        Set<Pictures> picturesReturnedSet = picturesRepository.findPicturesByDeigmaThhlastikwnIs(deigmaThhlastikwnReturned);

        // Delete Pictures and DeigmaThhlastikwn
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        picturesRepository.deleteAll();
        picturesRepository.deleteAll();

        // Assertions
        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(picturesReturnedSet);
        assertEquals(deigmaThhlastikwnReturned.getPicturesSet().size(), picturesReturnedSet.size());
    }

    @Test
    public void findAllTest(){
        // Delete previously stored data
        picturesRepository.deleteAll();
        picturesRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving (it has already set 2 files in it)
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);

        // Get-Testing with pagination method
        Pageable pageable = PageRequest.of(0, 1, Sort.Direction.DESC, "id");
        Page<Pictures> picturesPageReturned = picturesRepository.findAll(pageable);

        // Delete test saves
        picturesRepository.deleteAll();
        picturesRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(picturesPageReturned);
        assertEquals(1, picturesPageReturned.getNumberOfElements());
        assertEquals(2, picturesPageReturned.getTotalPages());
        assertEquals(2, picturesPageReturned.getTotalElements());
        assertTrue(picturesPageReturned.hasNext());
        assertFalse(picturesPageReturned.hasPrevious());
    }

}
