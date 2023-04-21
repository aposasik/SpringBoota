package com.teicm.kerkinibackend.repositories.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaPressThreats;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
@Lazy
@Transactional
public interface CtThhlastikaPressThreatsRepository
        extends CrudRepository<CtThhlastikaPressThreats, Long>, JpaRepository<CtThhlastikaPressThreats, Long>,
        org.springframework.data.repository.Repository<CtThhlastikaPressThreats, Long> {

    Optional<CtThhlastikaPressThreats> findById(Long id);

    CtThhlastikaPressThreats findByActCodeEquals(String actCode);

    CtThhlastikaPressThreats findCtThhlastikaPressThreatsById(Long id);

    List<CtThhlastikaPressThreats> findAll();

    Page<CtThhlastikaPressThreats> findAll(Pageable pageable);

    @Query(nativeQuery = true, value = "SELECT DISTINCT ct.act_code FROM ct_thhlastika_press_threats ct WHERE ct.act_code IS NOT NULL ORDER BY act_code ASC")
    ArrayList<String> findDistinctByActCodeOrderByActCode();

}
