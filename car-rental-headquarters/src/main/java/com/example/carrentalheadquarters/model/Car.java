package com.example.carrentalheadquarters.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private String carname;

    @Column
    @NotNull
    private String rangevehicle;

    @Column
    @NotNull
    private String licenseplate;

    @Column
    @NotNull
    private String carlife;

    @Column
    @NotNull
    private Integer expense;

    @Column
    @NotNull
    private boolean status;

    @Column
    private String describes;

    @Column
    @ManyToOne
    @JoinColumn(name = "shopid", referencedColumnName = "id")
    private Shop shop;

    public Car() {

    }

    public Car(Integer id, String carname, String rangevehicle, String licenseplate, String carlife, Integer expense, boolean status, String describes, Shop shop) {
        this.id = id;
        this.carname = carname;
        this.rangevehicle = rangevehicle;
        this.licenseplate = licenseplate;
        this.carlife = carlife;
        this.expense = expense;
        this.status = status;
        this.describes = describes;
        this.shop = shop;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getRangevehicle() {
        return rangevehicle;
    }

    public void setRangevehicle(String rangevehicle) {
        this.rangevehicle = rangevehicle;
    }

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }

    public String getCarlife() {
        return carlife;
    }

    public void setCarlife(String carlife) {
        this.carlife = carlife;
    }

    public Integer getExpense() {
        return expense;
    }

    public void setExpense(Integer expense) {
        this.expense = expense;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carname='" + carname + '\'' +
                ", rangevehicle='" + rangevehicle + '\'' +
                ", licenseplate='" + licenseplate + '\'' +
                ", carlife='" + carlife + '\'' +
                ", expense=" + expense +
                ", status=" + status +
                ", describes='" + describes + '\'' +
                ", shop=" + shop +
                '}';
    }
}
