package com.example.carrentalbranch.model;

import jakarta.persistence.*;

@Entity
public class CarCondition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "carid", referencedColumnName = "id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "conditionid", referencedColumnName = "id")
    private Condition condition;

    public CarCondition() {

    }

    public CarCondition(Integer id, Car car, Condition condition) {
        this.id = id;
        this.car = car;
        this.condition = condition;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "CarCondition{" +
                "id=" + id +
                ", car=" + car +
                ", condition=" + condition +
                '}';
    }
}
