package com.teicm.kerkinibackend.repository.thhlastika;

import com.teicm.kerkinibackend.KerkinibackendApplication;
import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaEidh;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXEidh;
import com.teicm.kerkinibackend.repositories.thhlastika.CtThhlastikaEidhRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnXEidhRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnXEidhSearchRepository;
import com.teicm.kerkinibackend.v1.models.SearchCriteria;
import com.teicm.kerkinibackend.v1.models.thhlastika.DeigmaThhlastikwnXEidhSearchDTO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@Transactional
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = KerkinibackendApplication.class)
@TestPropertySource(locations = "classpath:application-integrationtest.properties")
@RunWith(SpringRunner.class)
public class DeigmaThhlastikwnXEidhSearchRepositoryIT {

    @Autowired
    DeigmaThhlastikwnXEidhRepository deigmaThhlastikwnXEidhRepository;

    @Autowired
    DeigmaThhlastikwnXEidhSearchRepository deigmaThhlastikwnXEidhSearchRepository;

    @Autowired
    DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    @Autowired
    CtThhlastikaEidhRepository ctThhlastikaEidhRepository;

    private List<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidhList;

    private DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh;

    private DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh1;

    private DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh2;

    private DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh3;

    private DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh4;

    private DeigmaThhlastikwn deigmaThhlastikwn;

    private DeigmaThhlastikwn deigmaThhlastikwn1;

    private DeigmaThhlastikwn deigmaThhlastikwn2;

    private CtThhlastikaEidh ctThhlastikaEidh;

    private CtThhlastikaEidh ctThhlastikaEidh1;

    private CtThhlastikaEidh ctThhlastikaEidh2;

    private List<SearchCriteria> searchCriteriaList;

    private SearchCriteria searchCriteriaSxetikhAfthonia;

    private SearchCriteria searchCriteriaParathrhseis;

    private SearchCriteria searchCriteriaHlikia;

    private SearchCriteria searchCriteriaFulo;

    private SearchCriteria searchCriteriaPlhthosMoreThan1;

    private SearchCriteria searchCriteriaPlhthosLessThan3;

    private SearchCriteria searchCriteriaEokParII;

    private SearchCriteria searchCriteriaEokParIV;

    private SearchCriteria searchCriteriaEokParV;

    private SearchCriteria searchCriteriaDeigmaThhlastikwn;

    private SearchCriteria searchCriteriaCt;

    private SearchCriteria searchCriteriaNotCorrectOnDeigmaThhlastikwnId;

    private SearchCriteria searchCriteriaSemiCorrectOnDeigmaThhlastikwnId;

    private SearchCriteria searchCriteriaNotCorrectOnCtEidos;

    private SearchCriteria searchCriteriaSemiCorrectOnCtEidos;

    private SearchCriteria searchCriteriaNotCorrectOnSxetikhAfthonia;

    private SearchCriteria searchCriteriaSemiCorrectOnSxetikhAfthonia;

    private SearchCriteria searchCriteriaNotCorrectOnParathrhseis;

    private SearchCriteria searchCriteriaSemiCorrectOnParathrhseis;

    private SearchCriteria searchCriteriaNotCorrectOnHlikia;

    private SearchCriteria searchCriteriaSemiCorrectOnHlikia;

    private SearchCriteria searchCriteriaNotCorrectOnFulo;

    private SearchCriteria searchCriteriaSemiCorrectOnFulo;

    private SearchCriteria searchCriteriaNotCorrectOnPlhthos;

    private SearchCriteria searchCriteriaSemiCorrectOnPlhthos;

    // For eokPar not needed semiEqual tests
    private SearchCriteria searchCriteriaNotCorrectOnEokParII;

    private SearchCriteria searchCriteriaNotCorrectOnEokParIV;

    private SearchCriteria searchCriteriaNotCorrectOnEokParV;




