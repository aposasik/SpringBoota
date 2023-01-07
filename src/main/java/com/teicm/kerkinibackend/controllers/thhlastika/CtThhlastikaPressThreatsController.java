package com.teicm.kerkinibackend.controllers.thhlastika;

import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaPressThreats;
import com.teicm.kerkinibackend.services.thhlastika.CtThhlastikaPressThreatsService;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaPressThreatDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaPressThreatsSearchDTO;
import com.teicm.kerkinibackend.view.ExcelCtThhlastikaPressThreatsView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping(CtThhlastikaPressThreatsController.BASE_URL)
public class CtThhlastikaPressThreatsController {

    public static final String BASE_URL = "/v1/ctThhlastikaPressThreats";

    @Autowired
    private CtThhlastikaPressThreatsService ctThhlastikaPressThreatsService;

    @CrossOrigin
    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public CtThhlastikaPressThreats findById(@PathVariable Long id){
        try {
            return ctThhlastikaPressThreatsService.findById(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean deletePressThreat(@PathVariable Long id){
        try {
            return ctThhlastikaPressThreatsService.deletePressThreat(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<CtThhlastikaPressThreats> findAll(){
        try {
            return ctThhlastikaPressThreatsService.findAll();
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CtThhlastikaPressThreats addPressThreat(@RequestBody CtThhlastikaPressThreatDTO ctThhlastikaPressThreatDTO){
        try {
            return ctThhlastikaPressThreatsService.addPressThreat(ctThhlastikaPressThreatDTO);
        }catch (Exception e){
            throw e;
        }
    }

    // --When used from the front end take care of having the "file" parameter
    @CrossOrigin
    @PostMapping({"/addPressThreatsFromExcel"})
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addPressThreatsFromExcel(@RequestParam("file") MultipartFile file) throws IOException {
        try {
            return ctThhlastikaPressThreatsService.addPressThreatsFromExcel(file);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @PatchMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean patchPressThreat(@PathVariable Long id, @RequestBody CtThhlastikaPressThreatDTO ctThhlastikaPressThreatDTO){
        try {
            return ctThhlastikaPressThreatsService.patchPressThreat(id, ctThhlastikaPressThreatDTO);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAllActCodes"})
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<String> getAllActCodes(){
        try {
            return ctThhlastikaPressThreatsService.getAllActCodes();
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAllByPaging" + "/{page}"})
    @ResponseStatus(HttpStatus.OK)
    public Page<CtThhlastikaPressThreats> getAllByPaging(@PathVariable Integer page){
        try {
            return ctThhlastikaPressThreatsService.getAllByPaging(page);
        }catch (Exception e){
            throw e;
        }
    }

    private List<SearchCriteria> producedSearchCriterias(String search){
        try {
            List<SearchCriteria> searchCriteriaList = new ArrayList<>();
            if (search != null) {
//                Pattern pattern = Pattern.compile("(\\w+?)(~|<|>)(\\w+[(!-/. ?\\w+);]+)?,");
                // TODO: 2/12/2019 Implement \\\\R for strings with newLine chars. Tried it, it passes all the way to the query (having the \\\\R both in Controller and Repository regex) but it doens't give back data (EVENT THOUGH : select * from kerkinidb.ct_thhlastika_press_threats where description_en = 'a\ns\ndd' WORKS IN MYSQL WORKBENCH)
//                \\\\R for newLine characters but couldnt make it work
                Pattern pattern = Pattern.compile("(\\w+?)(~|<|>)([(!-/.: 0-9\\p{L});]+)?@");
                Matcher matcher = pattern.matcher(search);
                while (matcher.find()) {
                    searchCriteriaList.add(new SearchCriteria(matcher.group(1),
                            matcher.group(2), matcher.group(3)));
                }
            }
            return searchCriteriaList;
        } catch (Exception e) {
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/search"})
    @ResponseStatus(HttpStatus.OK)
    public CtThhlastikaPressThreatsSearchDTO searchCtThhlastikaPressThreats(@RequestParam(value = "search") String search,
                                                                            @RequestParam(value = "size") int size,
                                                                            @RequestParam(value = "page") int page,
                                                                            @RequestParam(value = "sort") String sort){
        try {
            return ctThhlastikaPressThreatsService.searchCtThhlastikaPressThreats(producedSearchCriterias(search), size, page, sort);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/downloadExcel"})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView downloadCtThhlastikaPressThreats(@RequestParam(value = "search") String search,
                                                         @RequestParam(value = "sort") String sort){
        try {
            List<CtThhlastikaPressThreats> ctThhlastikaPressThreatsList = ctThhlastikaPressThreatsService
                    .downloadCtThhlastikaPressThreats(producedSearchCriterias(search), sort);

            return new ModelAndView(new ExcelCtThhlastikaPressThreatsView(), "ctThhlastikaPressThreatsList", ctThhlastikaPressThreatsList);
        }catch (Exception e){
            throw e;
        }
    }

}
