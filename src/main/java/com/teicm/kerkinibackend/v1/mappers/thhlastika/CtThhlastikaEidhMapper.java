package com.teicm.kerkinibackend.v1.mappers.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaEidh;
import com.teicm.kerkinibackend.v1.models.thhlastika.CtThhlastikaEidosDTO;

public interface CtThhlastikaEidhMapper {

    CtThhlastikaEidh CtThhlastikaEidhDTOToCtThhlastikaEidh(CtThhlastikaEidosDTO ctThhlastikaEidosDTO);
}
