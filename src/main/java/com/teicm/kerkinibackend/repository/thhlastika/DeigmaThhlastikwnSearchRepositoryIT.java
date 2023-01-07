package com.teicm.kerkinibackend.repository.thhlastika;

import com.teicm.kerkinibackend.KerkinibackendApplication;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnSearchRepository;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnSearchDTO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

// TODO: 12/31/2018 Could do more tests for each attribute about "moreThanExists cases"

@Transactional
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = KerkinibackendApplication.class)
@TestPropertySource(locations = "classpath:application-integrationtest.properties")
@RunWith(SpringRunner.class)
public class DeigmaThhlastikwnSearchRepositoryIT {

    @Autowired
    DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    @Autowired
    DeigmaThhlastikwnSearchRepository deigmaThhlastikwnSearchRepository;


    private List<DeigmaThhlastikwn> deigmaThhlastikwnList;

    private DeigmaThhlastikwn deigmaThhlastikwn;

    private DeigmaThhlastikwn deigmaThhlastikwn1;

    private DeigmaThhlastikwn deigmaThhlastikwn2;

    private DeigmaThhlastikwn deigmaThhlastikwn3;

    private DeigmaThhlastikwn deigmaThhlastikwn4;


    private List<SearchCriteria> searchCriteriaList;


    private SearchCriteria searchCriteriaKwdikosDeigmatolhpsias;

    private SearchCriteria searchCriteriaXrhmatodothsh;

    private SearchCriteria searchCriteriaEreunhths;

    private SearchCriteria searchCriteriaTopothesia;

    private SearchCriteria searchCriteriaDateMoreThan2018_11_11;

    private SearchCriteria searchCriteriaDateLessThan2019_01_01;

    private SearchCriteria searchCriteriaTimeMoreThan11_11_11;

    private SearchCriteria searchCriteriaTimeLessThan13_13_13;

    private SearchCriteria searchCriteriaDiarkeia;

    private SearchCriteria searchCriteriaTuposVlasthshs;

    private SearchCriteria searchCriteriaTuposOikotopou;

    private SearchCriteria searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1;

    private SearchCriteria searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3;

    private SearchCriteria searchCriteriaLatitudeEgsa;

    private SearchCriteria searchCriteriaLongitudeEgsa;

    private SearchCriteria searchCriteriaLatitudeWGS84;

    private SearchCriteria searchCriteriaLongitudeWGS84;

    private SearchCriteria searchCriteriaGridCell;

    private SearchCriteria searchCriteriaKwdikosNatura;

    private SearchCriteria searchCriteriaMethodosDeigmatolhpsias;

    private SearchCriteria searchCriteriaParathrhseis;

    private SearchCriteria searchCriteriaNomos;


    // Not correct on
    private SearchCriteria searchCriteriaNotCorrectOnKwdikosDeigmatolhpsias;

    private SearchCriteria searchCriteriaNotCorrectOnXrhmatodothsh;

    private SearchCriteria searchCriteriaNotCorrectOnEreunhths;

    private SearchCriteria searchCriteriaNotCorrectOnTopothesia;

    private SearchCriteria searchCriteriaNotCorrectOnDate;

    private SearchCriteria searchCriteriaNotCorrectOnTime;

    private SearchCriteria searchCriteriaNotCorrectOnDiarkeia;

    private SearchCriteria searchCriteriaNotCorrectOnTuposVlasthshs;

    private SearchCriteria searchCriteriaNotCorrectOnTuposOikotopou;

    private SearchCriteria searchCriteriaNotCorrectOnEpifaneiaDeigmatolhpsias;

    private SearchCriteria searchCriteriaNotCorrectOnLatitudeEgsa;

    private SearchCriteria searchCriteriaNotCorrectOnLongitudeEgsa;

    private SearchCriteria searchCriteriaNotCorrectOnLatitudeWGS84;

    private SearchCriteria searchCriteriaNotCorrectOnLongitudeWGS84;

    private SearchCriteria searchCriteriaNotCorrectOnGridCell;

    private SearchCriteria searchCriteriaNotCorrectOnKwdikosNatura;

    private SearchCriteria searchCriteriaNotCorrectOnMethodosDeigmatolhpsias;

    private SearchCriteria searchCriteriaNotCorrectOnParathrhseis;

    private SearchCriteria searchCriteriaNotCorrectOnNomos;

    // Semi correct on
    private SearchCriteria searchCriteriaSemiCorrectOnKwdikosDeigmatolhpsias;

    private SearchCriteria searchCriteriaSemiCorrectOnXrhmatodothsh;

    private SearchCriteria searchCriteriaSemiCorrectOnEreunhths;

    private SearchCriteria searchCriteriaSemiCorrectOnTopothesia;

    private SearchCriteria searchCriteriaSemiCorrectOnDate;

    private SearchCriteria searchCriteriaSemiCorrectOnTime;

    private SearchCriteria searchCriteriaSemiCorrectOnDiarkeia;

    private SearchCriteria searchCriteriaSemiCorrectOnTuposVlasthshs;

    private SearchCriteria searchCriteriaSemiCorrectOnTuposOikotopou;

    private SearchCriteria searchCriteriaSemiCorrectOnEpifaneiaDeigmatolhpsias;

    private SearchCriteria searchCriteriaSemiCorrectOnLatitudeEgsa;

    private SearchCriteria searchCriteriaSemiCorrectOnLongitudeEgsa;

    private SearchCriteria searchCriteriaSemiCorrectOnLatitudeWGS84;

    private SearchCriteria searchCriteriaSemiCorrectOnLongitudeWGS84;

    private SearchCriteria searchCriteriaSemiCorrectOnGridCell;

    private SearchCriteria searchCriteriaSemiCorrectOnKwdikosNatura;

    private SearchCriteria searchCriteriaSemiCorrectOnMethodosDeigmatolhpsias;

    private SearchCriteria searchCriteriaSemiCorrectOnParathrhseis;

    private SearchCriteria searchCriteriaSemiCorrectOnNomos;


