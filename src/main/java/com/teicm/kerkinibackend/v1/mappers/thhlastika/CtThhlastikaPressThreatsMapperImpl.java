package com.teicm.kerkinibackend.v1.mappers.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaPressThreats;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaPressThreatDTO;

public class CtThhlastikaPressThreatsMapperImpl implements CtThhlastikaPressThreatsMapper {
    @Override
    public CtThhlastikaPressThreats CtThhlastikaPressThreatsDTOToCtThhlastikaPressThreats(CtThhlastikaPressThreatDTO ctThhlastikaPressThreatDTO) {
        try {
            CtThhlastikaPressThreats ctThhlastikaPressThreats = new CtThhlastikaPressThreats();
            ctThhlastikaPressThreats.setActCode(ctThhlastikaPressThreatDTO.getActCode());
            ctThhlastikaPressThreats.setDescriptionEn(ctThhlastikaPressThreatDTO.getDescriptionEn());
            ctThhlastikaPressThreats.setRemarks(ctThhlastikaPressThreatDTO.getRemarks());

            return ctThhlastikaPressThreats;
        }catch (Exception e){
            throw e;
        }
    }
}
