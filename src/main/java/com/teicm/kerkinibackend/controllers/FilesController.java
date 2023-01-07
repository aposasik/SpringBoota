package com.teicm.kerkinibackend.controllers;

import com.teicm.kerkinibackend.domain.Files;
import com.teicm.kerkinibackend.services.FilesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(FilesController.BASE_URL)
public class FilesController {

    public static final String BASE_URL = "/v1/files";

    @Autowired
    private FilesServiceImpl filesService;

    @CrossOrigin
    @GetMapping({"/getFilesByDeigmaThhlastikwnIs" + "/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public Set<Files> getFilesByDeigmaThhlastikwn(@PathVariable Long id){
        try {
            return filesService.getFilesByDeigmaThhlastikwn(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean deleteFile(@PathVariable Long id){
        try {
            return filesService.deleteFile(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/{id}"})
    public Files getFile(@PathVariable Long id){
        try {
            return filesService.getById(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAllByPaging" + "/{page}"})
    @ResponseStatus(HttpStatus.OK)
    public Page<Files> getAllByPaging(@PathVariable Integer page){
        try {
            return filesService.getAllByPaging(page);
        }catch (Exception e){
            throw e;
        }
    }

}
