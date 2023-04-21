package com.teicm.kerkinibackend.v1.mappers.ornithopanida;

import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanidaXPresAndThreats;
import com.teicm.kerkinibackend.v1.models.ornithopanida.DeigmaOrnithopanidaXPresAndThreatsAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.ornithopanida.DeigmaOrnithopanidaXPresAndThreatsDTO;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component
public class DeigmaOrnithopanidaXPresAndThreatsMapperImpl implements DeigmaOrnithopanidaXPresAndThreatsMapper
{
    @Override
    public DeigmaOrnithopanidaXPresAndThreats deigmaOrnithopanidaXPresAndThreatsTOdeigmaOrnithopanidaXPresAndThreatsDTO(DeigmaOrnithopanidaXPresAndThreatsDTO deigmaOrnithopanidaXPresAndThreatsDTO)
    {
        if (deigmaOrnithopanidaXPresAndThreatsDTO == null) {
            return null;
        }
        DeigmaOrnithopanidaXPresAndThreats deigmaOrnithopanidaXPresAndThreats = new DeigmaOrnithopanidaXPresAndThreats();

        deigmaOrnithopanidaXPresAndThreats.setRelevenr(deigmaOrnithopanidaXPresAndThreatsDTO.getReleve_NR());
        deigmaOrnithopanidaXPresAndThreats.setType(deigmaOrnithopanidaXPresAndThreatsDTO.getType());
        deigmaOrnithopanidaXPresAndThreats.setImportance(deigmaOrnithopanidaXPresAndThreatsDTO.getImportance());
        deigmaOrnithopanidaXPresAndThreats.setKodikos(deigmaOrnithopanidaXPresAndThreatsDTO.getKodikos());

        return deigmaOrnithopanidaXPresAndThreats;
    }

    @Override
    public DeigmaOrnithopanidaXPresAndThreatsDTO deigmaOrnithopanidaXPresAndThreatsDTOTOdeigmaOrnithopanidaXPresAndThreats(DeigmaOrnithopanidaXPresAndThreats deigmaOrnithopanidaXPresAndThreats) {
        if ( deigmaOrnithopanidaXPresAndThreats == null ) {
            return null;
        }

        DeigmaOrnithopanidaXPresAndThreatsDTO deigmaOrnithopanidaXPresAndThreatsDTO = new DeigmaOrnithopanidaXPresAndThreatsDTO();

        deigmaOrnithopanidaXPresAndThreatsDTO.setId(deigmaOrnithopanidaXPresAndThreats.getId());

        deigmaOrnithopanidaXPresAndThreatsDTO.setCtActCode(deigmaOrnithopanidaXPresAndThreats.getCtornithopanidaPressuresAndThreats().getActCode());
        deigmaOrnithopanidaXPresAndThreatsDTO.setDeigmaornithopanidaID(deigmaOrnithopanidaXPresAndThreats.getDeigmaOrnithopanida().getId());
        deigmaOrnithopanidaXPresAndThreatsDTO.setKodikos( deigmaOrnithopanidaXPresAndThreats.getKodikos() );
        deigmaOrnithopanidaXPresAndThreatsDTO.setReleve_NR( deigmaOrnithopanidaXPresAndThreats.getRelevenr() );
   //     deigmaOrnithopanidaXPresAndThreatsDTO.setACT_Code( deigmaOrnithopanidaXPresAndThreats.getCtornithopanidaPressuresAndThreats().getActCode());
        deigmaOrnithopanidaXPresAndThreatsDTO.setType( deigmaOrnithopanidaXPresAndThreats.getType() );
        deigmaOrnithopanidaXPresAndThreatsDTO.setImportance( deigmaOrnithopanidaXPresAndThreats.getImportance() );

        return deigmaOrnithopanidaXPresAndThreatsDTO;
    }

    @Override
    public DeigmaOrnithopanidaXPresAndThreatsAutocompletesDTO mapListsToDeigmaOrnithopanidaXPresAndThreatsAutocompletesDTO(ArrayList<String> ctActCodeList, ArrayList<Long>deigmaornithopanidaIDList, ArrayList<Long>kodikosList, ArrayList<String>releve_NRList, ArrayList<String>ACT_CodeList, ArrayList<String>typeList, ArrayList<String>importanceList) {
        try {
            DeigmaOrnithopanidaXPresAndThreatsAutocompletesDTO deigmaOrnithopanidaXPresAndThreatsAutocompletesDTO = new DeigmaOrnithopanidaXPresAndThreatsAutocompletesDTO();

            deigmaOrnithopanidaXPresAndThreatsAutocompletesDTO.setCtActCodeList(ctActCodeList);
            deigmaOrnithopanidaXPresAndThreatsAutocompletesDTO.setDeigmaornithopanidaIDList(deigmaornithopanidaIDList);
            deigmaOrnithopanidaXPresAndThreatsAutocompletesDTO.setImportanceList(importanceList);
            deigmaOrnithopanidaXPresAndThreatsAutocompletesDTO.setKodikosList(kodikosList);
            deigmaOrnithopanidaXPresAndThreatsAutocompletesDTO.setReleve_NRList(releve_NRList);
            deigmaOrnithopanidaXPresAndThreatsAutocompletesDTO.setTypeList(typeList);

            return deigmaOrnithopanidaXPresAndThreatsAutocompletesDTO;
        }catch (Exception e){
            throw e;
        }
    }

}