    @Before
    public void setUp(){
        // Init deigmaThhlastikwnXEidh
        deigmaThhlastikwnXEidh = new DeigmaThhlastikwnXEidh();
        deigmaThhlastikwnXEidh.setSxetikhAfthonia("TestingSxetikhAfthonia");
        deigmaThhlastikwnXEidh.setParathrhseis("TestingParathrhseis");
        deigmaThhlastikwnXEidh.setHlikia("TestingHlikia");
        deigmaThhlastikwnXEidh.setFulo("TestingFulo");
        deigmaThhlastikwnXEidh.setPlhthos(0);
        deigmaThhlastikwnXEidh.setEokParII(false);
        deigmaThhlastikwnXEidh.setEokParIV(true);
        deigmaThhlastikwnXEidh.setEokParV(true);

        // Init deigmaThhlastikwnXEidh
        deigmaThhlastikwnXEidh1 = new DeigmaThhlastikwnXEidh();
        deigmaThhlastikwnXEidh1.setSxetikhAfthonia("TestingSxetikhAfthonia1");
        deigmaThhlastikwnXEidh1.setParathrhseis("TestingParathrhseis1");
        deigmaThhlastikwnXEidh1.setHlikia("TestingHlikia1");
        deigmaThhlastikwnXEidh1.setFulo("TestingFulo1");
        deigmaThhlastikwnXEidh1.setPlhthos(1);
        deigmaThhlastikwnXEidh1.setEokParII(true);
        deigmaThhlastikwnXEidh1.setEokParIV(false);
        deigmaThhlastikwnXEidh1.setEokParV(false);

        // Init deigmaThhlastikwnXEidh
        deigmaThhlastikwnXEidh2 = new DeigmaThhlastikwnXEidh();
        deigmaThhlastikwnXEidh2.setSxetikhAfthonia("TestingSxetikhAfthonia2");
        deigmaThhlastikwnXEidh2.setParathrhseis("TestingParathrhseis2");
        deigmaThhlastikwnXEidh2.setHlikia("TestingHlikia2");
        deigmaThhlastikwnXEidh2.setFulo("TestingFulo2");
        deigmaThhlastikwnXEidh2.setPlhthos(2);
        deigmaThhlastikwnXEidh2.setEokParII(true);
        deigmaThhlastikwnXEidh2.setEokParIV(false);
        deigmaThhlastikwnXEidh2.setEokParV(false);

        // Init deigmaThhlastikwnXEidh
        deigmaThhlastikwnXEidh3 = new DeigmaThhlastikwnXEidh();
        deigmaThhlastikwnXEidh3.setSxetikhAfthonia("TestingSxetikhAfthonia3");
        deigmaThhlastikwnXEidh3.setParathrhseis("TestingParathrhseis3");
        deigmaThhlastikwnXEidh3.setHlikia("TestingHlikia3");
        deigmaThhlastikwnXEidh3.setFulo("TestingFulo3");
        deigmaThhlastikwnXEidh3.setPlhthos(3);
        deigmaThhlastikwnXEidh3.setEokParII(true);
        deigmaThhlastikwnXEidh3.setEokParIV(false);
        deigmaThhlastikwnXEidh3.setEokParV(false);

        // Init deigmaThhlastikwnXEidh
        deigmaThhlastikwnXEidh4 = new DeigmaThhlastikwnXEidh();
        deigmaThhlastikwnXEidh4.setSxetikhAfthonia("TestingSxetikhAfthonia4");
        deigmaThhlastikwnXEidh4.setParathrhseis("TestingParathrhseis4");
        deigmaThhlastikwnXEidh4.setHlikia("TestingHlikia4");
        deigmaThhlastikwnXEidh4.setFulo("TestingFulo4");
        deigmaThhlastikwnXEidh4.setPlhthos(4);
        deigmaThhlastikwnXEidh4.setEokParII(false);
        deigmaThhlastikwnXEidh4.setEokParIV(true);
        deigmaThhlastikwnXEidh4.setEokParV(true);


        // Init deigmaThhlastikwn
        deigmaThhlastikwn = new DeigmaThhlastikwn();
        deigmaThhlastikwn.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias");

        // Init deigmaThhlastikwn
        deigmaThhlastikwn1 = new DeigmaThhlastikwn();
        deigmaThhlastikwn1.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias1");

        // Init deigmaThhlastikwn
        deigmaThhlastikwn2 = new DeigmaThhlastikwn();
        deigmaThhlastikwn2.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias2");

        // Init ctThhlastikaEidos
        ctThhlastikaEidh = new CtThhlastikaEidh();
        ctThhlastikaEidh.setEidos("TestingEidos");

        // Init ctThhlastikaEidos
        ctThhlastikaEidh1 = new CtThhlastikaEidh();
        ctThhlastikaEidh1.setEidos("TestingEidos1");

        // Init ctThhlastikaEidos
        ctThhlastikaEidh2 = new CtThhlastikaEidh();
        ctThhlastikaEidh2.setEidos("TestingEidos2");

        // Init searchCriteria
        searchCriteriaSxetikhAfthonia = new SearchCriteria();
        searchCriteriaSxetikhAfthonia.setKey("sxetikhAfthonia");
        searchCriteriaSxetikhAfthonia.setOperation("~");
        searchCriteriaSxetikhAfthonia.setValue("TestingSxetikhAfthonia1;TestingSxetikhAfthonia2;TestingSxetikhAfthonia3;");

        // Init searchCriteria
        searchCriteriaParathrhseis = new SearchCriteria();
        searchCriteriaParathrhseis.setKey("parathrhseis");
        searchCriteriaParathrhseis.setOperation("~");
        searchCriteriaParathrhseis.setValue("TestingParathrhseis1;TestingParathrhseis2;TestingParathrhseis3;");

        // Init searchCriteria
        searchCriteriaHlikia = new SearchCriteria();
        searchCriteriaHlikia.setKey("hlikia");
        searchCriteriaHlikia.setOperation("~");
        searchCriteriaHlikia.setValue("TestingHlikia1;TestingHlikia2;TestingHlikia3;");

        // Init searchCriteria
        searchCriteriaFulo = new SearchCriteria();
        searchCriteriaFulo.setKey("fulo");
        searchCriteriaFulo.setOperation("~");
        searchCriteriaFulo.setValue("TestingFulo1;TestingFulo2;TestingFulo3;");

        // Init searchCriteria
        searchCriteriaPlhthosMoreThan1 = new SearchCriteria();
        searchCriteriaPlhthosMoreThan1.setKey("plhthos");
        searchCriteriaPlhthosMoreThan1.setOperation(">");
        searchCriteriaPlhthosMoreThan1.setValue(1);

        // Init searchCriteria
        searchCriteriaPlhthosLessThan3 = new SearchCriteria();
        searchCriteriaPlhthosLessThan3.setKey("plhthos");
        searchCriteriaPlhthosLessThan3.setOperation("<");
        searchCriteriaPlhthosLessThan3.setValue(3);

        // Init searchCriteria
        searchCriteriaEokParII = new SearchCriteria();
        searchCriteriaEokParII.setKey("eokParII");
        searchCriteriaEokParII.setOperation("~");
        searchCriteriaEokParII.setValue(true);

        // Init searchCriteria
        searchCriteriaEokParIV = new SearchCriteria();
        searchCriteriaEokParIV.setKey("eokParIV");
        searchCriteriaEokParIV.setOperation("~");
        searchCriteriaEokParIV.setValue(false);

        // Init searchCriteria
        searchCriteriaEokParV = new SearchCriteria();
        searchCriteriaEokParV.setKey("eokParV");
        searchCriteriaEokParV.setOperation("~");
        searchCriteriaEokParV.setValue(false);

        // Init searchCriteria
        searchCriteriaNotCorrectOnSxetikhAfthonia = new SearchCriteria();
        searchCriteriaNotCorrectOnSxetikhAfthonia.setKey("sxetikhAfthonia");
        searchCriteriaNotCorrectOnSxetikhAfthonia.setOperation("~");
        searchCriteriaNotCorrectOnSxetikhAfthonia.setValue("TestingSxetikhAfthonia;TestingSxetikhAfthonia4;TestingSxetikhAfthonia100;");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnSxetikhAfthonia = new SearchCriteria();
        searchCriteriaSemiCorrectOnSxetikhAfthonia.setKey("sxetikhAfthonia");
        searchCriteriaSemiCorrectOnSxetikhAfthonia.setOperation("~");
        searchCriteriaSemiCorrectOnSxetikhAfthonia.setValue("TestingSxetikhAfthonia;TestingSxetikhAfthonia1;TestingSxetikhAfthonia4;");

        // Init searchCriteria
        searchCriteriaNotCorrectOnParathrhseis = new SearchCriteria();
        searchCriteriaNotCorrectOnParathrhseis.setKey("parathrhseis");
        searchCriteriaNotCorrectOnParathrhseis.setOperation("~");
        searchCriteriaNotCorrectOnParathrhseis.setValue("TestingParathrhseis;TestingParathrhseis4;TestingParathrhseis100;");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnParathrhseis = new SearchCriteria();
        searchCriteriaSemiCorrectOnParathrhseis.setKey("parathrhseis");
        searchCriteriaSemiCorrectOnParathrhseis.setOperation("~");
        searchCriteriaSemiCorrectOnParathrhseis.setValue("TestingParathrhseis;TestingParathrhseis1;TestingParathrhseis4;");

        // Init searchCriteria
        searchCriteriaNotCorrectOnHlikia = new SearchCriteria();
        searchCriteriaNotCorrectOnHlikia.setKey("hlikia");
        searchCriteriaNotCorrectOnHlikia.setOperation("~");
        searchCriteriaNotCorrectOnHlikia.setValue("TestingHlikia;TestingHlikia4;TestingHlikia100;");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnHlikia = new SearchCriteria();
        searchCriteriaSemiCorrectOnHlikia.setKey("hlikia");
        searchCriteriaSemiCorrectOnHlikia.setOperation("~");
        searchCriteriaSemiCorrectOnHlikia.setValue("TestingHlikia;TestingHlikia1;TestingHlikia4;");

        // Init searchCriteria
        searchCriteriaNotCorrectOnFulo = new SearchCriteria();
        searchCriteriaNotCorrectOnFulo.setKey("fulo");
        searchCriteriaNotCorrectOnFulo.setOperation("~");
        searchCriteriaNotCorrectOnFulo.setValue("TestingFulo;TestingFulo4;TestingFulo100;");

        // Init searchCriteria
        searchCriteriaSemiCorrectOnFulo = new SearchCriteria();
        searchCriteriaSemiCorrectOnFulo.setKey("fulo");
        searchCriteriaSemiCorrectOnFulo.setOperation("~");
        searchCriteriaSemiCorrectOnFulo.setValue("TestingFulo;TestingFulo1;TestingFulo4;");

        // Init searchCriteria
        searchCriteriaNotCorrectOnPlhthos = new SearchCriteria();
        searchCriteriaNotCorrectOnPlhthos.setKey("plhthos");
        searchCriteriaNotCorrectOnPlhthos.setOperation(">");
        searchCriteriaNotCorrectOnPlhthos.setValue(4);

        // Init searchCriteria
        searchCriteriaSemiCorrectOnPlhthos = new SearchCriteria();
        searchCriteriaSemiCorrectOnPlhthos.setKey("plhthos");
        searchCriteriaSemiCorrectOnPlhthos.setOperation("<");
        searchCriteriaSemiCorrectOnPlhthos.setValue(1);

        // Init searchCriteria
        searchCriteriaNotCorrectOnEokParII = new SearchCriteria();
        searchCriteriaNotCorrectOnEokParII.setKey("eokParII");
        searchCriteriaNotCorrectOnEokParII.setOperation("~");
        searchCriteriaNotCorrectOnEokParII.setValue(false);

        // Init searchCriteria
        searchCriteriaNotCorrectOnEokParIV = new SearchCriteria();
        searchCriteriaNotCorrectOnEokParIV.setKey("eokParIV");
        searchCriteriaNotCorrectOnEokParIV.setOperation("~");
        searchCriteriaNotCorrectOnEokParIV.setValue(true);

        // Init searchCriteria
        searchCriteriaNotCorrectOnEokParV = new SearchCriteria();
        searchCriteriaNotCorrectOnEokParV.setKey("eokParV");
        searchCriteriaNotCorrectOnEokParV.setOperation("~");
        searchCriteriaNotCorrectOnEokParV.setValue(true);



        // Init searchCriteria
        searchCriteriaDeigmaThhlastikwn = new SearchCriteria();
        searchCriteriaDeigmaThhlastikwn.setKey("deigmaThhlastikwn");
        searchCriteriaDeigmaThhlastikwn.setOperation("~");
        // --- Value to be set in each of tests depending on the returned DeigmaThhlastikwn
        searchCriteriaDeigmaThhlastikwn.setValue(null);

        // Init searchCriteria
        searchCriteriaCt = new SearchCriteria();
        searchCriteriaCt.setKey("ctThhlastikaPressThreats");
        searchCriteriaCt.setOperation("~");
        // --- Value to be set in each of tests depending on the returned CtThhlastikaPressThreats
        searchCriteriaCt.setValue(null);


        // Init searchCriteria
        searchCriteriaNotCorrectOnDeigmaThhlastikwnId = new SearchCriteria();
        searchCriteriaNotCorrectOnDeigmaThhlastikwnId.setKey("deigmaThhlastikwn");
        searchCriteriaNotCorrectOnDeigmaThhlastikwnId.setOperation("~");
        // To setup in the tests
        searchCriteriaNotCorrectOnDeigmaThhlastikwnId.setValue(null);


        // Init searchCriteria
        searchCriteriaSemiCorrectOnDeigmaThhlastikwnId = new SearchCriteria();
        searchCriteriaSemiCorrectOnDeigmaThhlastikwnId.setKey("deigmaThhlastikwn");
        searchCriteriaSemiCorrectOnDeigmaThhlastikwnId.setOperation("~");
        // To set in the tests
        searchCriteriaSemiCorrectOnDeigmaThhlastikwnId.setValue(null);


        // Init searchCriteria
        searchCriteriaNotCorrectOnCtEidos = new SearchCriteria();
        searchCriteriaNotCorrectOnCtEidos.setKey("ctThhlastikaEidh");
        searchCriteriaNotCorrectOnCtEidos.setOperation("~");
        // To setup in the tests
        searchCriteriaNotCorrectOnCtEidos.setValue(null);


        // Init searchCriteria
        searchCriteriaSemiCorrectOnCtEidos = new SearchCriteria();
        searchCriteriaSemiCorrectOnCtEidos.setKey("ctThhlastikaEidh");
        searchCriteriaSemiCorrectOnCtEidos.setOperation("~");
        // To set in the tests
        searchCriteriaSemiCorrectOnCtEidos.setValue(null);


        // Init List<SearchCriteria>
        searchCriteriaList = new ArrayList<>();

        // Init List<DeigmaThhlastikwnXEidh>
        deigmaThhlastikwnXEidhList = new ArrayList<>();


    }


    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned3);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortAscTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Asc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.ASC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Asc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Asc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhMoreCriteriasThanExistsTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned3);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaMoreThanExists = new SearchCriteria();
        searchCriteriaMoreThanExists.setKey("sxetikhAfthonia");
        searchCriteriaMoreThanExists.setOperation("~");
        searchCriteriaMoreThanExists.setValue("TestingSxetikhAfthonia1;TestingSxetikhAfthonia2;TestingSxetikhAfthonia3;TestingSxetikhAfthonia100;");

        searchCriteriaList.add(searchCriteriaMoreThanExists);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhCriteriasEmptyTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 3 and 4 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned3);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned4);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test



        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(5), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(3, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhCriteriasEmptyPage2Test(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test



        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 1, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(5), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(3, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhCriteriasEmptyPage3Test(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 0 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test



        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 2, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(5), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(3, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaParathrhseisTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned3);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaParathrhseis);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaHlikiaTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned3);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaHlikia);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaFuloTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned3);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaFulo);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaPlhthosMoreThan1AndPlhthosLessThan3Test(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned3);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaEokParIITest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned3);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaEokParII);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaEokParIVTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned3);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaEokParIV);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaEokParVTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned3);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaEokParV);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortAscCriteriaParathrhseisTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Asc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.ASC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaParathrhseis);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Asc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Asc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortAscCriteriaHlikiaTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Asc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.ASC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaHlikia);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Asc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Asc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortAscCriteriaFuloTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Asc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.ASC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaFulo);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Asc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Asc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortAscCriteriaPlhthosMoreThan1AndPlhthosLessThan3Test(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Asc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.ASC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Asc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Asc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortAscCriteriaEokParIITest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Asc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.ASC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaEokParII);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Asc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Asc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortAscCriteriaEokParIVTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Asc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.ASC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaEokParIV);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Asc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Asc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortAscCriteriaEokParVTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Asc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.ASC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaEokParV);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Asc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Asc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaMoreThanExistsSxetikhAfthoniaTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned3);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaSxetikhAfthoniaMoreThanExists = new SearchCriteria();
        searchCriteriaSxetikhAfthoniaMoreThanExists.setKey("sxetikhAfthonia");
        searchCriteriaSxetikhAfthoniaMoreThanExists.setOperation("~");
        searchCriteriaSxetikhAfthoniaMoreThanExists.setValue("TestingSxetikhAfthonia1;TestingSxetikhAfthonia2;TestingSxetikhAfthonia3;");
        searchCriteriaList.add(searchCriteriaSxetikhAfthoniaMoreThanExists);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaMoreThanExistsParathrhseisTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned3);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaParathrhseisMoreThanExists = new SearchCriteria();
        searchCriteriaParathrhseisMoreThanExists.setKey("parathrhseis");
        searchCriteriaParathrhseisMoreThanExists.setOperation("~");
        searchCriteriaParathrhseisMoreThanExists.setValue("TestingParathrhseis1;TestingParathrhseis2;TestingParathrhseis3;");
        searchCriteriaList.add(searchCriteriaParathrhseisMoreThanExists);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaMoreThanExistsHlikiaTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned3);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaHlikiaMoreThanExists = new SearchCriteria();
        searchCriteriaHlikiaMoreThanExists.setKey("hlikia");
        searchCriteriaHlikiaMoreThanExists.setOperation("~");
        searchCriteriaHlikiaMoreThanExists.setValue("TestingHlikia1;TestingHlikia2;TestingHlikia3;");
        searchCriteriaList.add(searchCriteriaHlikiaMoreThanExists);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaMoreThanExistsFuloTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned3);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaFuloMoreThanExists = new SearchCriteria();
        searchCriteriaFuloMoreThanExists.setKey("fulo");
        searchCriteriaFuloMoreThanExists.setOperation("~");
        searchCriteriaFuloMoreThanExists.setValue("TestingFulo1;TestingFulo2;TestingFulo3;TestingFulo100;");
        searchCriteriaList.add(searchCriteriaFulo);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(3), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(1).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescDeigmaThhlastikwnIdTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCtEidosTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaCtEidos);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescDeigmaThhlastikwnIdSxetikhAfthoniaTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCtEidosSxetikhAfthoniaTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 2, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescDeigmaThhlastikwnIdCtEidosSxetikhAfthoniaTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned2);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";" + deigmaThhlastikwnReturned2.getId() + ";");
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";" + ctThhlastikaEidhReturned2.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaCtEidos);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(2), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescDeigmaThhlastikwnIdCtEidosSxetikhAfthoniaParathrhseisTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned2);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";" + deigmaThhlastikwnReturned2.getId() + ";");
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";" + ctThhlastikaEidhReturned2.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaParathrhseis);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(2), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescDeigmaThhlastikwnIdCtEidosSxetikhAfthoniaHlikiaTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned2);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";" + deigmaThhlastikwnReturned2.getId() + ";");
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";" + ctThhlastikaEidhReturned2.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(2), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescDeigmaThhlastikwnIdCtEidosSxetikhAfthoniaHlikiaFuloTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned2);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";" + deigmaThhlastikwnReturned2.getId() + ";");
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";" + ctThhlastikaEidhReturned2.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaFulo);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(2), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescDeigmaThhlastikwnIdCtEidosSxetikhAfthoniaHlikiaFuloPlhthosMoreThan1PlhthosLessThan3Test(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned2);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";" + deigmaThhlastikwnReturned2.getId() + ";");
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";" + ctThhlastikaEidhReturned2.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaFulo);
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(2), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescDeigmaThhlastikwnIdCtEidosSxetikhAfthoniaHlikiaFuloPlhthosMoreThan1PlhthosLessThan3EokParIITest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned2);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";" + deigmaThhlastikwnReturned2.getId() + ";");
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";" + ctThhlastikaEidhReturned2.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaFulo);
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
        searchCriteriaList.add(searchCriteriaEokParII);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(2), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescDeigmaThhlastikwnIdCtEidosSxetikhAfthoniaHlikiaFuloPlhthosMoreThan1PlhthosLessThan3EokParIIEokParIVTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned2);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";" + deigmaThhlastikwnReturned2.getId() + ";");
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";" + ctThhlastikaEidhReturned2.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaFulo);
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
        searchCriteriaList.add(searchCriteriaEokParII);
        searchCriteriaList.add(searchCriteriaEokParIV);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(2), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaAllDeigmaThhlastikwnIdCtEidosSxetikhAfthoniaHlikiaFuloPlhthosMoreThan1PlhthosLessThan3EokParIIEokParIVEokParVTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned2);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";" + deigmaThhlastikwnReturned2.getId() + ";");
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";" + ctThhlastikaEidhReturned2.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaFulo);
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
        searchCriteriaList.add(searchCriteriaEokParII);
        searchCriteriaList.add(searchCriteriaEokParIV);
        searchCriteriaList.add(searchCriteriaEokParV);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(2), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(2, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertTrue(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaAllAndsOrsAndNotEqualOnDeigmaThhlastikwnIdTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
//        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";");
//        searchCriteriaList.add(searchCriteriaDeigmaId);
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaFulo);
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
        searchCriteriaList.add(searchCriteriaEokParII);
        searchCriteriaList.add(searchCriteriaEokParIV);
        searchCriteriaList.add(searchCriteriaEokParV);

        searchCriteriaNotCorrectOnDeigmaThhlastikwnId.setValue(100 + ";");
        searchCriteriaList.add(searchCriteriaNotCorrectOnDeigmaThhlastikwnId);


        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaAllAndsOrsAndNotEqualOnCtEidosTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
//        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";");
//        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaFulo);
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
        searchCriteriaList.add(searchCriteriaEokParII);
        searchCriteriaList.add(searchCriteriaEokParIV);
        searchCriteriaList.add(searchCriteriaEokParV);

        searchCriteriaNotCorrectOnCtEidos.setValue("TestingCtEidos100;");
        searchCriteriaList.add(searchCriteriaNotCorrectOnCtEidos);



        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaAllAndsOrsAndNotEqualOnSxetikhAfthoniaTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaCtEidos);
