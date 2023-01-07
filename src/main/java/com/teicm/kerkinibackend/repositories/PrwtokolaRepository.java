package com.teicm.kerkinibackend.repositories;

import com.teicm.kerkinibackend.domain.Prwtokola;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.ArrayList;

@Repository
public interface PrwtokolaRepository extends CrudRepository<Prwtokola, Long>, JpaRepository<Prwtokola, Long>, org.springframework.data.repository.Repository<Prwtokola, Long> {

    Page<Prwtokola> findAll(Pageable pageable);

    @Query(nativeQuery = true, value = "SELECT DISTINCT prwtokolo.id from prwtokola prwtokolo  WHERE prwtokolo.id IS NOT NULL ORDER BY prwtokolo.id ASC")
    ArrayList<BigInteger> findDistinctByPrwtokolaIdOrderByPrwtokolaId();

}
