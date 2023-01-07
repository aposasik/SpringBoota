package com.teicm.kerkinibackend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;

import javax.persistence.*;

@Entity
public class Pictures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "deigma_thhlastikwn_id")
    private DeigmaThhlastikwn deigmaThhlastikwn;

    @Column(name = "picture_name")
    private String pictureName;

    @Column(name = "picture_type")
    private String pictureType;

    @Lob
    @Column(name = "data")
    private byte[] data;

    public Pictures() {
    }

    public Pictures(DeigmaThhlastikwn deigmaThhlastikwn, String pictureName, String pictureType, byte[] data) {
        this.deigmaThhlastikwn = deigmaThhlastikwn;
        this.pictureName = pictureName;
        this.pictureType = pictureType;
        this.data = data;
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

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public String getPictureType() {
        return pictureType;
    }

    public void setPictureType(String pictureType) {
        this.pictureType = pictureType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
