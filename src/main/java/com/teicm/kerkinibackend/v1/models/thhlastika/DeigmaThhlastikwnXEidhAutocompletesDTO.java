package com.teicm.kerkinibackend.v1.models.thhlastika;

import java.math.BigInteger;
import java.util.ArrayList;

public class DeigmaThhlastikwnXEidhAutocompletesDTO {

    private ArrayList<BigInteger> deigmaThhlastikwnIdList;

    private ArrayList<String> ctEidosList;

    private ArrayList<String> sxetikhAfthoniaList;

    private ArrayList<String> hlikiaList;

    private ArrayList<String> fuloList;

    public DeigmaThhlastikwnXEidhAutocompletesDTO() {
    }

    public DeigmaThhlastikwnXEidhAutocompletesDTO(ArrayList<BigInteger> deigmaThhlastikwnIdList, ArrayList<String> ctEidosList, ArrayList<String> sxetikhAfthoniaList, ArrayList<String> hlikiaList, ArrayList<String> fuloList) {
        this.deigmaThhlastikwnIdList = deigmaThhlastikwnIdList;
        this.ctEidosList = ctEidosList;
        this.sxetikhAfthoniaList = sxetikhAfthoniaList;
        this.hlikiaList = hlikiaList;
        this.fuloList = fuloList;
    }

    public ArrayList<BigInteger> getDeigmaThhlastikwnIdList() {
        return deigmaThhlastikwnIdList;
    }

    public void setDeigmaThhlastikwnIdList(ArrayList<BigInteger> deigmaThhlastikwnIdList) {
        this.deigmaThhlastikwnIdList = deigmaThhlastikwnIdList;
    }

    public ArrayList<String> getCtEidosList() {
        return ctEidosList;
    }

    public void setCtEidosList(ArrayList<String> ctEidosList) {
        this.ctEidosList = ctEidosList;
    }

    public ArrayList<String> getSxetikhAfthoniaList() {
        return sxetikhAfthoniaList;
    }

    public void setSxetikhAfthoniaList(ArrayList<String> sxetikhAfthoniaList) {
        this.sxetikhAfthoniaList = sxetikhAfthoniaList;
    }

    public ArrayList<String> getHlikiaList() {
        return hlikiaList;
    }

    public void setHlikiaList(ArrayList<String> hlikiaList) {
        this.hlikiaList = hlikiaList;
    }

    public ArrayList<String> getFuloList() {
        return fuloList;
    }

    public void setFuloList(ArrayList<String> fuloList) {
        this.fuloList = fuloList;
    }
}
