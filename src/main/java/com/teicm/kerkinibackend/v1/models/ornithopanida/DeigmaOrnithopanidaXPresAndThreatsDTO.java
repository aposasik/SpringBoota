package com.teicm.kerkinibackend.v1.models.ornithopanida;

public class DeigmaOrnithopanidaXPresAndThreatsDTO
{
    private Long id;
    private String ctActCode;
    private Long deigmaornithopanidaID;
    private Long kodikos;
    private String Releve_NR;
    private String Type;
    private String Importance;

    public DeigmaOrnithopanidaXPresAndThreatsDTO(){

    }
    public DeigmaOrnithopanidaXPresAndThreatsDTO(Long id,String ctActCode, Long deigmaornithopanidaID, Long kodikos, String releve_NR,String type, String importance) {
        this.id = id;
        this.ctActCode = ctActCode;
        this.deigmaornithopanidaID = deigmaornithopanidaID;
        this.kodikos = kodikos;
        this.Releve_NR = releve_NR;
        this.Type = type;
        this.Importance = importance;
    }

    public DeigmaOrnithopanidaXPresAndThreatsDTO(String ctActCode, Long deigmaornithopanidaID, Long kodikos, String releve_NR, String type, String importance) {
        this.ctActCode = ctActCode;
        this.deigmaornithopanidaID = deigmaornithopanidaID;
        this.kodikos = kodikos;
        this.Releve_NR = releve_NR;
        this.Type = type;
        this.Importance = importance;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCtActCode() {
        return ctActCode;
    }
    public void setCtActCode(String ctActCode) {
        this.ctActCode = ctActCode;
    }
    public Long getDeigmaornithopanidaID() {
        return deigmaornithopanidaID;
    }
    public void setDeigmaornithopanidaID(Long deigmaornithopanidaID) {
        this.deigmaornithopanidaID = deigmaornithopanidaID;
    }
    public Long getKodikos() {
        return kodikos;
    }
    public void setKodikos(Long kodikos) {
        this.kodikos = kodikos;
    }
    public String getReleve_NR() {
        return Releve_NR;
    }
    public void setReleve_NR(String releve_NR) {
        Releve_NR = releve_NR;
    }
    public String getType() {
        return Type;
    }
    public void setType(String type) {
        Type = type;
    }
    public String getImportance() {
        return Importance;
    }
    public void setImportance(String importance) {
        Importance = importance;
    }
}
