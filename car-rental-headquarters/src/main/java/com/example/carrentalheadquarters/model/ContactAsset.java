package com.example.carrentalheadquarters.model;

import jakarta.persistence.*;

@Entity
public class ContactAsset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "carcontactid", referencedColumnName = "id")
    private CarContact carcontact;

    @ManyToOne
    @JoinColumn(name = "assetid", referencedColumnName = "id")
    private Asset asset;

    public ContactAsset() {

    }

    public ContactAsset(Integer id, CarContact carcontact, Asset asset) {
        this.id = id;
        this.carcontact = carcontact;
        this.asset = asset;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CarContact getCarcontact() {
        return carcontact;
    }

    public void setCarcontact(CarContact carcontact) {
        this.carcontact = carcontact;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    @Override
    public String toString() {
        return "ContactAsset{" +
                "id=" + id +
                ", carcontact=" + carcontact +
                ", asset=" + asset +
                '}';
    }
}
