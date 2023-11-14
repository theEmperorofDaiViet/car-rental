package com.example.carrentalheadquarters.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.sql.Date;

@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private Date payday;

    @ManyToOne
    @JoinColumn(name = "clientid", referencedColumnName = "id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "staffid", referencedColumnName = "id")
    private Staff staff;

    public Bill() {

    }

    public Bill(Integer id, Date payday, Client client, Staff staff) {
        this.id = id;
        this.payday = payday;
        this.client = client;
        this.staff = staff;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getPayday() {
        return payday;
    }

    public void setPayday(Date payday) {
        this.payday = payday;
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
        return "Bill{" +
                "id=" + id +
                ", payday=" + payday +
                ", client=" + client +
                ", staff=" + staff +
                '}';
    }
}
