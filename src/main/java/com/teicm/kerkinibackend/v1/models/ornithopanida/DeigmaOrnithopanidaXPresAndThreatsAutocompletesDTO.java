package com.teicm.kerkinibackend.v1.models.ornithopanida;

import java.util.ArrayList;

public class DeigmaOrnithopanidaXPresAndThreatsAutocompletesDTO {
    private ArrayList<String>ctActCodeList;
    private ArrayList<Long>deigmaornithopanidaIDList;
    private ArrayList<Long>kodikosList;
    private ArrayList<String>Releve_NRList;
    private ArrayList<String>TypeList;
    private ArrayList<String>ImportanceList;

    public DeigmaOrnithopanidaXPresAndThreatsAutocompletesDTO(){
    }

    public DeigmaOrnithopanidaXPresAndThreatsAutocompletesDTO(ArrayList<String>ctActCodeList,ArrayList<Long>deigmaornithopanidaIDList,ArrayList<Long>kodikosList,ArrayList<String>releve_NRList,ArrayList<String>typeList,ArrayList<String>importanceList){
        this.ctActCodeList=ctActCodeList;
        this.deigmaornithopanidaIDList=deigmaornithopanidaIDList;
        this.kodikosList=kodikosList;
        this.Releve_NRList=releve_NRList;
        this.TypeList=typeList;
        this.ImportanceList=importanceList;
    }

    public ArrayList<String> getCtActCodeList() {
        return ctActCodeList;
    }

    public void setCtActCodeList(ArrayList<String> ctActCodeList) {
        this.ctActCodeList = ctActCodeList;
    }

    public ArrayList<Long> getDeigmaornithopanidaIDList() {
        return deigmaornithopanidaIDList;
    }

    public void setDeigmaornithopanidaIDList(ArrayList<Long> deigmaornithopanidaIDList) {
        this.deigmaornithopanidaIDList = deigmaornithopanidaIDList;
    }

    public ArrayList<Long> getKodikosList() {
        return kodikosList;
    }

    public void setKodikosList(ArrayList<Long> kodikosList) {
        this.kodikosList = kodikosList;
    }

    public ArrayList<String> getReleve_NRList() {
        return Releve_NRList;
    }

    public void setReleve_NRList(ArrayList<String> releve_NRList) {
        Releve_NRList = releve_NRList;
    }

    public ArrayList<String> getTypeList() {
        return TypeList;
    }

    public void setTypeList(ArrayList<String> typeList) {
        TypeList = typeList;
    }

    public ArrayList<String> getImportanceList() {
        return ImportanceList;
    }

    public void setImportanceList(ArrayList<String> importanceList) {
        ImportanceList = importanceList;
    }
}
