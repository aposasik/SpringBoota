package com.teicm.kerkinibackend.v1.models;

public class DeigmataDTO {

    private Long kwdikosPrwtokolou;

    public DeigmataDTO() {
    }

    public DeigmataDTO(Long kwdikosPrwtokolou) {
        this.kwdikosPrwtokolou = kwdikosPrwtokolou;
    }

    public Long getKwdikosPrwtokolou() {
        return kwdikosPrwtokolou;
    }

    public void setKwdikosPrwtokolou(Long kwdikosPrwtokolou) {
        this.kwdikosPrwtokolou = kwdikosPrwtokolou;
    }
}
