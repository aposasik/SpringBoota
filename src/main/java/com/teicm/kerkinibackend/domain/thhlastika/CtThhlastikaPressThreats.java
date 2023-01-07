package com.teicm.kerkinibackend.domain.thhlastika;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CtThhlastikaPressThreats {

    // Implemented Comparators for sorting in ITs
    // Comparator for Descending
    public static final Comparator<CtThhlastikaPressThreats> DESC_ORDER = (o1, o2) -> Long.compare(o2.getId(), o1.getId());

    // Comparator for Ascending
    public static final Comparator<CtThhlastikaPressThreats> ASC_ORDER = (o1, o2) -> Long.compare(o1.getId(), o2.getId());

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ctThhlastikaPressThreats")
    @JsonIgnore
    private Set<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsSet = new HashSet<>();

    @Column(name = "act_code", unique = true, length = 50, nullable = false)
    private String actCode;

    @Column(name = "description_en")
    private String descriptionEn;

    @Column(name = "remarks")
    private String remarks;

    public CtThhlastikaPressThreats addXPressThreat(DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreats){
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(this);
        this.deigmaThhlastikwnXPressThreatsSet.add(deigmaThhlastikwnXPressThreats);
        return this;
    }

    public void removeXPressThreats(DeigmaThhlastikwnXPressThreats deigmaThhlastikwnXPressThreats){
        deigmaThhlastikwnXPressThreats.setCtThhlastikaPressThreats(null);
        this.deigmaThhlastikwnXPressThreatsSet.remove(deigmaThhlastikwnXPressThreats);
    }

    public CtThhlastikaPressThreats() {
    }

    // Used for Jpa Criteria
    public CtThhlastikaPressThreats(Long id, String actCode, String descriptionEn, String remarks) {
        this.id = id;
        this.actCode = actCode;
        this.descriptionEn = descriptionEn;
        this.remarks = remarks;
    }

    public CtThhlastikaPressThreats(String actCode, Set<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsSet, String descriptionEn, String remarks) {
        this.actCode = actCode;
        this.deigmaThhlastikwnXPressThreatsSet = deigmaThhlastikwnXPressThreatsSet;
        this.descriptionEn = descriptionEn;
        this.remarks = remarks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActCode() {
        return actCode;
    }

    public void setActCode(String actCode) {
        this.actCode = actCode;
    }

    public Set<DeigmaThhlastikwnXPressThreats> getDeigmaThhlastikwnXPressThreatsSet() {
        return deigmaThhlastikwnXPressThreatsSet;
    }

    public void setDeigmaThhlastikwnXPressThreatsSet(Set<DeigmaThhlastikwnXPressThreats> deigmaThhlastikwnXPressThreatsSet) {
        this.deigmaThhlastikwnXPressThreatsSet = deigmaThhlastikwnXPressThreatsSet;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
