package com.teicm.kerkinibackend.services.ornithopanida;



import com.teicm.kerkinibackend.domain.ornithopanida.CTOrnithopanidaEidi;
import com.teicm.kerkinibackend.repositories.ornithopanida.CTOrnithopanidaEidiRep;
import com.teicm.kerkinibackend.v1.mappers.ornithopanida.CTOrnithopanidaEidiMapper;
import com.teicm.kerkinibackend.v1.models.ornithopanida.CTOrnithopanidaEidiDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;


@Component
public class CTOrnithopanidaEidiServiceImpl implements CTOrnithopanidaEidiService
{

    private CTOrnithopanidaEidiMapper ctOrnithopanidaEidiMapper;

    @Autowired
    private CTOrnithopanidaEidiRep ctOrnithopanidaEidiRep;

    public CTOrnithopanidaEidiServiceImpl(CTOrnithopanidaEidiMapper ctOrnithopanidaEidiMapper, CTOrnithopanidaEidiRep ctOrnithopanidaEidiRep)
    {
        this.ctOrnithopanidaEidiMapper = ctOrnithopanidaEidiMapper;
        this.ctOrnithopanidaEidiRep = ctOrnithopanidaEidiRep;
    }
 
    @Override
    public CTOrnithopanidaEidi addEidos(CTOrnithopanidaEidiDTO ctOrnithopanidaEidiDTO) {
        return ctOrnithopanidaEidiRep.save(ctOrnithopanidaEidiMapper.ctOrnithopanidaEidiTOctOrnithopanidaEidiDTO(ctOrnithopanidaEidiDTO));
    }

    @Override
    public boolean addEidhFromExcel(MultipartFile file) throws IOException {
        return false;
    }

    @Override
    public CTOrnithopanidaEidi findById(Long id)
    {
        Optional<CTOrnithopanidaEidi> optional=  ctOrnithopanidaEidiRep.findById(id);
        return optional.orElse(null);
    }

    @Override
    public CTOrnithopanidaEidi findByEidos(String eidos) {
        return ctOrnithopanidaEidiRep.findByEidosEquals(eidos);
    }

    @Override
    public boolean patchEidos(Long id, CTOrnithopanidaEidiDTO ctOrnithopanidaEidiDTO) {
        try {
            Optional<CTOrnithopanidaEidi> optionalCTOrnithopanidaEidi = ctOrnithopanidaEidiRep.findById(id);

            if (optionalCTOrnithopanidaEidi.isPresent()){
                if (ctOrnithopanidaEidiDTO.getEidos() != null){
                    optionalCTOrnithopanidaEidi.get().setEidos(ctOrnithopanidaEidiDTO.getEidos());
                }

                ctOrnithopanidaEidiRep.save(optionalCTOrnithopanidaEidi.get());

                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean deleteEidos(Long id) {
        try {
            Optional<CTOrnithopanidaEidi> optionalCTOrnithopanidaEidi = ctOrnithopanidaEidiRep.findById(id);

            if (optionalCTOrnithopanidaEidi.isPresent()){
                ctOrnithopanidaEidiRep.delete(optionalCTOrnithopanidaEidi.get());

                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public ArrayList<String> getAllEidh() {
        try {
            return ctOrnithopanidaEidiRep.findDistinctByEidosOrderByEidos();
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Page<CTOrnithopanidaEidi> getAllByPaging(Integer page) {
        try {
            Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "id");
            return ctOrnithopanidaEidiRep.findAll(pageable);
        }catch (Exception e){
            throw e;
        }
    }
}
