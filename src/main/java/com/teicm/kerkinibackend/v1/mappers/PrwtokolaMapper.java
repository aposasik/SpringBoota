package com.teicm.kerkinibackend.v1.mappers;

import com.teicm.kerkinibackend.domain.Prwtokola;
import com.teicm.kerkinibackend.v1.models.PrwtokolaDTO;

public interface PrwtokolaMapper {

    Prwtokola prwtokolaDTOToPrwtokola(PrwtokolaDTO prwtokolaDTO);

}
