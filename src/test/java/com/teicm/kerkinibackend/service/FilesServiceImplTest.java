package com.teicm.kerkinibackend.service;

import com.teicm.kerkinibackend.domain.Files;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.repositories.FilesRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnRepository;
import com.teicm.kerkinibackend.services.FilesServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Pageable;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;

public class FilesServiceImplTest {

    private FilesServiceImpl filesService;

    @Mock
    private FilesRepository filesRepository;

    @Mock
    private DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    private Files files;

    private DeigmaThhlastikwn deigmaThhlastikwn;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);

        filesService = new FilesServiceImpl();
        filesService.setFilesRepository(filesRepository);
        filesService.setDeigmaThhlastikwnRepository(deigmaThhlastikwnRepository);

        // Init Pictures
        files = new Files();
        files.setId(1l);
        files.setFileName("PictureName");
        files.setFileType("PictureType");
        byte[] data = new byte[100];
        files.setData(data);

        // Init Deigma
        deigmaThhlastikwn = new DeigmaThhlastikwn();
        deigmaThhlastikwn.setId(1l);
    }

    @Test
    void deleteFilesTest(){
        Mockito.when(filesRepository.findById(files.getId())).thenReturn(Optional.of(files));

        boolean deleteFlag = filesService.deleteFile(files.getId());

        Mockito.verify(filesRepository, Mockito.times(1)).findById(files.getId());
        Mockito.verify(filesRepository, Mockito.times(1)).delete(files);
        assertTrue(deleteFlag);
    }

    @Test
    void getByIdTest(){
        Mockito.when(filesRepository.findById(files.getId())).thenReturn(Optional.of(files));

        Files filesActual = filesService.getById(files.getId());

        Mockito.verify(filesRepository,Mockito.times(1)).findById(files.getId());
        assertEquals(files.getId(), filesActual.getId());
        assertEquals(files.getFileName(), filesActual.getFileName());
        assertEquals(files.getFileType(), filesActual.getFileType());
        assertEquals(files.getData(), filesActual.getData());
    }

    @Test
    void getFilesByDeigmaThhlastikwnTest(){
        Mockito.when(deigmaThhlastikwnRepository.findById(deigmaThhlastikwn.getId())).thenReturn(Optional.of(deigmaThhlastikwn));

        Set<Files> picturesSet = new HashSet<>();
        picturesSet.add(files);
        Mockito.when(filesRepository.findFilesByDeigmaThhlastikwnIs(deigmaThhlastikwn)).thenReturn(picturesSet);

        Set<Files> filesSetActual = filesService.getFilesByDeigmaThhlastikwn(files.getId());

        Mockito.verify(filesRepository, Mockito.times(1)).findFilesByDeigmaThhlastikwnIs(deigmaThhlastikwn);
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findById(files.getId());
        assertEquals(picturesSet, filesSetActual);
    }

    @Test
    void getAllByPaging(){
        filesService.getAllByPaging(0);

        Mockito.verify(filesRepository, Mockito.times(1)).findAll((Pageable) any());
    }

}
