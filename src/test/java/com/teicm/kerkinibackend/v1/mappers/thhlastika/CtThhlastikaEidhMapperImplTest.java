package com.teicm.kerkinibackend.v1.mappers.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaEidh;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaEidosDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CtThhlastikaEidhMapperImplTest {

    private CtThhlastikaEidhMapperImpl ctThhlastikaEidhMapper = new CtThhlastikaEidhMapperImpl();

    private CtThhlastikaEidosDTO ctThhlastikaEidosDTO;

    @BeforeEach
    void setUp(){
        ctThhlastikaEidosDTO = new CtThhlastikaEidosDTO();
        ctThhlastikaEidosDTO.setEidos("Testing Eidos for CtThhlastikaEidhDTOToCtThhlastikaEidhTest");

    }

    @Test
    void CtThhlastikaEidhDTOToCtThhlastikaEidhTest(){
        CtThhlastikaEidh ctThhlastikaEidhActual = ctThhlastikaEidhMapper.CtThhlastikaEidhDTOToCtThhlastikaEidh(ctThhlastikaEidosDTO);

        assertEquals(ctThhlastikaEidosDTO.getEidos(), ctThhlastikaEidhActual.getEidos());
    }

}
