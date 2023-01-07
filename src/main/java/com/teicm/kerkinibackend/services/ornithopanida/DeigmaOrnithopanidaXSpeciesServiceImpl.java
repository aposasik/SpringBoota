package com.teicm.kerkinibackend.services.ornithopanida;

import com.teicm.kerkinibackend.domain.ornithopanida.CTOrnithopanidaEidi;
import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanida;
import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanidaXSpecies;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXEidh;
import com.teicm.kerkinibackend.repositories.ornithopanida.CTOrnithopanidaEidiRep;
import com.teicm.kerkinibackend.repositories.ornithopanida.DeigmaOrnithopanidaRep;
import com.teicm.kerkinibackend.repositories.ornithopanida.DeigmaOrnithopanidaXSpeciesRep;
import com.teicm.kerkinibackend.v1.mappers.ornithopanida.DeigmaOrnithopanidaXSpeciesMapper;
import com.teicm.kerkinibackend.v1.mappers.ornithopanida.DeigmaOrnithopanidaXSpeciesMapperImpl;
import com.teicm.kerkinibackend.v1.models.ornithopanida.DeigmaOrnithopanidaXSpeciesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Component
public class DeigmaOrnithopanidaXSpeciesServiceImpl implements DeigmaOrnithopanidaXSpeciesService
{

    private DeigmaOrnithopanidaXSpeciesMapperImpl deigmaOrnithopanidaXSpeciesMapper = new DeigmaOrnithopanidaXSpeciesMapperImpl();

    @Autowired
    private DeigmaOrnithopanidaXSpeciesRep deigmaOrnithopanidaXSpeciesRep;

    @Autowired
    private DeigmaOrnithopanidaRep deigmaOrnithopanidaRep;

    @Autowired
    private CTOrnithopanidaEidiRep ctOrnithopanidaEidiRep;

    public DeigmaOrnithopanidaXSpeciesServiceImpl(DeigmaOrnithopanidaXSpeciesMapperImpl deigmaOrnithopanidaXSpeciesMapper, DeigmaOrnithopanidaXSpeciesRep deigmaOrnithopanidaXSpeciesRep)
    {
        this.deigmaOrnithopanidaXSpeciesMapper = deigmaOrnithopanidaXSpeciesMapper;
        this.deigmaOrnithopanidaXSpeciesRep = deigmaOrnithopanidaXSpeciesRep;
    }


    @Override
    public Set<DeigmaOrnithopanidaXSpeciesDTO> getDeigmaOrnithopanidaXSpeciesByDeigmaOrnithopanidaIs(Long id) {
        try {
            // Finding the needed DeigmaOrnithopanida through the given Id
            Optional<DeigmaOrnithopanida> optionalDeigmaOrnithopanida = deigmaOrnithopanidaRep.findById(id);

            // Initializing the Set<DTOs>
            Set<DeigmaOrnithopanidaXSpeciesDTO> deigmaOrnithopanidaXSpeciesDTOS = new HashSet<>();

            // Asking for the desired data and mapping them into DTOs (for the 2 extra fields)
            if (optionalDeigmaOrnithopanida.isPresent()){
                for (DeigmaOrnithopanidaXSpecies XSpecies:
                        deigmaOrnithopanidaXSpeciesRep.findDeigmaOrnithopanidaXSpeciesByDeigmaOrnithopanidaIs(optionalDeigmaOrnithopanida.get())) {

                    deigmaOrnithopanidaXSpeciesDTOS.add(deigmaOrnithopanidaXSpeciesMapper
                            .deigmaOrnithopanidaXSpeciesDTOTOdeigmaOrnithopanidaXSpecies(XSpecies));
                }
            }

            return deigmaOrnithopanidaXSpeciesDTOS;
        }catch (Exception e){
            throw e;
        }

    }

