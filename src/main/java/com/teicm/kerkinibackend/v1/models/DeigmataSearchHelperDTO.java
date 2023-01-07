package com.teicm.kerkinibackend.v1.models;

public class DeigmataSearchHelperDTO {

    private Long id;

    private Long deigmaThhlastikwnId;

    private Long prwtokolaId;

    public DeigmataSearchHelperDTO() {
    }

    public DeigmataSearchHelperDTO(Long id, Long deigmaThhlastikwnId, Long prwtokolaId) {
        this.id = id;
        this.deigmaThhlastikwnId = deigmaThhlastikwnId;
        this.prwtokolaId = prwtokolaId;
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

    public Long getPrwtokolaId() {
        return prwtokolaId;
    }

    public void setPrwtokolaId(Long prwtokolaId) {
        this.prwtokolaId = prwtokolaId;
    }
}
