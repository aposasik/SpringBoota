package com.teicm.kerkinibackend.v1.mappers.ornithopanida;

import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanidaXSpecies;
import com.teicm.kerkinibackend.v1.models.ornithopanida.DeigmaOrnithopanidaXSpeciesAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.ornithopanida.DeigmaOrnithopanidaXSpeciesDTO;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component
public class DeigmaOrnithopanidaXSpeciesMapperImpl implements DeigmaOrnithopanidaXSpeciesMapper {
    @Override
    public DeigmaOrnithopanidaXSpecies deigmaOrnithopanidaXSpeciesTOdeigmaOrnithopanidaXSpeciesDTO(
            DeigmaOrnithopanidaXSpeciesDTO deigmaOrnithopanidaXSpeciesDTO) {
        if (deigmaOrnithopanidaXSpeciesDTO == null) {
            return null;
        }
        DeigmaOrnithopanidaXSpecies deigmaOrnithopanidaXSpecies = new DeigmaOrnithopanidaXSpecies();

        // deigmaOrnithopanidaXSpecies.setAadeigmatos(deigmaOrnithopanidaXSpeciesDTO.getAadeigmatos());
        deigmaOrnithopanidaXSpecies.setOra(deigmaOrnithopanidaXSpeciesDTO.getOra());
        deigmaOrnithopanidaXSpecies.setXegsa(deigmaOrnithopanidaXSpeciesDTO.getXegsa());
        deigmaOrnithopanidaXSpecies.setYegsa(deigmaOrnithopanidaXSpeciesDTO.getYegsa());
        deigmaOrnithopanidaXSpecies.setFulo(deigmaOrnithopanidaXSpeciesDTO.getFulo());
        deigmaOrnithopanidaXSpecies.setHlikia(deigmaOrnithopanidaXSpeciesDTO.getHlikia());
        deigmaOrnithopanidaXSpecies.setArithmosatomon(deigmaOrnithopanidaXSpeciesDTO.getArithmosatomon());
        deigmaOrnithopanidaXSpecies.setParatiriseis(deigmaOrnithopanidaXSpeciesDTO.getParatiriseis());
        deigmaOrnithopanidaXSpecies.setEkpar1(deigmaOrnithopanidaXSpeciesDTO.getEkpar1());
        deigmaOrnithopanidaXSpecies.setEkpar2(deigmaOrnithopanidaXSpeciesDTO.getEkpar2());
        deigmaOrnithopanidaXSpecies.setEkpar3(deigmaOrnithopanidaXSpeciesDTO.getEkpar3());
        deigmaOrnithopanidaXSpecies.setAttitude(deigmaOrnithopanidaXSpeciesDTO.getAttitude());
        deigmaOrnithopanidaXSpecies.setTyposparatiriseis(deigmaOrnithopanidaXSpeciesDTO.getTyposparatiriseis());
        deigmaOrnithopanidaXSpecies.setKodikos(deigmaOrnithopanidaXSpeciesDTO.getKodikos());

        return deigmaOrnithopanidaXSpecies;
    }

