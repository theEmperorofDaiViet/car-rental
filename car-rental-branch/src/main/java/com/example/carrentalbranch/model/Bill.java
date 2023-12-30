package com.example.carrentalbranch.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.sql.Date;
import java.util.List;

@Entity
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private Date payday;

    @OneToMany(mappedBy = "bill")
    @JsonIgnore
    private List<CarBill> carBillList;

    @ManyToOne
    @JoinColumn(name = "clientid", referencedColumnName = "id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "staffid", referencedColumnName = "id")
    private Staff staff;

    public Bill() {

    }

    public Bill(Integer id, Date payday, List<CarBill> carBillList, Client client, Staff staff) {
        this.id = id;
        this.payday = payday;
        this.carBillList = carBillList;
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

    public List<CarBill> getCarBillList() {
        return carBillList;
    }

    public void setCarBillList(List<CarBill> carBillList) {
        this.carBillList = carBillList;
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
                ", carBillList=" + carBillList +
                ", client=" + client +
                ", staff=" + staff +
                '}';
    }
}
