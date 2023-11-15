package com.example.carrentalheadquarters.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private String phone;

    @Column
    @NotNull
    private String address;

    @Column
    private String note;

    @OneToMany(mappedBy = "client")
    @JsonIgnore
    private List<ShopClient> shopClientList;

    public Client() {

    }

    public Client(Integer id, String name, String phone, String address, String note, List<ShopClient> shopClientList) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.note = note;
        this.shopClientList = shopClientList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<ShopClient> getShopClientList() {
        return shopClientList;
    }

    public void setShopClientList(List<ShopClient> shopClientList) {
        this.shopClientList = shopClientList;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", note='" + note + '\'' +
                ", shopClientList=" + shopClientList +
                '}';
    }
}
