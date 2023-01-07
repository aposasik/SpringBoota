package com.teicm.kerkinibackend.v1.models.thhlastika;

public class DeigmaThhlastikwnXPressThreatDTO {

    // TODO: 1/25/2019 Could be refactored into a different DTO just for having also the Id property
    // Only when the DTO is used as a returning object
    private Long id;


    // DeigmaThhlastikwn Id
    private Long deigmaThhlastikwnId;

    // CtThhlastikaXPressThreats actCode
    private String ctActCode;

    // DeigmaThhlastikwnXPressThreat
    private String kwdikosEidous;

    private String pressThreat;

    private String importance;

    public DeigmaThhlastikwnXPressThreatDTO() {
    }

    // Having also the Id if needed


    public DeigmaThhlastikwnXPressThreatDTO(Long id, Long deigmaThhlastikwnId, String ctActCode, String kwdikosEidous, String pressThreat, String importance) {
        this.id = id;
        this.deigmaThhlastikwnId = deigmaThhlastikwnId;
        this.ctActCode = ctActCode;
        this.kwdikosEidous = kwdikosEidous;
        this.pressThreat = pressThreat;
        this.importance = importance;
    }

    public DeigmaThhlastikwnXPressThreatDTO(Long deigmaThhlastikwnId, String ctActCode, String kwdikosEidous, String pressThreat, String importance) {
        this.deigmaThhlastikwnId = deigmaThhlastikwnId;
        this.ctActCode = ctActCode;
        this.kwdikosEidous = kwdikosEidous;
        this.pressThreat = pressThreat;
        this.importance = importance;
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

    public String getCtActCode() {
        return ctActCode;
    }

    public void setCtActCode(String ctActCode) {
        this.ctActCode = ctActCode;
    }

    public String getKwdikosEidous() {
        return kwdikosEidous;
    }

    public void setKwdikosEidous(String kwdikosEidous) {
        this.kwdikosEidous = kwdikosEidous;
    }

    public String getPressThreat() {
        return pressThreat;
    }

    public void setPressThreat(String pressThreat) {
        this.pressThreat = pressThreat;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }
}
