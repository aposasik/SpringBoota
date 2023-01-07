package com.teicm.kerkinibackend.v1.models;

public class DeigmaGoogleMarkersDTO {

    private Long id;

    private Double longitudeWGS84;

    private Double latitudeWGS84;

    public DeigmaGoogleMarkersDTO() {
    }

    public DeigmaGoogleMarkersDTO(Long id, Double longitudeWGS84, Double latitudeWGS84) {
        this.id = id;
        this.longitudeWGS84 = longitudeWGS84;
        this.latitudeWGS84 = latitudeWGS84;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLongitudeWGS84() {
        return longitudeWGS84;
    }

    public void setLongitudeWGS84(Double longitudeWGS84) {
        this.longitudeWGS84 = longitudeWGS84;
    }

    public Double getLatitudeWGS84() {
        return latitudeWGS84;
    }

    public void setLatitudeWGS84(Double latitudeWGS84) {
        this.latitudeWGS84 = latitudeWGS84;
    }
}
