package com.teicm.kerkinibackend.repositories.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaEidh;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;


@Repository
@Lazy
@Transactional
public interface CtThhlastikaEidhRepository extends CrudRepository<CtThhlastikaEidh, Long>, JpaRepository<CtThhlastikaEidh, Long>, org.springframework.data.repository.Repository<CtThhlastikaEidh, Long> {

    @Query(nativeQuery = true, value = "SELECT ct.eidos FROM ct_thhlastika_eidh ct WHERE ct.eidos IS NOT NULL ORDER BY eidos ASC")
    ArrayList<String> findDistinctByEidosOrderByEidos();

    CtThhlastikaEidh findByEidosEquals(String eidos);

    CtThhlastikaEidh findCtThhlastikaEidhById(Long id);

    Page<CtThhlastikaEidh> findAll(Pageable pageable);

}
