package com.teicm.kerkinibackend.v1.mappers.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.v1.models.DeigmaGoogleMarkersDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DeigmaThhlastikwnMapperImplTest {

    DeigmaThhlastikwnMapperImpl deigmaThhlastikwnMapper = new DeigmaThhlastikwnMapperImpl();

    DeigmaThhlastikwnDTO deigmaThhlastikwnDTO;

    List<DeigmaThhlastikwn> deigmaThhlastikwnList = new ArrayList<>();

    DeigmaThhlastikwn deigmaThhlastikwn1;

    DeigmaThhlastikwn deigmaThhlastikwn2;

    private ArrayList<String> kwdikosDeigmatolhpsiasList;

    private ArrayList<String> xrhmatodothshList;

    private ArrayList<String> ereunhthsList;

    private ArrayList<String> topothesiaList;

    private ArrayList<String> diarkeiaList;

    private ArrayList<String> tuposVlasthshsList;

    private ArrayList<String> tuposOikotopouList;

    private ArrayList<String> gridCellList;

    private ArrayList<String> kwdikosNaturaList;

    private ArrayList<String> methodosDeigmatolhpsiasList;

    private ArrayList<Double> latitudeEGSAList;

    private ArrayList<Double> longitudeEGSAList;

    private ArrayList<Double> latitudeWGS84List;

    private ArrayList<Double> longitudeWGS84List;

    private ArrayList<String> nomosList;

    @BeforeEach
    void setUp(){
        // Init DTO
        deigmaThhlastikwnDTO = new DeigmaThhlastikwnDTO();

        deigmaThhlastikwnDTO.setEreunhths("TestingEreunhths");
        deigmaThhlastikwnDTO.setDate("2018-12-18");
        deigmaThhlastikwnDTO.setTime("13:56:10");
        deigmaThhlastikwnDTO.setDiarkeia("TestingDiarkeia");
        deigmaThhlastikwnDTO.setEpifaneiaDeigmatolhpsias(10);
        deigmaThhlastikwnDTO.setGridCell("TestingGridCell");
        deigmaThhlastikwnDTO.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias");
        deigmaThhlastikwnDTO.setKwdikosNatura("TestingKwdikosNatura");
        deigmaThhlastikwnDTO.setLatitudeEGSA(273069.647269);
        deigmaThhlastikwnDTO.setLongitudeEGSA(4171345.69667);
        deigmaThhlastikwnDTO.setLatitudeWGS84(37.66384);
        deigmaThhlastikwnDTO.setLongitudeWGS84(21.42891);
        deigmaThhlastikwnDTO.setMethodosDeigmatolhpsias("TestingMethodosDeigmatolhpsias");
        deigmaThhlastikwnDTO.setNomos("TestingNomos");
        deigmaThhlastikwnDTO.setParathrhseis("TestingParathrhseis");
        deigmaThhlastikwnDTO.setTopothesia("TestingTopothesia");
        deigmaThhlastikwnDTO.setTuposOikotopou("TestingTuposOikotopou");
        deigmaThhlastikwnDTO.setTuposVlasthshs("TestingTuposVlasthshs");
        deigmaThhlastikwnDTO.setXrhmatodothsh("TestingXrhmatodothsh");

        // Init DeigmaThhlastikwn and List
        deigmaThhlastikwn1 = new DeigmaThhlastikwn();
        deigmaThhlastikwn1.setId(1l);
        deigmaThhlastikwn1.setLatitudeWGS84(37.66384);
        deigmaThhlastikwn1.setLongitudeEGSA(21.42891);

        deigmaThhlastikwn2 = new DeigmaThhlastikwn();
        deigmaThhlastikwn2.setId(2l);
        deigmaThhlastikwn2.setLatitudeWGS84(40.32134);
        deigmaThhlastikwn2.setLongitudeWGS84(22.21132);

        deigmaThhlastikwnList.add(deigmaThhlastikwn1);
        deigmaThhlastikwnList.add(deigmaThhlastikwn2);

        // Inits for mapping to Autocompletes test
        kwdikosDeigmatolhpsiasList = new ArrayList<>();
        kwdikosDeigmatolhpsiasList.add("KwdikosDeigmatolhpsias1");
        kwdikosDeigmatolhpsiasList.add("KwdikosDeigmatolhpsias1");

        xrhmatodothshList = new ArrayList<>();
        xrhmatodothshList.add("Xrhmatodothsh1");
        xrhmatodothshList.add("Xrhmatodothsh1");

        ereunhthsList = new ArrayList<>();
        ereunhthsList.add("Ereunhths1");
        ereunhthsList.add("Ereunhths1");

        topothesiaList = new ArrayList<>();
        topothesiaList.add("Topothesia1");
        topothesiaList.add("Topothesia2");

        diarkeiaList = new ArrayList<>();
        diarkeiaList.add("Diarkeia1");
        diarkeiaList.add("Diarkeia2");

        tuposVlasthshsList = new ArrayList<>();
        tuposVlasthshsList.add("TuposVlasthshs1");
        tuposVlasthshsList.add("TuposVlasthshs2");

        tuposOikotopouList = new ArrayList<>();
        tuposOikotopouList.add("TuposOikotopou1");
        tuposOikotopouList.add("TuposOikotopou2");

        gridCellList = new ArrayList<>();
        gridCellList.add("GridCell1");
        gridCellList.add("GridCell2");

        kwdikosNaturaList = new ArrayList<>();
        kwdikosNaturaList.add("KwdikosNatura1");
        kwdikosNaturaList.add("KwdikosNatura2");

        methodosDeigmatolhpsiasList = new ArrayList<>();
        methodosDeigmatolhpsiasList.add("MethodosDeigmatolhpsias1");
        methodosDeigmatolhpsiasList.add("MethodosDeigmatolhpsias2");

        latitudeEGSAList = new ArrayList<>();
        latitudeEGSAList.add(111111.111111);
        latitudeEGSAList.add(222222.222222);

        latitudeEGSAList = new ArrayList<>();
        latitudeEGSAList.add(111111.111111);
        latitudeEGSAList.add(222222.222222);

        longitudeEGSAList = new ArrayList<>();
        longitudeEGSAList.add(111111.111111);
        longitudeEGSAList.add(222222.222222);

        latitudeWGS84List = new ArrayList<>();
        latitudeWGS84List.add(1111111.11111);
        latitudeWGS84List.add(2222222.22222);

        longitudeWGS84List = new ArrayList<>();
        longitudeWGS84List.add(1111111.11111);
        longitudeWGS84List.add(2222222.22222);

        nomosList = new ArrayList<>();
        nomosList.add("Nomos1");
        nomosList.add("Nomos2");
    }

    @Test
    void deigmaThhlastikwnDTOToDeigmaThhlastikwnTest(){
        DeigmaThhlastikwn deigmaThhlastikwnActual = deigmaThhlastikwnMapper.deigmaThhlastikwnDTOToDeigmaThhlastikwn(deigmaThhlastikwnDTO);

        assertEquals(deigmaThhlastikwnDTO.getEreunhths(), deigmaThhlastikwnActual.getEreunhths());
        assertEquals(LocalDate.parse(deigmaThhlastikwnDTO.getDate()), deigmaThhlastikwnActual.getDate());
        assertEquals(LocalTime.parse(deigmaThhlastikwnDTO.getTime()), deigmaThhlastikwnActual.getTime());
        assertEquals(deigmaThhlastikwnDTO.getDiarkeia(), deigmaThhlastikwnActual.getDiarkeia());
        assertEquals(deigmaThhlastikwnDTO.getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnActual.getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnDTO.getGridCell(), deigmaThhlastikwnActual.getGridCell());
        assertEquals(deigmaThhlastikwnDTO.getKwdikosDeigmatolhpsias(), deigmaThhlastikwnActual.getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnDTO.getKwdikosNatura(), deigmaThhlastikwnActual.getKwdikosNatura());
        assertEquals(deigmaThhlastikwnDTO.getLatitudeEGSA(), deigmaThhlastikwnActual.getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnDTO.getLongitudeEGSA(), deigmaThhlastikwnActual.getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnDTO.getLatitudeWGS84(), deigmaThhlastikwnActual.getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnDTO.getLongitudeWGS84(), deigmaThhlastikwnActual.getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnDTO.getMethodosDeigmatolhpsias(), deigmaThhlastikwnActual.getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnDTO.getNomos(), deigmaThhlastikwnActual.getNomos());
        assertEquals(deigmaThhlastikwnDTO.getParathrhseis(), deigmaThhlastikwnActual.getParathrhseis());
        assertEquals(deigmaThhlastikwnDTO.getTopothesia(), deigmaThhlastikwnActual.getTopothesia());
        assertEquals(deigmaThhlastikwnDTO.getTuposOikotopou(), deigmaThhlastikwnActual.getTuposOikotopou());
        assertEquals(deigmaThhlastikwnDTO.getTuposVlasthshs(), deigmaThhlastikwnActual.getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnDTO.getXrhmatodothsh(), deigmaThhlastikwnActual.getXrhmatodothsh());
    }

    @Test
    void deigmaThhlastikwnToDeigmaGoogleMarkersDTOTest(){
        List<DeigmaGoogleMarkersDTO> googleMarkersDTOList = deigmaThhlastikwnMapper.deigmaThhlastikwnToDeigmaGoogleMarkersDTO(deigmaThhlastikwnList);

        assertEquals(deigmaThhlastikwn1.getId(), googleMarkersDTOList.get(0).getId());
        assertEquals(deigmaThhlastikwn1.getLatitudeWGS84(), googleMarkersDTOList.get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwn1.getLongitudeWGS84(), googleMarkersDTOList.get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwn2.getId(), googleMarkersDTOList.get(1).getId());
        assertEquals(deigmaThhlastikwn2.getLatitudeWGS84(), googleMarkersDTOList.get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwn2.getLongitudeWGS84(), googleMarkersDTOList.get(1).getLongitudeWGS84());
    }

    @Test
    void mapListsToDeigmaThhlastikwnAutocompletesDTO(){
        DeigmaThhlastikwnAutocompletesDTO deigmaThhlastikwnAutocompletesDTO = deigmaThhlastikwnMapper
                .mapListsToDeigmaThhlastikwnAutocompletesDTO(kwdikosDeigmatolhpsiasList, xrhmatodothshList,
                        ereunhthsList, topothesiaList, diarkeiaList, tuposVlasthshsList, tuposOikotopouList,
                        gridCellList, kwdikosNaturaList, methodosDeigmatolhpsiasList, latitudeEGSAList,
                        longitudeEGSAList, latitudeWGS84List, longitudeWGS84List, nomosList);

        assertEquals(kwdikosDeigmatolhpsiasList, deigmaThhlastikwnAutocompletesDTO.getKwdikosDeigmatolhpsiasList());
        assertEquals(xrhmatodothshList, deigmaThhlastikwnAutocompletesDTO.getXrhmatodothshList());
        assertEquals(ereunhthsList, deigmaThhlastikwnAutocompletesDTO.getEreunhthsList());
        assertEquals(topothesiaList, deigmaThhlastikwnAutocompletesDTO.getTopothesiaList());
    }

}
