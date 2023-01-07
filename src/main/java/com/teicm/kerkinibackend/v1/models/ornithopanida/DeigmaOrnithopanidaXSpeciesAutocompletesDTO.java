package com.teicm.kerkinibackend.v1.models.ornithopanida;

import java.util.ArrayList;

public class DeigmaOrnithopanidaXSpeciesAutocompletesDTO {
    private ArrayList<Long>deigmataOrnithopanidasidList;
    private ArrayList<String>CtkodikoseidosList;
    private ArrayList<Long>kodikosList;
    private ArrayList<Long>aadeigmatosList;
    private ArrayList<String>fuloList;
    private ArrayList<String>hliakiaList;
    private ArrayList<String>arithmosatomonList;

    public DeigmaOrnithopanidaXSpeciesAutocompletesDTO(){
    }

    public DeigmaOrnithopanidaXSpeciesAutocompletesDTO(ArrayList<Long>deigmataOrnithopanidasidList,ArrayList<String>CtkodikoseidosList,ArrayList<Long>kodikosList,ArrayList<Long>aadeigmatosList,ArrayList<String>fuloList,ArrayList<String>hliakiaList,ArrayList<String>arithmosatomonList){
        this.deigmataOrnithopanidasidList=deigmataOrnithopanidasidList;
        this.CtkodikoseidosList=CtkodikoseidosList;
        this.kodikosList=kodikosList;
        this.aadeigmatosList=aadeigmatosList;
        this.fuloList=fuloList;
        this.hliakiaList=hliakiaList;
        this.arithmosatomonList=arithmosatomonList;
    }

    public ArrayList<Long> getDeigmataOrnithopanidasidList() {
        return deigmataOrnithopanidasidList;
    }

    public void setDeigmataOrnithopanidasidList(ArrayList<Long> deigmataOrnithopanidasidList) {
        this.deigmataOrnithopanidasidList = deigmataOrnithopanidasidList;
    }

    public ArrayList<String> getCtkodikoseidosList() {
        return CtkodikoseidosList;
    }

    public void setCtkodikoseidosList(ArrayList<String> ctkodikoseidosList) {
        CtkodikoseidosList = ctkodikoseidosList;
    }

    public ArrayList<Long> getKodikosList() {
        return kodikosList;
    }

    public void setKodikosList(ArrayList<Long> kodikosList) {
        this.kodikosList = kodikosList;
    }

    public ArrayList<Long> getAadeigmatosList() {
        return aadeigmatosList;
    }

    public void setAadeigmatosList(ArrayList<Long> aadeigmatosList) {
        this.aadeigmatosList = aadeigmatosList;
    }

    public ArrayList<String> getFuloList() {
        return fuloList;
    }

    public void setFuloList(ArrayList<String> fuloList) {
        this.fuloList = fuloList;
    }

    public ArrayList<String> getHliakiaList() {
        return hliakiaList;
    }

    public void setHliakiaList(ArrayList<String> hliakiaList) {
        this.hliakiaList = hliakiaList;
    }

    public ArrayList<String> getArithmosatomonList() {
        return arithmosatomonList;
    }

    public void setArithmosatomonList(ArrayList<String> arithmosatomonList) {
        this.arithmosatomonList = arithmosatomonList;
    }
}