//        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaNotCorrectOnSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaFulo);
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
        searchCriteriaList.add(searchCriteriaEokParII);
        searchCriteriaList.add(searchCriteriaEokParIV);
        searchCriteriaList.add(searchCriteriaEokParV);


        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaAllAndsOrsAndNotEqualOnParathrhseisTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
//        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaNotCorrectOnParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaFulo);
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
        searchCriteriaList.add(searchCriteriaEokParII);
        searchCriteriaList.add(searchCriteriaEokParIV);
        searchCriteriaList.add(searchCriteriaEokParV);


        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaAllAndsOrsAndNotEqualOnHlikiaTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaParathrhseis);
//        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaNotCorrectOnHlikia);
        searchCriteriaList.add(searchCriteriaFulo);
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
        searchCriteriaList.add(searchCriteriaEokParII);
        searchCriteriaList.add(searchCriteriaEokParIV);
        searchCriteriaList.add(searchCriteriaEokParV);


        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaAllAndsOrsAndNotEqualOnFuloTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
//        searchCriteriaList.add(searchCriteriaFulo);
        searchCriteriaList.add(searchCriteriaNotCorrectOnFulo);
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
        searchCriteriaList.add(searchCriteriaEokParII);
        searchCriteriaList.add(searchCriteriaEokParIV);
        searchCriteriaList.add(searchCriteriaEokParV);


        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaAllAndsOrsAndNotEqualOnPlhthosTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaFulo);
