package com.teicm.kerkinibackend.domain.ornithopanida;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.teicm.kerkinibackend.domain.Deigmata;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXEidh;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXPressThreats;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="deigma_ornithopanida")
public class DeigmaOrnithopanida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    @JsonIgnore
    private Deigmata deigmata;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "deigmaOrnithopanida")
    @JsonIgnore
    private Set<DeigmaOrnithopanidaXPresAndThreats> deigmaOrnithopanidaXPresAndThreatsSet = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "deigmaOrnithopanida")
    @JsonIgnore
    private Set<DeigmaOrnithopanidaXSpecies> deigmaOrnithopanidaXSpeciesSet = new HashSet<>();

    @Column(name = "researcher")
    private String researcher;

    @Column(name = "locality")
    private String locality;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "time")
    private LocalTime time;

    @Column(name = "kodikosDeigmatolipsias")
    private String kodikosDeigmatolipsias;

    @Column(name = "xrimatodotikoMeso")
    private String xrimatodotikoMeso;

    @Column(name = "habitat")
    private String habitat;

    @Column(name ="xegsa")
    private Double xegsa;

    @Column(name ="yegsa")
    private Double yegsa;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "altitude")
    private Double altitude;

    @Column(name="xegsat")
    private Double xegsat;

    @Column(name="yegsat")
    private Double yegsat;

    @Column(name="latitudet")
    private Double latitudet;

    @Column(name="longitudet")
    private Double longitudet;

    @Column(name="paratiriseis")
    private String paratiriseis;

    @Column(name="altitudet")
    private Double altitudet;

    @Column(name="nomos")
    private String nomos;

    @Column(name="gridCell",nullable = false,length = 20)
    private String gridCell;

    @Column(name="kodikosNatura",nullable = false,length = 9)
    private String kodikosNatura;

    @Column(name="methodos")
    private String methodos;

    @Column(name="kyriarxosTyposVlastisis")
    private String kyriarxosTyposVlastisis;

    @Column(name="kalypsi")
    private String kalypsi;

    @Column(name="ypsosVlastisis")
    private String ypsosVlastisis;

    @Column(name="puknotita")
    private String puknotita;

    @Column(name="poiotita")
    private String poiotita;

    @Column(name="photo")
    @Lob
    private Byte photo;

    @Column(name="file")
    @Lob
    private Byte file;

    @Column(name="nefoseis")
    private String nefoseis;

    @Column(name="kateuthinsiAnemou")
    private String kateuthinsiAnemou;

    @Column(name="kateuthinsiAnemouAzim")
    private String kateuthinsiAnemouAzim;

    @Column(name="thermokrasia")
    private String thermokrasia;

    @Column(name="entasiAnemou")
    private String entasiAnemou;

    public DeigmaOrnithopanida addPressThreat(DeigmaOrnithopanidaXPresAndThreats deigmaOrnithopanidaXPresAndThreats)
    {
        deigmaOrnithopanidaXPresAndThreats.setDeigmaOrnithopanida(this);
        this.deigmaOrnithopanidaXPresAndThreatsSet.add(deigmaOrnithopanidaXPresAndThreats);
        return this;
    }

    public void removeXPressThreats(DeigmaOrnithopanidaXPresAndThreats deigmaOrnithopanidaXPresAndThreats){
        deigmaOrnithopanidaXPresAndThreats.setDeigmaOrnithopanida(null);
        this.deigmaOrnithopanidaXPresAndThreatsSet.remove(deigmaOrnithopanidaXPresAndThreats);
    }

    public DeigmaOrnithopanida addXEidos(DeigmaOrnithopanidaXSpecies deigmaOrnithopanidaXSpecies){
        deigmaOrnithopanidaXSpecies.setDeigmaOrnithopanida(this);
        this.deigmaOrnithopanidaXSpeciesSet.add(deigmaOrnithopanidaXSpecies);
        return this;
    }

    public void removeXEidos(DeigmaOrnithopanidaXSpecies deigmaOrnithopanidaXSpecies){
        deigmaOrnithopanidaXSpecies.setDeigmaOrnithopanida(null);
        this.deigmaOrnithopanidaXSpeciesSet.remove(deigmaOrnithopanidaXSpecies);
    }

    public DeigmaOrnithopanida(){

    }
    public DeigmaOrnithopanida(Long id, String researcher, String locality, LocalDate date, LocalTime time, String kodikosDeigmatolipsias, String xrimatodotikoMeso, String habitat, Double xegsa, Double yegsa, Double latitude, Double longitude, Double altitude, Double xegsat, Double yegsat, Double latitudet, Double longitudet, Double altitudet, String paratiriseis, String gridCell, String nomos, String methodos, String kodikosNatura, String kyriarxosTyposVlastisis, String kalypsi, String ypsosVlastisis, String poiotita, String puknotita, Byte file, Byte photo, String nefoseis, String kateuthinsiAnemou, String kateuthinsiAnemouAzim, String thermokrasia, String entasiAnemou){
        this.id = id;
        this.researcher=researcher;
        this.locality=locality;
        this.date=date;
        this.time=time;
        this.kodikosDeigmatolipsias=kodikosDeigmatolipsias;
        this.xrimatodotikoMeso=xrimatodotikoMeso;
        this.habitat=habitat;
        this.xegsa=xegsa;
        this.yegsa=yegsa;
        this.latitude=latitude;
        this.longitude=longitude;
        this.altitude=altitude;
        this.xegsat=xegsat;
        this.yegsat=yegsat;
        this.latitudet=latitudet;
        this.longitudet=longitudet;
        this.altitudet=altitudet;
        this.paratiriseis=paratiriseis;
        this.gridCell=gridCell;
        this.nomos=nomos;
        this.methodos=methodos;
        this.kodikosNatura=kodikosNatura;
        this.kyriarxosTyposVlastisis=kyriarxosTyposVlastisis;
        this.kalypsi=kalypsi;
        this.ypsosVlastisis=ypsosVlastisis;
        this.poiotita=poiotita;
        this.puknotita=puknotita;
        this.file=file;
        this.photo=photo;
        this.nefoseis=nefoseis;
        this.kateuthinsiAnemou=kateuthinsiAnemou;
        this.kateuthinsiAnemouAzim=kateuthinsiAnemouAzim;
        this.thermokrasia=thermokrasia;
        this.entasiAnemou=entasiAnemou;
    }
    public DeigmaOrnithopanida(Deigmata deigmata, Set<DeigmaOrnithopanidaXPresAndThreats>deigmaOrnithopanidaXPresAndThreatsSet, Set<DeigmaOrnithopanidaXSpecies>deigmaOrnithopanidaXSpeciesSet, String researcher, String locality, LocalDate date, LocalTime time, String kodikosDeigmatolipsias, String xrimatodotikoMeso, String habitat, Double xegsa, Double yegsa, Double latitude, Double longitude, Double altitude, Double xegsat, Double yegsat, Double latitudet, Double longitudet, Double altitudet, String paratiriseis, String gridCell, String nomos, String methodos, String kodikosNatura, String kyriarxosTyposVlastisis, String kalypsi, String ypsosVlastisis, String poiotita, String puknotita, Byte file, Byte photo, String nefoseis, String kateuthinsiAnemou, String kateuthinsiAnemouAzim, String thermokrasia, String entasiAnemou){
          this.deigmata=deigmata;
          this.deigmaOrnithopanidaXPresAndThreatsSet=deigmaOrnithopanidaXPresAndThreatsSet;
          this.deigmaOrnithopanidaXSpeciesSet=deigmaOrnithopanidaXSpeciesSet;
          this.researcher=researcher;
          this.locality=locality;
          this.date=date;
          this.time=time;
          this.kodikosDeigmatolipsias=kodikosDeigmatolipsias;
          this.xrimatodotikoMeso=xrimatodotikoMeso;
          this.habitat=habitat;
          this.xegsa=xegsa;
          this.yegsa=yegsa;
          this.latitude=latitude;
          this.longitude=longitude;
          this.altitude=altitude;
          this.xegsat=xegsat;
          this.yegsat=yegsat;
          this.latitudet=latitudet;
          this.longitudet=longitudet;
          this.altitudet=altitudet;
          this.paratiriseis=paratiriseis;
          this.gridCell=gridCell;
          this.nomos=nomos;
          this.methodos=methodos;
          this.kodikosNatura=kodikosNatura;
          this.kyriarxosTyposVlastisis=kyriarxosTyposVlastisis;
          this.kalypsi=kalypsi;
          this.ypsosVlastisis=ypsosVlastisis;
          this.poiotita=poiotita;
          this.puknotita=puknotita;
          this.file=file;
          this.photo=photo;
          this.nefoseis=nefoseis;
          this.kateuthinsiAnemou=kateuthinsiAnemou;
          this.kateuthinsiAnemouAzim=kateuthinsiAnemouAzim;
          this.thermokrasia=thermokrasia;
          this.entasiAnemou=entasiAnemou;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Deigmata getDeigmata() {
        return deigmata;
    }

    public void setDeigmata(Deigmata deigmata) {
        this.deigmata = deigmata;
    }

    public Set<DeigmaOrnithopanidaXPresAndThreats> getDeigmaOrnithopanidaXPresAndThreatsSet() {
        return deigmaOrnithopanidaXPresAndThreatsSet;
    }
    public void setDeigmaOrnithopanidaXPresAndThreatsSet(Set<DeigmaOrnithopanidaXPresAndThreats> deigmaOrnithopanidaXPresAndThreatsSet) {
        this.deigmaOrnithopanidaXPresAndThreatsSet = deigmaOrnithopanidaXPresAndThreatsSet;
    }
    public Set<DeigmaOrnithopanidaXSpecies> getDeigmaOrnithopanidaXSpeciesSet() {
        return deigmaOrnithopanidaXSpeciesSet;
    }
    public void setDeigmaOrnithopanidaXSpeciesSet(Set<DeigmaOrnithopanidaXSpecies> deigmaOrnithopanidaXSpeciesSet) {
        this.deigmaOrnithopanidaXSpeciesSet = deigmaOrnithopanidaXSpeciesSet;
    }
    public String getResearcher() {
        return researcher;
    }
    public void setResearcher(String researcher) {
        this.researcher = researcher;
    }
    public String getLocality() {
        return locality;
    }
    public void setLocality(String locality) {
        this.locality = locality;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public LocalTime getTime() {
        return time;
    }
    public void setTime(LocalTime time) {
        this.time = time;
    }
    public String getKodikosDeigmatolipsias() {
        return kodikosDeigmatolipsias;
    }
    public void setKodikosDeigmatolipsias(String kodikosDeigmatolipsias) {
        this.kodikosDeigmatolipsias = kodikosDeigmatolipsias;
    }
    public String getXrimatodotikoMeso() {
        return xrimatodotikoMeso;
    }
    public void setXrimatodotikoMeso(String xrimatodotikoMeso) {
        this.xrimatodotikoMeso = xrimatodotikoMeso;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public Double getXegsa() {
        return xegsa;
    }
    public void setXegsa(Double xegsa) {
        this.xegsa = xegsa;
    }
    public Double getYegsa() {
        return yegsa;
    }
    public void setYegsa(Double yegsa) {
        this.yegsa = yegsa;
    }
    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    public Double getAltitude() {
        return altitude;
    }
    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }
    public Double getXegsat() {
        return xegsat;
    }
    public void setXegsat(Double xegsat) {
        this.xegsat = xegsat;
    }
    public Double getYegsat() {
        return yegsat;
    }
    public void setYegsat(Double yegsat) {
        this.yegsat = yegsat;
    }
    public Double getLatitudet() {
        return latitudet;
    }
    public void setLatitudet(Double latitudet) {
        this.latitudet = latitudet;
    }
    public Double getLongitudet() {
        return longitudet;
    }
    public void setLongitudet(Double longitudet) {
        this.longitudet = longitudet;
    }
    public String getParatiriseis() {
        return paratiriseis;
    }
    public void setParatiriseis(String paratiriseis) {
        this.paratiriseis = paratiriseis;
    }
    public Double getAltitudet() {
        return altitudet;
    }
    public void setAltitudet(Double altitudet) {
        this.altitudet = altitudet;
    }
    public String getNomos() {
        return nomos;
    }
    public void setNomos(String nomos) {
        this.nomos = nomos;
    }
    public String getGridCell() {
        return gridCell;
    }
    public void setGridCell(String gridCell) {
        this.gridCell = gridCell;
    }
    public String getKodikosNatura() {
        return kodikosNatura;
    }
    public void setKodikosNatura(String kodikosNatura) {
        this.kodikosNatura = kodikosNatura;
    }
    public String getMethodos() {
        return methodos;
    }
    public void setMethodos(String methodos) {
        this.methodos = methodos;
    }
    public String getKyriarxosTyposVlastisis() {
        return kyriarxosTyposVlastisis;
    }
    public void setKyriarxosTyposVlastisis(String kyriarxosTyposVlastisis) {
        this.kyriarxosTyposVlastisis = kyriarxosTyposVlastisis;
    }
    public String getKalypsi() {
        return kalypsi;
    }
    public void setKalypsi(String kalypsi) {
        this.kalypsi = kalypsi;
    }
    public String getYpsosVlastisis() {
        return ypsosVlastisis;
    }
    public void setYpsosVlastisis(String ypsosVlastisis) {
        this.ypsosVlastisis = ypsosVlastisis;
    }
    public String getPuknotita() {
        return puknotita;
    }
    public void setPuknotita(String puknotita) {
        this.puknotita = puknotita;
    }
    public String getPoiotita() {
        return poiotita;
    }
    public void setPoiotita(String poiotita) {
        this.poiotita = poiotita;
    }
    public Byte getPhoto() {
        return photo;
    }
    public void setPhoto(Byte photo) {
        this.photo = photo;
    }
    public Byte getFile() {
        return file;
    }
    public void setFile(Byte file) {
        this.file = file;
    }
    public String getNefoseis() {
        return nefoseis;
    }
    public void setNefoseis(String nefoseis) {
        this.nefoseis = nefoseis;
    }
    public String getKateuthinsiAnemou() {
        return kateuthinsiAnemou;
    }
    public void setKateuthinsiAnemou(String kateuthinsiAnemou) {
        this.kateuthinsiAnemou = kateuthinsiAnemou;
    }
    public String getKateuthinsiAnemouAzim() {
        return kateuthinsiAnemouAzim;
    }
    public void setKateuthinsiAnemouAzim(String kateuthinsiAnemouAzim) {
        this.kateuthinsiAnemouAzim = kateuthinsiAnemouAzim;
    }
    public String getThermokrasia() {
        return thermokrasia;
    }
    public void setThermokrasia(String thermokrasia) {
        this.thermokrasia = thermokrasia;
    }
    public String getEntasiAnemou() {
        return entasiAnemou;
    }
    public void setEntasiAnemou(String entasiAnemou) {
        this.entasiAnemou = entasiAnemou;
    }
}