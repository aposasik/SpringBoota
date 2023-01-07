package com.teicm.kerkinibackend.services.ornithopanida;

import com.teicm.kerkinibackend.domain.*;
import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanida;
import com.teicm.kerkinibackend.repositories.DeigmataRepository;
import com.teicm.kerkinibackend.repositories.PrwtokolaRepository;
import com.teicm.kerkinibackend.repositories.ornithopanida.DeigmaOrnithopanidaRep;
import com.teicm.kerkinibackend.v1.mappers.ornithopanida.DeigmaOrnithopanidaMapper;
import com.teicm.kerkinibackend.v1.mappers.ornithopanida.DeigmaOrnithopanidaMapperImpl;
import com.teicm.kerkinibackend.v1.models.ornithopanida.DeigmaOrnithopanidaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DeigmaOrnithopanidaServiceImpl implements DeigmaOrnithopanidaService
{

    @Autowired
    private DeigmaOrnithopanidaRep deigmaOrnithopanidaRep;

    @Autowired
    private PrwtokolaRepository prwtokolaRepository;

    @Autowired
    private DeigmataRepository deigmataRepository;

    private DeigmaOrnithopanidaMapper deigmaOrnithopanidaMapper = new DeigmaOrnithopanidaMapperImpl();

    public DeigmaOrnithopanidaServiceImpl(DeigmaOrnithopanidaRep deigmaOrnithopanidaRep)
    {
        this.deigmaOrnithopanidaRep = deigmaOrnithopanidaRep;
    }

    public void setPrwtokolaRepository(PrwtokolaRepository prwtokolaRepository) {
        this.prwtokolaRepository = prwtokolaRepository;
    }

    public void setDeigmataRepository(DeigmataRepository deigmataRepository) {
        this.deigmataRepository = deigmataRepository;
    }

    @Override
    public DeigmaOrnithopanida addDeigmaOrnithopanida(DeigmaOrnithopanidaDTO deigmaOrnithopanidaDTO) {
        // Creating the Deigmata
        Deigmata deigmata = new Deigmata();

        // Find Prwtokola with specified Id to set it onto Deigmata
        Optional<Prwtokola> prwtokola = prwtokolaRepository.findById(deigmaOrnithopanidaDTO.getPrwtokolaId());
        if (prwtokola.isPresent()){
            prwtokola.get().addDeigma(deigmata);
        } else {
            throw new RuntimeException("There was no Prwtokola found with id of " + deigmaOrnithopanidaDTO.getPrwtokolaId());
        }

        // Creating the DeigmaOrnithopanida
        DeigmaOrnithopanida deigmaOrnithopanida = deigmaOrnithopanidaMapper.deigmaOrnithopanidaTOdeigmaOrnithopanidaDTO(deigmaOrnithopanidaDTO);

        // Setting the DeigmaOrnithopanida onto the Deigmata and vice-versa
        deigmaOrnithopanida.setDeigmata(deigmata);
        deigmata.setDeigmaOrnithopanida(deigmaOrnithopanida);

        // Saving the Deigmata to the db (automatically we also save the DeigmaOrnithopanida through cascading)
        Deigmata savedDeigmata = deigmataRepository.save(deigmata);

        // Returning the saved DeigmaOrnithopanida
        return deigmaOrnithopanidaRep.findDeigmaOrnithopanidaById(savedDeigmata.getDeigmaOrnithopanida().getId());
    }
    @Override
    public boolean patchDeigmaOrnithopanida(Long id, DeigmaOrnithopanidaDTO deigmaOrnithopanidaDTO) {
        try {
            Optional<DeigmaOrnithopanida> optionalDeigmaOrnithopanida = deigmaOrnithopanidaRep.findById(id);

            if (optionalDeigmaOrnithopanida.isPresent()){
                if (deigmaOrnithopanidaDTO.getParatiriseis() != null){
                    optionalDeigmaOrnithopanida.get().setParatiriseis(deigmaOrnithopanidaDTO.getParatiriseis());
                }
                if (deigmaOrnithopanidaDTO.getXegsa() != null){
                    optionalDeigmaOrnithopanida.get().setXegsa(deigmaOrnithopanidaDTO.getXegsa());
                }
                if (deigmaOrnithopanidaDTO.getYegsa() != null){
                    optionalDeigmaOrnithopanida.get().setYegsa(deigmaOrnithopanidaDTO.getYegsa());
                }
                if (deigmaOrnithopanidaDTO.getGridCell() != null){
                    optionalDeigmaOrnithopanida.get().setGridCell(deigmaOrnithopanidaDTO.getGridCell());
                }
                if (deigmaOrnithopanidaDTO.getAltitude() != null){
                    optionalDeigmaOrnithopanida.get().setAltitude(deigmaOrnithopanidaDTO.getAltitude());
                }
                if (deigmaOrnithopanidaDTO.getAltitudet() != null){
                    optionalDeigmaOrnithopanida.get().setAltitudet(deigmaOrnithopanidaDTO.getAltitudet());
                }
                if (deigmaOrnithopanidaDTO.getDate() != null){
                    optionalDeigmaOrnithopanida.get().setDate(deigmaOrnithopanidaDTO.getDate());
                }
                if (deigmaOrnithopanidaDTO.getEntasiAnemou() != null){
                    optionalDeigmaOrnithopanida.get().setEntasiAnemou(deigmaOrnithopanidaDTO.getEntasiAnemou());
                }
                if (deigmaOrnithopanidaDTO.getFile() != null){
                    optionalDeigmaOrnithopanida.get().setFile(deigmaOrnithopanidaDTO.getFile());
                }
                if (deigmaOrnithopanidaDTO.getHabitat() != null){
                    optionalDeigmaOrnithopanida.get().setHabitat(deigmaOrnithopanidaDTO.getHabitat());
                }
                if (deigmaOrnithopanidaDTO.getKalypsi() != null){
                    optionalDeigmaOrnithopanida.get().setKalypsi(deigmaOrnithopanidaDTO.getKalypsi());
                }
                if (deigmaOrnithopanidaDTO.getNomos() != null){
                    optionalDeigmaOrnithopanida.get().setNomos(deigmaOrnithopanidaDTO.getNomos());
                }
                if (deigmaOrnithopanidaDTO.getKateuthinsiAnemou() != null){
                    optionalDeigmaOrnithopanida.get().setKateuthinsiAnemou(deigmaOrnithopanidaDTO.getKateuthinsiAnemou());
                }
                if (deigmaOrnithopanidaDTO.getKateuthinsiAnemouAzim() != null){
                    optionalDeigmaOrnithopanida.get().setKateuthinsiAnemouAzim(deigmaOrnithopanidaDTO.getKateuthinsiAnemouAzim());
                }
                if (deigmaOrnithopanidaDTO.getKodikosDeigmatolipsias() != null){
                    optionalDeigmaOrnithopanida.get().setKodikosDeigmatolipsias(deigmaOrnithopanidaDTO.getKodikosDeigmatolipsias());
                }
                if (deigmaOrnithopanidaDTO.getKodikosNatura() != null){
                    optionalDeigmaOrnithopanida.get().setKodikosNatura(deigmaOrnithopanidaDTO.getKodikosNatura());
                }
                if (deigmaOrnithopanidaDTO.getKyriarxosTyposVlastisis() != null){
                    optionalDeigmaOrnithopanida.get().setKyriarxosTyposVlastisis(deigmaOrnithopanidaDTO.getKyriarxosTyposVlastisis());
                }
                if (deigmaOrnithopanidaDTO.getLatitude() != null){
                optionalDeigmaOrnithopanida.get().setLatitude(deigmaOrnithopanidaDTO.getLatitude());
                }
                if (deigmaOrnithopanidaDTO.getLocality() != null) {
                    optionalDeigmaOrnithopanida.get().setLocality(deigmaOrnithopanidaDTO.getLocality());
                }
                if (deigmaOrnithopanidaDTO.getLongitude() != null) {
                optionalDeigmaOrnithopanida.get().setLongitude(deigmaOrnithopanidaDTO.getLongitude());
                }
                if (deigmaOrnithopanidaDTO.getLongitudet() != null) {
                optionalDeigmaOrnithopanida.get().setLongitudet(deigmaOrnithopanidaDTO.getLongitudet());
                }
                if (deigmaOrnithopanidaDTO.getMethodos() != null) {
                optionalDeigmaOrnithopanida.get().setMethodos(deigmaOrnithopanidaDTO.getMethodos());
                }
                if (deigmaOrnithopanidaDTO.getLatitudet()!= null) {
                    optionalDeigmaOrnithopanida.get().setLatitudet(deigmaOrnithopanidaDTO.getLatitudet());
                }
                if (deigmaOrnithopanidaDTO.getNefoseis() != null) {
                    optionalDeigmaOrnithopanida.get().setNefoseis(deigmaOrnithopanidaDTO.getNefoseis());
                }
                if (deigmaOrnithopanidaDTO.getPhoto() != null) {
                    optionalDeigmaOrnithopanida.get().setPhoto(deigmaOrnithopanidaDTO.getPhoto());
                }
                if (deigmaOrnithopanidaDTO.getPoiotita() != null) {
                    optionalDeigmaOrnithopanida.get().setPoiotita(deigmaOrnithopanidaDTO.getPoiotita());
                }
                if (deigmaOrnithopanidaDTO.getPuknotita() != null) {
                    optionalDeigmaOrnithopanida.get().setPuknotita(deigmaOrnithopanidaDTO.getPuknotita());
                }
                if (deigmaOrnithopanidaDTO.getResearcher() != null) {
                    optionalDeigmaOrnithopanida.get().setResearcher(deigmaOrnithopanidaDTO.getResearcher());
                }
                if (deigmaOrnithopanidaDTO.getThermokrasia() != null) {
                    optionalDeigmaOrnithopanida.get().setThermokrasia(deigmaOrnithopanidaDTO.getThermokrasia());
                }
                if (deigmaOrnithopanidaDTO.getTime() != null) {
                    optionalDeigmaOrnithopanida.get().setTime(deigmaOrnithopanidaDTO.getTime());
                }
                if (deigmaOrnithopanidaDTO.getXegsat() != null) {
                    optionalDeigmaOrnithopanida.get().setXegsat(deigmaOrnithopanidaDTO.getXegsat());
                }
                if (deigmaOrnithopanidaDTO.getXrimatodotikoMeso() != null) {
                    optionalDeigmaOrnithopanida.get().setXrimatodotikoMeso(deigmaOrnithopanidaDTO.getXrimatodotikoMeso());
                }
                if (deigmaOrnithopanidaDTO.getYegsat() != null) {
                    optionalDeigmaOrnithopanida.get().setYegsat(deigmaOrnithopanidaDTO.getYegsat());
                }
                if (deigmaOrnithopanidaDTO.getYpsosVlastisis() != null) {
                    optionalDeigmaOrnithopanida.get().setYpsosVlastisis(deigmaOrnithopanidaDTO.getYpsosVlastisis());
                }
                deigmaOrnithopanidaRep.save(optionalDeigmaOrnithopanida.get());

                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }
    @Override
    public boolean deleteDeigmaOrnithopanida(Long id) {
        try {
            Optional<DeigmaOrnithopanida> optionalDeigmaOrnithopanida = deigmaOrnithopanidaRep.findById(id);

            if (optionalDeigmaOrnithopanida.isPresent()){
                deigmaOrnithopanidaRep.delete(optionalDeigmaOrnithopanida.get());
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            throw e;
        }
    }
    @Override
    public Page<DeigmaOrnithopanida> getAllByPaging(Integer page) {
        try {
            Pageable pageable = PageRequest.of(page, 10, Sort.Direction.DESC, "id");
            return deigmaOrnithopanidaRep.findAll(pageable);
        }catch (Exception e){
            throw e;
        }
    }
    @Override
    public List<DeigmaOrnithopanida> findAll()
    {
        return deigmaOrnithopanidaRep.findAll();
    }

    @Override
    public DeigmaOrnithopanida findById(Long id)
    {
       Optional<DeigmaOrnithopanida> optional = deigmaOrnithopanidaRep.findById(id);
        return optional.orElse(null);
    }
}