//        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
//        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
        searchCriteriaList.add(searchCriteriaNotCorrectOnPlhthos);
        searchCriteriaList.add(searchCriteriaEokParII);
        searchCriteriaList.add(searchCriteriaEokParIV);
        searchCriteriaList.add(searchCriteriaEokParV);


        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaAllAndsOrsAndNotEqualOnEokParIITest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaFulo);
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
//        searchCriteriaList.add(searchCriteriaEokParII);
        searchCriteriaList.add(searchCriteriaNotCorrectOnEokParII);
        searchCriteriaList.add(searchCriteriaEokParIV);
        searchCriteriaList.add(searchCriteriaEokParV);


        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaAllAndsOrsAndNotEqualOnEokParIVTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaFulo);
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
        searchCriteriaList.add(searchCriteriaEokParII);
//        searchCriteriaList.add(searchCriteriaEokParIV);
        searchCriteriaList.add(searchCriteriaNotCorrectOnEokParIV);
        searchCriteriaList.add(searchCriteriaEokParV);


        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaAllAndsOrsAndNotEqualOnEokParVTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaFulo);
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
        searchCriteriaList.add(searchCriteriaEokParII);
        searchCriteriaList.add(searchCriteriaEokParIV);
//        searchCriteriaList.add(searchCriteriaEokParV);
        searchCriteriaList.add(searchCriteriaNotCorrectOnEokParV);


        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaAllAndsOrsAndSemiEqualOnDeigmaThhlastikwnIdTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned2);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
