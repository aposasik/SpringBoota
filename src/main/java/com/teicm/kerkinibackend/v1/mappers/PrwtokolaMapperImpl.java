package com.teicm.kerkinibackend.v1.mappers;

import com.teicm.kerkinibackend.domain.Prwtokola;
import com.teicm.kerkinibackend.v1.models.PrwtokolaDTO;

public class PrwtokolaMapperImpl implements PrwtokolaMapper {

    @Override
    public Prwtokola prwtokolaDTOToPrwtokola(PrwtokolaDTO prwtokolaDTO) {
        try {
            Prwtokola prwtokola = new Prwtokola();

            prwtokola.setPerigrafh(prwtokolaDTO.getPerigrafh());
            prwtokola.setParathuroDedomenwn(prwtokolaDTO.getParathuroDedomenwn());
            prwtokola.setPinakasDedomenwn(prwtokolaDTO.getPinakasDedomenwn());

            return prwtokola;
        }catch (Exception e){
            throw e;
        }
    }

}
