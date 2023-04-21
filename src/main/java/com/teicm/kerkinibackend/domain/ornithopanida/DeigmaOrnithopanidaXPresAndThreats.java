package com.teicm.kerkinibackend.domain.ornithopanida;

import javax.persistence.*;

@Entity

public class DeigmaOrnithopanidaXPresAndThreats
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "deigma_ornithopanida_id")
    private DeigmaOrnithopanida deigmaOrnithopanida;

    @ManyToOne
    @JoinColumn(name = "ctornithopanida_pressures_and_threats_id")
    private CTOrnithopanidaPressuresAndThreats ctornithopanidaPressuresAndThreats;

    @Column(name = "kodikos")
    private Long kodikos;

    @Column(name = "releveNR", length = 50)
    private String relevenr;

   // @Column(name = "act_code", length = 50)
    //private String actCode;

    @Column(name = "type", length = 50)
    private String type;

    @Column(name = "importance", length = 1)
    private String importance;


    public  DeigmaOrnithopanidaXPresAndThreats()
    {}

    public  DeigmaOrnithopanidaXPresAndThreats(Long id,DeigmaOrnithopanida deigmaOrnithopanida, CTOrnithopanidaPressuresAndThreats ctornithopanidaPressuresAndThreats, Long kodikos, String relevenr,String type, String importance)
    {
        this.id =id;
        this.deigmaOrnithopanida=deigmaOrnithopanida;
        this.ctornithopanidaPressuresAndThreats=ctornithopanidaPressuresAndThreats;
        this.kodikos=kodikos;
        this.relevenr=relevenr;
    //    this.actCode=actCode;
        this.type=type;
        this.importance=importance;
    }

    public  DeigmaOrnithopanidaXPresAndThreats(DeigmaOrnithopanida deigmaOrnithopanida, CTOrnithopanidaPressuresAndThreats ctornithopanidaPressuresAndThreats, Long kodikos, String relevenr,String type, String importance)
    {
        this.deigmaOrnithopanida=deigmaOrnithopanida;
        this.ctornithopanidaPressuresAndThreats=ctornithopanidaPressuresAndThreats;
        this.kodikos=kodikos;
        this.relevenr=relevenr;
   //     this.actCode=actCode;
        this.type=type;
        this.importance=importance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getKodikos() {
        return kodikos;
    }

    public void setKodikos(Long kodikos) {
        this.kodikos = kodikos;
    }

    public String getRelevenr() {
        return relevenr;
    }

    public void setRelevenr(String relevenr) {
        this.relevenr = relevenr;
    }

    //public String getActCode() {
 //       return actCode;
 //   }

   // public void setActCode(String actCode) {
   //     this.actCode = actCode;
  //  }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public DeigmaOrnithopanida getDeigmaOrnithopanida() {
        return deigmaOrnithopanida;
    }

    public void setDeigmaOrnithopanida(DeigmaOrnithopanida deigmaOrnithopanida) {
        this.deigmaOrnithopanida = deigmaOrnithopanida;
    }

    public CTOrnithopanidaPressuresAndThreats getCtornithopanidaPressuresAndThreats() {
        return ctornithopanidaPressuresAndThreats;
    }

    public void setCtornithopanidaPressuresAndThreats(CTOrnithopanidaPressuresAndThreats ctornithopanidaPressuresAndThreats) {
        this.ctornithopanidaPressuresAndThreats = ctornithopanidaPressuresAndThreats;
    }
}