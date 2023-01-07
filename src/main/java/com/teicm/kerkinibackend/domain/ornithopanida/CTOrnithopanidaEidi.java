package com.teicm.kerkinibackend.domain.ornithopanida;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.teicm.kerkinibackend.domain.thhlastika.CtThhlastikaEidh;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwnXEidh;

import java.util.HashSet;
import java.util.Set;

@Entity
public class CTOrnithopanidaEidi
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "eidos",unique = true, length = 50)
    private String eidos;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ctornithopanidaEidi")
    @JsonIgnore
    private Set<DeigmaOrnithopanidaXSpecies> deigmaOrnithopanidaXSpeciesSet = new HashSet<>();

    public CTOrnithopanidaEidi() {

    }
    public CTOrnithopanidaEidi(Long id,String eidos) {
        this.id = id;
        this.eidos = eidos;
    }
    public CTOrnithopanidaEidi(Long id,String eidos, Set<DeigmaOrnithopanidaXSpecies> deigmaOrnithopanidaXSpeciesSet)
    {
        this.id = id;
        this.eidos = eidos;
        this.deigmaOrnithopanidaXSpeciesSet = deigmaOrnithopanidaXSpeciesSet;
    }
    public CTOrnithopanidaEidi addXEidos(DeigmaOrnithopanidaXSpecies deigmaOrnithopanidaXSpecies){
        deigmaOrnithopanidaXSpecies.setCtornithopanidaEidi(this);
        this.deigmaOrnithopanidaXSpeciesSet.add(deigmaOrnithopanidaXSpecies);
        return this;
    }

    public void removeXEidos(DeigmaOrnithopanidaXSpecies deigmaOrnithopanidaXSpecies){
        deigmaOrnithopanidaXSpecies.setCtornithopanidaEidi(null);
        this.deigmaOrnithopanidaXSpeciesSet.remove(deigmaOrnithopanidaXSpecies);
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
    public Set<DeigmaOrnithopanidaXSpecies> getDeigmaOrnithopanidaXSpeciesSet() {
        return deigmaOrnithopanidaXSpeciesSet;
    }
    public void setDeigmaOrnithopanidaXSpeciesSet(Set<DeigmaOrnithopanidaXSpecies> deigmaOrnithopanidaXSpeciesSet) {
        this.deigmaOrnithopanidaXSpeciesSet = deigmaOrnithopanidaXSpeciesSet;
    }

}
