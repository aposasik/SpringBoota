package com.teicm.kerkinibackend.repositories;

import com.teicm.kerkinibackend.domain.Deigmata;
import com.teicm.kerkinibackend.domain.Prwtokola;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Set;

@Repository
public interface DeigmataRepository extends CrudRepository<Deigmata, Long>, JpaRepository<Deigmata, Long>, org.springframework.data.repository.Repository<Deigmata, Long> {

    @Deprecated
    Set<Deigmata> findDeigmataByPrwtokolaIs(Prwtokola prwtokola);

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.prwtokola_id from deigmata deigma WHERE deigma.prwtokola_id IS NOT NULL ORDER BY prwtokola_id ASC")
    ArrayList<BigInteger> findDistinctByPrwtokolaIdOrderByPrwtokolaId();

    Page<Deigmata> findAll(Pageable pageable);
}
