package com.teicm.kerkinibackend.repositories.ornithopanida;

import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanida;
import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanidaXSpecies;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXEidh;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Set;

public interface DeigmaOrnithopanidaXSpeciesRep extends CrudRepository<DeigmaOrnithopanidaXSpecies, Long>, JpaRepository<DeigmaOrnithopanidaXSpecies, Long>, org.springframework.data.repository.Repository<DeigmaOrnithopanidaXSpecies, Long>
{
    Set<DeigmaOrnithopanidaXSpecies> findDeigmaOrnithopanidaXSpeciesByDeigmaOrnithopanidaIs (DeigmaOrnithopanida deigmaOrnithopanida);
    Page<DeigmaOrnithopanidaXSpecies> findAll(Pageable pageable);

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.deigma_ornithopanida_id from deigma_ornithopanidaxspecies deigmax WHERE deigmax.deigma_ornithopanida_id IS NOT NULL ORDER BY deigma_ornithopanida_id ASC")
    ArrayList<BigInteger> findDistinctByDeigmaOrnithopanidaIdOrderByDeigmaOrnithopanidaId();

    @Deprecated
    // Needs to be parsed to get for each Id the eidos of the specific Ct.
    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.ctornithopanida_eidi_id from deigma_ornithopanidaxspecies deigmax WHERE deigmax.ctornithopanida_eidi_id IS NOT NULL ORDER BY ctornithopanida_eidi_id ASC")
    ArrayList<Long> findDistinctByCtEidhIdOrderByEidhId();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.hlikia from deigma_ornithopanidaxspecies deigmax WHERE deigmax.hlikia IS NOT NULL ORDER BY hlikia ASC")
    ArrayList<String> findDistinctByHlikiaOrderByHlikia();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigmax.fulo from deigma_ornithopanidaxspecies deigmax WHERE deigmax.fulo IS NOT NULL ORDER BY fulo ASC")
    ArrayList<String> findDistinctByFuloOrderByFulo();

}
