package com.teicm.kerkinibackend.v1.mappers;

import com.teicm.kerkinibackend.domain.Prwtokola;
import com.teicm.kerkinibackend.v1.models.PrwtokolaDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PrwtokolaMapperImplTest {

    private PrwtokolaMapperImpl prwtokolaMapper = new PrwtokolaMapperImpl();

    private PrwtokolaDTO prwtokolaDTO;

    @BeforeEach
    void setUp(){
        prwtokolaDTO = new PrwtokolaDTO();
        prwtokolaDTO.setPerigrafh("Testing Perigrafh prwtokolaDTOToPrwtokola");
        prwtokolaDTO.setParathuroDedomenwn("Testing ParathuroDedomenwn prwtokolaDTOToPrwtokola");
        prwtokolaDTO.setPinakasDedomenwn("Testing PinakasDedomenwn prwtokolaDTOToPrwtokola");
    }

    @Test
    void prwtokolaDTOToPrwtokola(){
        Prwtokola prwtokolaActual = prwtokolaMapper.prwtokolaDTOToPrwtokola(prwtokolaDTO);

        assertEquals(prwtokolaDTO.getPerigrafh(), prwtokolaActual.getPerigrafh());
        assertEquals(prwtokolaDTO.getParathuroDedomenwn(), prwtokolaActual.getParathuroDedomenwn());
        assertEquals(prwtokolaDTO.getPinakasDedomenwn(), prwtokolaActual.getPinakasDedomenwn());
    }

}
