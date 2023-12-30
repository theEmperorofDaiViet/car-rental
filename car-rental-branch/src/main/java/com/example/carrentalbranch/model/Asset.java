package com.example.carrentalbranch.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private String assetname;

    @OneToMany(mappedBy = "asset")
    @JsonIgnore
    private List<ContactAsset> contactAssetList;

    public Asset() {

    }

    public Asset(Integer id, String assetname, List<ContactAsset> contactAssetList) {
        this.id = id;
        this.assetname = assetname;
        this.contactAssetList = contactAssetList;
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

    public List<ContactAsset> getContactAssetList() {
        return contactAssetList;
    }

    public void setContactAssetList(List<ContactAsset> contactAssetList) {
        this.contactAssetList = contactAssetList;
    }

    @Override
    public String toString() {
        return "Asset{" +
                "id=" + id +
                ", assetname='" + assetname + '\'' +
                ", contactAssetList=" + contactAssetList +
                '}';
    }
}
