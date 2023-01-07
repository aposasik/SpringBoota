package com.teicm.kerkinibackend.services;

import com.teicm.kerkinibackend.domain.Prwtokola;
import com.teicm.kerkinibackend.v1.models.PrwtokolaDTO;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;

@Service
public interface PrwtokolaService {

    Prwtokola getById(Long id);

    Prwtokola addPrwtokola(PrwtokolaDTO prwtokolaDTO);

    boolean addPrwtokolaFromExcel(MultipartFile file) throws IOException;

    boolean deletePrwtokola(Long id);

    boolean patchPrwtokola(Long id, PrwtokolaDTO prwtokolaDTO);

    ArrayList<BigInteger> getDistinctPrwtokolaIds();

    Page<Prwtokola> getAllByPaging(Integer page);
}
