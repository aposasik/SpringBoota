package com.teicm.kerkinibackend.v1.models.ornithopanida;

import java.time.LocalDate;
import java.time.LocalTime;

public class DeigmaOrnithopanidaDTO {

    private Long prwtokolaId;

    private String researcher;
    private String locality;
    private LocalDate date;
    private LocalTime time;
    private String kodikosDeigmatolipsias;
    private String xrimatodotikoMeso;
    private String habitat;
    private Double xegsa;
    private Double yegsa;
    private Double latitude;
    private Double longitude;
    private Double altitude;
    private Double xegsat;
    private Double yegsat;
    private Double latitudet;
    private Double longitudet;
    private String paratiriseis;
    private Double altitudet;
    private String nomos;
    private String gridCell;
    private String kodikosNatura;
    private String methodos;
    private String kyriarxosTyposVlastisis;
    private String kalypsi;
    private String ypsosVlastisis;
    private String puknotita;
    private String poiotita;
    private Byte photo;
    private Byte file;
    private String nefoseis;
    private String kateuthinsiAnemou;
    private String kateuthinsiAnemouAzim;
    private String thermokrasia;
    private String entasiAnemou;

    public DeigmaOrnithopanidaDTO(){

    }

    public DeigmaOrnithopanidaDTO(Long prwtokolaId, String researcher, String locality, LocalDate date, LocalTime time, String kodikosDeigmatolipsias, String xrimatodotikoMeso, String habitat, Double xegsa, Double yegsa, Double latitude, Double longitude, Double altitude, Double xegsat, Double yegsat, Double latitudet, Double longitudet, String paratiriseis, Double altitudet, String nomos, String gridCell, String kodikosNatura, String methodos, String kyriarxosTyposVlastisis, String kalypsi, String ypsosVlastisis, String puknotita, String poiotita, Byte photo, Byte file, String nefoseis, String kateuthinsiAnemou, String kateuthinsiAnemouAzim, String thermokrasia, String entasiAnemou) {
        this.prwtokolaId = prwtokolaId;
        this.researcher = researcher;
        this.locality = locality;
        this.date = date;
        this.time = time;
        this.kodikosDeigmatolipsias = kodikosDeigmatolipsias;
        this.xrimatodotikoMeso = xrimatodotikoMeso;
        this.habitat = habitat;
        this.xegsa = xegsa;
        this.yegsa = yegsa;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.xegsat = xegsat;
        this.yegsat = yegsat;
        this.latitudet = latitudet;
        this.longitudet = longitudet;
        this.paratiriseis = paratiriseis;
        this.altitudet = altitudet;
        this.nomos = nomos;
        this.gridCell = gridCell;
        this.kodikosNatura = kodikosNatura;
        this.methodos = methodos;
        this.kyriarxosTyposVlastisis = kyriarxosTyposVlastisis;
        this.kalypsi = kalypsi;
        this.ypsosVlastisis = ypsosVlastisis;
        this.puknotita = puknotita;
        this.poiotita = poiotita;
        this.photo = photo;
        this.file = file;
        this.nefoseis = nefoseis;
        this.kateuthinsiAnemou = kateuthinsiAnemou;
        this.kateuthinsiAnemouAzim = kateuthinsiAnemouAzim;
        this.thermokrasia = thermokrasia;
        this.entasiAnemou = entasiAnemou;
    }

    public Long getPrwtokolaId() {
        return prwtokolaId;
    }

    public void setPrwtokolaId(Long prwtokolaId) {
        this.prwtokolaId = prwtokolaId;
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