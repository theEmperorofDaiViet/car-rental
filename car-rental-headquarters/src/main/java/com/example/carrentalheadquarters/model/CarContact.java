package com.example.carrentalheadquarters.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.sql.Date;

@Entity
public class CarContact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private Date returndate;

    @ManyToOne
    @JoinColumn(name = "contactid", referencedColumnName = "id")
    private Contact contact;

    @ManyToOne
    @JoinColumn(name = "carid", referencedColumnName = "id")
    private Car car;

    public CarContact() {

    }

    public CarContact(Integer id, Date returndate, Contact contact, Car car) {
        this.id = id;
        this.returndate = returndate;
        this.contact = contact;
        this.car = car;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "CarContact{" +
                "id=" + id +
                ", returndate=" + returndate +
                ", contact=" + contact +
                ", car=" + car +
                '}';
    }
}
