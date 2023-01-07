package com.teicm.kerkinibackend.repository.thhlastika;

import com.teicm.kerkinibackend.KerkinibackendApplication;
import com.teicm.kerkinibackend.domain.Deigmata;
import com.teicm.kerkinibackend.domain.Files;
import com.teicm.kerkinibackend.domain.Pictures;
import com.teicm.kerkinibackend.domain.Prwtokola;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.repositories.DeigmataRepository;
import com.teicm.kerkinibackend.repositories.FilesRepository;
import com.teicm.kerkinibackend.repositories.PicturesRepository;
import com.teicm.kerkinibackend.repositories.PrwtokolaRepository;
import com.teicm.kerkinibackend.repositories.thhlastika.DeigmaThhlastikwnRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@Transactional
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = KerkinibackendApplication.class)
@TestPropertySource(locations = "classpath:application-integrationtest.properties")
@RunWith(SpringRunner.class)
public class DeigmaThhlastikwnRepositoryIT {

    @Autowired
    DeigmaThhlastikwnRepository deigmaThhlastikwnRepository;

    @Autowired
    DeigmataRepository deigmataRepository;

    @Autowired
    PrwtokolaRepository prwtokolaRepository;

    @Autowired
    PicturesRepository picturesRepository;

    @Autowired
    FilesRepository filesRepository;

    private DeigmaThhlastikwn deigmaThhlastikwn;

    private DeigmaThhlastikwn deigmaThhlastikwn1;

    private DeigmaThhlastikwn deigmaThhlastikwn2;

    private DeigmaThhlastikwn deigmaThhlastikwn3;

    private DeigmaThhlastikwn deigmaThhlastikwnTestLongitudeLatitudeNull;

    List<DeigmaThhlastikwn> deigmaThhlastikwnList;

    private Deigmata deigmata;

    private Prwtokola prwtokola;

    private Pictures pictures;

    private Files files;

