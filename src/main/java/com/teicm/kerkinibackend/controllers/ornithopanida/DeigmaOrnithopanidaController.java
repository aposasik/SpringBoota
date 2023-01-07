package com.teicm.kerkinibackend.controllers.ornithopanida;

import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanida;
import com.teicm.kerkinibackend.services.ornithopanida.DeigmaOrnithopanidaServiceImpl;
import com.teicm.kerkinibackend.v1.models.ornithopanida.DeigmaOrnithopanidaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(DeigmaOrnithopanidaController.BASE_URL)
public class DeigmaOrnithopanidaController 
{

    public static final String BASE_URL = "/v1/deigmaOrnithopanida";

    @Autowired
    private DeigmaOrnithopanidaServiceImpl deigmaOrnithopanidaService;

    @CrossOrigin
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DeigmaOrnithopanida addDeigmaOrnithopanida(@RequestBody DeigmaOrnithopanidaDTO deigmaOrnithopanidaDTO) {
        try {
            return deigmaOrnithopanidaService.addDeigmaOrnithopanida(deigmaOrnithopanidaDTO);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @PatchMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean patchDeigmaOrnithopanida(@PathVariable Long id, @RequestBody DeigmaOrnithopanidaDTO deigmaOrnithopanidaDTO) {
        try {
            return deigmaOrnithopanidaService.patchDeigmaOrnithopanida(id, deigmaOrnithopanidaDTO);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAllByPaging" + "/{page}"})
    @ResponseStatus(HttpStatus.OK)
    public Page<DeigmaOrnithopanida> getAllByPaging(@PathVariable Integer page){
        try {
            return deigmaOrnithopanidaService.getAllByPaging(page);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean deleteDeigmaOrnithopanida(@PathVariable Long id){
        try {
            return deigmaOrnithopanidaService.deleteDeigmaOrnithopanida(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<DeigmaOrnithopanida> findAll()
    {
        return deigmaOrnithopanidaService.findAll();
    }

    @CrossOrigin
    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public DeigmaOrnithopanida findById(@PathVariable Long id)
    {
        return deigmaOrnithopanidaService.findById(id);
    }
    
}