//        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";" + deigmaThhlastikwnReturned2.getId() + ";");
        searchCriteriaSemiCorrectOnDeigmaThhlastikwnId.setValue(deigmaThhlastikwnReturned1.getId() + ";");
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";" + ctThhlastikaEidhReturned2.getEidos() + ";");
//        searchCriteriaList.add(searchCriteriaDeigmaId);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnDeigmaThhlastikwnId);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaFulo);
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
        searchCriteriaList.add(searchCriteriaEokParII);
        searchCriteriaList.add(searchCriteriaEokParIV);
        searchCriteriaList.add(searchCriteriaEokParV);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaAllAndsOrsAndSemiEqualOnCtEidhTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned2);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";" + deigmaThhlastikwnReturned2.getId() + ";");
//        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";" + ctThhlastikaEidhReturned2.getEidos() + ";");
        searchCriteriaSemiCorrectOnCtEidos.setValue(ctThhlastikaEidhReturned1.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
//        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnCtEidos);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaFulo);
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
        searchCriteriaList.add(searchCriteriaEokParII);
        searchCriteriaList.add(searchCriteriaEokParIV);
        searchCriteriaList.add(searchCriteriaEokParV);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaAllAndsOrsAndSemiEqualOnSxetikhAfthoniaTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned2);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";" + deigmaThhlastikwnReturned2.getId() + ";");
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";" + ctThhlastikaEidhReturned2.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
//        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaFulo);
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
        searchCriteriaList.add(searchCriteriaEokParII);
        searchCriteriaList.add(searchCriteriaEokParIV);
        searchCriteriaList.add(searchCriteriaEokParV);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaAllAndsOrsAndSemiEqualOnParathrhseisTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned2);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";" + deigmaThhlastikwnReturned2.getId() + ";");
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";" + ctThhlastikaEidhReturned2.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaCtEidos);
//        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaFulo);
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
        searchCriteriaList.add(searchCriteriaEokParII);
        searchCriteriaList.add(searchCriteriaEokParIV);
        searchCriteriaList.add(searchCriteriaEokParV);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaAllAndsOrsAndSemiEqualOnHlikiaTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned2);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";" + deigmaThhlastikwnReturned2.getId() + ";");
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";" + ctThhlastikaEidhReturned2.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaParathrhseis);
//        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnHlikia);
        searchCriteriaList.add(searchCriteriaFulo);
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
        searchCriteriaList.add(searchCriteriaEokParII);
        searchCriteriaList.add(searchCriteriaEokParIV);
        searchCriteriaList.add(searchCriteriaEokParV);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaAllAndsOrsAndSemiEqualOnFuloTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned2);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";" + deigmaThhlastikwnReturned2.getId() + ";");
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";" + ctThhlastikaEidhReturned2.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
//        searchCriteriaList.add(searchCriteriaFulo);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnFulo);
        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
        searchCriteriaList.add(searchCriteriaEokParII);
        searchCriteriaList.add(searchCriteriaEokParIV);
        searchCriteriaList.add(searchCriteriaEokParV);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void searchDeigmaThhlastikwnXEidhSortDescCriteriaAllAndsOrsAndSemiEqualOnPlhthosTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);
        CtThhlastikaEidh ctThhlastikaEidhReturned1 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh1);
        CtThhlastikaEidh ctThhlastikaEidhReturned2 = ctThhlastikaEidhRepository.save(ctThhlastikaEidh2);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned1);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned2);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned2);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        SearchCriteria searchCriteriaDeigmaId = new SearchCriteria("deigmaThhlastikwn", "~", deigmaThhlastikwnReturned1.getId() + ";" + deigmaThhlastikwnReturned2.getId() + ";");
        SearchCriteria searchCriteriaCtEidos = new SearchCriteria("ctThhlastikaEidh", "~", ctThhlastikaEidhReturned1.getEidos() + ";" + ctThhlastikaEidhReturned2.getEidos() + ";");
        searchCriteriaList.add(searchCriteriaDeigmaId);
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);
        searchCriteriaList.add(searchCriteriaCtEidos);
        searchCriteriaList.add(searchCriteriaParathrhseis);
        searchCriteriaList.add(searchCriteriaHlikia);
        searchCriteriaList.add(searchCriteriaFulo);
