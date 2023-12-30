package com.example.carrentalbranch.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.sql.Date;
import java.util.List;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private Date rentaldate;

    @Column
    @NotNull
    private Integer deposit;

    @OneToMany(mappedBy = "contact")
    @JsonIgnore
    private List<CarContact> carContactList;

    @ManyToOne
    @JoinColumn(name = "clientid", referencedColumnName = "id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "staffid", referencedColumnName = "id")
    private Staff staff;

    public Contact() {

    }

    public Contact(Integer id, Date rentaldate, Integer deposit, List<CarContact> carContactList, Client client, Staff staff) {
        this.id = id;
        this.rentaldate = rentaldate;
        this.deposit = deposit;
        this.carContactList = carContactList;
        this.client = client;
        this.staff = staff;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRentaldate() {
        return rentaldate;
    }

    public void setRentaldate(Date rentaldate) {
        this.rentaldate = rentaldate;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public List<CarContact> getCarContactList() {
        return carContactList;
    }

    public void setCarContactList(List<CarContact> carContactList) {
        this.carContactList = carContactList;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", rentaldate=" + rentaldate +
                ", deposit=" + deposit +
                ", carContactList=" + carContactList +
                ", client=" + client +
                ", staff=" + staff +
                '}';
    }
}