    @Before
    public void setUp(){
        // Init deigmaThhlastikwn
        deigmaThhlastikwn = new DeigmaThhlastikwn();
        deigmaThhlastikwn.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias");
        deigmaThhlastikwn.setXrhmatodothsh("TestingXrhmatodothsh");
        deigmaThhlastikwn.setEreunhths("TestingEreunhths");
        deigmaThhlastikwn.setTopothesia("TestingTopothesia");
        deigmaThhlastikwn.setDate(LocalDate.parse("2018-10-10"));
        deigmaThhlastikwn.setTime(LocalTime.parse("10:10:10"));
        deigmaThhlastikwn.setDiarkeia("TestingDiarkeia");
        deigmaThhlastikwn.setTuposVlasthshs("TestingTuposVlasthshs");
        deigmaThhlastikwn.setTuposOikotopou("TestingTuposOikotopou");
        deigmaThhlastikwn.setEpifaneiaDeigmatolhpsias(0);
        deigmaThhlastikwn.setLatitudeEGSA(000000.000000);
        deigmaThhlastikwn.setLongitudeEGSA(0000000.00000);
        deigmaThhlastikwn.setLatitudeWGS84(00.00000);
        deigmaThhlastikwn.setLongitudeWGS84(00.00000);
        deigmaThhlastikwn.setGridCell("TestingGridCell");
        deigmaThhlastikwn.setKwdikosNatura("TestingKwdikosNatura");
        deigmaThhlastikwn.setMethodosDeigmatolhpsias("TestingMethodosDeigmatolhpsias");
        deigmaThhlastikwn.setParathrhseis("TestingParathrhseis");
        deigmaThhlastikwn.setNomos("TestingNomos");

        // Init deigmaThhlastikwn
        deigmaThhlastikwn1 = new DeigmaThhlastikwn();
        deigmaThhlastikwn1.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias1");
        deigmaThhlastikwn1.setXrhmatodothsh("TestingXrhmatodothsh1");
        deigmaThhlastikwn1.setEreunhths("TestingEreunhths1");
        deigmaThhlastikwn1.setTopothesia("TestingTopothesia1");
        deigmaThhlastikwn1.setDate(LocalDate.parse("2018-11-11"));
        deigmaThhlastikwn1.setTime(LocalTime.parse("11:11:11"));
        deigmaThhlastikwn1.setDiarkeia("TestingDiarkeia1");
        deigmaThhlastikwn1.setTuposVlasthshs("TestingTuposVlasthshs1");
        deigmaThhlastikwn1.setTuposOikotopou("TestingTuposOikotopou1");
        deigmaThhlastikwn1.setEpifaneiaDeigmatolhpsias(1);
        deigmaThhlastikwn1.setLatitudeEGSA(111111.111111);
        deigmaThhlastikwn1.setLongitudeEGSA(1111111.11111);
        deigmaThhlastikwn1.setLatitudeWGS84(11.11111);
        deigmaThhlastikwn1.setLongitudeWGS84(11.11111);
        deigmaThhlastikwn1.setGridCell("TestingGridCell1");
        deigmaThhlastikwn1.setKwdikosNatura("TestingKwdikosNatura1");
        deigmaThhlastikwn1.setMethodosDeigmatolhpsias("TestingMethodosDeigmatolhpsias1");
        deigmaThhlastikwn1.setParathrhseis("TestingParathrhseis1");
        deigmaThhlastikwn1.setNomos("TestingNomos1");

        // Init deigmaThhlastikwn
        deigmaThhlastikwn2 = new DeigmaThhlastikwn();
        deigmaThhlastikwn2.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias2");
        deigmaThhlastikwn2.setXrhmatodothsh("TestingXrhmatodothsh2");
        deigmaThhlastikwn2.setEreunhths("TestingEreunhths2");
        deigmaThhlastikwn2.setTopothesia("TestingTopothesia2");
        deigmaThhlastikwn2.setDate(LocalDate.parse("2018-12-12"));
        deigmaThhlastikwn2.setTime(LocalTime.parse("12:12:12"));
        deigmaThhlastikwn2.setDiarkeia("TestingDiarkeia2");
        deigmaThhlastikwn2.setTuposVlasthshs("TestingTuposVlasthshs2");
        deigmaThhlastikwn2.setTuposOikotopou("TestingTuposOikotopou2");
        deigmaThhlastikwn2.setEpifaneiaDeigmatolhpsias(2);
        deigmaThhlastikwn2.setLatitudeEGSA(222222.222222);
        deigmaThhlastikwn2.setLongitudeEGSA(2222222.22222);
        deigmaThhlastikwn2.setLatitudeWGS84(22.22222);
        deigmaThhlastikwn2.setLongitudeWGS84(22.22222);
        deigmaThhlastikwn2.setGridCell("TestingGridCell2");
        deigmaThhlastikwn2.setKwdikosNatura("TestingKwdikosNatura2");
        deigmaThhlastikwn2.setMethodosDeigmatolhpsias("TestingMethodosDeigmatolhpsias2");
        deigmaThhlastikwn2.setParathrhseis("TestingParathrhseis2");
        deigmaThhlastikwn2.setNomos("TestingNomos2");

        // Init deigmaThhlastikwn
        deigmaThhlastikwn3 = new DeigmaThhlastikwn();
        deigmaThhlastikwn3.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias3");
        deigmaThhlastikwn3.setXrhmatodothsh("TestingXrhmatodothsh3");
        deigmaThhlastikwn3.setEreunhths("TestingEreunhths3");
        deigmaThhlastikwn3.setTopothesia("TestingTopothesia3");
        deigmaThhlastikwn3.setDate(LocalDate.parse("2019-01-01"));
        deigmaThhlastikwn3.setTime(LocalTime.parse("13:13:13"));
        deigmaThhlastikwn3.setDiarkeia("TestingDiarkeia3");
        deigmaThhlastikwn3.setTuposVlasthshs("TestingTuposVlasthshs3");
        deigmaThhlastikwn3.setTuposOikotopou("TestingTuposOikotopou3");
        deigmaThhlastikwn3.setEpifaneiaDeigmatolhpsias(3);
        deigmaThhlastikwn3.setLatitudeEGSA(333333.333333);
        deigmaThhlastikwn3.setLongitudeEGSA(3333333.33333);
        deigmaThhlastikwn3.setLatitudeWGS84(33.33333);
        deigmaThhlastikwn3.setLongitudeWGS84(33.33333);
        deigmaThhlastikwn3.setGridCell("TestingGridCell3");
        deigmaThhlastikwn3.setKwdikosNatura("TestingKwdikosNatura3");
        deigmaThhlastikwn3.setMethodosDeigmatolhpsias("TestingMethodosDeigmatolhpsias3");
        deigmaThhlastikwn3.setParathrhseis("TestingParathrhseis3");
        deigmaThhlastikwn3.setNomos("TestingNomos3");

        // Init deigmaThhlastikwn
        deigmaThhlastikwn4 = new DeigmaThhlastikwn();
        deigmaThhlastikwn4.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias4");
        deigmaThhlastikwn4.setXrhmatodothsh("TestingXrhmatodothsh4");
        deigmaThhlastikwn4.setEreunhths("TestingEreunhths4");
        deigmaThhlastikwn4.setTopothesia("TestingTopothesia4");
        deigmaThhlastikwn4.setDate(LocalDate.parse("2019-02-02"));
        deigmaThhlastikwn4.setTime(LocalTime.parse("14:14:14"));
        deigmaThhlastikwn4.setDiarkeia("TestingDiarkeia4");
        deigmaThhlastikwn4.setTuposVlasthshs("TestingTuposVlasthshs4");
        deigmaThhlastikwn4.setTuposOikotopou("TestingTuposOikotopou4");
        deigmaThhlastikwn4.setEpifaneiaDeigmatolhpsias(4);
        deigmaThhlastikwn4.setLatitudeEGSA(444444.444444);
        deigmaThhlastikwn4.setLongitudeEGSA(4444444.44444);
        deigmaThhlastikwn4.setLatitudeWGS84(44.44444);
        deigmaThhlastikwn4.setLongitudeWGS84(44.44444);
        deigmaThhlastikwn4.setGridCell("TestingGridCell4");
        deigmaThhlastikwn4.setKwdikosNatura("TestingKwdikosNatura4");
        deigmaThhlastikwn4.setMethodosDeigmatolhpsias("TestingMethodosDeigmatolhpsias4");
        deigmaThhlastikwn4.setParathrhseis("TestingParathrhseis4");
        deigmaThhlastikwn4.setNomos("TestingNomos4");


        // Init searchCriteria
        searchCriteriaKwdikosDeigmatolhpsias = new SearchCriteria();
        searchCriteriaKwdikosDeigmatolhpsias.setKey("kwdikosDeigmatolhpsias");
        searchCriteriaKwdikosDeigmatolhpsias.setOperation("~");
        searchCriteriaKwdikosDeigmatolhpsias.setValue("TestingKwdikosDeigmatolhpsias1;TestingKwdikosDeigmatolhpsias2;TestingKwdikosDeigmatolhpsias3;");

        // Init searchCriteria
        searchCriteriaXrhmatodothsh = new SearchCriteria();
        searchCriteriaXrhmatodothsh.setKey("xrhmatodothsh");
        searchCriteriaXrhmatodothsh.setOperation("~");
        searchCriteriaXrhmatodothsh.setValue("TestingXrhmatodothsh1;TestingXrhmatodothsh2;TestingXrhmatodothsh3;");

        // Init searchCriteria
        searchCriteriaEreunhths = new SearchCriteria();
        searchCriteriaEreunhths.setKey("ereunhths");
        searchCriteriaEreunhths.setOperation("~");
        searchCriteriaEreunhths.setValue("TestingEreunhths1;TestingEreunhths2;TestingEreunhths3;");

        // Init searchCriteria
        searchCriteriaTopothesia = new SearchCriteria();
        searchCriteriaTopothesia.setKey("topothesia");
        searchCriteriaTopothesia.setOperation("~");
        searchCriteriaTopothesia.setValue("TestingTopothesia1;TestingTopothesia2;TestingTopothesia3;");

        // Init searchCriteria
        searchCriteriaDateMoreThan2018_11_11 = new SearchCriteria();
        searchCriteriaDateMoreThan2018_11_11.setKey("date");
        searchCriteriaDateMoreThan2018_11_11.setOperation(">");
        searchCriteriaDateMoreThan2018_11_11.setValue("2018-11-11");

        // Init searchCriteria
        searchCriteriaDateLessThan2019_01_01 = new SearchCriteria();
        searchCriteriaDateLessThan2019_01_01.setKey("date");
        searchCriteriaDateLessThan2019_01_01.setOperation("<");
        searchCriteriaDateLessThan2019_01_01.setValue("2019-01-01");

        // Init searchCriteria
        searchCriteriaTimeMoreThan11_11_11 = new SearchCriteria();
        searchCriteriaTimeMoreThan11_11_11.setKey("time");
        searchCriteriaTimeMoreThan11_11_11.setOperation(">");
        searchCriteriaTimeMoreThan11_11_11.setValue("11:11:11");

        // Init searchCriteria
        searchCriteriaTimeLessThan13_13_13 = new SearchCriteria();
        searchCriteriaTimeLessThan13_13_13.setKey("time");
        searchCriteriaTimeLessThan13_13_13.setOperation("<");
        searchCriteriaTimeLessThan13_13_13.setValue("13:13:13");

        // Init searchCriteria
        searchCriteriaDiarkeia = new SearchCriteria();
        searchCriteriaDiarkeia.setKey("diarkeia");
        searchCriteriaDiarkeia.setOperation("~");
        searchCriteriaDiarkeia.setValue("TestingDiarkeia1;TestingDiarkeia2;TestingDiarkeia3;");

        // Init searchCriteria
        searchCriteriaTuposVlasthshs = new SearchCriteria();
        searchCriteriaTuposVlasthshs.setKey("tuposVlasthshs");
        searchCriteriaTuposVlasthshs.setOperation("~");
        searchCriteriaTuposVlasthshs.setValue("TestingTuposVlasthshs1;TestingTuposVlasthshs2;TestingTuposVlasthshs3;");

        // Init searchCriteria
        searchCriteriaTuposOikotopou = new SearchCriteria();
        searchCriteriaTuposOikotopou.setKey("tuposOikotopou");
        searchCriteriaTuposOikotopou.setOperation("~");
        searchCriteriaTuposOikotopou.setValue("TestingTuposOikotopou1;TestingTuposOikotopou2;TestingTuposOikotopou3;");

        // Init searchCriteria
        searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1 = new SearchCriteria();
        searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1.setKey("epifaneiaDeigmatolhpsias");
        searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1.setOperation(">");
        searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1.setValue(1);

        // Init searchCriteria
        searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3 = new SearchCriteria();
        searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3.setKey("epifaneiaDeigmatolhpsias");
        searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3.setOperation("<");
        searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3.setValue(3);

        // Init searchCriteria
        searchCriteriaLatitudeEgsa = new SearchCriteria();
        searchCriteriaLatitudeEgsa.setKey("latitudeEGSA");
        searchCriteriaLatitudeEgsa.setOperation("~");
        searchCriteriaLatitudeEgsa.setValue(111111.111111 + ";" + 222222.222222 + ";" + 333333.333333 + ";");

        // Init searchCriteria
        searchCriteriaLongitudeEgsa = new SearchCriteria();
        searchCriteriaLongitudeEgsa.setKey("longitudeEGSA");
        searchCriteriaLongitudeEgsa.setOperation("~");
        searchCriteriaLongitudeEgsa.setValue(1111111.11111 + ";" + 2222222.22222 + ";" + 3333333.33333 + ";");

        // Init searchCriteria
        searchCriteriaLatitudeWGS84 = new SearchCriteria();
        searchCriteriaLatitudeWGS84.setKey("latitudeWGS84");
        searchCriteriaLatitudeWGS84.setOperation("~");
        searchCriteriaLatitudeWGS84.setValue(11.11111 + ";" + 22.22222 + ";" + 33.33333 + ";");

        // Init searchCriteria
        searchCriteriaLongitudeWGS84 = new SearchCriteria();
        searchCriteriaLongitudeWGS84.setKey("longitudeWGS84");
        searchCriteriaLongitudeWGS84.setOperation("~");
        searchCriteriaLongitudeWGS84.setValue(11.11111 + ";" + 22.22222 + ";" + 33.33333 + ";");

        // Init searchCriteria
        searchCriteriaGridCell = new SearchCriteria();
        searchCriteriaGridCell.setKey("gridCell");
        searchCriteriaGridCell.setOperation("~");
        searchCriteriaGridCell.setValue("TestingGridCell1;TestingGridCell2;TestingGridCell3;");

        // Init searchCriteria
        searchCriteriaKwdikosNatura = new SearchCriteria();
        searchCriteriaKwdikosNatura.setKey("kwdikosNatura");
        searchCriteriaKwdikosNatura.setOperation("~");
        searchCriteriaKwdikosNatura.setValue("TestingKwdikosNatura1;TestingKwdikosNatura2;TestingKwdikosNatura3;");

        // Init searchCriteria
        searchCriteriaMethodosDeigmatolhpsias = new SearchCriteria();
        searchCriteriaMethodosDeigmatolhpsias.setKey("methodosDeigmatolhpsias");
        searchCriteriaMethodosDeigmatolhpsias.setOperation("~");
        searchCriteriaMethodosDeigmatolhpsias.setValue("TestingMethodosDeigmatolhpsias1;TestingMethodosDeigmatolhpsias2;TestingMethodosDeigmatolhpsias3;");

        // Init searchCriteria
        searchCriteriaParathrhseis = new SearchCriteria();
        searchCriteriaParathrhseis.setKey("parathrhseis");
        searchCriteriaParathrhseis.setOperation("~");
        searchCriteriaParathrhseis.setValue("TestingParathrhseis1;TestingParathrhseis2;TestingParathrhseis3;");

        // Init searchCriteria
        searchCriteriaNomos = new SearchCriteria();
        searchCriteriaNomos.setKey("nomos");
        searchCriteriaNomos.setOperation("~");
        searchCriteriaNomos.setValue("TestingNomos1;TestingNomos2;TestingNomos3;");



        // Init searchCriteria
        searchCriteriaNotCorrectOnKwdikosDeigmatolhpsias = new SearchCriteria();
        searchCriteriaNotCorrectOnKwdikosDeigmatolhpsias.setKey("kwdikosDeigmatolhpsias");
        searchCriteriaNotCorrectOnKwdikosDeigmatolhpsias.setOperation("~");
        searchCriteriaNotCorrectOnKwdikosDeigmatolhpsias.setValue("TestingKwdikosDeigmatolhpsias;TestingKwdikosDeigmatolhpsias4;TestingKwdikosDeigmatolhpsias100;");

        // Init searchCriteria
        searchCriteriaNotCorrectOnXrhmatodothsh = new SearchCriteria();
        searchCriteriaNotCorrectOnXrhmatodothsh.setKey("xrhmatodothsh");
        searchCriteriaNotCorrectOnXrhmatodothsh.setOperation("~");
        searchCriteriaNotCorrectOnXrhmatodothsh.setValue("TestingXrhmatodothsh;TestingXrhmatodothsh4;TestingXrhmatodothsh100;");

        // Init searchCriteria
        searchCriteriaNotCorrectOnEreunhths = new SearchCriteria();
        searchCriteriaNotCorrectOnEreunhths.setKey("ereunhths");
        searchCriteriaNotCorrectOnEreunhths.setOperation("~");
        searchCriteriaNotCorrectOnEreunhths.setValue("TestingEreunhths;TestingEreunhths4;TestingEreunhths100;");

        // Init searchCriteria
        searchCriteriaNotCorrectOnTopothesia = new SearchCriteria();
        searchCriteriaNotCorrectOnTopothesia.setKey("topothesia");
        searchCriteriaNotCorrectOnTopothesia.setOperation("~");
        searchCriteriaNotCorrectOnTopothesia.setValue("TestingTopothesia;TestingTopothesia4;TestingTopothesia100;");

        // Init searchCriteria
        searchCriteriaNotCorrectOnDate = new SearchCriteria();
        searchCriteriaNotCorrectOnDate.setKey("date");
        searchCriteriaNotCorrectOnDate.setOperation("<");
        searchCriteriaNotCorrectOnDate.setValue("2018-11-10");

        // Init searchCriteria
        searchCriteriaNotCorrectOnTime = new SearchCriteria();
        searchCriteriaNotCorrectOnTime.setKey("time");
        searchCriteriaNotCorrectOnTime.setOperation("<");
        searchCriteriaNotCorrectOnTime.setValue("11:11:10");

        // Init searchCriteria
        searchCriteriaNotCorrectOnDiarkeia = new SearchCriteria();
        searchCriteriaNotCorrectOnDiarkeia.setKey("diarkeia");
        searchCriteriaNotCorrectOnDiarkeia.setOperation("~");
        searchCriteriaNotCorrectOnDiarkeia.setValue("TestingDiarkeia;TestingDiarkeia4;TestingDiarkeia100;");

        // Init searchCriteria
        searchCriteriaNotCorrectOnTuposVlasthshs = new SearchCriteria();
        searchCriteriaNotCorrectOnTuposVlasthshs.setKey("tuposVlasthshs");
        searchCriteriaNotCorrectOnTuposVlasthshs.setOperation("~");
        searchCriteriaNotCorrectOnTuposVlasthshs.setValue("TestingTuposVlasthshs;TestingTuposVlasthshs4;TestingTuposVlasthshs100;");

        // Init searchCriteria
        searchCriteriaNotCorrectOnTuposOikotopou = new SearchCriteria();
        searchCriteriaNotCorrectOnTuposOikotopou.setKey("tuposOikotopou");
        searchCriteriaNotCorrectOnTuposOikotopou.setOperation("~");
        searchCriteriaNotCorrectOnTuposOikotopou.setValue("TestingTuposOikotopou;TestingTuposOikotopou4;TestingTuposOikotopou100;");

        // Init searchCriteria
        searchCriteriaNotCorrectOnEpifaneiaDeigmatolhpsias = new SearchCriteria();
        searchCriteriaNotCorrectOnEpifaneiaDeigmatolhpsias.setKey("epifaneiaDeigmatolhpsias");
        searchCriteriaNotCorrectOnEpifaneiaDeigmatolhpsias.setOperation("<");
        searchCriteriaNotCorrectOnEpifaneiaDeigmatolhpsias.setValue(0);

        // Init searchCriteria
        searchCriteriaNotCorrectOnLatitudeEgsa = new SearchCriteria();
        searchCriteriaNotCorrectOnLatitudeEgsa.setKey("latitudeEGSA");
        searchCriteriaNotCorrectOnLatitudeEgsa.setOperation("~");
        searchCriteriaNotCorrectOnLatitudeEgsa.setValue(000000.000000 + ";");

        // Init searchCriteria
        searchCriteriaNotCorrectOnLongitudeEgsa = new SearchCriteria();
        searchCriteriaNotCorrectOnLongitudeEgsa.setKey("longitudeEGSA");
        searchCriteriaNotCorrectOnLongitudeEgsa.setOperation("~");
        searchCriteriaNotCorrectOnLongitudeEgsa.setValue(0000000.00000 + ";");

        // Init searchCriteria
        searchCriteriaNotCorrectOnLatitudeWGS84 = new SearchCriteria();
        searchCriteriaNotCorrectOnLatitudeWGS84.setKey("latitudeWGS84");
        searchCriteriaNotCorrectOnLatitudeWGS84.setOperation("~");
        searchCriteriaNotCorrectOnLatitudeWGS84.setValue(00.00000 + ";");

        // Init searchCriteria
        searchCriteriaNotCorrectOnLongitudeWGS84 = new SearchCriteria();
        searchCriteriaNotCorrectOnLongitudeWGS84.setKey("longitudeWGS84");
        searchCriteriaNotCorrectOnLongitudeWGS84.setOperation("~");
        searchCriteriaNotCorrectOnLongitudeWGS84.setValue(00.00000 + ";");

        // Init searchCriteria
        searchCriteriaNotCorrectOnGridCell = new SearchCriteria();
        searchCriteriaNotCorrectOnGridCell.setKey("gridCell");
        searchCriteriaNotCorrectOnGridCell.setOperation("~");
        searchCriteriaNotCorrectOnGridCell.setValue("TestingGridCell;TestingGridCell4;TestingGridCell100;");

        // Init searchCriteria
        searchCriteriaNotCorrectOnKwdikosNatura = new SearchCriteria();
        searchCriteriaNotCorrectOnKwdikosNatura.setKey("kwdikosNatura");
        searchCriteriaNotCorrectOnKwdikosNatura.setOperation("~");
        searchCriteriaNotCorrectOnKwdikosNatura.setValue("TestingKwdikosNatura;TestingKwdikosNatura4;TestingKwdikosNatura100;");

        // Init searchCriteria
        searchCriteriaNotCorrectOnMethodosDeigmatolhpsias = new SearchCriteria();
        searchCriteriaNotCorrectOnMethodosDeigmatolhpsias.setKey("methodosDeigmatolhpsias");
        searchCriteriaNotCorrectOnMethodosDeigmatolhpsias.setOperation("~");
        searchCriteriaNotCorrectOnMethodosDeigmatolhpsias.setValue("TestingMethodosDeigmatolhpsias;TestingMethodosDeigmatolhpsias4;TestingMethodosDeigmatolhpsias100;");

        // Init searchCriteria
        searchCriteriaNotCorrectOnParathrhseis = new SearchCriteria();
        searchCriteriaNotCorrectOnParathrhseis.setKey("parathrhseis");
        searchCriteriaNotCorrectOnParathrhseis.setOperation("~");
        searchCriteriaNotCorrectOnParathrhseis.setValue("TestingParathrhseis;TestingParathrhseis4;TestingParathrhseis100;");

        // Init searchCriteria
        searchCriteriaNotCorrectOnNomos = new SearchCriteria();
        searchCriteriaNotCorrectOnNomos.setKey("nomos");
        searchCriteriaNotCorrectOnNomos.setOperation("~");
        searchCriteriaNotCorrectOnNomos.setValue("TestingNomos;TestingNomos4;TestingNomos100;");




        // Init searchCriteria
        searchCriteriaSemiCorrectOnKwdikosDeigmatolhpsias = new SearchCriteria();
        searchCriteriaSemiCorrectOnKwdikosDeigmatolhpsias.setKey("kwdikosDeigmatolhpsias");
        searchCriteriaSemiCorrectOnKwdikosDeigmatolhpsias.setOperation("~");
        searchCriteriaSemiCorrectOnKwdikosDeigmatolhpsias.setValue("TestingKwdikosDeigmatolhpsias;TestingKwdikosDeigmatolhpsias1;TestingKwdikosDeigmatolhpsias4;TestingKwdikosDeigmatolhpsias100;");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnXrhmatodothsh = new SearchCriteria();
        searchCriteriaSemiCorrectOnXrhmatodothsh.setKey("xrhmatodothsh");
        searchCriteriaSemiCorrectOnXrhmatodothsh.setOperation("~");
        searchCriteriaSemiCorrectOnXrhmatodothsh.setValue("TestingXrhmatodothsh;TestingXrhmatodothsh1;TestingXrhmatodothsh4;TestingXrhmatodothsh100;");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnEreunhths = new SearchCriteria();
        searchCriteriaSemiCorrectOnEreunhths.setKey("ereunhths");
        searchCriteriaSemiCorrectOnEreunhths.setOperation("~");
        searchCriteriaSemiCorrectOnEreunhths.setValue("TestingEreunhths;TestingEreunhths1;TestingEreunhths4;TestingEreunhths100;");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnTopothesia = new SearchCriteria();
        searchCriteriaSemiCorrectOnTopothesia.setKey("topothesia");
        searchCriteriaSemiCorrectOnTopothesia.setOperation("~");
        searchCriteriaSemiCorrectOnTopothesia.setValue("TestingTopothesia;TestingTopothesia1;TestingTopothesia4;TestingTopothesia100;");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnDate = new SearchCriteria();
        searchCriteriaSemiCorrectOnDate.setKey("date");
        searchCriteriaSemiCorrectOnDate.setOperation("<");
        searchCriteriaSemiCorrectOnDate.setValue("2018-11-11");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnTime = new SearchCriteria();
        searchCriteriaSemiCorrectOnTime.setKey("time");
        searchCriteriaSemiCorrectOnTime.setOperation("<");
        searchCriteriaSemiCorrectOnTime.setValue("11:11:12");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnDiarkeia = new SearchCriteria();
        searchCriteriaSemiCorrectOnDiarkeia.setKey("diarkeia");
        searchCriteriaSemiCorrectOnDiarkeia.setOperation("~");
        searchCriteriaSemiCorrectOnDiarkeia.setValue("TestingDiarkeia;TestingDiarkeia1;TestingDiarkeia4;TestingDiarkeia100;");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnTuposVlasthshs = new SearchCriteria();
        searchCriteriaSemiCorrectOnTuposVlasthshs.setKey("tuposVlasthshs");
        searchCriteriaSemiCorrectOnTuposVlasthshs.setOperation("~");
        searchCriteriaSemiCorrectOnTuposVlasthshs.setValue("TestingTuposVlasthshs;TestingTuposVlasthshs1;TestingTuposVlasthshs4;TestingTuposVlasthshs100;");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnTuposOikotopou = new SearchCriteria();
        searchCriteriaSemiCorrectOnTuposOikotopou.setKey("tuposOikotopou");
        searchCriteriaSemiCorrectOnTuposOikotopou.setOperation("~");
        searchCriteriaSemiCorrectOnTuposOikotopou.setValue("TestingTuposOikotopou;TestingTuposOikotopou1;TestingTuposOikotopou4;TestingTuposOikotopou100;");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnEpifaneiaDeigmatolhpsias = new SearchCriteria();
        searchCriteriaSemiCorrectOnEpifaneiaDeigmatolhpsias.setKey("epifaneiaDeigmatolhpsias");
        searchCriteriaSemiCorrectOnEpifaneiaDeigmatolhpsias.setOperation("<");
        searchCriteriaSemiCorrectOnEpifaneiaDeigmatolhpsias.setValue(1);

        // Init searchCriteria
        searchCriteriaSemiCorrectOnLatitudeEgsa = new SearchCriteria();
        searchCriteriaSemiCorrectOnLatitudeEgsa.setKey("latitudeEGSA");
        searchCriteriaSemiCorrectOnLatitudeEgsa.setOperation("~");
        searchCriteriaSemiCorrectOnLatitudeEgsa.setValue(000000.000000 + ";" + 111111.111111 + ";");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnLongitudeEgsa = new SearchCriteria();
        searchCriteriaSemiCorrectOnLongitudeEgsa.setKey("longitudeEGSA");
        searchCriteriaSemiCorrectOnLongitudeEgsa.setOperation("~");
        searchCriteriaSemiCorrectOnLongitudeEgsa.setValue(0000000.00000 + ";" + 1111111.11111 + ";");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnLatitudeWGS84 = new SearchCriteria();
        searchCriteriaSemiCorrectOnLatitudeWGS84.setKey("latitudeWGS84");
        searchCriteriaSemiCorrectOnLatitudeWGS84.setOperation("~");
        searchCriteriaSemiCorrectOnLatitudeWGS84.setValue(00.00000 + ";" + 11.11111 + ";");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnLongitudeWGS84 = new SearchCriteria();
        searchCriteriaSemiCorrectOnLongitudeWGS84.setKey("longitudeWGS84");
        searchCriteriaSemiCorrectOnLongitudeWGS84.setOperation("~");
        searchCriteriaSemiCorrectOnLongitudeWGS84.setValue(00.00000 + ";" + 11.11111 + ";");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnGridCell = new SearchCriteria();
        searchCriteriaSemiCorrectOnGridCell.setKey("gridCell");
        searchCriteriaSemiCorrectOnGridCell.setOperation("~");
        searchCriteriaSemiCorrectOnGridCell.setValue("TestingGridCell;TestingGridCell1;TestingGridCell4;TestingGridCell100;");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnKwdikosNatura = new SearchCriteria();
        searchCriteriaSemiCorrectOnKwdikosNatura.setKey("kwdikosNatura");
        searchCriteriaSemiCorrectOnKwdikosNatura.setOperation("~");
        searchCriteriaSemiCorrectOnKwdikosNatura.setValue("TestingKwdikosNatura;TestingKwdikosNatura1;TestingKwdikosNatura4;TestingKwdikosNatura100;");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnMethodosDeigmatolhpsias = new SearchCriteria();
        searchCriteriaSemiCorrectOnMethodosDeigmatolhpsias.setKey("methodosDeigmatolhpsias");
        searchCriteriaSemiCorrectOnMethodosDeigmatolhpsias.setOperation("~");
        searchCriteriaSemiCorrectOnMethodosDeigmatolhpsias.setValue("TestingMethodosDeigmatolhpsias;TestingMethodosDeigmatolhpsias1;TestingMethodosDeigmatolhpsias4;TestingMethodosDeigmatolhpsias100;");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnParathrhseis = new SearchCriteria();
        searchCriteriaSemiCorrectOnParathrhseis.setKey("parathrhseis");
        searchCriteriaSemiCorrectOnParathrhseis.setOperation("~");
        searchCriteriaSemiCorrectOnParathrhseis.setValue("TestingParathrhseis;TestingParathrhseis1;TestingParathrhseis4;TestingParathrhseis100;");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnNomos = new SearchCriteria();
        searchCriteriaSemiCorrectOnNomos.setKey("nomos");
        searchCriteriaSemiCorrectOnNomos.setOperation("~");
        searchCriteriaSemiCorrectOnNomos.setValue("TestingNomos;TestingNomos1;TestingNomos4;TestingNomos100;");



        // Init List<DeigmaThhlastikwn>
        deigmaThhlastikwnList = new ArrayList<>();

        // Init List<SearchCriteria>
        searchCriteriaList = new ArrayList<>();

    }

