package com.teicm.kerkinibackend.services.ornithopanida;

import com.teicm.kerkinibackend.domain.ornithopanida.CTOrnithopanidaPressuresAndThreats;
import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanida;
import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanidaXPresAndThreats;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXPressThreats;
import com.teicm.kerkinibackend.repositories.ornithopanida.CTOrnithopanidaPressuresAndThreatsRep;
import com.teicm.kerkinibackend.repositories.ornithopanida.DeigmaOrnithopanidaRep;
import com.teicm.kerkinibackend.repositories.ornithopanida.DeigmaOrnithopanidaXPresAndThreatsRep;
import com.teicm.kerkinibackend.v1.mappers.ornithopanida.DeigmaOrnithopanidaXPresAndThreatsMapper;
import com.teicm.kerkinibackend.v1.models.ornithopanida.DeigmaOrnithopanidaXPresAndThreatsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class DeigmaOrnithopanidaXPresAndThreatsServiceImpl implements DeigmaOrnithopanidaXPresAndThreatsService
{
    @Autowired
    private DeigmaOrnithopanidaXPresAndThreatsMapper deigmaOrnithopanidaXPresAndThreatsMapper;

    @Autowired
    private DeigmaOrnithopanidaXPresAndThreatsRep deigmaOrnithopanidaXPresAndThreatsRep;

    @Autowired
    private DeigmaOrnithopanidaRep deigmaOrnithopanidaRep;

    @Autowired
    private CTOrnithopanidaPressuresAndThreatsRep ctOrnithopanidaPressuresAndThreatsRep;


    public DeigmaOrnithopanidaXPresAndThreatsServiceImpl(DeigmaOrnithopanidaXPresAndThreatsMapper deigmaOrnithopanidaXPresAndThreatsMapper, DeigmaOrnithopanidaXPresAndThreatsRep deigmaOrnithopanidaXPresAndThreatsRep) {
        this.deigmaOrnithopanidaXPresAndThreatsMapper = deigmaOrnithopanidaXPresAndThreatsMapper;
        this.deigmaOrnithopanidaXPresAndThreatsRep = deigmaOrnithopanidaXPresAndThreatsRep;
    }

    @Override
    public List<DeigmaOrnithopanidaXPresAndThreats> findAll()
    {
        return deigmaOrnithopanidaXPresAndThreatsRep.findAll();

    }
    @Override
    public DeigmaOrnithopanidaXPresAndThreats getById(Long id) {
        try {
            Optional<DeigmaOrnithopanidaXPresAndThreats> deigmaOrnithopanidaXPresAndThreatsOptional = deigmaOrnithopanidaXPresAndThreatsRep
                    .findById(id);

            if (deigmaOrnithopanidaXPresAndThreatsOptional.isPresent()){
                return deigmaOrnithopanidaXPresAndThreatsOptional.get();
            } else {
                return null;
            }
        }catch (Exception e){
            throw e;
        }
    }
    @Override
    public Page<DeigmaOrnithopanidaXPresAndThreats> getAllByPaging(Integer page) {
        try {
            Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "id");
            return deigmaOrnithopanidaXPresAndThreatsRep.findAll(pageable);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Set<DeigmaOrnithopanidaXPresAndThreatsDTO> getDeigmaOrnithopanidaXPressThreatsByDeigmaOrnithopanidaIs(Long id) {
        try {
            // Finding the needed DeigmaOrnithopanida through the given Id
            Optional<DeigmaOrnithopanida> optionalDeigmaOrnithopanida = deigmaOrnithopanidaRep.findById(id);

            // Initializing the Set<DTOs>
            Set<DeigmaOrnithopanidaXPresAndThreatsDTO> deigmaOrnithopanidaXPresAndThreatsDTOS = new HashSet<>();

            // Asking for the desired data and mapping them into DTOs (for the 2 extra fields)
            if (optionalDeigmaOrnithopanida.isPresent()){
                for (DeigmaOrnithopanidaXPresAndThreats XPressThreat:
                        deigmaOrnithopanidaXPresAndThreatsRep.findDeigmaOrnithopanidaXPressAndThreatsByDeigmaOrnithopanidaIs(optionalDeigmaOrnithopanida.get())) {

                    deigmaOrnithopanidaXPresAndThreatsDTOS.add(deigmaOrnithopanidaXPresAndThreatsMapper.deigmaOrnithopanidaXPresAndThreatsDTOTOdeigmaOrnithopanidaXPresAndThreats(XPressThreat));
                }
            }

            return deigmaOrnithopanidaXPresAndThreatsDTOS;
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public DeigmaOrnithopanidaXPresAndThreatsDTO addDeigmaOrnithopanidaXPressAndThreats(DeigmaOrnithopanidaXPresAndThreatsDTO deigmaOrnithopanidaXPresAndThreatsDTO) {
        try {
            DeigmaOrnithopanidaXPresAndThreats deigmaOrnithopanidaXPresAndThreats = deigmaOrnithopanidaXPresAndThreatsMapper
                    .deigmaOrnithopanidaXPresAndThreatsTOdeigmaOrnithopanidaXPresAndThreatsDTO(deigmaOrnithopanidaXPresAndThreatsDTO);

            Optional<DeigmaOrnithopanida> optionalDeigmaOrnithopanida = deigmaOrnithopanidaRep
                    .findById(deigmaOrnithopanidaXPresAndThreatsDTO.getDeigmaornithopanidaID());

            // If Ct exists already
            if (deigmaOrnithopanidaXPresAndThreatsDTO.getCtActCode() != null){
                CTOrnithopanidaPressuresAndThreats ctOrnithopanidaPressuresAndThreats = ctOrnithopanidaPressuresAndThreatsRep
                        .findByActCodeEquals(deigmaOrnithopanidaXPresAndThreatsDTO.getCtActCode());

                if (ctOrnithopanidaPressuresAndThreats == null){
                    throw new RuntimeException("There was no ct Press Threat found with actCode of " + deigmaOrnithopanidaXPresAndThreatsDTO.getCtActCode());
                } else {
                    ctOrnithopanidaPressuresAndThreats.addXPressThreat(deigmaOrnithopanidaXPresAndThreats);
                }
            }

            if (optionalDeigmaOrnithopanida.isPresent()){
                optionalDeigmaOrnithopanida.get().addPressThreat(deigmaOrnithopanidaXPresAndThreats);
            } else {
                throw new RuntimeException("There was no deigmaOrnithopanida found with id of " + deigmaOrnithopanidaXPresAndThreatsDTO.getDeigmaornithopanidaID());
            }

            return deigmaOrnithopanidaXPresAndThreatsMapper.deigmaOrnithopanidaXPresAndThreatsDTOTOdeigmaOrnithopanidaXPresAndThreats(
                    deigmaOrnithopanidaXPresAndThreatsRep.save(deigmaOrnithopanidaXPresAndThreats));
        }catch (Exception e){
            throw e;
        }
    }
    @Override
    public boolean patchDeigmaOrnithopanidaXPresAndThreats(Long id, DeigmaOrnithopanidaXPresAndThreatsDTO deigmaOrnithopanidaXPresAndThreatsDTO) {
        try {
            Optional<DeigmaOrnithopanidaXPresAndThreats> optionalDeigmaOrnithopanidaXPresAndThreats = deigmaOrnithopanidaXPresAndThreatsRep.findById(id);

            if (optionalDeigmaOrnithopanidaXPresAndThreats.isPresent()){
                if (deigmaOrnithopanidaXPresAndThreatsDTO.getImportance() != null){
                    optionalDeigmaOrnithopanidaXPresAndThreats.get().setImportance(deigmaOrnithopanidaXPresAndThreatsDTO.getImportance());
                }
                if (deigmaOrnithopanidaXPresAndThreatsDTO.getType() != null){
                    optionalDeigmaOrnithopanidaXPresAndThreats.get().setType(deigmaOrnithopanidaXPresAndThreatsDTO.getType());
                }
                if (deigmaOrnithopanidaXPresAndThreatsDTO.getKodikos() != null){
                    optionalDeigmaOrnithopanidaXPresAndThreats.get().setKodikos(deigmaOrnithopanidaXPresAndThreatsDTO.getKodikos());
                }
                // If DeigmaOrnithopanidaId is not null and we need to change it (remove old from set add new to other DeigmaOrnithopanida set)
                if (deigmaOrnithopanidaXPresAndThreatsDTO.getDeigmaornithopanidaID() != null){

                    // If new exists : Finding the DeigmaOrnithopanida through the given Id to which Set we will add now
                    Optional<DeigmaOrnithopanida> newOptionalDeigmaOrnithopanida = deigmaOrnithopanidaRep.findById(deigmaOrnithopanidaXPresAndThreatsDTO.getDeigmaornithopanidaID());

                    // Adding onto the set and setting it on the XPressThreats side
                    if (newOptionalDeigmaOrnithopanida.isPresent()){
                        // Find the old DeigmaOrnithopanida to remove from it
                        Optional<DeigmaOrnithopanida> optionalDeigmaOrnithopanida = deigmaOrnithopanidaRep.findById(optionalDeigmaOrnithopanidaXPresAndThreats.get().getDeigmaOrnithopanida().getId());

                        if (optionalDeigmaOrnithopanida.isPresent()){
                            optionalDeigmaOrnithopanida.get().removeXPressThreats(optionalDeigmaOrnithopanidaXPresAndThreats.get());
                        } else {
                            throw new RuntimeException("The DeigmaOrnithopanida with id of " + optionalDeigmaOrnithopanidaXPresAndThreats.get().getDeigmaOrnithopanida().getId() + " was not found");
                        }
                        // Adding to the new after removing from the older one
                        newOptionalDeigmaOrnithopanida.get().addPressThreat(optionalDeigmaOrnithopanidaXPresAndThreats.get());
                    } else {
                        throw new RuntimeException("The DeigmaOrnithopanida with id of " + deigmaOrnithopanidaXPresAndThreatsDTO.getDeigmaornithopanidaID() + " was not found");
                    }
                }

                // If Ct is not null and we need to change it (remove old from set add new to other Ct set)
                if (deigmaOrnithopanidaXPresAndThreatsDTO.getCtActCode() != null){

                    // If new exists : Finding the Ct through the given actCode to which Set we will add now
                    CTOrnithopanidaPressuresAndThreats newOptionalCtOrnithopanidaPressThreat = ctOrnithopanidaPressuresAndThreatsRep.findByActCodeEquals(deigmaOrnithopanidaXPresAndThreatsDTO.getCtActCode());

                    // Adding onto the set and setting it on the XPressThreats side
                    if (newOptionalCtOrnithopanidaPressThreat != null){
                        // Find the old Ct to remove from it
                        Optional<CTOrnithopanidaPressuresAndThreats> optionalCTOrnithopanidaPressuresAndThreats = ctOrnithopanidaPressuresAndThreatsRep.findById(optionalDeigmaOrnithopanidaXPresAndThreats.get().getCtornithopanidaPressuresAndThreats().getId());

                        if (optionalCTOrnithopanidaPressuresAndThreats.isPresent()){
                            optionalCTOrnithopanidaPressuresAndThreats.get().removeXPressThreats(optionalDeigmaOrnithopanidaXPresAndThreats.get());
                        } else {
                            throw new RuntimeException("The CtPressThreats with actCode of " + optionalDeigmaOrnithopanidaXPresAndThreats.get().getCtornithopanidaPressuresAndThreats().getActCode() + " was not found");
                        }
                        // Adding to the new after removing from the older one
                        newOptionalCtOrnithopanidaPressThreat.addXPressThreat(optionalDeigmaOrnithopanidaXPresAndThreats.get());
                    } else {
                        throw new RuntimeException("The CtPressThreats with actCode of " + deigmaOrnithopanidaXPresAndThreatsDTO.getCtActCode() + " was not found");
                    }
                }
                // Saving-Patching to the db
                deigmaOrnithopanidaXPresAndThreatsRep.save(optionalDeigmaOrnithopanidaXPresAndThreats.get());
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean deleteDeigmaOrnithopanidaXPresAndThreats(Long id) {
        try {
            Optional<DeigmaOrnithopanidaXPresAndThreats> deigmaOrnithopanidaXPresAndThreats = deigmaOrnithopanidaXPresAndThreatsRep.findById(id);

            if (deigmaOrnithopanidaXPresAndThreats.isPresent()){
                // Deleting the requested DeigmaOrnithopanidaXSpecies
                deigmaOrnithopanidaXPresAndThreatsRep.delete(deigmaOrnithopanidaXPresAndThreats.get());

                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

}