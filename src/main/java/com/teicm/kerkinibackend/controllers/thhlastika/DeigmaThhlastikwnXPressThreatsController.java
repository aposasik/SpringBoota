package com.teicm.kerkinibackend.controllers.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXPressThreats;
import com.teicm.kerkinibackend.services.thhlastika.DeigmaThhlastikwnXPressThreatsService;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXPressThreatDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXPressThreatsAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXPressThreatsSearchDTO;
import com.teicm.kerkinibackend.view.ExcelDeigmaThhastikwnXPressThreatsView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping(DeigmaThhlastikwnXPressThreatsController.BASE_URL)
public class DeigmaThhlastikwnXPressThreatsController {

    public static final String BASE_URL = "/v1/deigmaThhlastikwnXPressThreats";


    @Autowired
    private DeigmaThhlastikwnXPressThreatsService deigmaThhlastikwnXPressThreatsService;

    @CrossOrigin
    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public DeigmaThhlastikwnXPressThreats getById(@PathVariable Long id){
        try {
            return deigmaThhlastikwnXPressThreatsService.getById(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getDeigmaThhlastikwnXPressThreatsByDeigmaThhlastikwnIs/" + "{id}"})
    @ResponseStatus(HttpStatus.OK)
    public Set<DeigmaThhlastikwnXPressThreatDTO> getDeigmaThhlastikwnXPressThreatsBy(@PathVariable Long id){
        try {
            return deigmaThhlastikwnXPressThreatsService.getDeigmaThhlastikwnXPressThreatsByDeigmaThhlastikwnIs(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DeigmaThhlastikwnXPressThreatDTO addDeigmaThhlastikwnXPressThreats(@RequestBody DeigmaThhlastikwnXPressThreatDTO deigmaThhlastikwnXPressThreatDTO){
        try {
            return deigmaThhlastikwnXPressThreatsService.addDeigmaThhlastikwnXPressThreats(deigmaThhlastikwnXPressThreatDTO);
        }catch (Exception e){
            throw e;
        }
    }

    // --When used from the front end take care of having the "file" parameter
    @CrossOrigin
    @PostMapping({"/addDeigmaThhlastikwnXPressThreatsFromExcel"})
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addDeigmaThhlastikwnXPressThreatsFromExcel(@RequestParam("file") MultipartFile file) throws IOException {
        try {
            return deigmaThhlastikwnXPressThreatsService.addDeigmaThhlastikwnXPressThreatsFromExcel(file);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @PatchMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean patchDeigmaThhlastikwnXPressThreats(@PathVariable Long id, @RequestBody DeigmaThhlastikwnXPressThreatDTO deigmaThhlastikwnXPressThreatDTO){
        try {
            return deigmaThhlastikwnXPressThreatsService.patchDeigmaThhlastikwnXPressThreats(id, deigmaThhlastikwnXPressThreatDTO);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean deleteDeigmaThhlastikwnXPressThreats(@PathVariable Long id){
        try {
            return deigmaThhlastikwnXPressThreatsService.deleteDeigmaThhlastikwnXPressThreats(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAllByPaging" + "/{page}"})
    @ResponseStatus(HttpStatus.OK)
    public Page<DeigmaThhlastikwnXPressThreats> getAllByPaging(@PathVariable Integer page){
        try {
            return deigmaThhlastikwnXPressThreatsService.getAllByPaging(page);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAutocompletes"})
    @ResponseStatus(HttpStatus.OK)
    public DeigmaThhlastikwnXPressThreatsAutocompletesDTO getAutocompletes(){
        try {
            return deigmaThhlastikwnXPressThreatsService.getDeigmaThhlastikwnXPressThreatsAutocompletes();
        }catch (Exception e){
            throw e;
        }
    }

    private List<SearchCriteria> producedSearchCriterias(String search) {
        try {
            List<SearchCriteria> searchCriteriaList = new ArrayList<>();
            if (search != null) {
//                Pattern pattern = Pattern.compile("(\\w+?)(~|<|>)(\\w+[(!-/. ?\\w+);]+)?,");
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
    public DeigmaThhlastikwnXPressThreatsSearchDTO searchDeigmaThhlastikwnXPressThreats(@RequestParam(value = "search") String search,
                                                                                        @RequestParam(value = "size") int size,
                                                                                        @RequestParam(value = "page") int page,
                                                                                        @RequestParam(value = "sort") String sort){
        try {
            return deigmaThhlastikwnXPressThreatsService.searchDeigmaThhlastikwnXPressThreats(producedSearchCriterias(search), size, page, sort);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/downloadExcel"})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView downloadDeigmaThhlastikwnXPressThreats(@RequestParam(value = "search") String search,
                                                               @RequestParam(value = "sort") String sort){
        try {
            List<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsList = deigmaThhlastikwnXPressThreatsService
                    .downloadDeigmaThhlastikwnXPressThreats(producedSearchCriterias(search), sort);

            return new ModelAndView(new ExcelDeigmaThhastikwnXPressThreatsView(), "deigmaThhlastikwnXPressThreatsList", deigmaThhlastikwnXPressThreatsList);
        }catch (Exception e){
            throw e;
        }
    }

}
