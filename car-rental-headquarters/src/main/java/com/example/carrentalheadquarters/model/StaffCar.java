package com.example.carrentalheadquarters.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

@Entity
public class StaffCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private Date fixdate;

    @Column
    @NotNull
    private String fixed;

    @ManyToOne
    @JoinColumn(name = "staffid", referencedColumnName = "id")
    private Staff staff;

    @ManyToOne
    @JoinColumn(name = "carid", referencedColumnName = "id")
    private Car car;

    public StaffCar() {

    }

    public StaffCar(Integer id, Date fixdate, String fixed, Staff staff, Car car) {
        this.id = id;
        this.fixdate = fixdate;
        this.fixed = fixed;
        this.staff = staff;
        this.car = car;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFixdate() {
        return fixdate;
    }

    public void setFixdate(Date fixdate) {
        this.fixdate = fixdate;
    }

    public String getFixed() {
        return fixed;
    }

    public void setFixed(String fixed) {
        this.fixed = fixed;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "StaffCar{" +
                "id=" + id +
                ", fixdate=" + fixdate +
                ", fixed='" + fixed + '\'' +
                ", staff=" + staff +
                ", car=" + car +
                '}';
    }
}
