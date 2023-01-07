package com.teicm.kerkinibackend.controllers.thhlastika;

import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaEidh;
import com.teicm.kerkinibackend.services.thhlastika.CtThhlastikaEidhService;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaEidhSearchDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaEidosDTO;
import com.teicm.kerkinibackend.view.ExcelCtThhlastikaEidhView;
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
@RequestMapping(CtThhlastikaEidhController.BASE_URL)
public class CtThhlastikaEidhController {

    public static final String BASE_URL="/v1/ctThhlastikaEidh";

    @Autowired
    private CtThhlastikaEidhService ctThhlastikaEidhService;

    @CrossOrigin
    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public CtThhlastikaEidh findById(@PathVariable Long id){
        try {
            return ctThhlastikaEidhService.findById(id);
        } catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CtThhlastikaEidh addEidos(@RequestBody CtThhlastikaEidosDTO ctThhlastikaEidosDTO){
        try {
            return ctThhlastikaEidhService.addEidos(ctThhlastikaEidosDTO);
        } catch (Exception e){
            throw e;
        }
    }

    // --When used from the front end take care of having the "file" parameter
    @CrossOrigin
    @PostMapping({"/addEidhFromExcel"})
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addEidhFromExcel(@RequestParam("file") MultipartFile file) throws IOException {
        try {
            return ctThhlastikaEidhService.addEidhFromExcel(file);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @PatchMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean patchEidos(@PathVariable Long id, @RequestBody CtThhlastikaEidosDTO ctThhlastikaEidosDTO){
        try {
            return ctThhlastikaEidhService.patchEidos(id, ctThhlastikaEidosDTO);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean deleteEidos(@PathVariable Long id){
        try {
            return ctThhlastikaEidhService.deleteEidos(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAllEidh"})
    @ResponseStatus(HttpStatus.OK)
    public ArrayList<String> getAllEidh(){
        try {
            return ctThhlastikaEidhService.getAllEidh();
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAllByPaging" + "/{page}"})
    @ResponseStatus(HttpStatus.OK)
    public Page<CtThhlastikaEidh> getAllByPaging(@PathVariable Integer page){
        try {
            return ctThhlastikaEidhService.getAllByPaging(page);
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
    public CtThhlastikaEidhSearchDTO searchCtThhlastikaEidh(@RequestParam(value = "search") String search,
                                                            @RequestParam(value = "size") int size,
                                                            @RequestParam(value = "page") int page,
                                                            @RequestParam(value = "sort") String sort){
        try {
            return ctThhlastikaEidhService.searchCtThhlastikaEidh(producedSearchCriterias(search), size, page, sort);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/downloadExcel"})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView downloadCtThhlastikaEidh(@RequestParam(value = "search") String search,
                                                 @RequestParam(value = "sort") String sort){
        try {
            List<CtThhlastikaEidh> ctThhlastikaEidhList = ctThhlastikaEidhService
                    .downloadCtThhlastikaEidh(producedSearchCriterias(search), sort);

            return new ModelAndView(new ExcelCtThhlastikaEidhView(), "ctThhlastikaEidhList", ctThhlastikaEidhList);
        }catch (Exception e){
            throw e;
        }
    }
}
