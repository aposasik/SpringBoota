package com.teicm.kerkinibackend.v1.mappers.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXPressThreats;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXPressThreatDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXPressThreatsAutocompletesDTO;

import java.math.BigInteger;
import java.util.ArrayList;

public class DeigmaThhlastikwnXPressThreatsMapperImpl implements DeigmaThhlastikwnXPressThreatsMapper {
    @Override
    public DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsDTOtToDeigmaThhlastikwnXPressThreats(DeigmaThhlastikwnXPressThreatDTO deigmaThhlastikwnXPressThreatDTO) {
        try {
            DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreats = new DeigmaThhlastikwnXPressThreats();

            deigmaThhlastikwnXPressThreats.setImportance(deigmaThhlastikwnXPressThreatDTO.getImportance());
            deigmaThhlastikwnXPressThreats.setKwdikosEidous(deigmaThhlastikwnXPressThreatDTO.getKwdikosEidous());
            deigmaThhlastikwnXPressThreats.setPressThreat(deigmaThhlastikwnXPressThreatDTO.getPressThreat());

            return deigmaThhlastikwnXPressThreats;
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public DeigmaThhlastikwnXPressThreatDTO deigmaThhlastikwnXPressThreatstToDeigmaThhlastikwnXPressThreatDTO(DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreat) {
        try {
            DeigmaThhlastikwnXPressThreatDTO deigmaThhlastikwnXPressThreatDTO = new DeigmaThhlastikwnXPressThreatDTO();

            // Also having the Id property
            deigmaThhlastikwnXPressThreatDTO.setId(deigmaThhlastikwnXPressThreat.getId());

            deigmaThhlastikwnXPressThreatDTO.setDeigmaThhlastikwnId(deigmaThhlastikwnXPressThreat.getDeigmaThhlastikwn().getId());
            deigmaThhlastikwnXPressThreatDTO.setCtActCode(deigmaThhlastikwnXPressThreat.getCtThhlastikaPressThreats().getActCode());
            deigmaThhlastikwnXPressThreatDTO.setPressThreat(deigmaThhlastikwnXPressThreat.getPressThreat());
            deigmaThhlastikwnXPressThreatDTO.setKwdikosEidous(deigmaThhlastikwnXPressThreat.getKwdikosEidous());
            deigmaThhlastikwnXPressThreatDTO.setImportance(deigmaThhlastikwnXPressThreat.getImportance());

            return deigmaThhlastikwnXPressThreatDTO;
        }catch (Exception e){
            throw e;
        }
    }

    @Override
    public DeigmaThhlastikwnXPressThreatsAutocompletesDTO mapListsToDeigmaThhlastikwnXPressThreatsAutocompletesDTO(ArrayList<BigInteger> deigmaThhlastikwnIdList, ArrayList<String> kwdikosEidousList, ArrayList<String> pressThreatList, ArrayList<String> importanceList, ArrayList<String> ctActCodeList) {
        try {
            DeigmaThhlastikwnXPressThreatsAutocompletesDTO deigmaThhlastikwnXPressThreatsAutocompletesDTO = new DeigmaThhlastikwnXPressThreatsAutocompletesDTO();

            deigmaThhlastikwnXPressThreatsAutocompletesDTO.setDeigmaThhlastikwnIdList(deigmaThhlastikwnIdList);
            deigmaThhlastikwnXPressThreatsAutocompletesDTO.setCtActCodeList(ctActCodeList);
            deigmaThhlastikwnXPressThreatsAutocompletesDTO.setKwdikosEidousList(kwdikosEidousList);
            deigmaThhlastikwnXPressThreatsAutocompletesDTO.setPressThreatList(pressThreatList);
            deigmaThhlastikwnXPressThreatsAutocompletesDTO.setImportanceList(importanceList);

            return deigmaThhlastikwnXPressThreatsAutocompletesDTO;
        }catch (Exception e){
            throw e;
        }
    }

}
