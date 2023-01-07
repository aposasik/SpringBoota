package com.teicm.kerkinibackend.controllers;

import com.teicm.kerkinibackend.domain.Pictures;
import com.teicm.kerkinibackend.services.PicturesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;


@RestController
@RequestMapping(PicturesController.BASE_URL)
public class PicturesController {

    public static final String BASE_URL = "/v1/pictures";

    @Autowired
    private PicturesServiceImpl picturesService;

    @CrossOrigin
    @GetMapping({"/getPicturesByDeigmaThhlastikwnIs" + "/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public Set<Pictures> getPicturesByDeigmaThhlastikwn(@PathVariable Long id){
        try {
            return picturesService.getPicturesByDeigmaThhlastikwn(id);
        }catch (Exception e){
            throw e;
        }
    }
    @CrossOrigin
    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean deletePicture(@PathVariable Long id){
        try {
            return picturesService.deletePicture(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/{id}"})
    public Pictures getPicture(@PathVariable Long id){
        try {
            return picturesService.getById(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAllByPaging" + "/{page}"})
    @ResponseStatus(HttpStatus.OK)
    public Page<Pictures> getAllByPaging(@PathVariable Integer page){
        try {
            return picturesService.getAllByPaging(page);
        }catch (Exception e){
            throw e;
        }
    }

}
