package com.teicm.kerkinibackend.v1.models.thhlastika;

public class DeigmaThhlastikwnDTO {

    // PrwtokolaId to set onto the Deigmata on which the DeigmataThhlastikwn will be set
    private Long prwtokolaId;

    // DeigmaThhlastikwn
    private String kwdikosDeigmatolhpsias;

    private String xrhmatodothsh;

    private String ereunhths;

    private String topothesia;

    private String date;

    private String time;

    private String diarkeia;

    private String tuposVlasthshs;

    private String tuposOikotopou;

    private Integer epifaneiaDeigmatolhpsias;

    private Double latitudeEGSA;

    private Double longitudeEGSA;

    //    Preferred for Google Maps Markers
    private Double latitudeWGS84;

    //    Preferred for Google Maps Markers
    private Double longitudeWGS84;

    private String gridCell;

    private String kwdikosNatura;

    private String methodosDeigmatolhpsias;

    private String parathrhseis;

    private String nomos;

    private Byte picture;

    private Byte file;

    public DeigmaThhlastikwnDTO() {
    }

    public DeigmaThhlastikwnDTO(Long prwtokolaId, String kwdikosDeigmatolhpsias, String xrhmatodothsh, String ereunhths, String topothesia, String date, String time, String diarkeia, String tuposVlasthshs, String tuposOikotopou, Integer epifaneiaDeigmatolhpsias, Double latitudeEGSA, Double longitudeEGSA, Double latitudeWGS84, Double longitudeWGS84, String gridCell, String kwdikosNatura, String methodosDeigmatolhpsias, String parathrhseis, String nomos, Byte picture, Byte file) {
        this.prwtokolaId = prwtokolaId;
        this.kwdikosDeigmatolhpsias = kwdikosDeigmatolhpsias;
        this.xrhmatodothsh = xrhmatodothsh;
        this.ereunhths = ereunhths;
        this.topothesia = topothesia;
        this.date = date;
        this.time = time;
        this.diarkeia = diarkeia;
        this.tuposVlasthshs = tuposVlasthshs;
        this.tuposOikotopou = tuposOikotopou;
        this.epifaneiaDeigmatolhpsias = epifaneiaDeigmatolhpsias;
        this.latitudeEGSA = latitudeEGSA;
        this.longitudeEGSA = longitudeEGSA;
        this.latitudeWGS84 = latitudeWGS84;
        this.longitudeWGS84 = longitudeWGS84;
        this.gridCell = gridCell;
        this.kwdikosNatura = kwdikosNatura;
        this.methodosDeigmatolhpsias = methodosDeigmatolhpsias;
        this.parathrhseis = parathrhseis;
        this.nomos = nomos;
        this.picture = picture;
        this.file = file;
    }

    public Long getPrwtokolaId() {
        return prwtokolaId;
    }

    public void setPrwtokolaId(Long prwtokolaId) {
        this.prwtokolaId = prwtokolaId;
    }

    public String getKwdikosDeigmatolhpsias() {
        return kwdikosDeigmatolhpsias;
    }

    public void setKwdikosDeigmatolhpsias(String kwdikosDeigmatolhpsias) {
        this.kwdikosDeigmatolhpsias = kwdikosDeigmatolhpsias;
    }

    public String getXrhmatodothsh() {
        return xrhmatodothsh;
    }

    public void setXrhmatodothsh(String xrhmatodothsh) {
        this.xrhmatodothsh = xrhmatodothsh;
    }

    public String getEreunhths() {
        return ereunhths;
    }

    public void setEreunhths(String ereunhths) {
        this.ereunhths = ereunhths;
    }

    public String getTopothesia() {
        return topothesia;
    }

    public void setTopothesia(String topothesia) {
        this.topothesia = topothesia;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDiarkeia() {
        return diarkeia;
    }

    public void setDiarkeia(String diarkeia) {
        this.diarkeia = diarkeia;
    }

    public String getTuposVlasthshs() {
        return tuposVlasthshs;
    }

    public void setTuposVlasthshs(String tuposVlasthshs) {
        this.tuposVlasthshs = tuposVlasthshs;
    }

    public String getTuposOikotopou() {
        return tuposOikotopou;
    }

    public void setTuposOikotopou(String tuposOikotopou) {
        this.tuposOikotopou = tuposOikotopou;
    }

    public Integer getEpifaneiaDeigmatolhpsias() {
        return epifaneiaDeigmatolhpsias;
    }

    public void setEpifaneiaDeigmatolhpsias(Integer epifaneiaDeigmatolhpsias) {
        this.epifaneiaDeigmatolhpsias = epifaneiaDeigmatolhpsias;
    }

    public Double getLatitudeEGSA() {
        return latitudeEGSA;
    }

    public void setLatitudeEGSA(Double latitudeEGSA) {
        this.latitudeEGSA = latitudeEGSA;
    }

    public Double getLongitudeEGSA() {
        return longitudeEGSA;
    }

    public void setLongitudeEGSA(Double longitudeEGSA) {
        this.longitudeEGSA = longitudeEGSA;
    }

    public Double getLatitudeWGS84() {
        return latitudeWGS84;
    }

    public void setLatitudeWGS84(Double latitudeWGS84) {
        this.latitudeWGS84 = latitudeWGS84;
    }

    public Double getLongitudeWGS84() {
        return longitudeWGS84;
    }

    public void setLongitudeWGS84(Double longitudeWGS84) {
        this.longitudeWGS84 = longitudeWGS84;
    }

    public String getGridCell() {
        return gridCell;
    }

    public void setGridCell(String gridCell) {
        this.gridCell = gridCell;
    }

    public String getKwdikosNatura() {
        return kwdikosNatura;
    }

    public void setKwdikosNatura(String kwdikosNatura) {
        this.kwdikosNatura = kwdikosNatura;
    }

    public String getMethodosDeigmatolhpsias() {
        return methodosDeigmatolhpsias;
    }

    public void setMethodosDeigmatolhpsias(String methodosDeigmatolhpsias) {
        this.methodosDeigmatolhpsias = methodosDeigmatolhpsias;
    }

    public String getParathrhseis() {
        return parathrhseis;
    }

    public void setParathrhseis(String parathrhseis) {
        this.parathrhseis = parathrhseis;
    }

    public String getNomos() {
        return nomos;
    }

    public void setNomos(String nomos) {
        this.nomos = nomos;
    }

    public Byte getPicture() {
        return picture;
    }

    public void setPicture(Byte picture) {
        this.picture = picture;
    }

    public Byte getFile() {
        return file;
    }

    public void setFile(Byte file) {
        this.file = file;
    }
}
