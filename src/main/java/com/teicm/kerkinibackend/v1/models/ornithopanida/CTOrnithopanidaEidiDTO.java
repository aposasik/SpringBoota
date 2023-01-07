package com.teicm.kerkinibackend.v1.models.ornithopanida;


//import lombok.Data;

//@Data
public class CTOrnithopanidaEidiDTO
{
    private String eidos;

    public CTOrnithopanidaEidiDTO(){}

    public CTOrnithopanidaEidiDTO(String eidos) {
        this.eidos = eidos;
    }


    public String getEidos() {
        return eidos;
    }

    public void setEidos(String eidos) {
        this.eidos = eidos;
    }
}
