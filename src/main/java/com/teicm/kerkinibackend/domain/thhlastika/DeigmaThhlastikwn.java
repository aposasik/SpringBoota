package com.teicm.kerkinibackend.domain.thhlastika;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.teicm.kerkinibackend.domain.Deigmata;
import com.teicm.kerkinibackend.domain.Files;
import com.teicm.kerkinibackend.domain.Pictures;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "deigma_thhlastikwn")
public class DeigmaThhlastikwn {

    // Implemented Comparators for sorting in ITs
    // Comparator for Descending
    public static final Comparator<DeigmaThhlastikwn> DESC_ORDER = (d1, d2) -> Long.compare(d2.getId(), d1.getId());

    // Comparator for Ascending
    public static final Comparator<DeigmaThhlastikwn> ASC_ORDER = (d1, d2) -> Long.compare(d1.getId(), d2.getId());

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    @JsonIgnore
    private Deigmata deigmata;

    // 1/25/2019 IMPORTANT - Changed from CascadeType.All to Remove, Detach and Refresh instead to solve a problem of having connected data ( Entities for example DeigmaThhlastikwn or Ct with XEidh, XPressThreats).
    @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE},  mappedBy = "deigmaThhlastikwn")
    @JsonIgnore
    private Set<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidhSet = new HashSet<>();

    // 1/25/2019 IMPORTANT - Changed from CascadeType.All to Remove, Detach and Refresh instead to solve a problem of having connected data ( Entities for example DeigmaThhlastikwn or Ct with XEidh, XPressThreats).
    @OneToMany(cascade = {CascadeType.REMOVE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.MERGE}, mappedBy = "deigmaThhlastikwn")
    @JsonIgnore
    private Set<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsSet = new HashSet<>();

    @Column(name = "kwdikos_deigmatos", nullable = false)
    private String kwdikosDeigmatolhpsias;

    @Column(name = "xrhmatodothsh")
    private String xrhmatodothsh;

    @Column(name = "ereunhths")
    private String ereunhths;

    @Column(name = "topothesia")
    private String topothesia;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "time")
    private LocalTime time;

    @Column(name = "diarkeia", length = 40)
    private String diarkeia;

    @Column(name = "tupos_vlasthshs")
    private String tuposVlasthshs;

    @Column(name = "tupos_oikotopou")
    private String tuposOikotopou;

    @Column(name = "epifaneia_deigmatolhpsias")
    private Integer epifaneiaDeigmatolhpsias;

    @Column(name = "latitude_egsa")
    private Double latitudeEGSA;

    @Column(name = "longitude_egsa")
    private Double longitudeEGSA;

    //    Preferred for Google Maps Markers
    @Column(name = "latitude_wgs84")
    private Double latitudeWGS84;

    //    Preferred for Google Maps Markers
    @Column(name = "longitude_wgs84")
    private Double longitudeWGS84;

    @Column(name = "grid_cell", length = 30)
    private String gridCell;

    @Column(name = "kwdikos_natura", length = 30)
    private String kwdikosNatura;

    @Column(name = "methodos_deigmatolhpsias")
    private String methodosDeigmatolhpsias;

    @Column(name = "parathrhseis")
    private String parathrhseis;

    @Column(name = "nomos")
    private String nomos;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deigmaThhlastikwn")
    @JsonIgnore
    private Set<Files> filesSet = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deigmaThhlastikwn")
    @JsonIgnore
    private Set<Pictures> picturesSet = new HashSet<>();

    public DeigmaThhlastikwn() {
    }

    // For Jpa Criteria
    public DeigmaThhlastikwn(Long id, String kwdikosDeigmatolhpsias, String xrhmatodothsh, String ereunhths, String topothesia, LocalDate date, LocalTime time, String diarkeia, String tuposVlasthshs, String tuposOikotopou, Integer epifaneiaDeigmatolhpsias, Double latitudeEGSA, Double longitudeEGSA, Double latitudeWGS84, Double longitudeWGS84, String gridCell, String kwdikosNatura, String methodosDeigmatolhpsias, String parathrhseis, String nomos) {
        this.id = id;
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
    }

    public DeigmaThhlastikwn(Deigmata deigmata, Set<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidhSet, Set<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsSet, Set<Files> filesSet, Set<Pictures> picturesSet, String kwdikosDeigmatolhpsias, String xrhmatodothsh, String ereunhths, String topothesia, LocalDate date, LocalTime time, String diarkeia, String tuposVlasthshs, String tuposOikotopou, Integer epifaneiaDeigmatolhpsias, Double latitudeEGSA, Double longitudeEGSA, Double latitudeWGS84, Double longitudeWGS84, String gridCell, String kwdikosNatura, String methodosDeigmatolhpsias, String parathrhseis, String nomos) {
        this.deigmata = deigmata;
        this.deigmaThhlastikwnXEidhSet = deigmaThhlastikwnXEidhSet;
        this.deigmaThhlastikwnXPressThreatsSet = deigmaThhlastikwnXPressThreatsSet;
        this.filesSet = filesSet;
        this.picturesSet = picturesSet;
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
    }

    // Custom method for adding a new PressThreat for a specific DeigmaThhlastikwn allong with specifying the parent's id in the child object.
    public DeigmaThhlastikwn addPressThreat(DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreats){
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(this);
        this.deigmaThhlastikwnXPressThreatsSet.add(deigmaThhlastikwnXPressThreats);
        return this;
    }

    public DeigmaThhlastikwn addXEidh(DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh){
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(this);
        this.deigmaThhlastikwnXEidhSet.add(deigmaThhlastikwnXEidh);
        return this;
    }

    public void addFile(Files file){
        file.setDeigmaThhlastikwn(this);
        this.filesSet.add(file);
    }

    public void addPicture(Pictures picture){
        picture.setDeigmaThhlastikwn(this);
        this.picturesSet.add(picture);
    }

    public void removeXPressThreats(DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreats){
        deigmaThhlastikwnXPressThreats.setDeigmaThhlastikwn(null);
        this.deigmaThhlastikwnXPressThreatsSet.remove(deigmaThhlastikwnXPressThreats);
    }

    public void removeXEidh(DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh){
        deigmaThhlastikwnXEidh.setDeigmaThhlastikwn(null);
        this.deigmaThhlastikwnXEidhSet.remove(deigmaThhlastikwnXEidh);
    }

    public void removeFile(Files file){
        file.setDeigmaThhlastikwn(null);
        this.filesSet.remove(file);
    }

    public void removePicture(Pictures picture){
        picture.setDeigmaThhlastikwn(null);
        this.picturesSet.remove(picture);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<DeigmaThhlastikwnXEidh> getDeigmaThhlastikwnXEidhSet() {
        return deigmaThhlastikwnXEidhSet;
    }

    public void setDeigmaThhlastikwnXEidhSet(Set<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidhSet) {
        this.deigmaThhlastikwnXEidhSet = deigmaThhlastikwnXEidhSet;
    }

    public Deigmata getDeigmata() {
        return deigmata;
    }

    public void setDeigmata(Deigmata deigmata) {
        this.deigmata = deigmata;
    }

    public Set<DeigmaThhlastikwnXPressThreats> getDeigmaThhlastikwnXPressThreatsSet() {
        return deigmaThhlastikwnXPressThreatsSet;
    }

    public void setDeigmaThhlastikwnXPressThreatsSet(Set<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsSet) {
        this.deigmaThhlastikwnXPressThreatsSet = deigmaThhlastikwnXPressThreatsSet;
    }

    public Set<Files> getFilesSet() {
        return filesSet;
    }

    public void setFilesSet(Set<Files> filesSet) {
        this.filesSet = filesSet;
    }

    public Set<Pictures> getPicturesSet() {
        return picturesSet;
    }

    public void setPicturesSet(Set<Pictures> picturesSet) {
        this.picturesSet = picturesSet;
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

}
