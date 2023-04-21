package com.teicm.kerkinibackend.repositories.ornithopanida;

import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanida;
import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanidaXPresAndThreats;
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
public interface DeigmaOrnithopanidaXPresAndThreatsRep extends CrudRepository<DeigmaOrnithopanidaXPresAndThreats, Long>, JpaRepository<DeigmaOrnithopanidaXPresAndThreats, Long>, org.springframework.data.repository.Repository<DeigmaOrnithopanidaXPresAndThreats, Long>
{
    Page<DeigmaOrnithopanidaXPresAndThreats> findAll(Pageable pageable);
    Set<DeigmaOrnithopanidaXPresAndThreats> findDeigmaOrnithopanidaXPressAndThreatsByDeigmaOrnithopanidaIs(DeigmaOrnithopanida deigmaOrnithopanida);

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.kodikos from deigma_ornithopanidaxpres_and_threats deigmax WHERE deigmax.kodikos IS NOT NULL ORDER BY kodikos ASC")
    ArrayList<String> findDistinctByKodikosOrderByKwdikos();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.type from deigma_ornithopanidaxpres_and_threats deigmax WHERE deigmax.type IS NOT NULL ORDER BY type ASC")
    ArrayList<String> findDistinctByTypeOrderByType();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.importance from deigma_ornithopanidaxpres_and_threats deigmax WHERE deigmax.importance IS NOT NULL ORDER BY importance ASC")
    ArrayList<String> findDistinctByImportanceOrderByImportance();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.deigma_ornithopanida_id from deigma_ornithopanidaxpres_and_threats deigmax WHERE deigmax.deigma_ornithopanida_id IS NOT NULL ORDER BY deigma_ornithopanida_id ASC")
    ArrayList<BigInteger> findDistinctByDeigmaOrnithopanidaIdOrderByDeigmaOrnithopanidaId();

    @Deprecated
    // Needs to be parsed to get for each Id the actCode of the specific Ct.
    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.ctornithopanida_pressures_and_threats_id from deigma_ornithopanidaxpres_and_threats deigmax WHERE deigmax.ctornithopanida_pressures_and_threats_id IS NOT NULL ORDER BY ctornithopanida_pressures_and_threats_id ASC")
    ArrayList<Long> findDistinctByCtPressAndThreatsIdOrderByPressAndThreatsId();
}