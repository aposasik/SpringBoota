package com.teicm.kerkinibackend.v1.mappers.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaPressThreats;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXPressThreats;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXPressThreatDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXPressThreatsAutocompletesDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeigmaThhlastikwnXPressThreatsMapperImplTest {

    DeigmaThhlastikwnXPressThreatsMapperImpl deigmaThhlastikwnXPressThreatsMapper = new DeigmaThhlastikwnXPressThreatsMapperImpl();

    private DeigmaThhlastikwnXPressThreatDTO deigmaThhlastikwnXPressThreatDTO;

    private DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreats;

    private ArrayList<BigInteger> deigmaThhlastikwnIdList;

    private ArrayList<String> kwdikosEidousList;

    private ArrayList<String> pressThreatList;

    private ArrayList<String> importanceList;

    private ArrayList<String> ctActCodeList;

    @BeforeEach
    void setUp(){
        // Init XPressThreatDTO
        deigmaThhlastikwnXPressThreatDTO = new DeigmaThhlastikwnXPressThreatDTO();

        deigmaThhlastikwnXPressThreatDTO.setImportance("TestingImportance");
        deigmaThhlastikwnXPressThreatDTO.setKwdikosEidous("TestingKwdikosEidous");
        deigmaThhlastikwnXPressThreatDTO.setPressThreat("TestingPressThreat");

        // Init XPressThreat
        deigmaThhlastikwnXPressThreats = new DeigmaThhlastikwnXPressThreats();

        DeigmaThhlastikwn deigmaThhlastikwn = new DeigmaThhlastikwn();

        deigmaThhlastikwn.setId(1l);

        CtThhlastikaPressThreats ctThhlastikaPressThreats = new CtThhlastikaPressThreats();

        ctThhlastikaPressThreats.setActCode("Testing ActCode");

        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(deigmaThhlastikwn);
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(ctThhlastikaPressThreats);
        deigmaThhlastikwnXPressThreats.setImportance("TestingImportance");
        deigmaThhlastikwnXPressThreats.setKwdikosEidous("TestingKwdikosEidous");
        deigmaThhlastikwnXPressThreats.setPressThreat("TestingPressThreat");

        // Inits for mapping to Autocompletes test
        deigmaThhlastikwnIdList = new ArrayList<>();
        deigmaThhlastikwnIdList.add(BigInteger.valueOf(1));
        deigmaThhlastikwnIdList.add(BigInteger.valueOf(2));

        ctActCodeList = new ArrayList<>();
        ctActCodeList.add("ActCode1");
        ctActCodeList.add("ActCode2");

        kwdikosEidousList = new ArrayList<>();
        kwdikosEidousList.add("KwdikosEidous1");
        kwdikosEidousList.add("KwdikosEidous1");

        pressThreatList = new ArrayList<>();
        pressThreatList.add("PressThreat1");
        pressThreatList.add("PressThreat1");

        importanceList = new ArrayList<>();
        importanceList.add("Importance1");
        importanceList.add("Importance2");
    }

    @Test
    void deigmaThhlastikwnXPressThreatsDTOtToDeigmaThhlastikwnXPressThreatsTest(){
        DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreatsActual = deigmaThhlastikwnXPressThreatsMapper.deigmaThhlastikwnXPressThreatsDTOtToDeigmaThhlastikwnXPressThreats(deigmaThhlastikwnXPressThreatDTO);

        assertEquals(deigmaThhlastikwnXPressThreatDTO.getId(), deigmaThhlastikwnXPressThreatsActual.getId());
        assertEquals(deigmaThhlastikwnXPressThreatDTO.getPressThreat(), deigmaThhlastikwnXPressThreatsActual.getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreatDTO.getKwdikosEidous(), deigmaThhlastikwnXPressThreatsActual.getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreatDTO.getImportance(), deigmaThhlastikwnXPressThreatsActual.getImportance());
    }

    @Test
    void deigmaThhlastikwnXPressThreatstToDeigmaThhlastikwnXPressThreatDTOTest(){
        DeigmaThhlastikwnXPressThreatDTO deigmaThhlastikwnXPressThreatDTOActual = deigmaThhlastikwnXPressThreatsMapper.deigmaThhlastikwnXPressThreatstToDeigmaThhlastikwnXPressThreatDTO(deigmaThhlastikwnXPressThreats);

        assertEquals(deigmaThhlastikwnXPressThreats.getDeigmaThhlastikwn().getId(), deigmaThhlastikwnXPressThreatDTOActual.getDeigmaThhlastikwnId());
        assertEquals(deigmaThhlastikwnXPressThreats.getCtThhlastikaPressThreats().getActCode(), deigmaThhlastikwnXPressThreatDTOActual.getCtActCode());
        assertEquals(deigmaThhlastikwnXPressThreats.getPressThreat(), deigmaThhlastikwnXPressThreatDTOActual.getPressThreat());
        assertEquals(deigmaThhlastikwnXPressThreats.getKwdikosEidous(), deigmaThhlastikwnXPressThreatDTOActual.getKwdikosEidous());
        assertEquals(deigmaThhlastikwnXPressThreats.getImportance(), deigmaThhlastikwnXPressThreatDTOActual.getImportance());
    }

    @Test
    void mapListsToDeigmaThhlastikwnXPressThreatsAutocompletesDTO(){
        DeigmaThhlastikwnXPressThreatsAutocompletesDTO deigmaThhlastikwnXPressThreatsAutocompletesDTO = deigmaThhlastikwnXPressThreatsMapper
                .mapListsToDeigmaThhlastikwnXPressThreatsAutocompletesDTO(deigmaThhlastikwnIdList, kwdikosEidousList, pressThreatList, importanceList, ctActCodeList);

        assertEquals(deigmaThhlastikwnIdList, deigmaThhlastikwnXPressThreatsAutocompletesDTO.getDeigmaThhlastikwnIdList());
        assertEquals(kwdikosEidousList, deigmaThhlastikwnXPressThreatsAutocompletesDTO.getKwdikosEidousList());
        assertEquals(pressThreatList, deigmaThhlastikwnXPressThreatsAutocompletesDTO.getPressThreatList());
        assertEquals(importanceList, deigmaThhlastikwnXPressThreatsAutocompletesDTO.getImportanceList());
        assertEquals(ctActCodeList, deigmaThhlastikwnXPressThreatsAutocompletesDTO.getCtActCodeList());
    }


}
