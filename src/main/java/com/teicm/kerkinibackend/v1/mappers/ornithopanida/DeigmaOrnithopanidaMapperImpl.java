package com.teicm.kerkinibackend.v1.mappers.ornithopanida;

import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanida;
import com.teicm.kerkinibackend.v1.models.ornithopanida.DeigmaOrnithopanidaAutocompletesDTO;
import com.teicm.kerkinibackend.v1.models.ornithopanida.DeigmaOrnithopanidaDTO;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.ArrayList;

@Component
public class DeigmaOrnithopanidaMapperImpl implements DeigmaOrnithopanidaMapper{

    @Override
    public DeigmaOrnithopanida deigmaOrnithopanidaTOdeigmaOrnithopanidaDTO(DeigmaOrnithopanidaDTO deigmaOrnithopanidaDTO) {
        if (deigmaOrnithopanidaDTO == null) {
            return null;
        }
        DeigmaOrnithopanida deigmaOrnithopanida = new DeigmaOrnithopanida();

        deigmaOrnithopanida.setResearcher(deigmaOrnithopanidaDTO.getResearcher());
        deigmaOrnithopanida.setLocality(deigmaOrnithopanidaDTO.getLocality());
        deigmaOrnithopanida.setXegsa(deigmaOrnithopanidaDTO.getXegsa());
        deigmaOrnithopanida.setYegsa(deigmaOrnithopanidaDTO.getYegsa());
        deigmaOrnithopanida.setDate(deigmaOrnithopanidaDTO.getDate());
        deigmaOrnithopanida.setTime(deigmaOrnithopanidaDTO.getTime());
        deigmaOrnithopanida.setKodikosDeigmatolipsias(deigmaOrnithopanidaDTO.getKodikosDeigmatolipsias());
        deigmaOrnithopanida.setParatiriseis(deigmaOrnithopanidaDTO.getParatiriseis());
        deigmaOrnithopanida.setXrimatodotikoMeso(deigmaOrnithopanidaDTO.getXrimatodotikoMeso());
        deigmaOrnithopanida.setHabitat(deigmaOrnithopanidaDTO.getHabitat());
        deigmaOrnithopanida.setXegsa(deigmaOrnithopanidaDTO.getXegsa());
        deigmaOrnithopanida.setYegsa(deigmaOrnithopanidaDTO.getYegsa());
        deigmaOrnithopanida.setLatitude(deigmaOrnithopanidaDTO.getLatitude());
        deigmaOrnithopanida.setLongitude(deigmaOrnithopanidaDTO.getLongitude());
        deigmaOrnithopanida.setAltitude(deigmaOrnithopanidaDTO.getAltitude());
        deigmaOrnithopanida.setXegsat(deigmaOrnithopanidaDTO.getXegsat());
        deigmaOrnithopanida.setYegsat(deigmaOrnithopanidaDTO.getYegsat());
        deigmaOrnithopanida.setLatitudet(deigmaOrnithopanidaDTO.getLatitudet());
        deigmaOrnithopanida.setLongitudet(deigmaOrnithopanidaDTO.getLongitudet());
        deigmaOrnithopanida.setParatiriseis(deigmaOrnithopanidaDTO.getParatiriseis());
        deigmaOrnithopanida.setAltitudet(deigmaOrnithopanidaDTO.getAltitudet());
        deigmaOrnithopanida.setNomos(deigmaOrnithopanidaDTO.getNomos());
        deigmaOrnithopanida.setGridCell(deigmaOrnithopanidaDTO.getGridCell());
        deigmaOrnithopanida.setKodikosNatura(deigmaOrnithopanidaDTO.getKodikosNatura());
        deigmaOrnithopanida.setMethodos(deigmaOrnithopanidaDTO.getMethodos());
        deigmaOrnithopanida.setKyriarxosTyposVlastisis(deigmaOrnithopanidaDTO.getKyriarxosTyposVlastisis());
        deigmaOrnithopanida.setKalypsi(deigmaOrnithopanidaDTO.getKalypsi());
        deigmaOrnithopanida.setPuknotita(deigmaOrnithopanidaDTO.getPuknotita());
        deigmaOrnithopanida.setPoiotita(deigmaOrnithopanidaDTO.getPoiotita());
        deigmaOrnithopanida.setPhoto(deigmaOrnithopanidaDTO.getPhoto());
        deigmaOrnithopanida.setFile(deigmaOrnithopanidaDTO.getFile());
        deigmaOrnithopanida.setNefoseis(deigmaOrnithopanidaDTO.getNefoseis());
        deigmaOrnithopanida.setKateuthinsiAnemou(deigmaOrnithopanidaDTO.getKateuthinsiAnemou());
        deigmaOrnithopanida.setKateuthinsiAnemouAzim(deigmaOrnithopanidaDTO.getKateuthinsiAnemouAzim());
        deigmaOrnithopanida.setThermokrasia(deigmaOrnithopanidaDTO.getThermokrasia());
        deigmaOrnithopanida.setEntasiAnemou(deigmaOrnithopanidaDTO.getEntasiAnemou());
        return deigmaOrnithopanida;
    }

