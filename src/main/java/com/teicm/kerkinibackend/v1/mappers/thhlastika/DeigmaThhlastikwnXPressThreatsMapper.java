package com.teicm.kerkinibackend.v1.mappers.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXPressThreats;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXPressThreatDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXPressThreatsAutocompletesDTO;

import java.math.BigInteger;
import java.util.ArrayList;

public interface DeigmaThhlastikwnXPressThreatsMapper {

    DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsDTOtToDeigmaThhlastikwnXPressThreats(DeigmaThhlastikwnXPressThreatDTO deigmaThhlastikwnXPressThreatDTO);

    DeigmaThhlastikwnXPressThreatDTO deigmaThhlastikwnXPressThreatstToDeigmaThhlastikwnXPressThreatDTO(DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreat);

    DeigmaThhlastikwnXPressThreatsAutocompletesDTO mapListsToDeigmaThhlastikwnXPressThreatsAutocompletesDTO(ArrayList<BigInteger> deigmaThhlastikwnIdList, ArrayList<String> kwdikosEidousList, ArrayList<String> pressThreatList, ArrayList<String> importanceList, ArrayList<String> ctActCodeList);

}
