package com.example.carrentalheadquarters.model;

import com.example.carrentalheadquarters.dto.ShopRevenueDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private String facilityname;

    @Column
    @NotNull
    private String shopname;

    @Column
    @NotNull
    private String address;

    @Column
    @NotNull
    private String phone;

    @Column
    @NotNull
    private String email;

    @Column
    private String describes;

    @OneToMany(mappedBy = "shop")
    @JsonIgnore
    private List<ShopClient> shopClientList;

    public Shop(){

    }

    public Shop(Integer id, String facilityname, String shopname, String address, String phone, String email, String describes, List<ShopClient> shopClientList) {
        this.id = id;
        this.facilityname = facilityname;
        this.shopname = shopname;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.describes = describes;
        this.shopClientList = shopClientList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFacilityname() {
        return facilityname;
    }

    public void setFacilityname(String facilityname) {
        this.facilityname = facilityname;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    public List<ShopClient> getShopClientList() {
        return shopClientList;
    }

    public void setShopClientList(List<ShopClient> shopClientList) {
        this.shopClientList = shopClientList;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", facilityname='" + facilityname + '\'' +
                ", shopname='" + shopname + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", describes='" + describes + '\'' +
                ", shopClientList=" + shopClientList +
                '}';
    }
}
