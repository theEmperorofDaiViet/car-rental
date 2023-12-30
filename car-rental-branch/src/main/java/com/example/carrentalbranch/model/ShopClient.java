package com.example.carrentalbranch.model;

import jakarta.persistence.*;

@Entity
public class ShopClient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "shopid", referencedColumnName = "id")
    private Shop shop;

    @ManyToOne
    @JoinColumn(name = "clientid", referencedColumnName = "id")
    private Client client;

    public ShopClient() {

    }

    public ShopClient(Integer id, Shop shop, Client client) {
        this.id = id;
        this.shop = shop;
        this.client = client;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "ShopClient{" +
                "id=" + id +
                ", shop=" + shop +
                ", client=" + client +
                '}';
    }
}
