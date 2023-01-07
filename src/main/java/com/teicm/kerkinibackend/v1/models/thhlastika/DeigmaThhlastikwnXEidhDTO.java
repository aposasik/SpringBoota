package com.teicm.kerkinibackend.v1.models.thhlastika;

public class DeigmaThhlastikwnXEidhDTO {

    // TODO: 1/25/2019 Could be refactored into a different DTO just for having also the Id property
    // Only when the DTO is used as a returning object
    private Long id;


    // DeigmaThhlastikwn Id
    private Long deigmaThhlastikwnId;

    // CtThhlastikaEidh ctEidos
    private String ctEidos;

    // DeigmaThhlastikwnXEidh
    private String sxetikhAfthonia;

    private String parathrhseis;

    private String hlikia;

    private String fulo;

    private Integer plhthos;

    private Boolean eokParII;

    private Boolean eokParIV;

    private Boolean eokParV;

    public DeigmaThhlastikwnXEidhDTO() {
    }

    // Having also the Id if needed
    public DeigmaThhlastikwnXEidhDTO(Long id, Long deigmaThhlastikwnId, String ctEidos, String sxetikhAfthonia, String parathrhseis, String hlikia, String fulo, Integer plhthos, Boolean eokParII, Boolean eokParIV, Boolean eokParV) {
        this.id = id;
        this.deigmaThhlastikwnId = deigmaThhlastikwnId;
        this.ctEidos = ctEidos;
        this.sxetikhAfthonia = sxetikhAfthonia;
        this.parathrhseis = parathrhseis;
        this.hlikia = hlikia;
        this.fulo = fulo;
        this.plhthos = plhthos;
        this.eokParII = eokParII;
        this.eokParIV = eokParIV;
        this.eokParV = eokParV;
    }

    public DeigmaThhlastikwnXEidhDTO(Long deigmaThhlastikwnId, String ctEidos, String sxetikhAfthonia, String parathrhseis, String hlikia, String fulo, Integer plhthos, Boolean eokParII, Boolean eokParIV, Boolean eokParV) {
        this.deigmaThhlastikwnId = deigmaThhlastikwnId;
        this.ctEidos = ctEidos;
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

    public Long getDeigmaThhlastikwnId() {
        return deigmaThhlastikwnId;
    }

    public void setDeigmaThhlastikwnId(Long deigmaThhlastikwnId) {
        this.deigmaThhlastikwnId = deigmaThhlastikwnId;
    }

    public String getCtEidos() {
        return ctEidos;
    }

    public void setCtEidos(String ctEidos) {
        this.ctEidos = ctEidos;
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
