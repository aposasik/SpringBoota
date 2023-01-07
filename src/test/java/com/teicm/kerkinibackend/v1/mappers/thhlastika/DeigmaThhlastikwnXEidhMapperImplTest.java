package com.teicm.kerkinibackend.v1.mappers.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaEidh;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXEidh;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXEidhAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXEidhDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeigmaThhlastikwnXEidhMapperImplTest {

    private DeigmaThhlastikwnXEidhMapperImpl deigmaThhlastikwnXEidhMapper = new DeigmaThhlastikwnXEidhMapperImpl();

    private DeigmaThhlastikwnXEidhDTO deigmaThhlastikwnXEidhDTO;

    private DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh;

    private ArrayList<BigInteger> deigmaThhlastikwnIdList;
    private ArrayList<String> ctEidosList;
    private ArrayList<String> sxetikhAfthoniaList;
    private ArrayList<String> hlikiaList;
    private ArrayList<String> fuloList;

    @BeforeEach
    void setUp(){
        // Init XEidhDto
        deigmaThhlastikwnXEidhDTO = new DeigmaThhlastikwnXEidhDTO();

        deigmaThhlastikwnXEidhDTO.setEokParII(true);
        deigmaThhlastikwnXEidhDTO.setEokParIV(false);
        deigmaThhlastikwnXEidhDTO.setEokParV(false);
        deigmaThhlastikwnXEidhDTO.setFulo("TestFulo");
        deigmaThhlastikwnXEidhDTO.setHlikia("TestHlikia");
        deigmaThhlastikwnXEidhDTO.setParathrhseis("Testing Parathrhseis");
        deigmaThhlastikwnXEidhDTO.setPlhthos(3);
        deigmaThhlastikwnXEidhDTO.setSxetikhAfthonia("TestSxetikhAfthonia");

        // Init XEidh
        deigmaThhlastikwnXEidh = new DeigmaThhlastikwnXEidh();

        DeigmaThhlastikwn deigmaThhlastikwn = new DeigmaThhlastikwn();
        deigmaThhlastikwn.setId(1l);

        CtThhlastikaEidh ctThhlastikaEidh = new CtThhlastikaEidh();
        ctThhlastikaEidh.setEidos("Testing Eidos");

        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwn);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidh);
        deigmaThhlastikwnXEidh.setEokParII(true);
        deigmaThhlastikwnXEidh.setEokParIV(false);
        deigmaThhlastikwnXEidh.setEokParV(false);
        deigmaThhlastikwnXEidh.setFulo("TestFulo");
        deigmaThhlastikwnXEidh.setHlikia("TestHlikia");
        deigmaThhlastikwnXEidh.setParathrhseis("Testing Parathrhseis");
        deigmaThhlastikwnXEidh.setPlhthos(3);
        deigmaThhlastikwnXEidh.setSxetikhAfthonia("TestSxetikhAfthonia");

        // Inits for mapping to Autocompletes test
        deigmaThhlastikwnIdList = new ArrayList<>();
        deigmaThhlastikwnIdList.add(BigInteger.valueOf(1));
        deigmaThhlastikwnIdList.add(BigInteger.valueOf(2));

        ctEidosList = new ArrayList<>();
        ctEidosList.add("Eidos1");
        ctEidosList.add("Eidos2");

        sxetikhAfthoniaList = new ArrayList<>();
        sxetikhAfthoniaList.add("SxetikhAfthonia1");
        sxetikhAfthoniaList.add("SxetikhAfthonia2");

        hlikiaList = new ArrayList<>();
        hlikiaList.add("Hlikia1");
        hlikiaList.add("Hlikia2");

        fuloList = new ArrayList<>();
        fuloList.add("Fulo1");
        fuloList.add("Fulo2");

    }

    @Test
    void deigmaThhlastikwnXEidhDTOToDeigmaThhlastikwnXEidhTest(){
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhActual = deigmaThhlastikwnXEidhMapper.deigmaThhlastikwnXEidhDTOToDeigmaThhlastikwnXEidh(deigmaThhlastikwnXEidhDTO);

        assertEquals(deigmaThhlastikwnXEidhDTO.getEokParII(), deigmaThhlastikwnXEidhActual.getEokParII());
        assertEquals(deigmaThhlastikwnXEidhDTO.getEokParIV(), deigmaThhlastikwnXEidhActual.getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhDTO.getEokParV(), deigmaThhlastikwnXEidhActual.getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhDTO.getFulo(), deigmaThhlastikwnXEidhActual.getFulo());
        assertEquals(deigmaThhlastikwnXEidhDTO.getHlikia(), deigmaThhlastikwnXEidhActual.getHlikia());
        assertEquals(deigmaThhlastikwnXEidhDTO.getParathrhseis(), deigmaThhlastikwnXEidhActual.getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhDTO.getPlhthos(), deigmaThhlastikwnXEidhActual.getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhDTO.getSxetikhAfthonia(), deigmaThhlastikwnXEidhActual.getSxetikhAfthonia());
    }

    @Test
    void deigmaThhlastikwnXEidhToDeigmaThhlastikwnXEidhDTOTest(){
        DeigmaThhlastikwnXEidhDTO deigmaThhlastikwnXEidhDTOActual = deigmaThhlastikwnXEidhMapper.deigmaThhlastikwnXEidhToDeigmaThhlastikwnXEidhDTO(deigmaThhlastikwnXEidh);

        // Also having the Id property for this specific mapping of the DTO
        assertEquals(deigmaThhlastikwnXEidh.getId(), deigmaThhlastikwnXEidhDTOActual.getId());

        assertEquals(deigmaThhlastikwnXEidh.getDeigmaThhlastikwn().getId(), deigmaThhlastikwnXEidhDTOActual.getDeigmaThhlastikwnId());
        assertEquals(deigmaThhlastikwnXEidh.getCtThhlastikaEidh().getEidos(), deigmaThhlastikwnXEidhDTOActual.getCtEidos());
        assertEquals(deigmaThhlastikwnXEidh.getEokParII(), deigmaThhlastikwnXEidhDTOActual.getEokParII());
        assertEquals(deigmaThhlastikwnXEidh.getEokParIV(), deigmaThhlastikwnXEidhDTOActual.getEokParIV());
        assertEquals(deigmaThhlastikwnXEidh.getEokParV(), deigmaThhlastikwnXEidhDTOActual.getEokParIV());
        assertEquals(deigmaThhlastikwnXEidh.getFulo(), deigmaThhlastikwnXEidhDTOActual.getFulo());
        assertEquals(deigmaThhlastikwnXEidh.getHlikia(), deigmaThhlastikwnXEidhDTOActual.getHlikia());
        assertEquals(deigmaThhlastikwnXEidh.getParathrhseis(), deigmaThhlastikwnXEidhDTOActual.getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidh.getPlhthos(), deigmaThhlastikwnXEidhDTOActual.getPlhthos());
        assertEquals(deigmaThhlastikwnXEidh.getSxetikhAfthonia(), deigmaThhlastikwnXEidhDTOActual.getSxetikhAfthonia());
    }

    @Test
    void mapListsToDeigmaThhlastikwnXEidhAutocompletesDTO(){
        DeigmaThhlastikwnXEidhAutocompletesDTO deigmaThhlastikwnXEidhAutocompletesDTO = deigmaThhlastikwnXEidhMapper
                .mapListsToDeigmaThhlastikwnXEidhAutocompletesDTO(deigmaThhlastikwnIdList, ctEidosList, sxetikhAfthoniaList, hlikiaList, fuloList);

        assertEquals(deigmaThhlastikwnIdList, deigmaThhlastikwnXEidhAutocompletesDTO.getDeigmaThhlastikwnIdList());
        assertEquals(ctEidosList, deigmaThhlastikwnXEidhAutocompletesDTO.getCtEidosList());
        assertEquals(sxetikhAfthoniaList, deigmaThhlastikwnXEidhAutocompletesDTO.getSxetikhAfthoniaList());
        assertEquals(hlikiaList, deigmaThhlastikwnXEidhAutocompletesDTO.getHlikiaList());
        assertEquals(fuloList, deigmaThhlastikwnXEidhAutocompletesDTO.getFuloList());
    }

}