    @Override
    public DeigmaOrnithopanidaDTO deigmaOrnithopanidaDTOTOdeigmaOrnithopanida(DeigmaOrnithopanida deigmaOrnithopanida) {
        if (deigmaOrnithopanida == null) {
            return null;
        }
        DeigmaOrnithopanidaDTO deigmaOrnithopanidaDTO = new DeigmaOrnithopanidaDTO();

        deigmaOrnithopanidaDTO.setResearcher(deigmaOrnithopanida.getResearcher());
        deigmaOrnithopanidaDTO.setLocality(deigmaOrnithopanida.getLocality());
        deigmaOrnithopanidaDTO.setXegsa(deigmaOrnithopanida.getXegsa());
        deigmaOrnithopanidaDTO.setYegsa(deigmaOrnithopanida.getYegsa());
        deigmaOrnithopanidaDTO.setDate(deigmaOrnithopanida.getDate());
        deigmaOrnithopanidaDTO.setTime(deigmaOrnithopanida.getTime());
        deigmaOrnithopanidaDTO.setKodikosDeigmatolipsias(deigmaOrnithopanida.getKodikosDeigmatolipsias());
        deigmaOrnithopanidaDTO.setParatiriseis(deigmaOrnithopanida.getParatiriseis());
        deigmaOrnithopanidaDTO.setXrimatodotikoMeso(deigmaOrnithopanida.getXrimatodotikoMeso());
        deigmaOrnithopanidaDTO.setHabitat(deigmaOrnithopanida.getHabitat());
        deigmaOrnithopanidaDTO.setXegsa(deigmaOrnithopanida.getXegsa());
        deigmaOrnithopanidaDTO.setYegsa(deigmaOrnithopanida.getYegsa());
        deigmaOrnithopanidaDTO.setLatitude(deigmaOrnithopanida.getLatitude());
        deigmaOrnithopanidaDTO.setLongitude(deigmaOrnithopanida.getLongitude());
        deigmaOrnithopanidaDTO.setAltitude(deigmaOrnithopanida.getAltitude());
        deigmaOrnithopanidaDTO.setXegsat(deigmaOrnithopanida.getXegsat());
        deigmaOrnithopanidaDTO.setYegsat(deigmaOrnithopanida.getYegsat());
        deigmaOrnithopanidaDTO.setLatitudet(deigmaOrnithopanida.getLatitudet());
        deigmaOrnithopanidaDTO.setLongitudet(deigmaOrnithopanida.getLongitudet());
        deigmaOrnithopanidaDTO.setParatiriseis(deigmaOrnithopanida.getParatiriseis());
        deigmaOrnithopanidaDTO.setAltitudet(deigmaOrnithopanida.getAltitudet());
        deigmaOrnithopanidaDTO.setNomos(deigmaOrnithopanida.getNomos());
        deigmaOrnithopanidaDTO.setGridCell(deigmaOrnithopanida.getGridCell());
        deigmaOrnithopanidaDTO.setKodikosNatura(deigmaOrnithopanida.getKodikosNatura());
        deigmaOrnithopanidaDTO.setMethodos(deigmaOrnithopanida.getMethodos());
        deigmaOrnithopanidaDTO.setKyriarxosTyposVlastisis(deigmaOrnithopanida.getKyriarxosTyposVlastisis());
        deigmaOrnithopanidaDTO.setKalypsi(deigmaOrnithopanida.getKalypsi());
        deigmaOrnithopanidaDTO.setPuknotita(deigmaOrnithopanida.getPuknotita());
        deigmaOrnithopanidaDTO.setPoiotita(deigmaOrnithopanida.getPoiotita());
        deigmaOrnithopanidaDTO.setPhoto(deigmaOrnithopanida.getPhoto());
        deigmaOrnithopanidaDTO.setFile(deigmaOrnithopanida.getFile());
        deigmaOrnithopanidaDTO.setNefoseis(deigmaOrnithopanida.getNefoseis());
        deigmaOrnithopanidaDTO.setKateuthinsiAnemou(deigmaOrnithopanida.getKateuthinsiAnemou());
        deigmaOrnithopanidaDTO.setKateuthinsiAnemouAzim(deigmaOrnithopanida.getKateuthinsiAnemouAzim());
        deigmaOrnithopanidaDTO.setThermokrasia(deigmaOrnithopanida.getThermokrasia());
        deigmaOrnithopanidaDTO.setEntasiAnemou(deigmaOrnithopanida.getEntasiAnemou());

        return deigmaOrnithopanidaDTO;
    }

