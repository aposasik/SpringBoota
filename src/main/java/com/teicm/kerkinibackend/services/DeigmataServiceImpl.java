package com.teicm.kerkinibackend.services;

import com.teicm.kerkinibackend.domain.Deigmata;
import com.teicm.kerkinibackend.domain.Prwtokola;
import com.teicm.kerkinibackend.repositories.DeigmataRepository;
import com.teicm.kerkinibackend.repositories.DeigmataSearchRepository;
import com.teicm.kerkinibackend.repositories.PrwtokolaRepository;
import com.teicm.kerkinibackend.v1.models.DeigmataDTO;
import com.teicm.kerkinibackend.v1.models.DeigmataSearchDTO;
import com.teicm.kerkinibackend.v1.models.DeigmataSearchHelperDTO;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class DeigmataServiceImpl implements DeigmataService {

    @Autowired
    DeigmataRepository deigmataRepository;

    @Autowired
    PrwtokolaRepository prwtokolaRepository;

    @Autowired
    DeigmataSearchRepository deigmataSearchRepository;

    // For Mockito testing
    public void setDeigmataRepository(DeigmataRepository deigmataRepository) {
        this.deigmataRepository = deigmataRepository;
    }

    // For Mockito testing
    public void setPrwtokolaRepository(PrwtokolaRepository prwtokolaRepository) {
        this.prwtokolaRepository = prwtokolaRepository;
    }

    // For Mockito testing
    public void setDeigmataSearchRepository(DeigmataSearchRepository deigmataSearchRepository) {
        this.deigmataSearchRepository = deigmataSearchRepository;
    }

    @Override
    public Deigmata getById(Long id) {
        try {
            Optional<Deigmata> deigmataOptional = deigmataRepository.findById(id);

            if (deigmataOptional.isPresent()){
                return deigmataOptional.get();
            } else {
                return null;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean deleteDeigmata(Long id) {
        try {
            Optional<Deigmata> deigmata = deigmataRepository.findById(id);

            // If exists
            if (deigmata.isPresent()){
                // Deleting from db
                deigmataRepository.deleteById(deigmata.get().getId());

                return true;
            } else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public boolean patchDeigmata(Long id, DeigmataDTO deigmataDTO) {
        try {
            // Finding Deigmata object
            Optional<Deigmata> optionalDeigmata = deigmataRepository.findById(id);

            // If exists
            if (optionalDeigmata.isPresent()){
                if (deigmataDTO.getKwdikosPrwtokolou() != null){
                    // Finding the Prwtokola that is set to our Deigmata object to patch it
                    Optional<Prwtokola> optionalPrwtokola = prwtokolaRepository.findById(optionalDeigmata.get().getPrwtokola().getId());

                    // If exists
                    if (optionalPrwtokola.isPresent()){
                        // Remove Deigmata object from Prwtokola Set
                        optionalPrwtokola.get().removeDeigma(optionalDeigmata.get());

                        // Finding the new Prwtokola to be set onto the Deigmata and also to add into it the Deigmata through the addDeigma()
                        Optional<Prwtokola> newOptionalPrwtokola = prwtokolaRepository.findById(deigmataDTO.getKwdikosPrwtokolou());

                        if (newOptionalPrwtokola.isPresent()){
                            // Adding the Deigmata object to the Set of the specific Prwtokola object
                            newOptionalPrwtokola.get().addDeigma(optionalDeigmata.get());
                        } else {
                            throw new RuntimeException("Prwtokola with id of : " + deigmataDTO.getKwdikosPrwtokolou() + " was not found.");
                        }
                    } else {
                        throw new RuntimeException("Prwtokola with id of : " + optionalDeigmata.get().getPrwtokola().getId() + " was not found.");
                    }

                    // Patching the Deigmata (automatically also updating the Set of the two (older and newer) Prwtokola objects
                    deigmataRepository.save(optionalDeigmata.get());
                }

                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public Page<Deigmata> getAllByPaging(Integer page) {
        try {
            Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "id");
            return deigmataRepository.findAll(pageable);
        }catch (Exception e){
            throw e;
        }
    }



    @Deprecated
    @Override
    public Set<Deigmata> getDeigmataByPrwtokola(Long id) {
        try {
            // Finding the needed Prwtokolo through the given id
            Optional<Prwtokola> optionalPrwtokola = prwtokolaRepository.findById(id);

            // If Prwtokolo exists, get the Deigmata for the specified Prwtokolo and return
            if (optionalPrwtokola.isPresent()){
                return deigmataRepository.findDeigmataByPrwtokolaIs(optionalPrwtokola.get());
            }else {
                return null;
            }
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<BigInteger> getAutocompletes() {
        try {
            return deigmataRepository.findDistinctByPrwtokolaIdOrderByPrwtokolaId();
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public DeigmataSearchDTO searchDeigmata(List<SearchCriteria> searchCriteriaList, int size, int page, String sort) {
        try {
            return deigmataSearchRepository.searchDeigmata(searchCriteriaList, size, page, sort);
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public List<DeigmataSearchHelperDTO> downloadDeigmata(List<SearchCriteria> searchCriteriaList, String sort) {
        try {
            return deigmataSearchRepository.downloadDeigmata(searchCriteriaList, sort);
        }catch (Exception e){
            throw e;
        }
    }
}
