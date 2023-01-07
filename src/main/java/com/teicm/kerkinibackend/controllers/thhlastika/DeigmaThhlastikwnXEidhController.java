package com.teicm.kerkinibackend.controllers.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXEidh;
import com.teicm.kerkinibackend.services.thhlastika.DeigmaThhlastikwnXEidhServiceImpl;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXEidhAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXEidhDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXEidhSearchDTO;
import com.teicm.kerkinibackend.view.ExcelDeigmaThhlastikwnXEidhView;
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
@RequestMapping(DeigmaThhlastikwnXEidhController.BASE_URL)
public class DeigmaThhlastikwnXEidhController {

    public static final String BASE_URL = "/v1/deigmaThhlastikwnXEidh";

    @Autowired
    private DeigmaThhlastikwnXEidhServiceImpl deigmaThhlastikwnXEidhService;

    @CrossOrigin
    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public DeigmaThhlastikwnXEidh getById(@PathVariable Long id){
        try {
            return deigmaThhlastikwnXEidhService.getById(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getDeigmaThhlastikwnXEidhByDeigmaThhlastikwnIs/" + "{id}"})
    @ResponseStatus(HttpStatus.OK)
    public Set<DeigmaThhlastikwnXEidhDTO> getDeigmaThhlastikwnXEidhByDeigmaThhlastikwnIs(@PathVariable Long id){
        try {
            return deigmaThhlastikwnXEidhService.getDeigmaThhlastikwnXEidhByDeigmaThhlastikwnIs(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DeigmaThhlastikwnXEidhDTO addDeigmaThhlastikwnXEidh(@RequestBody DeigmaThhlastikwnXEidhDTO deigmaThhlastikwnXEidhDTO){
        try {
            return deigmaThhlastikwnXEidhService.addDeigmaThhlastikwnXEidh(deigmaThhlastikwnXEidhDTO);
        }catch (Exception e){
            throw e;
        }
    }

    // --When used from the front end take care of having the "file" parameter
    @CrossOrigin
    @PostMapping({"/addDeigmaThhlastikwnXEidhFromExcel"})
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addDeigmaThhlastikwnXEidhFromExcel(@RequestParam("file") MultipartFile file) throws IOException {
        try {
            return deigmaThhlastikwnXEidhService.addDeigmaThhlastikwnXEidhFromExcel(file);
        }catch (Exception e){
            throw e;
        }
    }


    @CrossOrigin
    @PatchMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean patchDeigmaThhlastikwnXEidh(@PathVariable Long id, @RequestBody DeigmaThhlastikwnXEidhDTO deigmaThhlastikwnXEidhDTO){
        try {
            return deigmaThhlastikwnXEidhService.patchDeigmaThhlastikwnXEidh(id, deigmaThhlastikwnXEidhDTO);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @DeleteMapping({"{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean deleteDeigmaThhlastikwnXEidh(@PathVariable Long id){
        try {
            return deigmaThhlastikwnXEidhService.deleteDeigmaThhlastikwnXEidh(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAllByPaging" + "/{page}"})
    @ResponseStatus(HttpStatus.OK)
    public Page<DeigmaThhlastikwnXEidh> getAllByPaging(@PathVariable Integer page){
        try {
            return deigmaThhlastikwnXEidhService.getAllByPaging(page);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAutocompletes"})
    @ResponseStatus(HttpStatus.OK)
    public DeigmaThhlastikwnXEidhAutocompletesDTO getAutocompletes(){
        try {
            return deigmaThhlastikwnXEidhService.getDeigmaThhlastikwnXEidhAutocompletes();
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
    public DeigmaThhlastikwnXEidhSearchDTO searchDeigmaThhlastikwnXEidh(@RequestParam(value = "search") String search,
                                                                        @RequestParam(value = "size") int size,
                                                                        @RequestParam(value = "page") int page,
                                                                        @RequestParam(value = "sort") String sort){
        try {
            return deigmaThhlastikwnXEidhService.searchDeigmaThhlastikwnXEidh(producedSearchCriterias(search), size, page, sort);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/downloadExcel"})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView downloadDeigmaThhlastikwnXEidh(@RequestParam(value = "search") String search,
                                                     @RequestParam(value = "sort") String sort){
        try {
            List<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidhList = deigmaThhlastikwnXEidhService.downloadDeigmaThhlastikwnXEidh(producedSearchCriterias(search), sort);

            return new ModelAndView(new ExcelDeigmaThhlastikwnXEidhView(), "deigmaThhlastikwnXEidhList", deigmaThhlastikwnXEidhList);
        }catch (Exception e){
            throw e;
        }
    }

}
