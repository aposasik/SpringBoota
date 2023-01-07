package com.teicm.kerkinibackend.domain.thhlastika;

import javax.persistence.*;
import java.util.Comparator;

@Entity
public class DeigmaThhlastikwnXEidh {

    // Implemented Comparators for sorting in ITs
    // Comparator for Descending
    public static final Comparator<DeigmaThhlastikwnXEidh> DESC_ORDER = (dX1, dX2) -> Long.compare(dX2.getId(), dX1.getId());

    // Comparator for Ascending
    public static final Comparator<DeigmaThhlastikwnXEidh> ASC_ORDER = (dX1, dX2) -> Long.compare(dX1.getId(), dX2.getId());

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "deigma_thhlastikwn_id")
    private DeigmaThhlastikwn deigmaThhlastikwn;

    @ManyToOne
    @JoinColumn(name = "ct_thhlastika_eidh_id")
    private CtThhlastikaEidh ctThhlastikaEidh;

    @Column(name = "sxetikh_afthonia")
    private String sxetikhAfthonia;

    @Column(name = "parathrhseis")
    private String parathrhseis;

    @Column(name = "hlikia")
    private String hlikia;

    @Column(name = "fulo")
    private String fulo;

    @Column(name = "plhthos")
    private Integer plhthos;

    @Column(name = "eok_par_ii")
    private Boolean eokParII;

    @Column(name = "eok_par_iv")
    private Boolean eokParIV;

    @Column(name = "eok_par_v")
    private Boolean eokParV;

    public DeigmaThhlastikwnXEidh() {
    }

    // Constructor For Jpa Criteria
    public DeigmaThhlastikwnXEidh(Long id, DeigmaThhlastikwn deigmaThhlastikwn, CtThhlastikaEidh ctThhlastikaEidh, String sxetikhAfthonia, String parathrhseis, String hlikia, String fulo, Integer plhthos, Boolean eokParII, Boolean eokParIV, Boolean eokParV) {
        this.id = id;
        this.deigmaThhlastikwn = deigmaThhlastikwn;
        this.ctThhlastikaEidh = ctThhlastikaEidh;
        this.sxetikhAfthonia = sxetikhAfthonia;
        this.parathrhseis = parathrhseis;
        this.hlikia = hlikia;
        this.fulo = fulo;
        this.plhthos = plhthos;
        this.eokParII = eokParII;
        this.eokParIV = eokParIV;
        this.eokParV = eokParV;
    }

    public DeigmaThhlastikwnXEidh(DeigmaThhlastikwn deigmaThhlastikwn, CtThhlastikaEidh ctThhlastikaEidh, String sxetikhAfthonia, String parathrhseis, String hlikia, String fulo, Integer plhthos, Boolean eokParII, Boolean eokParIV, Boolean eokParV) {
        this.deigmaThhlastikwn = deigmaThhlastikwn;
        this.ctThhlastikaEidh = ctThhlastikaEidh;
        this.sxetikhAfthonia = sxetikhAfthonia;
        this.parathrhseis = parathrhseis;
        this.hlikia = hlikia;
        this.fulo = fulo;
        this.plhthos = plhthos;
        this.eokParII = eokParII;
        this.eokParIV = eokParIV;
        this.eokParV = eokParV;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DeigmaThhlastikwn getDeigmaThhlastikwn() {
        return deigmaThhlastikwn;
    }

    public void setDeigmaThhlastikwn(DeigmaThhlastikwn deigmaThhlastikwn) {
        this.deigmaThhlastikwn = deigmaThhlastikwn;
    }

    public CtThhlastikaEidh getCtThhlastikaEidh() {
        return ctThhlastikaEidh;
    }

    public void setCtThhlastikaEidh(CtThhlastikaEidh ctThhlastikaEidh) {
        this.ctThhlastikaEidh = ctThhlastikaEidh;
    }

    public String getSxetikhAfthonia() {
        return sxetikhAfthonia;
    }

    public void setSxetikhAfthonia(String sxetikhAfthonia) {
        this.sxetikhAfthonia = sxetikhAfthonia;
    }

    public String getParathrhseis() {
        return parathrhseis;
    }

    public void setParathrhseis(String parathrhseis) {
        this.parathrhseis = parathrhseis;
    }

    public String getHlikia() {
        return hlikia;
    }

    public void setHlikia(String hlikia) {
        this.hlikia = hlikia;
    }

    public String getFulo() {
        return fulo;
    }

    public void setFulo(String fulo) {
        this.fulo = fulo;
    }

    public Integer getPlhthos() {
        return plhthos;
    }

    public void setPlhthos(Integer plhthos) {
        this.plhthos = plhthos;
    }

    public Boolean getEokParII() {
        return eokParII;
    }

    public void setEokParII(Boolean eokParII) {
        this.eokParII = eokParII;
    }

    public Boolean getEokParIV() {
        return eokParIV;
    }

    public void setEokParIV(Boolean eokParIV) {
        this.eokParIV = eokParIV;
    }

    public Boolean getEokParV() {
        return eokParV;
    }

    public void setEokParV(Boolean eokParV) {
        this.eokParV = eokParV;
    }
}
