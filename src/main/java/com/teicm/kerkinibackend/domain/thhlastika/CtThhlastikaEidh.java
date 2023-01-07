package com.teicm.kerkinibackend.domain.thhlastika;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CtThhlastikaEidh {

    // Implemented Comparators for sorting in ITs
    // Comparator for Descending
    public static final Comparator<CtThhlastikaEidh> DESC_ORDER = (o1, o2) -> Long.compare(o2.getId(), o1.getId());

    // Comparator for Ascending
    public static final Comparator<CtThhlastikaEidh> ASC_ORDER = (o1, o2) -> Long.compare(o1.getId(), o2.getId());

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ctThhlastikaEidh")
    @JsonIgnore
    private Set<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidhSet = new HashSet<>();

    @Column(name = "eidos", unique = true, length = 100)
    private String eidos;

    public CtThhlastikaEidh() {
    }

    public CtThhlastikaEidh(Long id, String eidos) {
        this.id = id;
        this.eidos = eidos;
    }

    // Used for Jpa Criteria
    public CtThhlastikaEidh(Long id, Set<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidhSet, String eidos) {
        this.id = id;
        this.deigmaThhlastikwnXEidhSet = deigmaThhlastikwnXEidhSet;
        this.eidos = eidos;
    }

    public CtThhlastikaEidh addXEidos(DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh){
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(this);
        this.deigmaThhlastikwnXEidhSet.add(deigmaThhlastikwnXEidh);
        return this;
    }

    public void removeXEidos(DeigmaThhlastikwnXEidh deigmaThhlastikwnXEidh){
        deigmaThhlastikwnXEidh.setCtThhlastikaEidh(null);
        this.deigmaThhlastikwnXEidhSet.remove(deigmaThhlastikwnXEidh);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEidos() {
        return eidos;
    }

    public void setEidos(String eidos) {
        this.eidos = eidos;
    }

    public Set<DeigmaThhlastikwnXEidh> getDeigmaThhlastikwnXEidhSet() {
        return deigmaThhlastikwnXEidhSet;
    }

    public void setDeigmaThhlastikwnXEidhSet(Set<DeigmaThhlastikwnXEidh> deigmaThhlastikwnXEidhSet) {
        this.deigmaThhlastikwnXEidhSet = deigmaThhlastikwnXEidhSet;
    }
}