    @Override
    public DeigmaOrnithopanidaXSpeciesDTO deigmaOrnithopanidaXSpeciesDTOTOdeigmaOrnithopanidaXSpecies(
            DeigmaOrnithopanidaXSpecies deigmaOrnithopanidaXSpecies) {
        if (deigmaOrnithopanidaXSpecies == null) {
            return null;
        }
        DeigmaOrnithopanidaXSpeciesDTO deigmaOrnithopanidaXSpeciesDTO = new DeigmaOrnithopanidaXSpeciesDTO();

        deigmaOrnithopanidaXSpeciesDTO.setId(deigmaOrnithopanidaXSpecies.getId());
        deigmaOrnithopanidaXSpeciesDTO
                .setDeigmataOrnithopanidasId(deigmaOrnithopanidaXSpecies.getDeigmaOrnithopanida().getId());
        deigmaOrnithopanidaXSpeciesDTO.setCtEidos(deigmaOrnithopanidaXSpecies.getCtornithopanidaEidi().getEidos());
        // deigmaOrnithopanidaXSpeciesDTO.setAadeigmatos(deigmaOrnithopanidaXSpecies.getAadeigmatos());
        deigmaOrnithopanidaXSpeciesDTO.setOra(deigmaOrnithopanidaXSpecies.getOra());
        deigmaOrnithopanidaXSpeciesDTO.setXegsa(deigmaOrnithopanidaXSpecies.getXegsa());
        deigmaOrnithopanidaXSpeciesDTO.setYegsa(deigmaOrnithopanidaXSpecies.getYegsa());
        deigmaOrnithopanidaXSpeciesDTO.setFulo(deigmaOrnithopanidaXSpecies.getFulo());
        deigmaOrnithopanidaXSpeciesDTO.setHlikia(deigmaOrnithopanidaXSpecies.getHlikia());
        deigmaOrnithopanidaXSpeciesDTO.setArithmosatomon(deigmaOrnithopanidaXSpecies.getArithmosatomon());
        deigmaOrnithopanidaXSpeciesDTO.setParatiriseis(deigmaOrnithopanidaXSpecies.getParatiriseis());
        deigmaOrnithopanidaXSpeciesDTO.setEkpar1(deigmaOrnithopanidaXSpecies.getEkpar1());
        deigmaOrnithopanidaXSpeciesDTO.setEkpar2(deigmaOrnithopanidaXSpecies.getEkpar2());
        deigmaOrnithopanidaXSpeciesDTO.setEkpar3(deigmaOrnithopanidaXSpecies.getEkpar3());
        deigmaOrnithopanidaXSpeciesDTO.setAttitude(deigmaOrnithopanidaXSpecies.getAttitude());
        deigmaOrnithopanidaXSpeciesDTO.setTyposparatiriseis(deigmaOrnithopanidaXSpecies.getTyposparatiriseis());
        deigmaOrnithopanidaXSpeciesDTO.setKodikos(deigmaOrnithopanidaXSpecies.getKodikos());

        return deigmaOrnithopanidaXSpeciesDTO;

    }

    @Override
    public DeigmaOrnithopanidaXSpeciesAutocompletesDTO mapListsToDeigmaOrnithopanidaXSpeciesAutocompletesDTO(
            ArrayList<Long> deigmataOrnithopanidasidList, ArrayList<String> CtkodikoseidosList,
            ArrayList<Long> kodikosList, ArrayList<Long> aadeigmatosList, ArrayList<String> fuloList,
            ArrayList<String> hliakiaList, ArrayList<String> arithmosatomonList) {
        try {
            DeigmaOrnithopanidaXSpeciesAutocompletesDTO deigmaOrnithopanidaXSpeciesAutocompletesDTO = new DeigmaOrnithopanidaXSpeciesAutocompletesDTO();

            deigmaOrnithopanidaXSpeciesAutocompletesDTO.setDeigmataOrnithopanidasidList(deigmataOrnithopanidasidList);
            deigmaOrnithopanidaXSpeciesAutocompletesDTO.setAadeigmatosList(aadeigmatosList);
            deigmaOrnithopanidaXSpeciesAutocompletesDTO.setArithmosatomonList(arithmosatomonList);
            deigmaOrnithopanidaXSpeciesAutocompletesDTO.setCtkodikoseidosList(CtkodikoseidosList);
            deigmaOrnithopanidaXSpeciesAutocompletesDTO.setFuloList(fuloList);
            deigmaOrnithopanidaXSpeciesAutocompletesDTO.setHliakiaList(hliakiaList);
            deigmaOrnithopanidaXSpeciesAutocompletesDTO.setKodikosList(kodikosList);

            return deigmaOrnithopanidaXSpeciesAutocompletesDTO;
        } catch (Exception e) {
            throw e;
        }
    }
}