    @Test
    public void searchDeigmaThhlastikwnSortDescTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortAscTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 and 2 because of the sort Asc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.ASC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Asc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Asc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescMoreCriteriasThanExistTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaKwdikosDeigmatolhpsiasMoreThanExist = new SearchCriteria();
        searchCriteriaKwdikosDeigmatolhpsiasMoreThanExist.setKey("kwdikosDeigmatolhpsias");
        searchCriteriaKwdikosDeigmatolhpsiasMoreThanExist.setOperation("~");
        searchCriteriaKwdikosDeigmatolhpsiasMoreThanExist.setValue("TestingKwdikosDeigmatolhpsias1;TestingKwdikosDeigmatolhpsias2;TestingKwdikosDeigmatolhpsias3;TestingKwdikosDeigmatolhpsias100;");
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsiasMoreThanExist);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasEmptyTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 3 and 4 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned4);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test Empty search Criterias

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(5), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(3, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasEmptyPage2Test(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 and 2 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test Empty search Criterias

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 1, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(5), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(3, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasEmptyPage3Test(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 0 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test Empty search Criterias

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 2, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(5), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(3, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasXrhmatodothshTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasEreunhthsTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaEreunhths);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasTopothesiaTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaTopothesia);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasDateTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasTimeTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasDiarkeiaTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaDiarkeia);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasTuposVlasthshsTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasTuposOikotopouTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaTuposOikotopou);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescEpifaneiaDeigmatolhpsiasTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasLatitudeEGSATest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasLongitudeEGSATest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasLatitudeWGS84Test(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasLongitudeWGS84Test(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasGridCellTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaGridCell);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasKwdikosNaturaTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosNatura);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasMethodosDeigmatolhpsiasTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasParathrhseisTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaParathrhseis);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasNomosTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasKwdikosDeigmatolhpsiasTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasKwdikosDeigmatolhpsiasXrhmatodothshTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasKwdikosDeigmatolhpsiasXrhmatodothshEreunhthsTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasKwdikosDeigmatolhpsiasXrhmatodothshEreunhthsTopothesiaTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasKwdikosDeigmatolhpsiasXrhmatodothshEreunhthsTopothesiaDateTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasKwdikosDeigmatolhpsiasXrhmatodothshEreunhthsTopothesiaDateTimeTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasKwdikosDeigmatolhpsiasXrhmatodothshEreunhthsTopothesiaDateTimeDiarkeiaTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasKwdikosDeigmatolhpsiasXrhmatodothshEreunhthsTopothesiaDateTimeDiarkeiaTuposVlasthshsTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasKwdikosDeigmatolhpsiasXrhmatodothshEreunhthsTopothesiaDateTimeDiarkeiaTuposVlasthshsTuposOikotopouTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasKwdikosDeigmatolhpsiasXrhmatodothshEreunhthsTopothesiaDateTimeDiarkeiaTuposVlasthshsTuposOikotopouEpifaneiaDeigmatolhpsiasTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasKwdikosDeigmatolhpsiasXrhmatodothshEreunhthsTopothesiaDateTimeDiarkeiaTuposVlasthshsTuposOikotopouEpifaneiaDeigmatolhpsiasLatitudeEGSATest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasKwdikosDeigmatolhpsiasXrhmatodothshEreunhthsTopothesiaDateTimeDiarkeiaTuposVlasthshsTuposOikotopouEpifaneiaDeigmatolhpsiasLatitudeEGSALongitudeEGSATest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasKwdikosDeigmatolhpsiasXrhmatodothshEreunhthsTopothesiaDateTimeDiarkeiaTuposVlasthshsTuposOikotopouEpifaneiaDeigmatolhpsiasLatitudeEGSALongitudeEGSALatitudeWGS84Test(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasKwdikosDeigmatolhpsiasXrhmatodothshEreunhthsTopothesiaDateTimeDiarkeiaTuposVlasthshsTuposOikotopouEpifaneiaDeigmatolhpsiasLatitudeEGSALongitudeEGSALatitudeWGS84LongitudeWGS84Test(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasKwdikosDeigmatolhpsiasXrhmatodothshEreunhthsTopothesiaDateTimeDiarkeiaTuposVlasthshsTuposOikotopouEpifaneiaDeigmatolhpsiasLatitudeEGSALongitudeEGSALatitudeWGS84LongitudeWGS84GridCellTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasKwdikosDeigmatolhpsiasXrhmatodothshEreunhthsTopothesiaDateTimeDiarkeiaTuposVlasthshsTuposOikotopouEpifaneiaDeigmatolhpsiasLatitudeEGSALongitudeEGSALatitudeWGS84LongitudeWGS84GridCellKwdikosNaturaTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasKwdikosDeigmatolhpsiasXrhmatodothshEreunhthsTopothesiaDateTimeDiarkeiaTuposVlasthshsTuposOikotopouEpifaneiaDeigmatolhpsiasLatitudeEGSALongitudeEGSALatitudeWGS84LongitudeWGS84GridCellKwdikosNaturaMethodosDeigmatolhpsiasTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasKwdikosDeigmatolhpsiasXrhmatodothshEreunhthsTopothesiaDateTimeDiarkeiaTuposVlasthshsTuposOikotopouEpifaneiaDeigmatolhpsiasLatitudeEGSALongitudeEGSALatitudeWGS84LongitudeWGS84GridCellKwdikosNaturaMethodosDeigmatolhpsiasParathrhseisTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllKwdikosDeigmatolhpsiasXrhmatodothshEreunhthsTopothesiaDateTimeDiarkeiaTuposVlasthshsTuposOikotopouEpifaneiaDeigmatolhpsiasLatitudeEGSALongitudeEGSALatitudeWGS84LongitudeWGS84GridCellKwdikosNaturaMethodosDeigmatolhpsiasParathrhseisNomosTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(1).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndNotEqualOnKwdikosDeigmatolhpsiasTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected (  Empty )


        // Preparing to test
//        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaNotCorrectOnKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(0, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndNotEqualOnXrhmatodothshTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected (  Empty )


        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
//        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaNotCorrectOnXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(0, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndNotEqualOnEreunhthsTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected (  Empty )


        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
//        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaNotCorrectOnEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(0, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndNotEqualOnTopothesiaTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected (  Empty )


        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
//        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaNotCorrectOnTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(0, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndNotEqualOnDateTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected (  Empty )


        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
//        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
//        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaNotCorrectOnDate);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(0, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndNotEqualOnTimeTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected (  Empty )


        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
//        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
//        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaNotCorrectOnTime);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(0, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndNotEqualOnDiarkeiaTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected (  Empty )


        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
//        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaNotCorrectOnDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(0, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndNotEqualOnTuposVlasthshsTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected (  Empty )


        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
//        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaNotCorrectOnTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(0, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndNotEqualOnTuposOikotopouTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected (  Empty )


        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
//        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaNotCorrectOnTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(0, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndNotEqualOnEpifaneiaDeigmatolhpsiasTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected (  Empty )


        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
//        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
//        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaNotCorrectOnEpifaneiaDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(0, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndNotEqualOnLatitudeEGSATest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected (  Empty )


        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
//        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaNotCorrectOnLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(0, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndNotEqualOnLongitudeEGSATest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected (  Empty )


        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
//        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaNotCorrectOnLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(0, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndNotEqualOnLatitudeWGS84Test(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected (  Empty )


        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
//        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaNotCorrectOnLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(0, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndNotEqualOnLongitudeWGS84Test(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected (  Empty )


        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
//        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaNotCorrectOnLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(0, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndNotEqualOnGridCellTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected (  Empty )


        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
//        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaNotCorrectOnGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(0, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndNotEqualOnKwdikosNaturaTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected (  Empty )


        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
//        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaNotCorrectOnKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(0, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndNotEqualOnMethodosDeigmatolhpsiasTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected (  Empty )


        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
//        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaNotCorrectOnMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(0, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndNotEqualOnParathrhseisTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected (  Empty )


        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
//        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNotCorrectOnParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(0, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndNotEqualOnNomosTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected (  Empty )


        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
//        searchCriteriaList.add(searchCriteriaNomos);
        searchCriteriaList.add(searchCriteriaNotCorrectOnNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(0, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndSemiEqualOnKwdikosDeigmatolhpsiasTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 because of the sort Desc and Semi Equal )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
//        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndSemiEqualOnXrhmatodothshTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 because of the sort Desc and Semi Equal )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
//        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndSemiEqualOnEreunhthsTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 because of the sort Desc and Semi Equal )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
//        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndSemiEqualOnTopothesiaTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 because of the sort Desc and Semi Equal )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
//        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndSemiEqualOnDateTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 because of the sort Desc and Semi Equal )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
//        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
//        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnDate);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndSemiEqualOnTimeTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 because of the sort Desc and Semi Equal )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
//        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
//        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnTime);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndSemiEqualOnDiarkeiaTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 because of the sort Desc and Semi Equal )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
//        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndSemiEqualOnTuposVlasthshsTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 because of the sort Desc and Semi Equal )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
//        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndSemiEqualOnTuposOikotopouTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 because of the sort Desc and Semi Equal )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
//        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndSemiEqualOnEpifaneiaDeigmatolhpsiasTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 because of the sort Desc and Semi Equal )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
//        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
//        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnEpifaneiaDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndSemiEqualOnLatitudeEGSATest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 because of the sort Desc and Semi Equal )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
//        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndSemiEqualOnLongitudeEGSATest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 because of the sort Desc and Semi Equal )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
//        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndSemiEqualOnLatitudeWGS84Test(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 because of the sort Desc and Semi Equal )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
//        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndSemiEqualOnLongitudeWGS84Test(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 because of the sort Desc and Semi Equal )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
//        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndSemiEqualOnGridCellTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 because of the sort Desc and Semi Equal )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
//        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndSemiEqualOnKwdikosNaturaTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 because of the sort Desc and Semi Equal )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
//        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndSemiEqualOnMethodosDeigmatolhpsiasTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 because of the sort Desc and Semi Equal )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
//        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndSemiEqualOnParathrhseisTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 because of the sort Desc and Semi Equal )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
//        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnParathrhseis);
        searchCriteriaList.add(searchCriteriaNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void searchDeigmaThhlastikwnSortDescCriteriasAllAndsOrsAndSemiEqualOnNomosTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 because of the sort Desc and Semi Equal )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaXrhmatodothsh);
        searchCriteriaList.add(searchCriteriaEreunhths);
        searchCriteriaList.add(searchCriteriaTopothesia);
        searchCriteriaList.add(searchCriteriaDateMoreThan2018_11_11);
        searchCriteriaList.add(searchCriteriaDateLessThan2019_01_01);
        searchCriteriaList.add(searchCriteriaTimeMoreThan11_11_11);
        searchCriteriaList.add(searchCriteriaTimeLessThan13_13_13);
        searchCriteriaList.add(searchCriteriaDiarkeia);
        searchCriteriaList.add(searchCriteriaTuposVlasthshs);
        searchCriteriaList.add(searchCriteriaTuposOikotopou);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasMoreThan1);
        searchCriteriaList.add(searchCriteriaEpifaneiaDeigmatolhpsiasLessThan3);
        searchCriteriaList.add(searchCriteriaLatitudeEgsa);
        searchCriteriaList.add(searchCriteriaLongitudeEgsa);
        searchCriteriaList.add(searchCriteriaLatitudeWGS84);
        searchCriteriaList.add(searchCriteriaLongitudeWGS84);
        searchCriteriaList.add(searchCriteriaGridCell);
        searchCriteriaList.add(searchCriteriaKwdikosNatura);
        searchCriteriaList.add(searchCriteriaMethodosDeigmatolhpsias);
        searchCriteriaList.add(searchCriteriaParathrhseis);
//        searchCriteriaList.add(searchCriteriaNomos);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnNomos);

        // Get test method
        DeigmaThhlastikwnSearchDTO deigmaThhlastikwnSearchDTO = deigmaThhlastikwnSearchRepository
                .searchDeigmataThhlastikwn(searchCriteriaList, 2, 0, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnSearchDTO);
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnSearchDTO.getDeigmaThhlastikwnList().get(0).getNomos());
    }

    @Test
    public void downloadDeigmaThhlastikwnSortDescTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 and 2 and 3 because of the sort Desc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);

        // Get test method
        List<DeigmaThhlastikwn> deigmaThhlastikwnListReturned = deigmaThhlastikwnSearchRepository
                .downloadDeigmataThhlastikwn(searchCriteriaList, "Desc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnListReturned);
        assertEquals(3, deigmaThhlastikwnListReturned.size());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnListReturned.get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnListReturned.get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnListReturned.get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnListReturned.get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnListReturned.get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnListReturned.get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnListReturned.get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnListReturned.get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnListReturned.get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnListReturned.get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnListReturned.get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnListReturned.get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnListReturned.get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnListReturned.get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnListReturned.get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnListReturned.get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnListReturned.get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnListReturned.get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnListReturned.get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnListReturned.get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnListReturned.get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnListReturned.get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnListReturned.get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnListReturned.get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnListReturned.get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnListReturned.get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnListReturned.get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnListReturned.get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnListReturned.get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnListReturned.get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnListReturned.get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnListReturned.get(1).getNomos());

        assertEquals(deigmaThhlastikwnList.get(2).getId(), deigmaThhlastikwnListReturned.get(2).getId());
        assertEquals(deigmaThhlastikwnList.get(2).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(2).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(2).getXrhmatodothsh(), deigmaThhlastikwnListReturned.get(2).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(2).getEreunhths(), deigmaThhlastikwnListReturned.get(2).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(2).getTopothesia(), deigmaThhlastikwnListReturned.get(2).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(2).getDate(), deigmaThhlastikwnListReturned.get(2).getDate());
        assertEquals(deigmaThhlastikwnList.get(2).getTime(), deigmaThhlastikwnListReturned.get(2).getTime());
        assertEquals(deigmaThhlastikwnList.get(2).getDiarkeia(), deigmaThhlastikwnListReturned.get(2).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(2).getTuposVlasthshs(), deigmaThhlastikwnListReturned.get(2).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(2).getTuposOikotopou(), deigmaThhlastikwnListReturned.get(2).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(2).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(2).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(2).getLatitudeEGSA(), deigmaThhlastikwnListReturned.get(2).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(2).getLongitudeEGSA(), deigmaThhlastikwnListReturned.get(2).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(2).getLatitudeWGS84(), deigmaThhlastikwnListReturned.get(2).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(2).getLongitudeWGS84(), deigmaThhlastikwnListReturned.get(2).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(2).getKwdikosNatura(), deigmaThhlastikwnListReturned.get(2).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(2).getMethodosDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(2).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(2).getParathrhseis(), deigmaThhlastikwnListReturned.get(2).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(2).getNomos(), deigmaThhlastikwnListReturned.get(2).getNomos());
    }

    @Test
    public void downloadDeigmaThhlastikwnSortAscTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);
        DeigmaThhlastikwn deigmaThhlastikwnReturned4 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn4);

        // Preparing the expected ( 1 and 2 and 3 because of the sort Asc )
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned3);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.ASC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaKwdikosDeigmatolhpsias);

        // Get test method
        List<DeigmaThhlastikwn> deigmaThhlastikwnListReturned = deigmaThhlastikwnSearchRepository
                .downloadDeigmataThhlastikwn(searchCriteriaList, "Asc");


        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertNotNull(deigmaThhlastikwnReturned4);
        assertNotNull(deigmaThhlastikwnListReturned);
        assertEquals(3, deigmaThhlastikwnListReturned.size());

        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnListReturned.get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getXrhmatodothsh(), deigmaThhlastikwnListReturned.get(0).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(0).getEreunhths(), deigmaThhlastikwnListReturned.get(0).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(0).getTopothesia(), deigmaThhlastikwnListReturned.get(0).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(0).getDate(), deigmaThhlastikwnListReturned.get(0).getDate());
        assertEquals(deigmaThhlastikwnList.get(0).getTime(), deigmaThhlastikwnListReturned.get(0).getTime());
        assertEquals(deigmaThhlastikwnList.get(0).getDiarkeia(), deigmaThhlastikwnListReturned.get(0).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposVlasthshs(), deigmaThhlastikwnListReturned.get(0).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(0).getTuposOikotopou(), deigmaThhlastikwnListReturned.get(0).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(0).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(0).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeEGSA(), deigmaThhlastikwnListReturned.get(0).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeEGSA(), deigmaThhlastikwnListReturned.get(0).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnListReturned.get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnListReturned.get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosNatura(), deigmaThhlastikwnListReturned.get(0).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(0).getMethodosDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(0).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getParathrhseis(), deigmaThhlastikwnListReturned.get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(0).getNomos(), deigmaThhlastikwnListReturned.get(0).getNomos());

        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnListReturned.get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getXrhmatodothsh(), deigmaThhlastikwnListReturned.get(1).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(1).getEreunhths(), deigmaThhlastikwnListReturned.get(1).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(1).getTopothesia(), deigmaThhlastikwnListReturned.get(1).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(1).getDate(), deigmaThhlastikwnListReturned.get(1).getDate());
        assertEquals(deigmaThhlastikwnList.get(1).getTime(), deigmaThhlastikwnListReturned.get(1).getTime());
        assertEquals(deigmaThhlastikwnList.get(1).getDiarkeia(), deigmaThhlastikwnListReturned.get(1).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposVlasthshs(), deigmaThhlastikwnListReturned.get(1).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(1).getTuposOikotopou(), deigmaThhlastikwnListReturned.get(1).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(1).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(1).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeEGSA(), deigmaThhlastikwnListReturned.get(1).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeEGSA(), deigmaThhlastikwnListReturned.get(1).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnListReturned.get(1).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnListReturned.get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosNatura(), deigmaThhlastikwnListReturned.get(1).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(1).getMethodosDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(1).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getParathrhseis(), deigmaThhlastikwnListReturned.get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(1).getNomos(), deigmaThhlastikwnListReturned.get(1).getNomos());

        assertEquals(deigmaThhlastikwnList.get(2).getId(), deigmaThhlastikwnListReturned.get(2).getId());
        assertEquals(deigmaThhlastikwnList.get(2).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(2).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(2).getXrhmatodothsh(), deigmaThhlastikwnListReturned.get(2).getXrhmatodothsh());
        assertEquals(deigmaThhlastikwnList.get(2).getEreunhths(), deigmaThhlastikwnListReturned.get(2).getEreunhths());
        assertEquals(deigmaThhlastikwnList.get(2).getTopothesia(), deigmaThhlastikwnListReturned.get(2).getTopothesia());
        assertEquals(deigmaThhlastikwnList.get(2).getDate(), deigmaThhlastikwnListReturned.get(2).getDate());
        assertEquals(deigmaThhlastikwnList.get(2).getTime(), deigmaThhlastikwnListReturned.get(2).getTime());
        assertEquals(deigmaThhlastikwnList.get(2).getDiarkeia(), deigmaThhlastikwnListReturned.get(2).getDiarkeia());
        assertEquals(deigmaThhlastikwnList.get(2).getTuposVlasthshs(), deigmaThhlastikwnListReturned.get(2).getTuposVlasthshs());
        assertEquals(deigmaThhlastikwnList.get(2).getTuposOikotopou(), deigmaThhlastikwnListReturned.get(2).getTuposOikotopou());
        assertEquals(deigmaThhlastikwnList.get(2).getEpifaneiaDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(2).getEpifaneiaDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(2).getLatitudeEGSA(), deigmaThhlastikwnListReturned.get(2).getLatitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(2).getLongitudeEGSA(), deigmaThhlastikwnListReturned.get(2).getLongitudeEGSA());
        assertEquals(deigmaThhlastikwnList.get(2).getLatitudeWGS84(), deigmaThhlastikwnListReturned.get(2).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(2).getLongitudeWGS84(), deigmaThhlastikwnListReturned.get(2).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(2).getKwdikosNatura(), deigmaThhlastikwnListReturned.get(2).getKwdikosNatura());
        assertEquals(deigmaThhlastikwnList.get(2).getMethodosDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(2).getMethodosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(2).getParathrhseis(), deigmaThhlastikwnListReturned.get(2).getParathrhseis());
        assertEquals(deigmaThhlastikwnList.get(2).getNomos(), deigmaThhlastikwnListReturned.get(2).getNomos());
    }

}