    @Before
    public  void setUp(){
        // Init deigmaThhlastikwn
        deigmaThhlastikwn = new DeigmaThhlastikwn();
        deigmaThhlastikwn.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias");
        deigmaThhlastikwn.setXrhmatodothsh("TestingXrhmatodothsh");
        deigmaThhlastikwn.setEreunhths("TestingEreunhths");
        deigmaThhlastikwn.setTopothesia("TestingTopothesia");
        deigmaThhlastikwn.setDiarkeia("TestingDiarkeia");
        deigmaThhlastikwn.setTuposVlasthshs("TestingTuposVlasthshs");
        deigmaThhlastikwn.setTuposOikotopou("TestingTuposOikotopou");
        deigmaThhlastikwn.setLatitudeEGSA(111111.111111);
        deigmaThhlastikwn.setLongitudeEGSA(111111.111111);
        deigmaThhlastikwn.setLongitudeWGS84(1111.11111);
        deigmaThhlastikwn.setLatitudeWGS84(1111.11111);
        deigmaThhlastikwn.setGridCell("TestingGridCell");
        deigmaThhlastikwn.setKwdikosNatura("TestingKwdikosNaatura");
        deigmaThhlastikwn.setMethodosDeigmatolhpsias("TestingMethodosDeigmatolhpsias");
        deigmaThhlastikwn.setParathrhseis("TestingParathrhseis");
        deigmaThhlastikwn.setNomos("TestingNomos");

        // Init deigmaThhlastikwn1
        deigmaThhlastikwn1 = new DeigmaThhlastikwn();
        deigmaThhlastikwn1.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias1");
        deigmaThhlastikwn1.setXrhmatodothsh("TestingXrhmatodothsh1");
        deigmaThhlastikwn1.setEreunhths("TestingEreunhths1");
        deigmaThhlastikwn1.setTopothesia("TestingTopothesia1");
        deigmaThhlastikwn1.setDiarkeia("TestingDiarkeia1");
        deigmaThhlastikwn1.setTuposVlasthshs("TestingTuposVlasthshs1");
        deigmaThhlastikwn1.setTuposOikotopou("TestingTuposOikotopou1");
        deigmaThhlastikwn1.setLatitudeEGSA(222222.222222);
        deigmaThhlastikwn1.setLongitudeEGSA(222222.222222);
        deigmaThhlastikwn1.setLongitudeWGS84(2222.22222);
        deigmaThhlastikwn1.setLatitudeWGS84(2222.22222);
        deigmaThhlastikwn1.setGridCell("TestingGridCell1");
        deigmaThhlastikwn1.setKwdikosNatura("TestingKwdikosNaatura1");
        deigmaThhlastikwn1.setMethodosDeigmatolhpsias("TestingMethodosDeigmatolhpsias1");
        deigmaThhlastikwn1.setParathrhseis("TestingParathrhseis1");
        deigmaThhlastikwn1.setNomos("TestingNomos1");

        // Init deigmaThhlastikwn2
        deigmaThhlastikwn2 = new DeigmaThhlastikwn();
        deigmaThhlastikwn2.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias2");
        deigmaThhlastikwn2.setXrhmatodothsh("TestingXrhmatodothsh2");
        deigmaThhlastikwn2.setEreunhths("TestingEreunhths2");
        deigmaThhlastikwn2.setTopothesia("TestingTopothesia2");
        deigmaThhlastikwn2.setDiarkeia("TestingDiarkeia2");
        deigmaThhlastikwn2.setTuposVlasthshs("TestingTuposVlasthshs2");
        deigmaThhlastikwn2.setTuposOikotopou("TestingTuposOikotopou2");
        deigmaThhlastikwn2.setLatitudeEGSA(333333.333333);
        deigmaThhlastikwn2.setLongitudeEGSA(333333.333333);
        deigmaThhlastikwn2.setLongitudeWGS84(3333.33333);
        deigmaThhlastikwn2.setLatitudeWGS84(3333.33333);
        deigmaThhlastikwn2.setGridCell("TestingGridCell2");
        deigmaThhlastikwn2.setKwdikosNatura("TestingKwdikosNaatura2");
        deigmaThhlastikwn2.setMethodosDeigmatolhpsias("TestingMethodosDeigmatolhpsias2");
        deigmaThhlastikwn2.setParathrhseis("TestingParathrhseis2");
        deigmaThhlastikwn2.setNomos("TestingNomos2");

        // Init deigmaThhlastikwn3
        deigmaThhlastikwn3 = new DeigmaThhlastikwn();
        deigmaThhlastikwn3.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias2");
        deigmaThhlastikwn3.setXrhmatodothsh("TestingXrhmatodothsh2");
        deigmaThhlastikwn3.setEreunhths("TestingEreunhths2");
        deigmaThhlastikwn3.setTopothesia("TestingTopothesia2");
        deigmaThhlastikwn3.setDiarkeia("TestingDiarkeia2");
        deigmaThhlastikwn3.setTuposVlasthshs("TestingTuposVlasthshs2");
        deigmaThhlastikwn3.setTuposOikotopou("TestingTuposOikotopou2");
        deigmaThhlastikwn3.setLatitudeEGSA(333333.333333);
        deigmaThhlastikwn3.setLongitudeEGSA(333333.333333);
        deigmaThhlastikwn3.setLongitudeWGS84(3333.33333);
        deigmaThhlastikwn3.setLatitudeWGS84(3333.33333);
        deigmaThhlastikwn3.setGridCell("TestingGridCell2");
        deigmaThhlastikwn3.setKwdikosNatura("TestingKwdikosNaatura2");
        deigmaThhlastikwn3.setMethodosDeigmatolhpsias("TestingMethodosDeigmatolhpsias2");
        deigmaThhlastikwn3.setParathrhseis("TestingParathrhseis2");
        deigmaThhlastikwn3.setNomos("TestingNomos2");

        // Init deigmaThhlastikwnTestLongitudeLatitudeNull
        deigmaThhlastikwnTestLongitudeLatitudeNull = new DeigmaThhlastikwn();
        deigmaThhlastikwnTestLongitudeLatitudeNull.setKwdikosDeigmatolhpsias("TestingKwdikosDeigmatolhpsias2");
        // Having Longitude and Latitude null to test id it will be returned

        // Init the List<DeigmaThhlastikwn>
        deigmaThhlastikwnList = new ArrayList<>();

        // Init deigmata
        deigmata = new Deigmata();

        // Init prwtokola
        prwtokola = new Prwtokola();
        prwtokola.setPerigrafh("TestingPerigrafh");
        prwtokola.setParathuroDedomenwn("TestingParathuroDedomenwn");
        prwtokola.setPinakasDedomenwn("TestingPinakasDedomenwn");

        // Init picutres
        pictures = new Pictures();
        pictures.setPictureName("TestingName");
        pictures.setPictureType("TestingType");
        pictures.setData(new byte[100]);

        // Init files
        files = new Files();
        files.setFileName("TestingName");
        files.setFileType("TestingType");
        files.setData(new byte[200]);
    }

