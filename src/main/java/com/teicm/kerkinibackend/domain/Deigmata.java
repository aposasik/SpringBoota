package com.teicm.kerkinibackend.domain;

import com.teicm.kerkinibackend.domain.ornithopanida.DeigmaOrnithopanida;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;

import javax.persistence.*;
import java.util.Comparator;

@Entity
public class Deigmata {

    // Implemented Comparators for sorting in ITs
    // Comparator for Descending
    public static final Comparator<Deigmata> DESC_ORDER = (dX1, dX2) -> Long.compare(dX2.getId(), dX1.getId());

    // Comparator for Ascending
    public static final Comparator<Deigmata> ASC_ORDER = (dX1, dX2) -> Long.compare(dX1.getId(), dX2.getId());

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private DeigmaThhlastikwn deigmaThhlastikwn;

    @OneToOne(cascade = CascadeType.ALL)
    private DeigmaOrnithopanida deigmaOrnithopanida;


    @ManyToOne
    @JoinColumn(name = "prwtokola_id")
    private Prwtokola prwtokola;

    public Deigmata() {
    }

    public Deigmata(DeigmaThhlastikwn deigmaThhlastikwn, Prwtokola prwtokola,DeigmaOrnithopanida deigmaOrnithopanida) {
        this.deigmaThhlastikwn = deigmaThhlastikwn;
        this.deigmaOrnithopanida = deigmaOrnithopanida;
        this.prwtokola = prwtokola;
    }

    // For Criteria Jpa searching-downloading
    public Deigmata(Long id, DeigmaThhlastikwn deigmaThhlastikwn, Prwtokola prwtokola,DeigmaOrnithopanida deigmaOrnithopanida) {
        this.id = id;
        this.deigmaThhlastikwn = deigmaThhlastikwn;
        this.deigmaOrnithopanida = deigmaOrnithopanida;
        this.prwtokola = prwtokola;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public DeigmaOrnithopanida getDeigmaOrnithopanida() {
        return deigmaOrnithopanida;
    }

    public void setDeigmaOrnithopanida(DeigmaOrnithopanida deigmaOrnithopanida) {
        this.deigmaOrnithopanida = deigmaOrnithopanida;
    }



    public DeigmaThhlastikwn getDeigmaThhlastikwn() {
        return deigmaThhlastikwn;
    }

    public void setDeigmaThhlastikwn(DeigmaThhlastikwn deigmaThhlastikwn) {
        this.deigmaThhlastikwn = deigmaThhlastikwn;
    }

    public Prwtokola getPrwtokola() {
        return prwtokola;
    }

    public void setPrwtokola(Prwtokola prwtokola) {
        this.prwtokola = prwtokola;
    }
}
