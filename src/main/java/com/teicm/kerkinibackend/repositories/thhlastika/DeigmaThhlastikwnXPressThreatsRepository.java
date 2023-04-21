package com.teicm.kerkinibackend.repositories.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXPressThreats;
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
public interface DeigmaThhlastikwnXPressThreatsRepository extends CrudRepository<DeigmaThhlastikwnXPressThreats, Long>, JpaRepository<DeigmaThhlastikwnXPressThreats, Long>, org.springframework.data.repository.Repository<DeigmaThhlastikwnXPressThreats, Long> {

    Set<DeigmaThhlastikwnXPressThreats> findDeigmaThhlastikwnXPressThreatsByDeigmaThhlastikwnIs(DeigmaThhlastikwn deigmaThhlastikwn);

    Page<DeigmaThhlastikwnXPressThreats> findAll(Pageable pageable);

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.kwdikos_eidous from deigma_thhlastikwnxpress_threats deigmax WHERE deigmax.kwdikos_eidous IS NOT NULL ORDER BY kwdikos_eidous ASC")
    ArrayList<String> findDistinctByKwdikosEidousOrderByKwdikosEidous();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.press_threat from deigma_thhlastikwnxpress_threats deigmax WHERE deigmax.press_threat IS NOT NULL ORDER BY press_threat ASC")
    ArrayList<String> findDistinctByPressThreatOrderByPressThreat();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.importance from deigma_thhlastikwnxpress_threats deigmax WHERE deigmax.importance IS NOT NULL ORDER BY importance ASC")
    ArrayList<String> findDistinctByImportanceOrderByImportance();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.deigma_thhlastikwn_id from deigma_thhlastikwnxpress_threats deigmax WHERE deigmax.deigma_thhlastikwn_id IS NOT NULL ORDER BY deigma_thhlastikwn_id ASC")
    ArrayList<BigInteger> findDistinctByDeigmaThhlastikwnIdOrderByDeigmaThhlastikwnId();

    @Deprecated
    // Needs to be parsed to get for each Id the actCode of the specific Ct.
    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.ct_thhlastika_press_threats_id from deigma_thhlastikwnxpress_threats deigmax WHERE deigmax.ct_thhlastika_press_threats_id IS NOT NULL ORDER BY ct_thhlastika_press_threats_id ASC")
    ArrayList<Long> findDistinctByCtPressThreatsIdOrderByPressThreatsId();

}