    @Test
    public void saveTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertEquals(deigmaThhlastikwn.getKwdikosDeigmatolhpsias(), deigmaThhlastikwnReturned.getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwn.getLongitudeWGS84(), deigmaThhlastikwnReturned.getLongitudeWGS84());
        assertEquals(deigmaThhlastikwn.getLatitudeWGS84(), deigmaThhlastikwnReturned.getLatitudeWGS84());
    }

    @Test
    public void saveRelationalTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();

        // Saving prwtokola
        Prwtokola prwtokolaReturned = prwtokolaRepository.save(prwtokola);

        // Preparing deigmaThhlastikwn and deigmata with both way sets
        deigmaThhlastikwn.setDeigmata(deigmata);
        deigmata.setDeigmaThhlastikwn(deigmaThhlastikwn);

        // Saving deigmata (by first adding to it the stored prwtokola and also by saving this way the new deigmataThhlastikwn)
        prwtokolaReturned.addDeigma(deigmata);
        Deigmata deigmataReturned = deigmataRepository.save(deigmata);

        // Checking for Prwtokola
        Optional<DeigmaThhlastikwn> optionalDeigmaThhlastikwnFound = deigmaThhlastikwnRepository.findById(deigmata.getDeigmaThhlastikwn().getId());

        // Checking for DeigmaThhlastikwn
        Optional<Prwtokola> optionalPrwtokolaFound = prwtokolaRepository.findById(deigmata.getPrwtokola().getId());

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        prwtokolaRepository.deleteAll();
        prwtokolaRepository.deleteAll();
        deigmataRepository.deleteAll();
        deigmataRepository.deleteAll();

        assertNotNull(prwtokolaReturned);
        assertNotNull(deigmataReturned);
        assertNotNull(optionalDeigmaThhlastikwnFound.get());
        assertNotNull(optionalPrwtokolaFound.get());
        assertEquals(prwtokolaReturned.getId(), deigmata.getPrwtokola().getId());
        assertTrue(optionalPrwtokolaFound.get().getDeigmataSet().contains(deigmataReturned));
        assertEquals(deigmaThhlastikwn.getId(), deigmata.getDeigmaThhlastikwn().getId());
        assertEquals(deigmata.getId(), optionalDeigmaThhlastikwnFound.get().getDeigmata().getId());
    }

    @Test
    public void savePictureTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        picturesRepository.deleteAll();
        picturesRepository.deleteAll();

        // Saving
        deigmaThhlastikwn.addPicture(pictures);
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);

        // Checking for the saved Pictures
        Set<Pictures> picturesFound = picturesRepository.findPicturesByDeigmaThhlastikwnIs(deigmaThhlastikwnReturned);

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        picturesRepository.deleteAll();
        picturesRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertEquals(deigmaThhlastikwn.getKwdikosDeigmatolhpsias(), deigmaThhlastikwnReturned.getKwdikosDeigmatolhpsias());
        assertEquals(1, deigmaThhlastikwnReturned.getPicturesSet().size());
        assertEquals(picturesFound.size(), deigmaThhlastikwnReturned.getPicturesSet().size());
    }

    @Test
    public void saveFileTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        filesRepository.deleteAll();
        filesRepository.deleteAll();

        // Saving
        deigmaThhlastikwn.addFile(files);
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);

        // Checking for the saved Files
        Set<Files> filesFound = filesRepository.findFilesByDeigmaThhlastikwnIs(deigmaThhlastikwnReturned);

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();
        filesRepository.deleteAll();
        filesRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertEquals(deigmaThhlastikwn.getKwdikosDeigmatolhpsias(), deigmaThhlastikwnReturned.getKwdikosDeigmatolhpsias());
        assertEquals(1, deigmaThhlastikwnReturned.getFilesSet().size());
        assertEquals(filesFound.size(), deigmaThhlastikwnReturned.getFilesSet().size());
    }

    @Test
    public void findDeigmaThhlastikwnById(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);

        DeigmaThhlastikwn deigmaThhlastikwnFound = deigmaThhlastikwnRepository.findDeigmaThhlastikwnById(deigmaThhlastikwnReturned.getId());

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnFound);
        assertEquals(deigmaThhlastikwnReturned.getId(), deigmaThhlastikwnFound.getId());
        assertEquals(deigmaThhlastikwnReturned.getKwdikosDeigmatolhpsias(), deigmaThhlastikwnFound.getKwdikosDeigmatolhpsias());
    }

    @Test
    public void findAllByLongitudeWGS84IsNotNullAndLatitudeWGS84IsNotNullTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwnTestLongitudeLatitudeNull);

        // Adding to the expected List
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned);
        deigmaThhlastikwnList.add(deigmaThhlastikwnReturned1);
        deigmaThhlastikwnList.sort(DeigmaThhlastikwn.DESC_ORDER);

        // Get-Test all without Longitude and Latitude nulls
        List<DeigmaThhlastikwn> deigmaThhlastikwnListReturned = deigmaThhlastikwnRepository
                .findAllByLongitudeWGS84IsNotNullAndLatitudeWGS84IsNotNullOrderByIdDesc();

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertEquals(2, deigmaThhlastikwnListReturned.size());
        assertEquals(deigmaThhlastikwnList.get(0).getId(), deigmaThhlastikwnListReturned.get(0).getId());
        assertEquals(deigmaThhlastikwnList.get(0).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(0).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(0).getLongitudeWGS84(), deigmaThhlastikwnListReturned.get(0).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(0).getLatitudeWGS84(), deigmaThhlastikwnListReturned.get(0).getLatitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getId(), deigmaThhlastikwnListReturned.get(1).getId());
        assertEquals(deigmaThhlastikwnList.get(1).getKwdikosDeigmatolhpsias(), deigmaThhlastikwnListReturned.get(1).getKwdikosDeigmatolhpsias());
        assertEquals(deigmaThhlastikwnList.get(1).getLongitudeWGS84(), deigmaThhlastikwnListReturned.get(1).getLongitudeWGS84());
        assertEquals(deigmaThhlastikwnList.get(1).getLatitudeWGS84(), deigmaThhlastikwnListReturned.get(1).getLatitudeWGS84());
    }

    @Test
    public void findAllTest(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwnTestLongitudeLatitudeNull);

        // Get-Testing with pagination method
        Pageable pageable = PageRequest.of(0, 2, Sort.Direction.DESC, "id");
        Page<DeigmaThhlastikwn> deigmaThhlastikwnPageReturned = deigmaThhlastikwnRepository.findAll(pageable);

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnPageReturned);
        assertEquals(2, deigmaThhlastikwnPageReturned.getNumberOfElements());
        assertEquals(2, deigmaThhlastikwnPageReturned.getTotalPages());
        assertEquals(3, deigmaThhlastikwnPageReturned.getTotalElements());
    }

    // Could be tested better by asserting an ArrayList<> of the expecting returned List of distincts.
    @Test
    public void findDistinctByKwdikosDeigmatosOrderByKwdikosDeigmatos(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);

        ArrayList<String> kwdikosDeigmatolhpsiasList = deigmaThhlastikwnRepository.findDistinctByKwdikosDeigmatosOrderByKwdikosDeigmatos();

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertEquals(3, kwdikosDeigmatolhpsiasList.size());
    }

    @Test
    public void findDistinctByXrhmatodothshOrderByXrhmatodothsh(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);

        ArrayList<String> xrhmatodothshList = deigmaThhlastikwnRepository.findDistinctByXrhmatodothshOrderByXrhmatodothsh();

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertEquals(3, xrhmatodothshList.size());
    }

    @Test
    public void findDistinctByEreunhthsOrderByEreunhths(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);

        ArrayList<String> ereunhthsList = deigmaThhlastikwnRepository.findDistinctByEreunhthsOrderByEreunhths();

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertEquals(3, ereunhthsList.size());
    }

    @Test
    public void findDistinctByTopothesiaOrderByTopothesia(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);

        ArrayList<String> topothesiaList = deigmaThhlastikwnRepository.findDistinctByTopothesiaOrderByTopothesia();

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertEquals(3, topothesiaList.size());
    }

    @Test
    public void findDistinctByDiarkeiaOrderByDiarkeia(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);

        ArrayList<String> diarkeiaList = deigmaThhlastikwnRepository.findDistinctByDiarkeiaOrderByDiarkeia();

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertEquals(3, diarkeiaList.size());
    }

    @Test
    public void findDistinctByTuposVlasthshsOrderByTuposVlasthshs(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);

        ArrayList<String> tuposVlasthshsList = deigmaThhlastikwnRepository.findDistinctByTuposVlasthshsOrderByTuposVlasthshs();

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertEquals(3, tuposVlasthshsList.size());
    }

    @Test
    public void findDistinctByTuposOikotopouOrderByTuposOikotopou(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);

        ArrayList<String> tuposOikotopouList = deigmaThhlastikwnRepository.findDistinctByTuposOikotopouOrderByTuposOikotopou();

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertEquals(3, tuposOikotopouList.size());
    }

    @Test
    public void findDistinctByLatitudeEGSAOrderByLatitudeEGSA(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);

        ArrayList<Double> latitudeEGSAList = deigmaThhlastikwnRepository.findDistinctByLatitudeEGSAOrderByLatitudeEGSA();

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertEquals(3, latitudeEGSAList.size());
    }

    @Test
    public void findDistinctByLongitudeEGSAOrderByLongitudeEGSA(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);

        ArrayList<Double> longitudeEGSAList = deigmaThhlastikwnRepository.findDistinctByLongitudeEGSAOrderByLongitudeEGSA();

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertEquals(3, longitudeEGSAList.size());
    }

    @Test
    public void findDistinctByLatitudeWGS84OrderByLatitudeWGS84(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);

        ArrayList<Double> latitudeWGS84List = deigmaThhlastikwnRepository.findDistinctByLatitudeWGS84OrderByLatitudeWGS84();

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertEquals(3, latitudeWGS84List.size());
    }

    @Test
    public void findDistinctByLongitudeWGS84OrderByLongitudeWGS84(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);

        ArrayList<Double> longitudeWGS84List = deigmaThhlastikwnRepository.findDistinctByLongitudeWGS84OrderByLongitudeWGS84();

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertEquals(3, longitudeWGS84List.size());
    }

    @Test
    public void findDistinctByGridCellOrderByGridCell(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);

        ArrayList<String> gridCellList = deigmaThhlastikwnRepository.findDistinctByGridCellOrderByGridCell();

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertEquals(3, gridCellList.size());
    }

    @Test
    public void findDistinctByKwdikosNaturaOrderByKwdikosNatura(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);

        ArrayList<String> kwdikosNaturaList = deigmaThhlastikwnRepository.findDistinctByKwdikosNaturaOrderByKwdikosNatura();

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertEquals(3, kwdikosNaturaList.size());
    }

    @Test
    public void findDistinctByMethodosDeigmatolhpsiasOrderByMethodosDeigmatolhpsias(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);

        ArrayList<String> methodosDeigmatolhpsiasList = deigmaThhlastikwnRepository.findDistinctByMethodosDeigmatolhpsiasOrderByMethodosDeigmatolhpsias();

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertEquals(3, methodosDeigmatolhpsiasList.size());
    }

    @Test
    public void findDistinctByNomosOrderByNomos(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);

        ArrayList<String> nomosList = deigmaThhlastikwnRepository.findDistinctByNomosOrderByNomos();

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertEquals(3, nomosList.size());
    }

    @Test
    public void findDistinctByParathrhseisOrderByParathrhseis(){
        // Delete previously stored data
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        // Saving
        DeigmaThhlastikwn deigmaThhlastikwnReturned = deigmaThhlastikwnRepository.save(deigmaThhlastikwn);
        DeigmaThhlastikwn deigmaThhlastikwnReturned1 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn1);
        DeigmaThhlastikwn deigmaThhlastikwnReturned2 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn2);
        DeigmaThhlastikwn deigmaThhlastikwnReturned3 = deigmaThhlastikwnRepository.save(deigmaThhlastikwn3);

        ArrayList<String> parathrhseisList = deigmaThhlastikwnRepository.findDistinctByParathrhseisOrderByParathrhseis();

        // Delete test saves
        deigmaThhlastikwnRepository.deleteAll();
        deigmaThhlastikwnRepository.deleteAll();

        assertNotNull(deigmaThhlastikwnReturned);
        assertNotNull(deigmaThhlastikwnReturned1);
        assertNotNull(deigmaThhlastikwnReturned2);
        assertNotNull(deigmaThhlastikwnReturned3);
        assertEquals(3, parathrhseisList.size());
    }

}
