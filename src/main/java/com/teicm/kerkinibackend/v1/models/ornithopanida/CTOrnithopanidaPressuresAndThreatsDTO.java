package com.teicm.kerkinibackend.v1.models.ornithopanida;

public class CTOrnithopanidaPressuresAndThreatsDTO
{
    private String actCode;
    private String descriptionEn;
    private String remarks;

    public  CTOrnithopanidaPressuresAndThreatsDTO(){

    };

    public CTOrnithopanidaPressuresAndThreatsDTO(String actCode, String descriptionEn, String remarks) {
        this.actCode = actCode;
        this.descriptionEn = descriptionEn;
        this.remarks = remarks;
    }

    public String getActCode() {
        return actCode;
    }

    public void setActCode(String actCode) {
        this.actCode = actCode;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
