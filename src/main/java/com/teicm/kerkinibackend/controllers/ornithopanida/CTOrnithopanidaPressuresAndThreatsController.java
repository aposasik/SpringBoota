package com.teicm.kerkinibackend.controllers.ornithopanida;


import com.teicm.kerkinibackend.domain.ornithopanida.CTOrnithopanidaPressuresAndThreats;
import com.teicm.kerkinibackend.services.ornithopanida.CTOrnithopanidaPressuresAndThreatsService;
import com.teicm.kerkinibackend.v1.models.ornithopanida.CTOrnithopanidaPressuresAndThreatsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/ctornithopanidaPressuresAndThreats")
  public class CTOrnithopanidaPressuresAndThreatsController
  {
     @Autowired
     private CTOrnithopanidaPressuresAndThreatsService ctOrnithopanidaPressuresAndThreatsService;

     public CTOrnithopanidaPressuresAndThreatsController(CTOrnithopanidaPressuresAndThreatsService ctOrnithopanidaPressuresAndThreatsService)
     {
            this.ctOrnithopanidaPressuresAndThreatsService = ctOrnithopanidaPressuresAndThreatsService;
     }

     @CrossOrigin
     @GetMapping
     @ResponseStatus(HttpStatus.OK)
     public List<CTOrnithopanidaPressuresAndThreats> findAll()
     {
        return ctOrnithopanidaPressuresAndThreatsService.findAll();
     }

      @CrossOrigin
      @GetMapping({"/getAllByPaging" + "/{page}"})
      @ResponseStatus(HttpStatus.OK)
      public Page<CTOrnithopanidaPressuresAndThreats> getAllByPaging(@PathVariable Integer page){
          try {
              return ctOrnithopanidaPressuresAndThreatsService.getAllByPaging(page);
          }catch (Exception e){
              throw e;
          }
      }

     @CrossOrigin
     @GetMapping({"/{id}"})
     @ResponseStatus(HttpStatus.OK)
     public CTOrnithopanidaPressuresAndThreats findById(@PathVariable Long id)
     {
        return ctOrnithopanidaPressuresAndThreatsService.findById(id);
     }

      @CrossOrigin
      @DeleteMapping({"/{id}"})
      @ResponseStatus(HttpStatus.OK)
      public boolean deletePressThreats(@PathVariable Long id)
      {
          return ctOrnithopanidaPressuresAndThreatsService.deletePressThreats(id);
      }
      
      @CrossOrigin
      @GetMapping({"/getAllActCodes"})
      @ResponseStatus(HttpStatus.OK)
      public ArrayList<String> getAllActCodes()
      {
        return ctOrnithopanidaPressuresAndThreatsService.getAllActCodes();
      }

      @CrossOrigin
      @PostMapping
      @ResponseStatus(HttpStatus.CREATED)
      public CTOrnithopanidaPressuresAndThreats addPressThreat(@RequestBody CTOrnithopanidaPressuresAndThreatsDTO ctOrnithopanidaPressuresAndThreatsDTO)
      {
         return ctOrnithopanidaPressuresAndThreatsService.addPressThreat(ctOrnithopanidaPressuresAndThreatsDTO);
      }

      @CrossOrigin
      @PatchMapping({"/{id}"})
      @ResponseStatus(HttpStatus.OK)
      public boolean patchPressThreat(@PathVariable Long id, @RequestBody CTOrnithopanidaPressuresAndThreatsDTO ctOrnithopanidaPressuresAndThreatsDTO){
          try {
              return ctOrnithopanidaPressuresAndThreatsService.patchPressThreat(id, ctOrnithopanidaPressuresAndThreatsDTO);
          }catch (Exception e){
              throw e;
          }
      }
  }

