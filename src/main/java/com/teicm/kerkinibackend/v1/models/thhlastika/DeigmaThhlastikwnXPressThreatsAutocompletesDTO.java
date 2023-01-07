package com.teicm.kerkinibackend.v1.models.thhlastika;

import java.math.BigInteger;
import java.util.ArrayList;

public class DeigmaThhlastikwnXPressThreatsAutocompletesDTO {

    private ArrayList<String> kwdikosEidousList;

    private ArrayList<String> pressThreatList;

    private ArrayList<String> importanceList;

    private ArrayList<BigInteger> deigmaThhlastikwnIdList;

    private ArrayList<String> ctActCodeList;

    public DeigmaThhlastikwnXPressThreatsAutocompletesDTO() {
    }

    public DeigmaThhlastikwnXPressThreatsAutocompletesDTO(ArrayList<String> kwdikosEidousList, ArrayList<String> pressThreatList, ArrayList<String> importanceList, ArrayList<BigInteger> deigmaThhlastikwnIdList, ArrayList<String> ctActCodeList) {
        this.kwdikosEidousList = kwdikosEidousList;
        this.pressThreatList = pressThreatList;
        this.importanceList = importanceList;
        this.deigmaThhlastikwnIdList = deigmaThhlastikwnIdList;
        this.ctActCodeList = ctActCodeList;
    }

    public ArrayList<String> getKwdikosEidousList() {
        return kwdikosEidousList;
    }

    public void setKwdikosEidousList(ArrayList<String> kwdikosEidousList) {
        this.kwdikosEidousList = kwdikosEidousList;
    }

    public ArrayList<String> getPressThreatList() {
        return pressThreatList;
    }

    public void setPressThreatList(ArrayList<String> pressThreatList) {
        this.pressThreatList = pressThreatList;
    }

    public ArrayList<String> getImportanceList() {
        return importanceList;
    }

    public void setImportanceList(ArrayList<String> importanceList) {
        this.importanceList = importanceList;
    }

    public ArrayList<BigInteger> getDeigmaThhlastikwnIdList() {
        return deigmaThhlastikwnIdList;
    }

    public void setDeigmaThhlastikwnIdList(ArrayList<BigInteger> deigmaThhlastikwnIdList) {
        this.deigmaThhlastikwnIdList = deigmaThhlastikwnIdList;
    }

    public ArrayList<String> getCtActCodeList() {
        return ctActCodeList;
    }

    public void setCtActCodeList(ArrayList<String> ctActCodeList) {
        this.ctActCodeList = ctActCodeList;
    }
}
