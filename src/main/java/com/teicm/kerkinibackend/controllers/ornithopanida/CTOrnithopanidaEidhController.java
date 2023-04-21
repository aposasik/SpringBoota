package com.teicm.kerkinibackend.controllers.ornithopanida;

import com.teicm.kerkinibackend.domain.ornithopanida.CTOrnithopanidaEidi;
import com.teicm.kerkinibackend.services.ornithopanida.CTOrnithopanidaEidiService;
import com.teicm.kerkinibackend.v1.models.ornithopanida.CTOrnithopanidaEidiDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.util.ArrayList;

@RestController
@RequestMapping("/v1/ctornithopanidaEidi")
public class CTOrnithopanidaEidhController 
{

    @Autowired
    private CTOrnithopanidaEidiService ctOrnithopanidaEidiService;

    @CrossOrigin
    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public CTOrnithopanidaEidi findById(@PathVariable Long id){
        try {
            return ctOrnithopanidaEidiService.findById(id);
        } catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CTOrnithopanidaEidi addEidos(@RequestBody CTOrnithopanidaEidiDTO ctOrnithopanidaEidiDTO){
        try {
            return ctOrnithopanidaEidiService.addEidos(ctOrnithopanidaEidiDTO);
        } catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @PostMapping({"/addEidhFromExcel"})
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addEidhFromExcel(@RequestParam("file") MultipartFile file) throws IOException {
        try {
            return ctOrnithopanidaEidiService.addEidhFromExcel(file);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @PatchMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean patchEidos(@PathVariable Long id, @RequestBody CTOrnithopanidaEidiDTO ctOrnithopanidaEidiDTO){
        try {
            return ctOrnithopanidaEidiService.patchEidos(id, ctOrnithopanidaEidiDTO);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean deleteEidos(@PathVariable Long id){
        try {
            return ctOrnithopanidaEidiService.deleteEidos(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAllEidh"})
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<String> getAllEidh(){
        try {
            return ctOrnithopanidaEidiService.getAllEidh();
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAllByPaging" + "/{page}"})
    @ResponseStatus(HttpStatus.OK)
    public Page<CTOrnithopanidaEidi> getAllByPaging(@PathVariable Integer page){
        try {
            return ctOrnithopanidaEidiService.getAllByPaging(page);
        }catch (Exception e){
            throw e;
        }
    }
}
