package com.example.carrentalbranch.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class CarBill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private Integer damages;

    @Column
    @NotNull
    private Integer rentalfee;

    @ManyToOne
    @JoinColumn(name = "billid", referencedColumnName = "id")
    private Bill bill;

    @ManyToOne
    @JoinColumn(name = "carid", referencedColumnName = "id")
    private Car car;

    public CarBill() {

    }

    public CarBill(Integer id, Integer damages, Integer rentalfee, Bill bill, Car car) {
        this.id = id;
        this.damages = damages;
        this.rentalfee = rentalfee;
        this.bill = bill;
        this.car = car;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDamages() {
        return damages;
    }

    public void setDamages(Integer damages) {
        this.damages = damages;
    }

    public Integer getRentalfee() {
        return rentalfee;
    }

    public void setRentalfee(Integer rentalfee) {
        this.rentalfee = rentalfee;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "CarBill{" +
                "id=" + id +
                ", damages=" + damages +
                ", rentalfee=" + rentalfee +
                ", bill=" + bill +
                ", car=" + car +
                '}';
    }
}
