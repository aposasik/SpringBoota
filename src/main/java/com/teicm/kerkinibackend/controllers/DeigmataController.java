package com.teicm.kerkinibackend.controllers;

import com.teicm.kerkinibackend.domain.Deigmata;
import com.teicm.kerkinibackend.services.DeigmataServiceImpl;
import com.teicm.kerkinibackend.v1.models.DeigmataDTO;
import com.teicm.kerkinibackend.v1.models.DeigmataSearchDTO;
import com.teicm.kerkinibackend.v1.models.DeigmataSearchHelperDTO;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.view.ExcelDeigmataView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping(DeigmataController.BASE_URL)
public class DeigmataController {

    public static final String BASE_URL = "/v1/deigmata";

    @Autowired
    DeigmataServiceImpl deigmataService;

    @CrossOrigin
    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public Deigmata getById(@PathVariable Long id){
        try {
            return deigmataService.getById(id);
        }catch (Exception e){
            throw e;
        }
    }

    @Deprecated
    @CrossOrigin
    @GetMapping({"/getDeigmataByPrwtokolaIs" + "/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public Set<Deigmata> getDeigmataByPrwtokola(@PathVariable Long id){
        try {
            return deigmataService.getDeigmataByPrwtokola(id);
        }catch (Exception e){
            throw e;
        }
    }


    @CrossOrigin
    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean deleteDeigmata(@PathVariable Long id){
        try {
            return deigmataService.deleteDeigmata(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @PatchMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean patchDeigmata(@PathVariable Long id, @RequestBody DeigmataDTO deigmataDTO){
        try {
            return deigmataService.patchDeigmata(id, deigmataDTO);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAllByPaging" + "/{page}"})
    @ResponseStatus(HttpStatus.OK)
    public Page<Deigmata> getAllByPaging(@PathVariable Integer page){
        try {
            return deigmataService.getAllByPaging(page);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAutocompletes"})
    @ResponseStatus(HttpStatus.OK)
    public List<BigInteger> getAutocompletes(){
        try {
            return deigmataService.getAutocompletes();
        }catch (Exception e){
            throw e;
        }
    }

    private List<SearchCriteria> producedSearchCriterias(String search){
        try {
            List<SearchCriteria> searchCriteriaList = new ArrayList<>();
            if (search != null) {
//                Pattern pattern = Pattern.compile("(\\w+?)(~)(\\w+[(!-/. ?\\w+);]+)?,");
                Pattern pattern = Pattern.compile("(\\w+?)(~)([(!-/.: 0-9\\p{L});]+)?@");
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
    public DeigmataSearchDTO searchDeigmata(@RequestParam(value = "search") String search,
                                                     @RequestParam(value = "size") int size,
                                                     @RequestParam(value = "page") int page,
                                                     @RequestParam(value = "sort") String sort){
        try {
            return deigmataService.searchDeigmata(producedSearchCriterias(search), size, page, sort);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/downloadExcel"})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView downloadDeigmata(@RequestParam(value = "search") String search,
                                                  @RequestParam(value = "sort") String sort){
        try {
            List<DeigmataSearchHelperDTO> deigmataList = deigmataService
                    .downloadDeigmata(producedSearchCriterias(search), sort);

            return new ModelAndView(new ExcelDeigmataView(), "deigmataList", deigmataList);
        }catch (Exception e){
            throw e;
        }
    }

}