    @Override
    public DeigmaOrnithopanidaAutocompletesDTO mapListsToDeigmaOrnithopanidaAutocompletesDTO(ArrayList<String> researcherList, ArrayList<String> localityList, ArrayList<String> kodikosDeigmatolipsiasList, ArrayList<String> xrimatodotikomesoList, ArrayList<String> habitatList, ArrayList<Double> xegsaList, ArrayList<Double>xegsatList, ArrayList<Double>yegsaList, ArrayList<Double>yegsatList, ArrayList<Double>latitudeList, ArrayList<Double>longitudeList, ArrayList<Double>altitudeList, ArrayList<Double>latitudetList, ArrayList<Double>longitudetList, ArrayList<Double>altitudetList, ArrayList<String>paratiriseisList, ArrayList<String>nomosList, ArrayList<String>gridCellList, ArrayList<String>kodikosNaturaList, ArrayList<String>methodosList, ArrayList<String>kyriarxosTyposVlastisisList, ArrayList<String>kalypsiList, ArrayList<String>ypsosVlastisisList, ArrayList<String>puknotitaList, ArrayList<String>poiotitaList, ArrayList<String>nefoseisList, ArrayList<String>kateuthinsiAnemouList, ArrayList<String>kateuthinsiAnemouAzimList, ArrayList<String>thermokrasiaList, ArrayList<String>entasiAnemouList, ArrayList<BigInteger>prwtokolaIdList){
        try{
            DeigmaOrnithopanidaAutocompletesDTO deigmaOrnithopanidaAutocompletesDTO= new DeigmaOrnithopanidaAutocompletesDTO();
            deigmaOrnithopanidaAutocompletesDTO.setAltitudeList(altitudeList);
            deigmaOrnithopanidaAutocompletesDTO.setAltitudetList(altitudetList);
            deigmaOrnithopanidaAutocompletesDTO.setEntasiAnemouList(entasiAnemouList);
            deigmaOrnithopanidaAutocompletesDTO.setGridCellList(gridCellList);
            deigmaOrnithopanidaAutocompletesDTO.setHabitatList(habitatList);
            deigmaOrnithopanidaAutocompletesDTO.setKalypsiList(kalypsiList);
            deigmaOrnithopanidaAutocompletesDTO.setKateuthinsiAnemouAzimList(kateuthinsiAnemouAzimList);
            deigmaOrnithopanidaAutocompletesDTO.setKateuthinsiAnemouList(kateuthinsiAnemouList);
            deigmaOrnithopanidaAutocompletesDTO.setKodikosDeigmatolipsiasList(kodikosDeigmatolipsiasList);
            deigmaOrnithopanidaAutocompletesDTO.setKodikosNaturaList(kodikosNaturaList);
            deigmaOrnithopanidaAutocompletesDTO.setKyriarxosTyposVlastisisList(kyriarxosTyposVlastisisList);
            deigmaOrnithopanidaAutocompletesDTO.setYpsosVlastisisList(ypsosVlastisisList);
            deigmaOrnithopanidaAutocompletesDTO.setYegsatList(yegsatList);
            deigmaOrnithopanidaAutocompletesDTO.setYegsaList(yegsaList);
            deigmaOrnithopanidaAutocompletesDTO.setXrimatodotikomesoList(xrimatodotikomesoList);
            deigmaOrnithopanidaAutocompletesDTO.setXegsatList(xegsatList);
            deigmaOrnithopanidaAutocompletesDTO.setXegsaList(xegsaList);
            deigmaOrnithopanidaAutocompletesDTO.setThermokrasiaList(thermokrasiaList);
            deigmaOrnithopanidaAutocompletesDTO.setResearcherList(researcherList);
            deigmaOrnithopanidaAutocompletesDTO.setPuknotitaList(puknotitaList);
            deigmaOrnithopanidaAutocompletesDTO.setPrwtokolaIdList(prwtokolaIdList);
            deigmaOrnithopanidaAutocompletesDTO.setPoiotitaList(poiotitaList);
            deigmaOrnithopanidaAutocompletesDTO.setParatiriseisList(paratiriseisList);
            deigmaOrnithopanidaAutocompletesDTO.setNomosList(nomosList);
            deigmaOrnithopanidaAutocompletesDTO.setNefoseisList(nefoseisList);
            deigmaOrnithopanidaAutocompletesDTO.setMethodosList(methodosList);
            deigmaOrnithopanidaAutocompletesDTO.setLongitudetList(longitudetList);
            deigmaOrnithopanidaAutocompletesDTO.setLongitudeList(longitudeList);
            deigmaOrnithopanidaAutocompletesDTO.setLocalityList(localityList);
            deigmaOrnithopanidaAutocompletesDTO.setLatitudetList(latitudetList);
            deigmaOrnithopanidaAutocompletesDTO.setLatitudeList(latitudeList);
            return deigmaOrnithopanidaAutocompletesDTO;
        }catch (Exception e){
            throw e;
        }
    }
}


