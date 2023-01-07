package com.teicm.kerkinibackend.controllers;

import com.teicm.kerkinibackend.domain.Prwtokola;
import com.teicm.kerkinibackend.services.PrwtokolaServiceImpl;
import com.teicm.kerkinibackend.v1.models.PrwtokolaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

@RestController
@RequestMapping(PrwtokolaController.BASE_URL)
public class PrwtokolaController {

    public static final String BASE_URL = "/v1/prwtokola";

    @Autowired
    private PrwtokolaServiceImpl prwtokolaService;

    @CrossOrigin
    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public Prwtokola getById(@PathVariable Long id){
        try {
            return prwtokolaService.getById(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Prwtokola addPrwtokola(@RequestBody PrwtokolaDTO prwtokolaDTO){
        try {
            return prwtokolaService.addPrwtokola(prwtokolaDTO);
        }catch (Exception e){
            throw e;
        }
    }

    // --When used from the front end take care of having the "file" parameter
    @CrossOrigin
    @PostMapping({"/addPrwtokolaFromExcel"})
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addPrwtokolaFromExcel(@RequestParam("file") MultipartFile file) throws IOException {
        try {
            return prwtokolaService.addPrwtokolaFromExcel(file);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean deletePrwtokola(@PathVariable Long id){
        try {
            return prwtokolaService.deletePrwtokola(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @PatchMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean patchPrwtokola(@PathVariable Long id, @RequestBody PrwtokolaDTO prwtokolaDTO){
        try {
            return prwtokolaService.patchPrwtokola(id, prwtokolaDTO);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"getDistinctIds"})
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<BigInteger> getDistinctIds(){
        try {
            return prwtokolaService.getDistinctPrwtokolaIds();
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAllByPaging" + "/{page}"})
    @ResponseStatus(HttpStatus.OK)
    public Page<Prwtokola> getAllByPaging(@PathVariable Integer page){
        try {
            return prwtokolaService.getAllByPaging(page);
        }catch (Exception e){
            throw e;
        }
    }

}
