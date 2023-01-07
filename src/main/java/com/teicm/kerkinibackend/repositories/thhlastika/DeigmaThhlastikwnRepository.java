package com.teicm.kerkinibackend.repositories.thhlastika;

import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
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


@Repository
@Lazy
@Transactional
public interface DeigmaThhlastikwnRepository extends CrudRepository<DeigmaThhlastikwn, Long>, JpaRepository<DeigmaThhlastikwn, Long>, org.springframework.data.repository.Repository<DeigmaThhlastikwn, Long> {

    DeigmaThhlastikwn findDeigmaThhlastikwnById(Long id);

    List<DeigmaThhlastikwn> findAllByLongitudeWGS84IsNotNullAndLatitudeWGS84IsNotNullOrderByIdDesc();

    Page<DeigmaThhlastikwn> findAll(Pageable pageable);

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.kwdikos_deigmatos from deigma_thhlastikwn deigma WHERE deigma.kwdikos_deigmatos IS NOT NULL ORDER BY kwdikos_deigmatos ASC")
    ArrayList<String> findDistinctByKwdikosDeigmatosOrderByKwdikosDeigmatos();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.xrhmatodothsh from deigma_thhlastikwn deigma WHERE deigma.xrhmatodothsh IS NOT NULL ORDER BY xrhmatodothsh ASC")
    ArrayList<String> findDistinctByXrhmatodothshOrderByXrhmatodothsh();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.ereunhths from deigma_thhlastikwn deigma WHERE deigma.ereunhths IS NOT NULL ORDER BY ereunhths ASC")
    ArrayList<String> findDistinctByEreunhthsOrderByEreunhths();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.topothesia from deigma_thhlastikwn deigma WHERE deigma.topothesia IS NOT NULL ORDER BY topothesia ASC")
    ArrayList<String> findDistinctByTopothesiaOrderByTopothesia();

    // For date and time the user will give the specific number along with ">" or / and "<".

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.diarkeia from deigma_thhlastikwn deigma WHERE deigma.diarkeia IS NOT NULL ORDER BY diarkeia ASC")
    ArrayList<String> findDistinctByDiarkeiaOrderByDiarkeia();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.tupos_vlasthshs from deigma_thhlastikwn deigma WHERE deigma.tupos_vlasthshs IS NOT NULL ORDER BY tupos_vlasthshs ASC")
    ArrayList<String> findDistinctByTuposVlasthshsOrderByTuposVlasthshs();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.tupos_oikotopou from deigma_thhlastikwn deigma WHERE deigma.tupos_oikotopou IS NOT NULL ORDER BY tupos_oikotopou ASC")
    ArrayList<String> findDistinctByTuposOikotopouOrderByTuposOikotopou();

    // For epifaneiaDeigmatolhpsias the user will give the specific number along with ">" or / and "<".

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.latitude_egsa from deigma_thhlastikwn deigma WHERE deigma.latitude_egsa IS NOT NULL ORDER BY latitude_egsa ASC")
    ArrayList<Double> findDistinctByLatitudeEGSAOrderByLatitudeEGSA();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.longitude_egsa from deigma_thhlastikwn deigma WHERE deigma.longitude_egsa IS NOT NULL ORDER BY longitude_egsa ASC")
    ArrayList<Double> findDistinctByLongitudeEGSAOrderByLongitudeEGSA();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.latitude_wgs84 from deigma_thhlastikwn deigma WHERE deigma.latitude_wgs84 IS NOT NULL ORDER BY latitude_wgs84 ASC")
    ArrayList<Double> findDistinctByLatitudeWGS84OrderByLatitudeWGS84();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.longitude_wgs84 from deigma_thhlastikwn deigma WHERE deigma.longitude_wgs84 IS NOT NULL ORDER BY longitude_wgs84 ASC")
    ArrayList<Double> findDistinctByLongitudeWGS84OrderByLongitudeWGS84();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.grid_cell from deigma_thhlastikwn deigma WHERE deigma.grid_cell IS NOT NULL ORDER BY grid_cell ASC")
    ArrayList<String> findDistinctByGridCellOrderByGridCell();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.kwdikos_natura from deigma_thhlastikwn deigma WHERE deigma.kwdikos_natura IS NOT NULL ORDER BY kwdikos_natura ASC")
    ArrayList<String> findDistinctByKwdikosNaturaOrderByKwdikosNatura();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.methodos_deigmatolhpsias from deigma_thhlastikwn deigma WHERE deigma.methodos_deigmatolhpsias IS NOT NULL ORDER BY methodos_deigmatolhpsias ASC")
    ArrayList<String> findDistinctByMethodosDeigmatolhpsiasOrderByMethodosDeigmatolhpsias();

    // Not sure it is needed
    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.parathrhseis from deigma_thhlastikwn deigma WHERE deigma.parathrhseis IS NOT NULL ORDER BY parathrhseis ASC")
    ArrayList<String> findDistinctByParathrhseisOrderByParathrhseis();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.nomos from deigma_thhlastikwn deigma WHERE deigma.nomos IS NOT NULL ORDER BY nomos ASC")
    ArrayList<String> findDistinctByNomosOrderByNomos();

}