//        searchCriteriaList.add(searchCriteriaPlhthosMoreThan1);
//        searchCriteriaList.add(searchCriteriaPlhthosLessThan3);
        searchCriteriaList.add(searchCriteriaSemiCorrectOnPlhthos);
        searchCriteriaList.add(searchCriteriaEokParII);
        searchCriteriaList.add(searchCriteriaEokParIV);
        searchCriteriaList.add(searchCriteriaEokParV);

        // Get - test method
        DeigmaThhlastikwnXEidhSearchDTO deigmaThhlastikwnXEidhSearchDTO = deigmaThhlastikwnXEidhSearchRepository
                .searchDeigmaThhlastikwnXEidh(searchCriteriaList, 1, 0, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhSearchDTO);
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalReturnedResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().size());
        assertEquals(Long.valueOf(1), deigmaThhlastikwnXEidhSearchDTO.getTotalResults());
        assertEquals(1, deigmaThhlastikwnXEidhSearchDTO.getTotalPages());
        assertEquals(0, deigmaThhlastikwnXEidhSearchDTO.getPage());
        assertEquals("Desc", deigmaThhlastikwnXEidhSearchDTO.getSort());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasPreviousPage());
        assertFalse(deigmaThhlastikwnXEidhSearchDTO.isHasNextPage());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhSearchDTO.getDeigmaThhlastikwnXEidhList().get(0).getEokParV());
    }

    @Test
    public void downloadDeigmaThhlastikwnXEidhSortDescTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 and 3 because we are having a sorting of Desc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned3);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.DESC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);

        // Get - test method
        List<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidhListReturned = deigmaThhlastikwnXEidhSearchRepository
                .downloadDeigmaThhlastikwnXEidh(searchCriteriaList, "Desc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhListReturned);
        assertEquals(3, deigmaThhlastikwnXEidhListReturned.size());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhListReturned.get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhListReturned.get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhListReturned.get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhListReturned.get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhListReturned.get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhListReturned.get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhListReturned.get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhListReturned.get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhListReturned.get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhListReturned.get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhListReturned.get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhListReturned.get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhListReturned.get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhListReturned.get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhListReturned.get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhListReturned.get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhListReturned.get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhListReturned.get(1).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(2).getId(), deigmaThhlastikwnXEidhListReturned.get(2).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(2).getSxetikhAfthonia(), deigmaThhlastikwnXEidhListReturned.get(2).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(2).getParathrhseis(), deigmaThhlastikwnXEidhListReturned.get(2).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(2).getHlikia(), deigmaThhlastikwnXEidhListReturned.get(2).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(2).getFulo(), deigmaThhlastikwnXEidhListReturned.get(2).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(2).getPlhthos(), deigmaThhlastikwnXEidhListReturned.get(2).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(2).getEokParII(), deigmaThhlastikwnXEidhListReturned.get(2).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(2).getEokParIV(), deigmaThhlastikwnXEidhListReturned.get(2).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(2).getEokParV(), deigmaThhlastikwnXEidhListReturned.get(2).getEokParV());
    }

    @Test
    public void downloadDeigmaThhlastikwnXEidhSortAscTest(){
        // Delete previously stored data
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        // Preparing deigmaThhlastikwn and Ct
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        CtThhlastikaEidh ctThhlastikaEidhReturned = ctThhlastikaEidhRepository.save(ctThhlastikaEidh);

        // Preparing XPressThreats for save
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh1.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh1.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh2.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh2.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh3.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh3.setCtThhlastikaEidh(ctThhlastikaEidhReturned);
        deigmaThhlastikwnXEidh4.setDeigmaThhlastikwn(deigmaThhlastikwnReturned);
        deigmaThhlastikwnXEidh4.setCtThhlastikaEidh(ctThhlastikaEidhReturned);

        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned1 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh1);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned2 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh2);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned3 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh3);
        DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidhReturned4 = deigmaThhlastikwnXEidhRepository.save(deigmaThhlastikwnXEidh4);

        // Preparing the expected List ( 1 and 2 and 3 because we are having a sorting of Asc )
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned1);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned2);
        deigmaThhlastikwnXEidhList.add(deigmaThhlastikwnXEidhReturned3);
        deigmaThhlastikwnXEidhList.sort(DeigmaThhlastikwnXEidh.ASC_ORDER);

        // Preparing to test
        searchCriteriaList.add(searchCriteriaSxetikhAfthonia);

        // Get - test method
        List<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidhListReturned = deigmaThhlastikwnXEidhSearchRepository
                .downloadDeigmaThhlastikwnXEidh(searchCriteriaList, "Asc");

        // Deleting test - saves
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnXEidhRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();
        ctThhlastikaEidhRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnXEidhReturned);
        assertNotNull(deigmaThhlastikwnXEidhReturned1);
        assertNotNull(deigmaThhlastikwnXEidhReturned2);
        assertNotNull(deigmaThhlastikwnXEidhReturned3);
        assertNotNull(deigmaThhlastikwnXEidhReturned4);
        assertNotNull(deigmaThhlastikwnXEidhListReturned);
        assertEquals(3, deigmaThhlastikwnXEidhListReturned.size());

        assertEquals(deigmaThhlastikwnXEidhList.get(0).getId(), deigmaThhlastikwnXEidhListReturned.get(0).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getSxetikhAfthonia(), deigmaThhlastikwnXEidhListReturned.get(0).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getParathrhseis(), deigmaThhlastikwnXEidhListReturned.get(0).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getHlikia(), deigmaThhlastikwnXEidhListReturned.get(0).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getFulo(), deigmaThhlastikwnXEidhListReturned.get(0).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getPlhthos(), deigmaThhlastikwnXEidhListReturned.get(0).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParII(), deigmaThhlastikwnXEidhListReturned.get(0).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParIV(), deigmaThhlastikwnXEidhListReturned.get(0).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(0).getEokParV(), deigmaThhlastikwnXEidhListReturned.get(0).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getId(), deigmaThhlastikwnXEidhListReturned.get(1).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getSxetikhAfthonia(), deigmaThhlastikwnXEidhListReturned.get(1).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getParathrhseis(), deigmaThhlastikwnXEidhListReturned.get(1).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getHlikia(), deigmaThhlastikwnXEidhListReturned.get(1).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getFulo(), deigmaThhlastikwnXEidhListReturned.get(1).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getPlhthos(), deigmaThhlastikwnXEidhListReturned.get(1).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParII(), deigmaThhlastikwnXEidhListReturned.get(1).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParIV(), deigmaThhlastikwnXEidhListReturned.get(1).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(1).getEokParV(), deigmaThhlastikwnXEidhListReturned.get(1).getEokParV());
        assertEquals(deigmaThhlastikwnXEidhList.get(2).getId(), deigmaThhlastikwnXEidhListReturned.get(2).getId());
        assertEquals(deigmaThhlastikwnXEidhList.get(2).getSxetikhAfthonia(), deigmaThhlastikwnXEidhListReturned.get(2).getSxetikhAfthonia());
        assertEquals(deigmaThhlastikwnXEidhList.get(2).getParathrhseis(), deigmaThhlastikwnXEidhListReturned.get(2).getParathrhseis());
        assertEquals(deigmaThhlastikwnXEidhList.get(2).getHlikia(), deigmaThhlastikwnXEidhListReturned.get(2).getHlikia());
        assertEquals(deigmaThhlastikwnXEidhList.get(2).getFulo(), deigmaThhlastikwnXEidhListReturned.get(2).getFulo());
        assertEquals(deigmaThhlastikwnXEidhList.get(2).getPlhthos(), deigmaThhlastikwnXEidhListReturned.get(2).getPlhthos());
        assertEquals(deigmaThhlastikwnXEidhList.get(2).getEokParII(), deigmaThhlastikwnXEidhListReturned.get(2).getEokParII());
        assertEquals(deigmaThhlastikwnXEidhList.get(2).getEokParIV(), deigmaThhlastikwnXEidhListReturned.get(2).getEokParIV());
        assertEquals(deigmaThhlastikwnXEidhList.get(2).getEokParV(), deigmaThhlastikwnXEidhListReturned.get(2).getEokParV());
    }

}
