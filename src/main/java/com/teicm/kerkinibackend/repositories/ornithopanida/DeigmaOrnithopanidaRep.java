package com.teicm.kerkinibackend.repositories.ornithopanida;

import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanida;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.ArrayList;

@Repository
@Lazy
@Transactional
public interface DeigmaOrnithopanidaRep extends CrudRepository<DeigmaOrnithopanida,Long>, JpaRepository<DeigmaOrnithopanida, Long>,org.springframework.data.repository.Repository<DeigmaOrnithopanida,Long>
{
    DeigmaOrnithopanida findDeigmaOrnithopanidaById(Long id);
   // List<DeigmaOrnithopanida>findAllByLongitudeWGS84IsNotNullAndLatitudeWGS84IsNotNullOrderByIdDesc();
    Page<DeigmaOrnithopanida> findAll(Pageable pageable);

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.kodikos_deigmatolipsias from deigma_ornithopanida deigma WHERE deigma.kodikos_deigmatolipsias IS NOT NULL ORDER BY kodikos_deigmatolipsias ASC")
    ArrayList<String> findDistinctByKodikosDeigmatolipsiasOrderByKodikosDeigmatolipsias();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.xrimatodotiko_meso from deigma_ornithopanida deigma WHERE deigma.xrimatodotiko_meso IS NOT NULL ORDER BY xrimatodotiko_meso ASC")
    ArrayList<String> findDistinctByXrimatodotikoMesoOrderByXrimatodotikoMeso();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.researcher from deigma_ornithopanida deigma WHERE deigma.researcher IS NOT NULL ORDER BY researcher ASC")
    ArrayList<String> findDistinctByResearcherOrderByResearcher();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.locality from deigma_ornithopanida deigma WHERE deigma.locality IS NOT NULL ORDER BY locality ASC")
    ArrayList<String> findDistinctByLocalityOrderByLocality();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.altitude from deigma_ornithopanida deigma WHERE deigma.altitude IS NOT NULL ORDER BY altitude ASC")
    ArrayList<String> findDistinctByAltitudeOrderByAltitude();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.altitudet from deigma_ornithopanida deigma WHERE deigma.altitudet IS NOT NULL ORDER BY altitudet ASC")
    ArrayList<String> findDistinctByAltitudetOrderByAltitudet();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.entasi_anemou from deigma_ornithopanida deigma WHERE deigma.entasi_anemou IS NOT NULL ORDER BY entasi_anemou ASC")
    ArrayList<String> findDistinctByEntasiAnemouOrderByEntasiAnemou();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.grid_cell from deigma_ornithopanida deigma WHERE deigma.grid_cell IS NOT NULL ORDER BY grid_cell ASC")
    ArrayList<String> findDistinctByGridCellOrderByGridCell();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.habitat from deigma_ornithopanida deigma WHERE deigma.habitat IS NOT NULL ORDER BY habitat ASC")
    ArrayList<String> findDistinctByHabitatOrderByHabitat();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.kalypsi from deigma_ornithopanida deigma WHERE deigma.kalypsi IS NOT NULL ORDER BY kalypsi ASC")
    ArrayList<String> findDistinctByKalypsiOrderByKalypsi();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.kateuthinsi_anemou from deigma_ornithopanida deigma WHERE deigma.kateuthinsi_anemou IS NOT NULL ORDER BY kateuthinsi_anemou ASC")
    ArrayList<String> findDistinctByKateuthinsiAnemouOrderByKateuthinsiAnemou();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.kateuthinsi_anemou_azim from deigma_ornithopanida deigma WHERE deigma.kateuthinsi_anemou_azim IS NOT NULL ORDER BY kateuthinsi_anemou_azim ASC")
    ArrayList<String> findDistinctByKateuthinsiAnemouAzimOrdOrderByKateuthinsiAnemouAzim();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.kodikos_natura from deigma_ornithopanida deigma WHERE deigma.kodikos_natura IS NOT NULL ORDER BY kodikos_natura ASC")
    ArrayList<String> findDistinctByKodikosNaturaOrderByKodikosNatura();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.kyriarxos_typos_vlastisis from deigma_ornithopanida deigma WHERE deigma.kyriarxos_typos_vlastisis IS NOT NULL ORDER BY kyriarxos_typos_vlastisis ASC")
    ArrayList<String> findDistinctByKyriarxosTyposVlastisisOrderByKyriarxosTyposVlastisis();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.latitude from deigma_ornithopanida deigma WHERE deigma.latitude IS NOT NULL ORDER BY latitude ASC")
    ArrayList<String> findDistinctByLatitudeOrderByLatitude();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.latitudet from deigma_ornithopanida deigma WHERE deigma.latitudet IS NOT NULL ORDER BY latitudet ASC")
    ArrayList<String> findDistinctByLatitudetOrdOrderByLatitudet();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.longitude from deigma_ornithopanida deigma WHERE deigma.longitude IS NOT NULL ORDER BY longitude ASC")
    ArrayList<String> findDistinctByLongitudeOrdOrderByLongitude();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.longitudet from deigma_ornithopanida deigma WHERE deigma.longitudet IS NOT NULL ORDER BY longitudet ASC")
    ArrayList<String> findDistinctByLongitudetOrdOrderByLongitudet();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.methodos from deigma_ornithopanida deigma WHERE deigma.methodos IS NOT NULL ORDER BY methodos ASC")
    ArrayList<String> findDistinctByMethodosOrderByMethodos();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.nefoseis from deigma_ornithopanida deigma WHERE deigma.nefoseis IS NOT NULL ORDER BY nefoseis ASC")
    ArrayList<String> findDistinctByNefoseisOrderByNefoseis();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.nomos from deigma_ornithopanida deigma WHERE deigma.nomos IS NOT NULL ORDER BY nomos ASC")
    ArrayList<String> findDistinctByNomosOrderByNomos();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.paratiriseis from deigma_ornithopanida deigma WHERE deigma.paratiriseis IS NOT NULL ORDER BY paratiriseis ASC")
    ArrayList<String> findDistinctByParatiriseisOrderByParatiriseis();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.poiotita from deigma_ornithopanida deigma WHERE deigma.poiotita IS NOT NULL ORDER BY poiotita ASC")
    ArrayList<String> findDistinctByPoiotitaOrderByPoiotita();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.puknotita from deigma_ornithopanida deigma WHERE deigma.puknotita IS NOT NULL ORDER BY puknotita ASC")
    ArrayList<String> findDistinctByPuknotitaOrderByPuknotita();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.thermokrasia from deigma_ornithopanida deigma WHERE deigma.thermokrasia IS NOT NULL ORDER BY thermokrasia ASC")
    ArrayList<String> findDistinctByThermokrasiaOrderByThermokrasia();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.xegsa from deigma_ornithopanida deigma WHERE deigma.xegsa IS NOT NULL ORDER BY xegsa ASC")
    ArrayList<String> findDistinctByXegsaOrderByXegsa();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.xegsat from deigma_ornithopanida deigma WHERE deigma.xegsat IS NOT NULL ORDER BY xegsat ASC")
    ArrayList<String> findDistinctByXegsatOrderByXegsat();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.yegsa from deigma_ornithopanida deigma WHERE deigma.yegsa IS NOT NULL ORDER BY yegsa ASC")
    ArrayList<String> findDistinctByYegsaOrderByYegsa();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.yegsat from deigma_ornithopanida deigma WHERE deigma.yegsat IS NOT NULL ORDER BY yegsat ASC")
    ArrayList<String> findDistinctByYegsatOrderByYegsat();

    @Query(nativeQuery = true, value = "SELECT DISTINCT deigma.ypsos_vlastisis from deigma_ornithopanida deigma WHERE deigma.ypsos_vlastisis IS NOT NULL ORDER BY ypsos_vlastisis ASC")
    ArrayList<String> findDistinctByYpsosVlastisisOrderByYpsosVlastisis();
}
