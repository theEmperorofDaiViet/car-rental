package com.example.carrentalheadquarters.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.sql.Date;
import java.util.List;

@Entity
public class CarContact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private Date returndate;

    @OneToMany(mappedBy = "carcontact")
    @JsonIgnore
    private List<ContactAsset> contactAssetList;

    @ManyToOne
    @JoinColumn(name = "contactid", referencedColumnName = "id")
    private Contact contact;

    @ManyToOne
    @JoinColumn(name = "carid", referencedColumnName = "id")
    private Car car;

    public CarContact() {

    }

    public CarContact(Integer id, Date returndate, List<ContactAsset> contactAssetList, Contact contact, Car car) {
        this.id = id;
        this.returndate = returndate;
        this.contactAssetList = contactAssetList;
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

    public List<ContactAsset> getContactAssetList() {
        return contactAssetList;
    }

    public void setContactAssetList(List<ContactAsset> contactAssetList) {
        this.contactAssetList = contactAssetList;
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
                ", contactAssetList=" + contactAssetList +
                ", contact=" + contact +
                ", car=" + car +
                '}';
    }
}