    @Override
    public DeigmaOrnithopanidaXSpeciesDTO addDeigmaOrnithopanidaXSpecies(DeigmaOrnithopanidaXSpeciesDTO deigmaOrnithopanidaXSpeciesDTO) {
        try {
            // Generating the new XSpecies
            DeigmaOrnithopanidaXSpecies deigmaOrnithopanidaXSpecies = deigmaOrnithopanidaXSpeciesMapper
                    .deigmaOrnithopanidaXSpeciesTOdeigmaOrnithopanidaXSpeciesDTO(deigmaOrnithopanidaXSpeciesDTO);

            // Getting the DeigmaOrnithopanida by Id
            Optional<DeigmaOrnithopanida> optionalDeigmaOrnithopanida = deigmaOrnithopanidaRep
                    .findById(deigmaOrnithopanidaXSpeciesDTO.getDeigmataOrnithopanidasId());

            // Getting the Ct with the specified `Ctkodikoseidos`
            if (deigmaOrnithopanidaXSpeciesDTO.getCtEidos() != null){
                CTOrnithopanidaEidi ctOrnithopanidaEidi = ctOrnithopanidaEidiRep.findByEidosEquals(deigmaOrnithopanidaXSpeciesDTO.getCtEidos());

                if (ctOrnithopanidaEidi == null){
                    throw new RuntimeException("There was no Ct Eidos found with eidos of " + deigmaOrnithopanidaXSpeciesDTO.getCtEidos());
                }
                // Updating (adding the new XEidos)
                ctOrnithopanidaEidi.addXEidos(deigmaOrnithopanidaXSpecies);
            }

            // Updating the DeigmaOrnithopanida with the new XEidos
            if (optionalDeigmaOrnithopanida.isPresent()){
                optionalDeigmaOrnithopanida.get().addXEidos(deigmaOrnithopanidaXSpecies);
            } else {
                throw new RuntimeException("There was no deigmaOrnithopanida found with id of " + deigmaOrnithopanidaXSpeciesDTO.getDeigmataOrnithopanidasId());
            }

            // Saving the new XEidos to the db with the connections, then the XEidos that returns we map it to a DTO (to add two fields) and return it.
            return deigmaOrnithopanidaXSpeciesMapper.deigmaOrnithopanidaXSpeciesDTOTOdeigmaOrnithopanidaXSpecies(
                    deigmaOrnithopanidaXSpeciesRep.save(deigmaOrnithopanidaXSpecies));
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean deleteDeigmaOrnithopanidaXSpecies(Long id) {
        try {
            // If it exists
            Optional<DeigmaOrnithopanidaXSpecies> deigmaOrnithopanidaXSpecies = deigmaOrnithopanidaXSpeciesRep.findById(id);

            if (deigmaOrnithopanidaXSpecies.isPresent()){
                // Deleting the requested DeigmaOrnithopanidaXSpecies
                deigmaOrnithopanidaXSpeciesRep.delete(deigmaOrnithopanidaXSpecies.get());

                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public DeigmaOrnithopanidaXSpecies getById(Long id) {
        try {
            Optional<DeigmaOrnithopanidaXSpecies> deigmaOrnithopanidaXSpeciesOptional = deigmaOrnithopanidaXSpeciesRep
                    .findById(id);

            if (deigmaOrnithopanidaXSpeciesOptional.isPresent()){
                return deigmaOrnithopanidaXSpeciesOptional.get();
            } else {
                return null;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean patchDeigmaOrnithopanidaXspecies(Long id, DeigmaOrnithopanidaXSpeciesDTO deigmaOrnithopanidaXSpeciesDTO) {
        try {
            Optional<DeigmaOrnithopanidaXSpecies> optionalDeigmaOrnithopanidaXSpecies = deigmaOrnithopanidaXSpeciesRep.findById(id);

            if (optionalDeigmaOrnithopanidaXSpecies.isPresent()){
                if (deigmaOrnithopanidaXSpeciesDTO.getArithmosatomon() != null){
                    optionalDeigmaOrnithopanidaXSpecies.get().setArithmosatomon(deigmaOrnithopanidaXSpeciesDTO.getArithmosatomon());
                }
                if (deigmaOrnithopanidaXSpeciesDTO.getAttitude() != null){
                    optionalDeigmaOrnithopanidaXSpecies.get().setAttitude(deigmaOrnithopanidaXSpeciesDTO.getAttitude());
                }
                if (deigmaOrnithopanidaXSpeciesDTO.getEkpar1() != null){
                    optionalDeigmaOrnithopanidaXSpecies.get().setEkpar1(deigmaOrnithopanidaXSpeciesDTO.getEkpar1());
                }
                if (deigmaOrnithopanidaXSpeciesDTO.getEkpar2() != null){
                    optionalDeigmaOrnithopanidaXSpecies.get().setEkpar2(deigmaOrnithopanidaXSpeciesDTO.getEkpar2());
                }
                if (deigmaOrnithopanidaXSpeciesDTO.getEkpar3() != null){
                    optionalDeigmaOrnithopanidaXSpecies.get().setEkpar3(deigmaOrnithopanidaXSpeciesDTO.getEkpar3());
                }
                if (deigmaOrnithopanidaXSpeciesDTO.getFulo() != null){
                    optionalDeigmaOrnithopanidaXSpecies.get().setFulo(deigmaOrnithopanidaXSpeciesDTO.getFulo());
                }
                if (deigmaOrnithopanidaXSpeciesDTO.getHlikia() != null){
                    optionalDeigmaOrnithopanidaXSpecies.get().setHlikia(deigmaOrnithopanidaXSpeciesDTO.getHlikia());
                }
                if (deigmaOrnithopanidaXSpeciesDTO.getKodikos() != null){
                    optionalDeigmaOrnithopanidaXSpecies.get().setKodikos(deigmaOrnithopanidaXSpeciesDTO.getKodikos());
                }
                if (deigmaOrnithopanidaXSpeciesDTO.getOra() != null){
                    optionalDeigmaOrnithopanidaXSpecies.get().setOra(deigmaOrnithopanidaXSpeciesDTO.getOra());
                }
                if (deigmaOrnithopanidaXSpeciesDTO.getParatiriseis() != null){
                    optionalDeigmaOrnithopanidaXSpecies.get().setParatiriseis(deigmaOrnithopanidaXSpeciesDTO.getParatiriseis());
                }
                if (deigmaOrnithopanidaXSpeciesDTO.getTyposparatiriseis() != null){
                    optionalDeigmaOrnithopanidaXSpecies.get().setTyposparatiriseis(deigmaOrnithopanidaXSpeciesDTO.getTyposparatiriseis());
                }
                if (deigmaOrnithopanidaXSpeciesDTO.getXegsa() != null){
                    optionalDeigmaOrnithopanidaXSpecies.get().setXegsa(deigmaOrnithopanidaXSpeciesDTO.getXegsa());
                }
                if (deigmaOrnithopanidaXSpeciesDTO.getYegsa() != null){
                    optionalDeigmaOrnithopanidaXSpecies.get().setYegsa(deigmaOrnithopanidaXSpeciesDTO.getYegsa());
                }
                if (deigmaOrnithopanidaXSpeciesDTO.getDeigmataOrnithopanidasId() != null){
                    // Checking if the new DeigmaOrnithopanida exists
                    Optional<DeigmaOrnithopanida> newOptionalDeigmaOrnithopanida = deigmaOrnithopanidaRep.findById(deigmaOrnithopanidaXSpeciesDTO.getDeigmataOrnithopanidasId());

                    if (newOptionalDeigmaOrnithopanida.isPresent()){
                        // Finding the older one to prepare remove of XEidos from Set
                        Optional<DeigmaOrnithopanida> optionalDeigmaOrnithopanida = deigmaOrnithopanidaRep.findById(optionalDeigmaOrnithopanidaXSpecies.get().getDeigmaOrnithopanida().getId());

                        // Removing from Set
                        if (optionalDeigmaOrnithopanida.isPresent()){
                            optionalDeigmaOrnithopanida.get().removeXEidos(optionalDeigmaOrnithopanidaXSpecies.get());
                        } else {
                            throw new RuntimeException("The DeigmaOrnithopanida with id of " + optionalDeigmaOrnithopanidaXSpecies.get().getDeigmaOrnithopanida().getId() + " was not found");
                        }
                        // Adding it to the new DeigmaOrnithopanida Set and setting it onto it
                        newOptionalDeigmaOrnithopanida.get().addXEidos(optionalDeigmaOrnithopanidaXSpecies.get());
                    } else {
                        throw new RuntimeException("The DeigmaOrnithopanida with id of " + deigmaOrnithopanidaXSpeciesDTO.getDeigmataOrnithopanidasId() + " was not found");
                    }
                }
                if (deigmaOrnithopanidaXSpeciesDTO.getCtEidos() != null){
                    // Checking if the new Ct exists
                    CTOrnithopanidaEidi newOptionalCTOrnithopanidaEidi = ctOrnithopanidaEidiRep.findByEidosEquals(deigmaOrnithopanidaXSpeciesDTO.getCtEidos());

                    if (newOptionalCTOrnithopanidaEidi != null){
                        // Finding the older one to prepare remove of XEidos from Set
                        Optional<CTOrnithopanidaEidi> optionalCTOrnithopanidaEidi = ctOrnithopanidaEidiRep.findById(optionalDeigmaOrnithopanidaXSpecies.get().getCtornithopanidaEidi().getId());

                        //Removing from Set
                        if (optionalCTOrnithopanidaEidi.isPresent()){
                            optionalCTOrnithopanidaEidi.get().removeXEidos(optionalDeigmaOrnithopanidaXSpecies.get());
                        } else {
                            throw new RuntimeException("The CTOrnithopanidaEidi with eidos of " + deigmaOrnithopanidaXSpeciesDTO.getCtEidos() + " was not found");
                        }
                        // Adding it to the new Ct Set and setting it onto it
                        newOptionalCTOrnithopanidaEidi.addXEidos(optionalDeigmaOrnithopanidaXSpecies.get());
                    } else {
                        throw new RuntimeException("The CTOrnithopanidaEidi with eidos of " + optionalDeigmaOrnithopanidaXSpecies.get().getCtornithopanidaEidi().getEidos() + " was not found");
                    }
                }
                deigmaOrnithopanidaXSpeciesRep.save(optionalDeigmaOrnithopanidaXSpecies.get());
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }
    @Override
    public Page<DeigmaOrnithopanidaXSpecies> getAllByPaging(Integer page) {
        try {
            Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "id");
            return deigmaOrnithopanidaXSpeciesRep.findAll(pageable);
        }catch (Exception e){
            throw e;
        }
    }
}