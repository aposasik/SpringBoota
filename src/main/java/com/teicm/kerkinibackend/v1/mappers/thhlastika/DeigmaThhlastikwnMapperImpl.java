package com.teicm.kerkinibackend.v1.mappers.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.v1.models.DeigmaGoogleMarkersDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnDTO;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

// In order to reduce persisting Pictures and Files, the user wont be able to automatically at the
//      initialization of the DeigmaThhlastikwn to persist along those two attributes,
//      he will be able to persist them later on in the view page of the Object through
//      2 inputs (solo @Post requests Image, File).
public class DeigmaThhlastikwnMapperImpl implements DeigmaThhlastikwnMapper {
    @Override
    public DeigmaThhlastikwn deigmaThhlastikwnDTOToDeigmaThhlastikwn(DeigmaThhlastikwnDTO deigmaThhlastikwnDTO) {
        DeigmaThhlastikwn deigmaThhlastikwn = new DeigmaThhlastikwn();

        deigmaThhlastikwn.setEreunhths(deigmaThhlastikwnDTO.getEreunhths());
        if (deigmaThhlastikwnDTO.getDate() != null){
            deigmaThhlastikwn.setDate(LocalDate.parse(deigmaThhlastikwnDTO.getDate()));
        }
        if (deigmaThhlastikwnDTO.getTime() != null){
            deigmaThhlastikwn.setTime(LocalTime.parse(deigmaThhlastikwnDTO.getTime()));
        }
        deigmaThhlastikwn.setDiarkeia(deigmaThhlastikwnDTO.getDiarkeia());
        deigmaThhlastikwn.setEpifaneiaDeigmatolhpsias(deigmaThhlastikwnDTO.getEpifaneiaDeigmatolhpsias());
        deigmaThhlastikwn.setGridCell(deigmaThhlastikwnDTO.getGridCell());
        deigmaThhlastikwn.setKwdikosDeigmatolhpsias(deigmaThhlastikwnDTO.getKwdikosDeigmatolhpsias());
        deigmaThhlastikwn.setKwdikosNatura(deigmaThhlastikwnDTO.getKwdikosNatura());
        deigmaThhlastikwn.setLatitudeEGSA(deigmaThhlastikwnDTO.getLatitudeEGSA());
        deigmaThhlastikwn.setLongitudeEGSA(deigmaThhlastikwnDTO.getLongitudeEGSA());
        deigmaThhlastikwn.setLatitudeWGS84(deigmaThhlastikwnDTO.getLatitudeWGS84());
        deigmaThhlastikwn.setLongitudeWGS84(deigmaThhlastikwnDTO.getLongitudeWGS84());
        deigmaThhlastikwn.setMethodosDeigmatolhpsias(deigmaThhlastikwnDTO.getMethodosDeigmatolhpsias());
        deigmaThhlastikwn.setNomos(deigmaThhlastikwnDTO.getNomos());
        deigmaThhlastikwn.setParathrhseis(deigmaThhlastikwnDTO.getParathrhseis());
        deigmaThhlastikwn.setTopothesia(deigmaThhlastikwnDTO.getTopothesia());
        deigmaThhlastikwn.setTuposOikotopou(deigmaThhlastikwnDTO.getTuposOikotopou());
        deigmaThhlastikwn.setTuposVlasthshs(deigmaThhlastikwnDTO.getTuposVlasthshs());
        deigmaThhlastikwn.setXrhmatodothsh(deigmaThhlastikwnDTO.getXrhmatodothsh());

        return deigmaThhlastikwn;
    }

    @Override
    public List<DeigmaGoogleMarkersDTO> deigmaThhlastikwnToDeigmaGoogleMarkersDTO(List<DeigmaThhlastikwn> deigmaThhlastikwnList) {
        List<DeigmaGoogleMarkersDTO> deigmaGoogleMarkersDTOArrayList = new ArrayList<>();

        for (DeigmaThhlastikwn deigmaThhlastikwn : deigmaThhlastikwnList){
            DeigmaGoogleMarkersDTO deigmaGoogleMarkersDTO = new DeigmaGoogleMarkersDTO(deigmaThhlastikwn.getId(), deigmaThhlastikwn.getLongitudeWGS84(), deigmaThhlastikwn.getLatitudeWGS84());
            deigmaGoogleMarkersDTOArrayList.add(deigmaGoogleMarkersDTO);
        }

        return deigmaGoogleMarkersDTOArrayList;
    }

    @Override
    public DeigmaThhlastikwnAutocompletesDTO mapListsToDeigmaThhlastikwnAutocompletesDTO(ArrayList<String> kwdikosDeigmatolhpsiasList, ArrayList<String> xrhmatodothshList, ArrayList<String> ereunhthsList, ArrayList<String> topothesiaList, ArrayList<String> diarkeiaList, ArrayList<String> tuposVlasthshsList, ArrayList<String> tuposOikotopouList, ArrayList<String> gridCellList, ArrayList<String> kwdikosNaturaList, ArrayList<String> methodosDeigmatolhpsiasList, ArrayList<Double> latitudeEGSAList, ArrayList<Double> longitudeEGSAList, ArrayList<Double> latitudeWGS84List, ArrayList<Double> longitudeWGS84List, ArrayList<String> nomosList) {
        try {
            DeigmaThhlastikwnAutocompletesDTO deigmaThhlastikwnAutocompletesDTO = new DeigmaThhlastikwnAutocompletesDTO();

            deigmaThhlastikwnAutocompletesDTO.setKwdikosDeigmatolhpsiasList(kwdikosDeigmatolhpsiasList);
            deigmaThhlastikwnAutocompletesDTO.setXrhmatodothshList(xrhmatodothshList);
            deigmaThhlastikwnAutocompletesDTO.setEreunhthsList(ereunhthsList);
            deigmaThhlastikwnAutocompletesDTO.setTopothesiaList(topothesiaList);
            deigmaThhlastikwnAutocompletesDTO.setDiarkeiaList(diarkeiaList);
            deigmaThhlastikwnAutocompletesDTO.setTuposVlasthshsList(tuposVlasthshsList);
            deigmaThhlastikwnAutocompletesDTO.setTuposOikotopouList(tuposOikotopouList);
            deigmaThhlastikwnAutocompletesDTO.setGridCellList(gridCellList);
            deigmaThhlastikwnAutocompletesDTO.setKwdikosNaturaList(kwdikosNaturaList);
            deigmaThhlastikwnAutocompletesDTO.setMethodosDeigmatolhpsiasList(methodosDeigmatolhpsiasList);
            deigmaThhlastikwnAutocompletesDTO.setLatitudeEGSAList(latitudeEGSAList);
            deigmaThhlastikwnAutocompletesDTO.setLongitudeEGSAList(longitudeEGSAList);
            deigmaThhlastikwnAutocompletesDTO.setLatitudeWGS84List(latitudeWGS84List);
            deigmaThhlastikwnAutocompletesDTO.setLongitudeWGS84List(longitudeWGS84List);
            deigmaThhlastikwnAutocompletesDTO.setNomosList(nomosList);

            return deigmaThhlastikwnAutocompletesDTO;
        }catch (Exception e){
            throw e;
        }
    }
}
