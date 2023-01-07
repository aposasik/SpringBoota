package com.teicm.kerkinibackend.v1.models;

public class PrwtokolaDTO {

    private String perigrafh;

    private String pinakasDedomenwn;

    private String parathuroDedomenwn;

    public PrwtokolaDTO() {
    }

    public PrwtokolaDTO(String perigrafh, String pinakasDedomenwn, String parathuroDedomenwn) {
        this.perigrafh = perigrafh;
        this.pinakasDedomenwn = pinakasDedomenwn;
        this.parathuroDedomenwn = parathuroDedomenwn;
    }

    public String getPerigrafh() {
        return perigrafh;
    }

    public void setPerigrafh(String perigrafh) {
        this.perigrafh = perigrafh;
    }

    public String getPinakasDedomenwn() {
        return pinakasDedomenwn;
    }

    public void setPinakasDedomenwn(String pinakasDedomenwn) {
        this.pinakasDedomenwn = pinakasDedomenwn;
    }

    public String getParathuroDedomenwn() {
        return parathuroDedomenwn;
    }

    public void setParathuroDedomenwn(String parathuroDedomenwn) {
        this.parathuroDedomenwn = parathuroDedomenwn;
    }
}
