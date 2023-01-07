package com.teicm.kerkinibackend.domain.thhlastika;

import javax.persistence.*;
import java.util.Comparator;

@Entity
public class DeigmaThhlastikwnXPressThreats {

    // Implemented Comparators for sorting in ITs
    // Comparator for Descending
    public static final Comparator<DeigmaThhlastikwnXPressThreats> DESC_ORDER = (dX1, dX2) -> Long.compare(dX2.getId(), dX1.getId());

    // Comparator for Ascending
    public static final Comparator<DeigmaThhlastikwnXPressThreats> ASC_ORDER = (dX1, dX2) -> Long.compare(dX1.getId(), dX2.getId());

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "deigma_thhlastikwn_id")
    private DeigmaThhlastikwn deigmaThhlastikwn;

    @ManyToOne
    @JoinColumn(name = "ct_thhlastika_press_threats_id")
    private CtThhlastikaPressThreats ctThhlastikaPressThreats;

    @Column(name = "kwdikos_eidous", length = 50)
    private String kwdikosEidous;

    @Column(name = "press_threat", length = 50)
    private String pressThreat;

    @Column(name = "importance", length = 50)
    private String importance;

    public DeigmaThhlastikwnXPressThreats() {
    }

    // Constructor for Jpa Criteria
    public DeigmaThhlastikwnXPressThreats(Long id, DeigmaThhlastikwn deigmaThhlastikwn, CtThhlastikaPressThreats ctThhlastikaPressThreats, String kwdikosEidous, String pressThreat, String importance) {
        this.id = id;
        this.deigmaThhlastikwn = deigmaThhlastikwn;
        this.ctThhlastikaPressThreats = ctThhlastikaPressThreats;
        this.kwdikosEidous = kwdikosEidous;
        this.pressThreat = pressThreat;
        this.importance = importance;
    }

    public DeigmaThhlastikwnXPressThreats(DeigmaThhlastikwn deigmaThhlastikwn, CtThhlastikaPressThreats ctThhlastikaPressThreats, String kwdikosEidous, String pressThreat, String importance) {
        this.deigmaThhlastikwn = deigmaThhlastikwn;
        this.ctThhlastikaPressThreats = ctThhlastikaPressThreats;
        this.kwdikosEidous = kwdikosEidous;
        this.pressThreat = pressThreat;
        this.importance = importance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DeigmaThhlastikwn getDeigmaThhlastikwn() {
        return deigmaThhlastikwn;
    }

    public void setDeigmaThhlastikwn(DeigmaThhlastikwn deigmaThhlastikwn) {
        this.deigmaThhlastikwn = deigmaThhlastikwn;
    }

    public CtThhlastikaPressThreats getCtThhlastikaPressThreats() {
        return ctThhlastikaPressThreats;
    }

    public void setCtThhlastikaPressThreats(CtThhlastikaPressThreats ctThhlastikaPressThreats) {
        this.ctThhlastikaPressThreats = ctThhlastikaPressThreats;
    }

    public String getKwdikosEidous() {
        return kwdikosEidous;
    }

    public void setKwdikosEidous(String kwdikosEidous) {
        this.kwdikosEidous = kwdikosEidous;
    }

    public String getPressThreat() {
        return pressThreat;
    }

    public void setPressThreat(String pressThreat) {
        this.pressThreat = pressThreat;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }
}
