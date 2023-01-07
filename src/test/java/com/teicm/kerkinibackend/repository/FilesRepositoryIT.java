package com.teicm.kerkinibackend.repository;

import com.teicm.kerkinibackend.KerkinibackendApplication;
import com.teicm.kerkinibackend.domain.Files;
import com.teicm.kerkinibackend.domain.Pictures;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.repositories.FilesRepository;
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
public class FilesRepositoryIT {

    @Autowired
    FilesRepository filesRepository;

    @Autowired
    DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    private Files files;

    private Files files1;

    private Files files2;

    private Set<Files> filesSet;

    private DeigmaThhlastikwn deigmaThhlastikwn;

    @Before
    public void setUp(){
        // Init files
        files = new Files();
        files.setFileName("TestingName");
        files.setFileType("TestingType");
        files.setData(new byte[100]);

        // Init files1
        files1 = new Files();
        files1.setFileName("TestingName1");
        files1.setFileType("TestingType1");
        files1.setData(new byte[200]);

        // Init files2
        files2 = new Files();
        files2.setFileName("TestingName2");
        files2.setFileType("TestingType2");
        files2.setData(new byte[300]);

        // Init Set
        filesSet = new HashSet<>();
        filesSet.add(files);
        filesSet.add(files1);

        // Init DeigmaThhlastikwn
        deigmaThhlastikwn = new DeigmaThhlastikwn();
        deigmaThhlastikwn.setEreunhths("TestingEreunhths");
        deigmaThhlastikwn.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias");
        deigmaThhlastikwn.addFile(files);
        deigmaThhlastikwn.addFile(files1);
    }

    @Test
    public void saveTest(){
        // Check by deletion for any previously stored data
        filesRepository.deleteAll();
        filesRepository.deleteAll();

        // Save Files
        Files fileReturned = filesRepository.save(files2);

        // Delete Files
        filesRepository.deleteAll();
        filesRepository.deleteAll();

        // Assertions
        assertNotNull(fileReturned);
        assertEquals(files2.getFileName(), fileReturned.getFileName());
        assertEquals(files2.getFileType(), fileReturned.getFileType());
        assertEquals(files2.getData(), fileReturned.getData());
    }

    @Test
    public void findPicturesByDeigmaThhlastikwnIsTest(){
        // Check by deletion for any previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        filesRepository.deleteAll();
        filesRepository.deleteAll();

        // Save DeigmaThhlastikwn
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);

        Set<Files> filesReturnedSet = filesRepository.findFilesByDeigmaThhlastikwnIs(deigmaThhlastikwnReturned);

        // Delete Files and DeigmaThhlastikwn
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        filesRepository.deleteAll();
        filesRepository.deleteAll();

        // Assertions
        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(filesReturnedSet);
        assertEquals(deigmaThhlastikwnReturned.getFilesSet().size(), filesReturnedSet.size());
    }

    @Test
    public void findAllTest(){
        // Delete previously stored data
        filesRepository.deleteAll();
        filesRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving (it has already set 2 files in it)
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);

        // Get-Testing with pagination method
        Pageable pageable = PageRequest.of(0, 1, Sort.Direction.DESC, "id");
        Page<Files> filesPageReturned = filesRepository.findAll(pageable);

        // Delete test saves
        filesRepository.deleteAll();
        filesRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(filesPageReturned);
        assertEquals(1, filesPageReturned.getNumberOfElements());
        assertEquals(2, filesPageReturned.getTotalPages());
        assertEquals(2, filesPageReturned.getTotalElements());
        assertTrue(filesPageReturned.hasNext());
        assertFalse(filesPageReturned.hasPrevious());
    }

}
