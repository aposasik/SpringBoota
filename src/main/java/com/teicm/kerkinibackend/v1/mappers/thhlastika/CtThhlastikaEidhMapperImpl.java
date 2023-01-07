package com.teicm.kerkinibackend.v1.mappers.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaEidh;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaEidosDTO;

public class CtThhlastikaEidhMapperImpl implements CtThhlastikaEidhMapper {

    @Override
    public CtThhlastikaEidh CtThhlastikaEidhDTOToCtThhlastikaEidh(CtThhlastikaEidosDTO ctThhlastikaEidosDTO) {
        try {
            CtThhlastikaEidh ctThhlastikaEidh = new CtThhlastikaEidh();
            ctThhlastikaEidh.setEidos(ctThhlastikaEidosDTO.getEidos());
            return ctThhlastikaEidh;
        } catch (Exception e){
            throw e;
        }
    }
}
