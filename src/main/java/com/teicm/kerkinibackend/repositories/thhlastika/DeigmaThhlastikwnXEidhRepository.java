package com.teicm.kerkinibackend.repositories.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXEidh;
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
public interface DeigmaThhlastikwnXEidhRepository extends CrudRepository<DeigmaThhlastikwnXEidh, Long>, JpaRepository<DeigmaThhlastikwnXEidh, Long>, org.springframework.data.repository.Repository<DeigmaThhlastikwnXEidh, Long> {

    Set<DeigmaThhlastikwnXEidh> findDeigmaThhlastikwnXEidhByDeigmaThhlastikwnIs(DeigmaThhlastikwn deigmaThhlastikwn);

    Page<DeigmaThhlastikwnXEidh> findAll(Pageable pageable);

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.deigma_thhlastikwn_id from deigma_thhlastikwnxeidh deigmax WHERE deigmax.deigma_thhlastikwn_id IS NOT NULL ORDER BY deigma_thhlastikwn_id ASC")
    ArrayList<BigInteger> findDistinctByDeigmaThhlastikwnIdOrderByDeigmaThhlastikwnId();

    @Deprecated
    // Needs to be parsed to get for each Id the eidos of the specific Ct.
    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.ct_thhlastika_eidh_id from deigma_thhlastikwnxeidh deigmax WHERE deigmax.ct_thhlastika_eidh_id IS NOT NULL ORDER BY ct_thhlastika_eidh_id ASC")
    ArrayList<Long> findDistinctByCtEidhIdOrderByEidhId();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.sxetikh_afthonia from deigma_thhlastikwnxeidh deigmax WHERE deigmax.sxetikh_afthonia IS NOT NULL ORDER BY sxetikh_afthonia ASC")
    ArrayList<String> findDistinctBySxetikhAfthoniaOrderBySxetikhAfthonia();

    // Not sure it is needed
    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.parathrhseis from deigma_thhlastikwnxeidh deigmax WHERE deigmax.parathrhseis IS NOT NULL ORDER BY parathrhseis ASC")
    ArrayList<String> findDistinctByParathrhseisOrderByParathrhseis();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.hlikia from deigma_thhlastikwnxeidh deigmax WHERE deigmax.hlikia IS NOT NULL ORDER BY hlikia ASC")
    ArrayList<String> findDistinctByHlikiaOrderByHlikia();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.fulo from deigma_thhlastikwnxeidh deigmax WHERE deigmax.fulo IS NOT NULL ORDER BY fulo ASC")
    ArrayList<String> findDistinctByFuloOrderByFulo();

    // Plhthos is going to be given from the user in ">" "<" style with the wanted number of plhthos.

    // EokParII, IV, V are going to be given from the user as "true" or "false" inputs.

}
