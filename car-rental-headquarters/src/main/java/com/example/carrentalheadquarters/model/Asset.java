package com.example.carrentalheadquarters.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private String assetname;

    public Asset() {

    }

    public Asset(Integer id, String assetname) {
        this.id = id;
        this.assetname = assetname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAssetname() {
        return assetname;
    }

    public void setAssetname(String assetname) {
        this.assetname = assetname;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "id=" + id +
                ", assetname='" + assetname + '\'' +
                '}';
    }
}
