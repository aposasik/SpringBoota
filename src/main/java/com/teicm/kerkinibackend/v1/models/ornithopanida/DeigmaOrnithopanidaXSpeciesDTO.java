package com.teicm.kerkinibackend.v1.models.ornithopanida;
import java.sql.Time;

public class DeigmaOrnithopanidaXSpeciesDTO {
        private  Long id;
        private Long deigmataOrnithopanidasId;
        private String ctEidos;
        private Long kodikos;
     //   private Long aadeigmatos;
        private Time ora;
        private Double xegsa;
        private Double yegsa;
        private String fulo;
        private String hlikia;
        private String arithmosatomon;
        private String paratiriseis;
        private Boolean ekpar1;
        private Boolean ekpar2;
        private Boolean ekpar3;
        private String attitude;
        private String typosparatiriseis;

    public DeigmaOrnithopanidaXSpeciesDTO(){

    }
    public DeigmaOrnithopanidaXSpeciesDTO(Long id, Long deigmataOrnithopanidasId, String ctEidos, Long kodikos, Time ora, Double xegsa, Double yegsa, String fulo, String hlikia, String arithmosatomon, String paratiriseis, Boolean ekpar1, Boolean ekpar2, Boolean ekpar3, String attitude, String typosparatiriseis) {
        this.id = id;
        this.deigmataOrnithopanidasId = deigmataOrnithopanidasId;
        this.ctEidos = ctEidos;
        this.kodikos = kodikos;
        this.ora = ora;
        this.xegsa = xegsa;
        this.yegsa = yegsa;
        this.fulo = fulo;
        this.hlikia = hlikia;
        this.arithmosatomon = arithmosatomon;
        this.paratiriseis = paratiriseis;
        this.ekpar1 = ekpar1;
        this.ekpar2 = ekpar2;
        this.ekpar3 = ekpar3;
        this.attitude = attitude;
        this.typosparatiriseis = typosparatiriseis;
    }

    public DeigmaOrnithopanidaXSpeciesDTO(Long deigmataOrnithopanidasId, String ctEidos, Long kodikos, Time ora, Double xegsa, Double yegsa, String fulo, String hlikia, String arithmosatomon, String paratiriseis, Boolean ekpar1, Boolean ekpar2, Boolean ekpar3, String attitude, String typosparatiriseis) {
        this.deigmataOrnithopanidasId = deigmataOrnithopanidasId;
        this.ctEidos = ctEidos;
        this.kodikos = kodikos;
        this.ora = ora;
        this.xegsa = xegsa;
        this.yegsa = yegsa;
        this.fulo = fulo;
        this.hlikia = hlikia;
        this.arithmosatomon = arithmosatomon;
        this.paratiriseis = paratiriseis;
        this.ekpar1 = ekpar1;
        this.ekpar2 = ekpar2;
        this.ekpar3 = ekpar3;
        this.attitude = attitude;
        this.typosparatiriseis = typosparatiriseis;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getDeigmataOrnithopanidasId() {
        return deigmataOrnithopanidasId;
    }

    public void setDeigmataOrnithopanidasId(Long deigmataOrnithopanidasId) {
        this.deigmataOrnithopanidasId = deigmataOrnithopanidasId;
    }

    public Long getKodikos() {
                return kodikos;
        }

        public void setKodikos(Long kodikos) {
                this.kodikos = kodikos;
        }

      //  public Long getAadeigmatos() {
     //           return aadeigmatos;
     //   }

      //  public void setAadeigmatos(Long aadeigmatos) {
   //             this.aadeigmatos = aadeigmatos;
   //     }



    public Time getOra() {
                return ora;
        }

        public void setOra(Time ora) {
                this.ora = ora;
        }

        public Double getXegsa() {
                return xegsa;
        }

        public void setXegsa(Double xegsa) {
                this.xegsa = xegsa;
        }

        public Double getYegsa() {
                return yegsa;
        }

        public void setYegsa(Double yegsa) {
                this.yegsa = yegsa;
        }

        public String getFulo() {
                return fulo;
        }

        public void setFulo(String fulo) {
                this.fulo = fulo;
        }

        public String getHlikia() {
                return hlikia;
        }

        public void setHlikia(String hlikia) {
                this.hlikia = hlikia;
        }

        public String getArithmosatomon() {
                return arithmosatomon;
        }

        public void setArithmosatomon(String arithmosatomon) {
                this.arithmosatomon = arithmosatomon;
        }

        public String getParatiriseis() {
                return paratiriseis;
        }

        public void setParatiriseis(String paratiriseis) {
                this.paratiriseis = paratiriseis;
        }

        public Boolean getEkpar1() {
                return ekpar1;
        }

        public void setEkpar1(Boolean ekpar1) {
                this.ekpar1 = ekpar1;
        }

        public Boolean getEkpar2() {
                return ekpar2;
        }

        public void setEkpar2(Boolean ekpar2) {
                this.ekpar2 = ekpar2;
        }

        public Boolean getEkpar3() {
                return ekpar3;
        }

        public void setEkpar3(Boolean ekpar3) {
                this.ekpar3 = ekpar3;
        }

        public String getAttitude() {
                return attitude;
        }

        public void setAttitude(String attitude) {
                this.attitude = attitude;
        }

        public String getTyposparatiriseis() {
                return typosparatiriseis;
        }

        public void setTyposparatiriseis(String typosparatiriseis) {
                this.typosparatiriseis = typosparatiriseis;
        }

        public String getCtEidos() {
        return ctEidos;
    }

        public void setCtEidos(String ctEidos) {
        this.ctEidos = ctEidos;
    }
}