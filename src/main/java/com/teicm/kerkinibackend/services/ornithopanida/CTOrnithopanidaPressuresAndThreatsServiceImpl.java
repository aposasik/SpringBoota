package com.teicm.kerkinibackend.services.ornithopanida;



import com.teicm.kerkinibackend.domain.ornithopanida.CTOrnithopanidaPressuresAndThreats;
import com.teicm.kerkinibackend.repositories.ornithopanida.CTOrnithopanidaPressuresAndThreatsRep;
import com.teicm.kerkinibackend.v1.mappers.ornithopanida.CTOrnithopanidaPressuresAndThreatsMapper;
import com.teicm.kerkinibackend.v1.models.ornithopanida.CTOrnithopanidaPressuresAndThreatsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CTOrnithopanidaPressuresAndThreatsServiceImpl implements CTOrnithopanidaPressuresAndThreatsService
{
    private CTOrnithopanidaPressuresAndThreatsMapper ctOrnithopanidaPressuresAndThreatsMapper;

    @Autowired
    private CTOrnithopanidaPressuresAndThreatsRep ctOrnithopanidaPressuresAndThreatsRep;

    public CTOrnithopanidaPressuresAndThreatsServiceImpl(CTOrnithopanidaPressuresAndThreatsMapper ctOrnithopanidaPressuresAndThreatsMapper, CTOrnithopanidaPressuresAndThreatsRep ctOrnithopanidaPressuresAndThreatsRep)
    {
        this.ctOrnithopanidaPressuresAndThreatsMapper = ctOrnithopanidaPressuresAndThreatsMapper;
        this.ctOrnithopanidaPressuresAndThreatsRep = ctOrnithopanidaPressuresAndThreatsRep;
    }

    @Override
    public List<CTOrnithopanidaPressuresAndThreats> findAll()
    {
        return ctOrnithopanidaPressuresAndThreatsRep.findAll();
    }

    @Override
    public CTOrnithopanidaPressuresAndThreats findById(Long id)
    {
        Optional<CTOrnithopanidaPressuresAndThreats> optional = ctOrnithopanidaPressuresAndThreatsRep.findById(id);
        return optional.orElse(null);
    }

    @Override
    public boolean deletePressThreats(Long id)
    {
        Optional<CTOrnithopanidaPressuresAndThreats> OptDelete = ctOrnithopanidaPressuresAndThreatsRep.findById(id);

        if (OptDelete.isPresent())
        {
            ctOrnithopanidaPressuresAndThreatsRep.delete(OptDelete.get());
            return true;
        }   return false;
    }

    @Override
    public Page<CTOrnithopanidaPressuresAndThreats> getAllByPaging(Integer page)
    {
        try
        {
            Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "id");
            return ctOrnithopanidaPressuresAndThreatsRep.findAll(pageable);
        }
        catch (Exception e)
        {
            throw e;
        }
    }



    @Override
    public boolean patchPressThreat(Long id, CTOrnithopanidaPressuresAndThreatsDTO ctOrnithopanidaPressuresAndThreatsDTO) {
        try {
            Optional<CTOrnithopanidaPressuresAndThreats> optionalCTOrnithopanidaPressuresAndThreats = ctOrnithopanidaPressuresAndThreatsRep.findById(id);

            if (optionalCTOrnithopanidaPressuresAndThreats.isPresent()){
                if (ctOrnithopanidaPressuresAndThreatsDTO.getActCode() != null){
                    optionalCTOrnithopanidaPressuresAndThreats.get().setActCode(ctOrnithopanidaPressuresAndThreatsDTO.getActCode());
                }
                if (ctOrnithopanidaPressuresAndThreatsDTO.getDescriptionEn() != null){
                    optionalCTOrnithopanidaPressuresAndThreats.get().setDescriptionEn(ctOrnithopanidaPressuresAndThreatsDTO.getDescriptionEn());
                }
                if (ctOrnithopanidaPressuresAndThreatsDTO.getRemarks() != null){
                    optionalCTOrnithopanidaPressuresAndThreats.get().setRemarks(ctOrnithopanidaPressuresAndThreatsDTO.getRemarks());
                }

                ctOrnithopanidaPressuresAndThreatsRep.save(optionalCTOrnithopanidaPressuresAndThreats.get());

                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public ArrayList<String> getAllActCodes()
    {
        return ctOrnithopanidaPressuresAndThreatsRep.findActOrderByAct();
    }

    @Override
    public CTOrnithopanidaPressuresAndThreats addPressThreat(CTOrnithopanidaPressuresAndThreatsDTO ctOrnithopanidaPressuresAndThreatsDTO){
      return ctOrnithopanidaPressuresAndThreatsRep.save(ctOrnithopanidaPressuresAndThreatsMapper.ctOrnithopanidaPressuresAndThreatsTOctOrnithopanidaPressuresAndThreatsDTO(ctOrnithopanidaPressuresAndThreatsDTO));
    }
}