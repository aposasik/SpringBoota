package com.teicm.kerkinibackend.v1.mappers.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.v1.models.DeigmaGoogleMarkersDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnDTO;

import java.util.ArrayList;
import java.util.List;

public interface DeigmaThhlastikwnMapper {

    DeigmaThhlastikwn deigmaThhlastikwnDTOToDeigmaThhlastikwn(DeigmaThhlastikwnDTO deigmaThhlastikwnDTO);

    List<DeigmaGoogleMarkersDTO> deigmaThhlastikwnToDeigmaGoogleMarkersDTO(List<DeigmaThhlastikwn> deigmaThhlastikwnList);

    DeigmaThhlastikwnAutocompletesDTO mapListsToDeigmaThhlastikwnAutocompletesDTO(ArrayList<String> kwdikosDeigmatolhpsiasList,
                                                                                  ArrayList<String> xrhmatodothshList, ArrayList<String> ereunhthsList,
                                                                                  ArrayList<String> topothesiaList, ArrayList<String> diarkeiaList,
                                                                                  ArrayList<String> tuposVlasthshsList, ArrayList<String> tuposOikotopouList,
                                                                                  ArrayList<String> gridCellList, ArrayList<String> kwdikosNaturaList,
                                                                                  ArrayList<String> methodosDeigmatolhpsiasList, ArrayList<Double> latitudeEGSAList,
                                                                                  ArrayList<Double> longitudeEGSAList, ArrayList<Double> latitudeWGS84List,
                                                                                  ArrayList<Double> longitudeWGS84List, ArrayList<String> nomosList);
}
