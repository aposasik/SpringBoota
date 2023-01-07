package com.teicm.kerkinibackend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Prwtokola {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prwtokola")
    @JsonIgnore
    private Set<Deigmata> deigmataSet = new HashSet<>();

    @Column(name = "perigrafh")
    private String perigrafh;

    @Column(name = "pinakas_dedomenwn")
    private String pinakasDedomenwn;

    @Column(name = "parathuro_dedomenwn")
    private String parathuroDedomenwn;
    
    public void addDeigma(Deigmata deigmata){
        deigmata.setPrwtokola(this);
        this.deigmataSet.add(deigmata);
    }

    public void removeDeigma(Deigmata deigmata){
        deigmata.setPrwtokola(null);
        this.deigmataSet.remove(deigmata);
    }

    public Prwtokola() {
    }

    public Prwtokola(Set<Deigmata> deigmataSet, String perigrafh, String pinakasDedomenwn, String parathuroDedomenwn) {
        this.deigmataSet = deigmataSet;
        this.perigrafh = perigrafh;
        this.pinakasDedomenwn = pinakasDedomenwn;
        this.parathuroDedomenwn = parathuroDedomenwn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Deigmata> getDeigmataSet() {
        return deigmataSet;
    }

    public void setDeigmataSet(Set<Deigmata> deigmataSet) {
        this.deigmataSet = deigmataSet;
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
