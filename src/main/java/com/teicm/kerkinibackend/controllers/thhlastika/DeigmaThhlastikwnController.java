package com.teicm.kerkinibackend.controllers.thhlastika;

import com.teicm.kerkinibackend.v1.models.DeigmaGoogleMarkersDTO;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.services.thhlastika.DeigmaThhlastikwnServiceImpl;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnSearchDTO;
import com.teicm.kerkinibackend.view.ExcelDeigmaThhlastikwnView;
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
@RequestMapping(DeigmaThhlastikwnController.BASE_URL)
public class DeigmaThhlastikwnController {

    public static final String BASE_URL = "/v1/deigmaThhlastikwn";

    @Autowired
    private DeigmaThhlastikwnServiceImpl deigmaThhlastikwnService;

    @CrossOrigin
    @GetMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public DeigmaThhlastikwn findDeigmaThhlastikwn(@PathVariable Long id){
        return deigmaThhlastikwnService.findDeigmaThhlastikwnById(id);
    }

    @CrossOrigin
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DeigmaThhlastikwn addDeigmaThhlastikwn(@RequestBody DeigmaThhlastikwnDTO deigmaThhlastikwnDTO) {
        try {
            return deigmaThhlastikwnService.addDeigmaThhlastikwn(deigmaThhlastikwnDTO);
        }catch (Exception e){
            throw e;
        }
    }

    // INFORM THE KERKINI ORGANIZATION HOW TO USE DATE Cells IN THEIR EXCELS. Example : '2017-11-15' with the "'" to parse it correctly.
    // --When used from the front end take care of having the "file" parameter
    @CrossOrigin
    @PostMapping({"/addDeigmaThhlastikwnFromExcel"})
    @ResponseStatus(HttpStatus.CREATED)
    public boolean addDeigmaThhlastikwnFromExcel(@RequestParam("file") MultipartFile file) throws IOException {
        try {
            return deigmaThhlastikwnService.addDeigmaThhlastikwnFromExcel(file);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAutocompletes"})
    @ResponseStatus(HttpStatus.OK)
    public DeigmaThhlastikwnAutocompletesDTO getAutocompletes(){
        try {
            return deigmaThhlastikwnService.getDeigmaThhlastikwnAutocompletes();
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAllGeoLocations"})
    @ResponseStatus(HttpStatus.OK)
    public List<DeigmaGoogleMarkersDTO> getAllGeoLocations() {
        try {
            return deigmaThhlastikwnService.getAllGeoLocations();
        }catch (Exception e){
            throw e;
        }
    }

    // --When used from the front end take care of having the "file" parameter
    @CrossOrigin
    @PatchMapping({"/{id}/addPicture"})
    @ResponseStatus(HttpStatus.OK)
    public boolean uploadPicture(@PathVariable Long id, @RequestParam("file") MultipartFile file) throws IOException {
        try {
            return deigmaThhlastikwnService.uploadPicture(id, file);
        }catch (Exception e){
            throw e;
        }
    }

    // --When used from the front end take care of having the "file" parameter
    @CrossOrigin
    @PatchMapping({"/{id}/addFile"})
    @ResponseStatus(HttpStatus.OK)
    public boolean uploadFile(@PathVariable Long id, @RequestParam("file") MultipartFile file) throws IOException {
        try {
            return deigmaThhlastikwnService.uploadFile(id, file);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @PatchMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean patchDeigmaThhlastikwn(@PathVariable Long id, @RequestBody DeigmaThhlastikwnDTO deigmaThhlastikwnDTO) {
        try {
            return deigmaThhlastikwnService.patchDeigmaThhlastikwn(id, deigmaThhlastikwnDTO);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @DeleteMapping({"/{id}"})
    @ResponseStatus(HttpStatus.OK)
    public boolean deleteDeigmaThhlastikwn(@PathVariable Long id){
        try {
            return deigmaThhlastikwnService.deleteDeigmaThhlastikwn(id);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/getAllByPaging" + "/{page}"})
    @ResponseStatus(HttpStatus.OK)
    public Page<DeigmaThhlastikwn> getAllByPaging(@PathVariable Integer page){
        try {
            return deigmaThhlastikwnService.getAllByPaging(page);
        }catch (Exception e){
            throw e;
        }
    }

    // TODO: 12/4/2018 Refactor it so that it happens in another central place?
    private List<SearchCriteria> producedSearchCriterias(String search){
        try {
            List<SearchCriteria> searchCriteriaList = new ArrayList<>();
            if (search != null) {

                // Pattern pattern = Pattern.compile("(\\w+?)(~|<|>)(\\w+[(!-/. ?\\w+);]+)?,");

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
    public DeigmaThhlastikwnSearchDTO searchDeigmaThhlastikwn(@RequestParam(value = "search") String search,
                                                              @RequestParam(value = "size") int size,
                                                              @RequestParam(value = "page") int page,
                                                              @RequestParam(value = "sort") String sort){
        try {
            return deigmaThhlastikwnService.searchDeigmaThhlastikwn(producedSearchCriterias(search), size, page, sort);
        }catch (Exception e){
            throw e;
        }
    }

    @CrossOrigin
    @GetMapping({"/downloadExcel"})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView downloadDeigmaThhlastikwn(@RequestParam(value = "search") String search,
                                                @RequestParam(value = "sort") String sort){
        try {
            List<DeigmaThhlastikwn> deigmaThhlastikwnList = deigmaThhlastikwnService
                    .downloadDeigmaThhlastikwn(producedSearchCriterias(search), sort);

            return new ModelAndView(new ExcelDeigmaThhlastikwnView(), "deigmaThhlastikwnList", deigmaThhlastikwnList);
        }catch (Exception e){
            throw e;
        }
    }

}
