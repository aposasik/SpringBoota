package com.teicm.kerkinibackend.v1.mappers.ornithopanida;

import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanida;
import com.teicm.kerkinibackend.v1.models.ornithopanida.DeigmaOrnithopanidaAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.ornithopanida.DeigmaOrnithopanidaDTO;

import java.math.BigInteger;
import java.util.ArrayList;

public interface DeigmaOrnithopanidaMapper
{
    DeigmaOrnithopanida deigmaOrnithopanidaTOdeigmaOrnithopanidaDTO(DeigmaOrnithopanidaDTO deigmaOrnithopanidaDTO);
    DeigmaOrnithopanidaDTO deigmaOrnithopanidaDTOTOdeigmaOrnithopanida(DeigmaOrnithopanida deigmaOrnithopanida);
    DeigmaOrnithopanidaAutocompletesDTO mapListsToDeigmaOrnithopanidaAutocompletesDTO(ArrayList<String> researcherList, ArrayList<String> localityList, ArrayList<String> kodikosDeigmatolipsiasList, ArrayList<String> xrimatodotikomesoList, ArrayList<String> habitatList, ArrayList<Double> xegsaList, ArrayList<Double>xegsatList, ArrayList<Double>yegsaList, ArrayList<Double>yegsatList, ArrayList<Double>latitudeList, ArrayList<Double>longitudeList, ArrayList<Double>altitudeList, ArrayList<Double>latitudetList, ArrayList<Double>longitudetList, ArrayList<Double>altitudetList, ArrayList<String>paratiriseisList, ArrayList<String>nomosList, ArrayList<String>gridCellList, ArrayList<String>kodikosNaturaList, ArrayList<String>methodosList, ArrayList<String>kyriarxosTyposVlastisisList, ArrayList<String>kalypsiList, ArrayList<String>ypsosVlastisisList, ArrayList<String>puknotitaList, ArrayList<String>poiotitaList, ArrayList<String>nefoseisList, ArrayList<String>kateuthinsiAnemouList, ArrayList<String>kateuthinsiAnemouAzimList, ArrayList<String>thermokrasiaList, ArrayList<String>entasiAnemouList, ArrayList<BigInteger>prwtokolaIdList);
}

