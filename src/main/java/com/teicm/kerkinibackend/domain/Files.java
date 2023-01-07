package com.teicm.kerkinibackend.domain;

import com.teicm.kerkinibackend.domain.thhlastika.DeigmaThhlastikwn;

import javax.persistence.*;

// It will have bidirectional connections with all the Deigma domains (same as Deigmata)

@Entity
public class Files {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "deigma_thhlastikwn_id")
    private DeigmaThhlastikwn deigmaThhlastikwn;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "file_type")
    private String fileType;

    @Lob
    @Column(name = "data")
    private byte[] data;

    public Files() {
    }

    public Files(DeigmaThhlastikwn deigmaThhlastikwn, String fileName, String fileType, byte[] data) {
        this.deigmaThhlastikwn = deigmaThhlastikwn;
        this.fileName = fileName;
        this.fileType = fileType;
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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
