package com.teicm.kerkinibackend.v1.mappers.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaPressThreats;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaPressThreatDTO;

public interface CtThhlastikaPressThreatsMapper {

    CtThhlastikaPressThreats CtThhlastikaPressThreatsDTOToCtThhlastikaPressThreats(CtThhlastikaPressThreatDTO ctThhlastikaPressThreatDTO);
}
