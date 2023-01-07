package com.teicm.kerkinibackend.controllers.ornithopanida;

import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanidaXPresAndThreats;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXPressThreats;
import com.teicm.kerkinibackend.services.ornithopanida.DeigmaOrnithopanidaXPresAndThreatsService;
import com.teicm.kerkinibackend.v1.models.ornithopanida.DeigmaOrnithopanidaXPresAndThreatsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.Set;


@RestController
@RequestMapping("/v1/deigmaOrnithopanidaXPresAndThreats")
public class DeigmaOrnithopanidaXPresAndThreatsController {
    @Autowired
    private DeigmaOrnithopanidaXPresAndThreatsService deigmaOrnithopanidaXPresAndThreatsService;

    public DeigmaOrnithopanidaXPresAndThreatsController(DeigmaOrnithopanidaXPresAndThreatsService deigmaOrnithopanidaXPresAndThreatsService) {
        this.deigmaOrnithopanidaXPresAndThreatsService = deigmaOrnithopanidaXPresAndThreatsService;
    }

    @CrossOrigin
    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public DeigmaOrnithopanidaXPresAndThreats getById(@PathVariable Long id){
        try {
            return deigmaOrnithopanidaXPresAndThreatsService.getById(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAllByPaging" + "/{page}"})
    @ResponseStatus(HttpStatus.OK)
    public Page<DeigmaOrnithopanidaXPresAndThreats> getAllByPaging(@PathVariable Integer page){
        try {
            return deigmaOrnithopanidaXPresAndThreatsService.getAllByPaging(page);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @PatchMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean patchDeigmaOrnithopanidaXPresAndThreats(@PathVariable Long id, @RequestBody DeigmaOrnithopanidaXPresAndThreatsDTO deigmaOrnithopanidaXPresAndThreatsDTO){
        try {
            return deigmaOrnithopanidaXPresAndThreatsService.patchDeigmaOrnithopanidaXPresAndThreats(id, deigmaOrnithopanidaXPresAndThreatsDTO);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DeigmaOrnithopanidaXPresAndThreatsDTO addDeigmaOrnithopanidaXPressAndThreats(@RequestBody DeigmaOrnithopanidaXPresAndThreatsDTO deigmaOrnithopanidaXPresAndThreatsDTO){
        try {
            return deigmaOrnithopanidaXPresAndThreatsService.addDeigmaOrnithopanidaXPressAndThreats(deigmaOrnithopanidaXPresAndThreatsDTO);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getDeigmaOrnithopanidaXPressThreatsByDeigmaOrnithopanidaIs/" + "{id}"})
    @ResponseStatus(HttpStatus.OK)
    public Set<DeigmaOrnithopanidaXPresAndThreatsDTO> getDeigmaOrnithopanidaXPressThreatsBy(@PathVariable Long id){
        try {
            return deigmaOrnithopanidaXPresAndThreatsService.getDeigmaOrnithopanidaXPressThreatsByDeigmaOrnithopanidaIs(id);
        }catch (Exception e){
            throw e;
        }
    }
    @CrossOrigin
    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean deleteDeigmaOrnithopanidaXPresAndThreats(@PathVariable Long id){
        try {
            return deigmaOrnithopanidaXPresAndThreatsService.deleteDeigmaOrnithopanidaXPresAndThreats(id);
        }catch (Exception e){
            throw e;
        }
    }
}