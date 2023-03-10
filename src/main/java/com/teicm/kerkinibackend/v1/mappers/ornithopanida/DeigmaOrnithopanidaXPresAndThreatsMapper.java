package com.teicm.kerkinibackend.v1.mappers.ornithopanida;

import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanidaXPresAndThreats;
import com.teicm.kerkinibackend.v1.models.ornithopanida.DeigmaOrnithopanidaXPresAndThreatsAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.ornithopanida.DeigmaOrnithopanidaXPresAndThreatsDTO;

import java.util.ArrayList;

public interface DeigmaOrnithopanidaXPresAndThreatsMapper
{
    DeigmaOrnithopanidaXPresAndThreats deigmaOrnithopanidaXPresAndThreatsTOdeigmaOrnithopanidaXPresAndThreatsDTO(DeigmaOrnithopanidaXPresAndThreatsDTO deigmaOrnithopanidaXPresAndThreatsDTO);

    DeigmaOrnithopanidaXPresAndThreatsDTO deigmaOrnithopanidaXPresAndThreatsDTOTOdeigmaOrnithopanidaXPresAndThreats(DeigmaOrnithopanidaXPresAndThreats deigmaOrnithopanidaXPresAndThreats);

    DeigmaOrnithopanidaXPresAndThreatsAutocompletesDTO mapListsToDeigmaOrnithopanidaXPresAndThreatsAutocompletesDTO(ArrayList<String> ctActCodeList, ArrayList<Long>deigmaornithopanidaIDList, ArrayList<Long>kodikosList, ArrayList<String>releve_NRList, ArrayList<String>ACT_CodeList, ArrayList<String>typeList, ArrayList<String>importanceList);
}
