package com.teicm.kerkinibackend.controllers.ornithopanida;

import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanidaXSpecies;
import com.teicm.kerkinibackend.services.ornithopanida.DeigmaOrnithopanidaXSpeciesServiceImpl;
import com.teicm.kerkinibackend.v1.models.ornithopanida.DeigmaOrnithopanidaXSpeciesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping(DeigmaOrnithopanidaXSpeciesController.BASE_URL)
public class DeigmaOrnithopanidaXSpeciesController {

    public static final String BASE_URL = "/v1/deigmaOrnithopanidaXSpecies";

    @Autowired
    private DeigmaOrnithopanidaXSpeciesServiceImpl deigmaOrnithopanidaXSpeciesService;

    @CrossOrigin
    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public DeigmaOrnithopanidaXSpecies getById(@PathVariable Long id){
        try {
            return deigmaOrnithopanidaXSpeciesService.getById(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getDeigmaOrnithopanidaXSpeciesByDeigmaOrnithopanidaIs/" + "{id}"})
    @ResponseStatus(HttpStatus.OK)
    public Set<DeigmaOrnithopanidaXSpeciesDTO> getDeigmaOrnithopanidaXSpeciesByDeigmaOrnithopanidaIs(@PathVariable Long id){
        try {
            return deigmaOrnithopanidaXSpeciesService.getDeigmaOrnithopanidaXSpeciesByDeigmaOrnithopanidaIs(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DeigmaOrnithopanidaXSpeciesDTO addDeigmaOrnithopanidaXSpecies(@RequestBody DeigmaOrnithopanidaXSpeciesDTO deigmaOrnithopanidaXSpeciesDTO){
        try {
            return deigmaOrnithopanidaXSpeciesService.addDeigmaOrnithopanidaXSpecies(deigmaOrnithopanidaXSpeciesDTO);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @DeleteMapping({"{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean deleteDeigmaOrnithopanidaXSpecies(@PathVariable Long id){
        try {
            return deigmaOrnithopanidaXSpeciesService.deleteDeigmaOrnithopanidaXSpecies(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @PatchMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean patchDeigmaOrnithopanidaXspecies(@PathVariable Long id, @RequestBody DeigmaOrnithopanidaXSpeciesDTO deigmaOrnithopanidaXSpeciesDTO){
        try {
            return deigmaOrnithopanidaXSpeciesService.patchDeigmaOrnithopanidaXspecies(id, deigmaOrnithopanidaXSpeciesDTO);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAllByPaging" + "/{page}"})
    @ResponseStatus(HttpStatus.OK)
    public Page<DeigmaOrnithopanidaXSpecies> getAllByPaging(@PathVariable Integer page){
        try {
            return deigmaOrnithopanidaXSpeciesService.getAllByPaging(page);
        }catch (Exception e){
            throw e;
        }
    }

}
