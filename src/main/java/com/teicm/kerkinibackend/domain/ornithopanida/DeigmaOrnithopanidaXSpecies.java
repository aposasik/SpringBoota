package com.teicm.kerkinibackend.domain.ornithopanida;

import javax.persistence.*;
import java.sql.Time;

@Entity
public class DeigmaOrnithopanidaXSpecies {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "deigma_ornithopanida_id")
    private DeigmaOrnithopanida deigmaOrnithopanida;

    @ManyToOne
    @JoinColumn(name = "ctornithopanida_eidi_id")
    private CTOrnithopanidaEidi ctornithopanidaEidi;

    @Column(name = "kodikos")
    private Long kodikos;

    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column(name="aaDeigmatos",nullable=false)
    // private Long aadeigmatos;

    @Column(name = "ora")
    private Time ora;

    @Column(name = "xegsa")
    private Double xegsa;

    @Column(name = "yegsa")
    private Double yegsa;

    @Column(name = "fulo")
    private String fulo;

    @Column(name = "hlikia")
    private String hlikia;

    @Column(name = "arithmosAtomon")
    private String arithmosatomon;

    @Column(name = "paratiriseis")
    private String paratiriseis;

    @Column(name = "ekpar1")
    private Boolean ekpar1;

    @Column(name = "ekpar2")
    private Boolean ekpar2;

    @Column(name = "ekpar3")
    private Boolean ekpar3;

    @Column(name = "attitude")
    private String attitude;

    @Column(name = "typosParatiriseis")
    private String typosparatiriseis;

    public DeigmaOrnithopanidaXSpecies() {

    }

    public DeigmaOrnithopanidaXSpecies(Long id, DeigmaOrnithopanida deigmaOrnithopanida,
            CTOrnithopanidaEidi ctornithopanidaEidi, Long kodikos, Time ora, Double xegsa, Double yegsa, String fulo,
            String hlikia, String arithmosatomon, String paratiriseis, Boolean ekpar1, Boolean ekpar2, Boolean ekpar3,
            String attitude, String typosparatiriseis) {
        this.id = id;
        this.deigmaOrnithopanida = deigmaOrnithopanida;
        this.ctornithopanidaEidi = ctornithopanidaEidi;
        this.kodikos = kodikos;
        // this.aadeigmatos=aadeigmatos;
        this.ora = ora;
        this.xegsa = xegsa;
        this.yegsa = yegsa;
        this.fulo = fulo;
        this.hlikia = hlikia;
        this.arithmosatomon = arithmosatomon;
        this.paratiriseis = paratiriseis;
        this.ekpar1 = ekpar1;
        this.ekpar2 = ekpar2;
        this.ekpar3 = ekpar3;
        this.attitude = attitude;
        this.typosparatiriseis = typosparatiriseis;
    }

    public DeigmaOrnithopanidaXSpecies(DeigmaOrnithopanida deigmaOrnithopanida, CTOrnithopanidaEidi ctornithopanidaEidi,
            Long kodikos, Time ora, Double xegsa, Double yegsa, String fulo, String hlikia, String arithmosatomon,
            String paratiriseis, Boolean ekpar1, Boolean ekpar2, Boolean ekpar3, String attitude,
            String typosparatiriseis) {
        this.deigmaOrnithopanida = deigmaOrnithopanida;
        this.ctornithopanidaEidi = ctornithopanidaEidi;
        this.kodikos = kodikos;
        // this.aadeigmatos=aadeigmatos;
        this.ora = ora;
        this.xegsa = xegsa;
        this.yegsa = yegsa;
        this.fulo = fulo;
        this.hlikia = hlikia;
        this.arithmosatomon = arithmosatomon;
        this.paratiriseis = paratiriseis;
        this.ekpar1 = ekpar1;
        this.ekpar2 = ekpar2;
        this.ekpar3 = ekpar3;
        this.attitude = attitude;
        this.typosparatiriseis = typosparatiriseis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getKodikos() {
        return kodikos;
    }

    public void setKodikos(Long kodikos) {
        this.kodikos = kodikos;
    }

    // public Long getAadeigmatos() {
    // return aadeigmatos;
    // }

    // public void setAadeigmatos(Long aadeigmatos) {
    // this.aadeigmatos = aadeigmatos;
    // }

    public Time getOra() {
        return ora;
    }

    public void setOra(Time ora) {
        this.ora = ora;
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

    public String getFulo() {
        return fulo;
    }

    public void setFulo(String fulo) {
        this.fulo = fulo;
    }

    public String getHlikia() {
        return hlikia;
    }

    public void setHlikia(String hlikia) {
        this.hlikia = hlikia;
    }

    public String getArithmosatomon() {
        return arithmosatomon;
    }

    public void setArithmosatomon(String arithmosatomon) {
        this.arithmosatomon = arithmosatomon;
    }

    public String getParatiriseis() {
        return paratiriseis;
    }

    public void setParatiriseis(String paratiriseis) {
        this.paratiriseis = paratiriseis;
    }

    public Boolean getEkpar1() {
        return ekpar1;
    }

    public void setEkpar1(Boolean ekpar1) {
        this.ekpar1 = ekpar1;
    }

    public Boolean getEkpar2() {
        return ekpar2;
    }

    public void setEkpar2(Boolean ekpar2) {
        this.ekpar2 = ekpar2;
    }

    public Boolean getEkpar3() {
        return ekpar3;
    }

    public void setEkpar3(Boolean ekpar3) {
        this.ekpar3 = ekpar3;
    }

    public String getAttitude() {
        return attitude;
    }

    public void setAttitude(String attitude) {
        this.attitude = attitude;
    }

    public String getTyposparatiriseis() {
        return typosparatiriseis;
    }

    public void setTyposparatiriseis(String typosparatiriseis) {
        this.typosparatiriseis = typosparatiriseis;
    }

    public DeigmaOrnithopanida getDeigmaOrnithopanida() {
        return deigmaOrnithopanida;
    }

    public void setDeigmaOrnithopanida(DeigmaOrnithopanida deigmaOrnithopanida) {
        this.deigmaOrnithopanida = deigmaOrnithopanida;
    }

    public CTOrnithopanidaEidi getCtornithopanidaEidi() {
        return ctornithopanidaEidi;
    }

    public void setCtornithopanidaEidi(CTOrnithopanidaEidi ctornithopanidaEidi) {
        this.ctornithopanidaEidi = ctornithopanidaEidi;
    }
}