package com.example.carrentalbranch.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class Staff {

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
    @NotNull
    private String username;

    @Column
    @NotNull
    private String password;

    @Column
    @NotNull
    private boolean ismanagement;

    @ManyToOne
    @JoinColumn(name = "shopid", referencedColumnName = "id")
    @NotNull
    private Shop shop;

    public Staff() {

    }

    public Staff(Integer id, String name, String phone, String address, String username, String password, boolean ismanagement, Shop shop) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.username = username;
        this.password = password;
        this.ismanagement = ismanagement;
        this.shop = shop;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIsmanagement() {
        return ismanagement;
    }

    public void setIsmanagement(boolean ismanagement) {
        this.ismanagement = ismanagement;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", ismanagement=" + ismanagement +
                ", shop=" + shop +
                '}';
    }
}
