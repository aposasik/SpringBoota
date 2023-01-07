package com.teicm.kerkinibackend.service;

import com.teicm.kerkinibackend.domain.Pictures;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.repositories.PicturesRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnRepository;
import com.teicm.kerkinibackend.services.PicturesServiceImpl;
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

public class PicturesServiceImplTest {

    private PicturesServiceImpl picturesService;

    @Mock
    private PicturesRepository picturesRepository;

    @Mock
    private DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    private Pictures pictures;

    private DeigmaThhlastikwn deigmaThhlastikwn;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);

        picturesService = new PicturesServiceImpl();
        picturesService.setPicturesRepository(picturesRepository);
        picturesService.setDeigmaThhlastikwnRepository(deigmaThhlastikwnRepository);

        // Init Pictures
        pictures = new Pictures();
        pictures.setId(1l);
        pictures.setPictureName("PictureName");
        pictures.setPictureType("PictureType");
        byte[] data = new byte[100];
        pictures.setData(data);

        // Init Deigma
        deigmaThhlastikwn = new DeigmaThhlastikwn();
        deigmaThhlastikwn.setId(1l);
    }

    @Test
    void deletePictureTest(){
        Mockito.when(picturesRepository.findById(pictures.getId())).thenReturn(Optional.of(pictures));

        boolean deleteFlag = picturesService.deletePicture(pictures.getId());

        Mockito.verify(picturesRepository, Mockito.times(1)).findById(pictures.getId());
        Mockito.verify(picturesRepository, Mockito.times(1)).delete(pictures);
        assertTrue(deleteFlag);
    }

    @Test
    void getByIdTest(){
        Mockito.when(picturesRepository.findById(pictures.getId())).thenReturn(Optional.of(pictures));

        Pictures picturesActual = picturesService.getById(pictures.getId());

        Mockito.verify(picturesRepository,Mockito.times(1)).findById(pictures.getId());
        assertEquals(pictures.getId(), picturesActual.getId());
        assertEquals(pictures.getPictureName(), picturesActual.getPictureName());
        assertEquals(pictures.getPictureType(), picturesActual.getPictureType());
        assertEquals(pictures.getData(), picturesActual.getData());
    }

    @Test
    void getPicturesByDeigmaThhlastikwnTest(){
        Mockito.when(deigmaThhlastikwnRepository.findById(deigmaThhlastikwn.getId())).thenReturn(Optional.of(deigmaThhlastikwn));

        Set<Pictures> picturesSet = new HashSet<>();
        picturesSet.add(pictures);
        Mockito.when(picturesRepository.findPicturesByDeigmaThhlastikwnIs(deigmaThhlastikwn)).thenReturn(picturesSet);

        Set<Pictures> picturesSetActual = picturesService.getPicturesByDeigmaThhlastikwn(pictures.getId());

        Mockito.verify(picturesRepository, Mockito.times(1)).findPicturesByDeigmaThhlastikwnIs(deigmaThhlastikwn);
        Mockito.verify(deigmaThhlastikwnRepository, Mockito.times(1)).findById(pictures.getId());
        assertEquals(picturesSet, picturesSetActual);
    }

    @Test
    void getAllByPaging(){
        picturesService.getAllByPaging(0);

        Mockito.verify(picturesRepository, Mockito.times(1)).findAll((Pageable) any());
    }
}
