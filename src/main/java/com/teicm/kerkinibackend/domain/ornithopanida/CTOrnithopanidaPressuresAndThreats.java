package com.teicm.kerkinibackend.domain.ornithopanida;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXPressThreats;

import java.util.HashSet;
import java.util.Set;

@Entity
public class CTOrnithopanidaPressuresAndThreats
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ctornithopanidaPressuresAndThreats")
    @JsonIgnore
    private Set<DeigmaOrnithopanidaXPresAndThreats> deigmaOrnithopanidaXPresAndThreatsSet = new HashSet<>();
    
    @Column(name = "act_code", unique = true, length = 50, nullable = false)
    private String actCode;

    @Column(name = "description_en")
    private String descriptionEn;

    @Column(name = "remarks")
    private String remarks;


    public CTOrnithopanidaPressuresAndThreats addXPressThreat(DeigmaOrnithopanidaXPresAndThreats deigmaOrnithopanidaXPresAndThreats) {
        deigmaOrnithopanidaXPresAndThreats.setCtornithopanidaPressuresAndThreats(this);
        this.deigmaOrnithopanidaXPresAndThreatsSet.add(deigmaOrnithopanidaXPresAndThreats);
        return this;
    }

    public void removeXPressThreats(DeigmaOrnithopanidaXPresAndThreats deigmaOrnithopanidaXPresAndThreats){
        deigmaOrnithopanidaXPresAndThreats.setCtornithopanidaPressuresAndThreats(null);
        this.deigmaOrnithopanidaXPresAndThreatsSet.remove(deigmaOrnithopanidaXPresAndThreats);
    }

    public CTOrnithopanidaPressuresAndThreats() {
    }

    public CTOrnithopanidaPressuresAndThreats(String actCode, String descriptionEn, String remarks, Set<DeigmaOrnithopanidaXPresAndThreats> deigmaOrnithopanidaXPresAndThreatsSet) {
        this.actCode = actCode;
        this.descriptionEn = descriptionEn;
        this.remarks = remarks;
        this.deigmaOrnithopanidaXPresAndThreatsSet = deigmaOrnithopanidaXPresAndThreatsSet;
    }

    public CTOrnithopanidaPressuresAndThreats(Long id,String actCode,String descriptionEn,String remarks) {
        this.id= id;
        this.actCode = actCode;
        this.descriptionEn = descriptionEn;
        this.remarks = remarks;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getActCode() {
        return actCode;
    }

    public void setActCode(final String actCode) {
        this.actCode = actCode;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(final String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(final String remarks) {
        this.remarks = remarks;
    }

    public Set<DeigmaOrnithopanidaXPresAndThreats> getDeigmaOrnithopanidaXPresAndThreatsSet() {
        return deigmaOrnithopanidaXPresAndThreatsSet;
    }

    public void setDeigmaOrnithopanidaXPresAndThreatsSet(Set<DeigmaOrnithopanidaXPresAndThreats> deigmaOrnithopanidaXPresAndThreatsSet) {
        this.deigmaOrnithopanidaXPresAndThreatsSet = deigmaOrnithopanidaXPresAndThreatsSet;
    }
}