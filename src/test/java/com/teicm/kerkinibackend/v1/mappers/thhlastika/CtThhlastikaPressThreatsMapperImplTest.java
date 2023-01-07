package com.teicm.kerkinibackend.v1.mappers.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaPressThreats;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaPressThreatDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CtThhlastikaPressThreatsMapperImplTest {

    CtThhlastikaPressThreatsMapperImpl ctThhlastikaPressThreatsMapper = new CtThhlastikaPressThreatsMapperImpl();

    private CtThhlastikaPressThreatDTO ctThhlastikaPressThreatDTO;

    @BeforeEach
    void setUp(){
        ctThhlastikaPressThreatDTO = new CtThhlastikaPressThreatDTO();
        ctThhlastikaPressThreatDTO.setActCode("Testing actCode for Testing");
        ctThhlastikaPressThreatDTO.setDescriptionEn("Testing descriptionEn for Testing");
        ctThhlastikaPressThreatDTO.setRemarks("Testing Remarks for Testing");
    }

    @Test
    void CtThhlastikaPressThreatsDTOToCtThhlastikaPressThreatsTest(){
        CtThhlastikaPressThreats ctThhlastikaPressThreatsActual = ctThhlastikaPressThreatsMapper.CtThhlastikaPressThreatsDTOToCtThhlastikaPressThreats(ctThhlastikaPressThreatDTO);

        assertEquals(ctThhlastikaPressThreatDTO.getActCode(), ctThhlastikaPressThreatsActual.getActCode());
        assertEquals(ctThhlastikaPressThreatDTO.getDescriptionEn(), ctThhlastikaPressThreatsActual.getDescriptionEn());
        assertEquals(ctThhlastikaPressThreatDTO.getRemarks(), ctThhlastikaPressThreatsActual.getRemarks());
    }

}
