package com.example.carrentalheadquarters.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
public class Condition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private String conditionname;

    @Column
    @NotNull
    private Integer expense;

    @OneToMany(mappedBy = "condition")
    @JsonIgnore
    private List<CarCondition> carConditionList;

    public Condition() {

    }

    public Condition(Integer id, String conditionname, Integer expense, List<CarCondition> carConditionList) {
        this.id = id;
        this.conditionname = conditionname;
        this.expense = expense;
        this.carConditionList = carConditionList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConditionname() {
        return conditionname;
    }

    public void setConditionname(String conditionname) {
        this.conditionname = conditionname;
    }

    public Integer getExpense() {
        return expense;
    }

    public void setExpense(Integer expense) {
        this.expense = expense;
    }

    public List<CarCondition> getCarConditionList() {
        return carConditionList;
    }

    public void setCarConditionList(List<CarCondition> carConditionList) {
        this.carConditionList = carConditionList;
    }

    @Override
    public String toString() {
        return "Condition{" +
                "id=" + id +
                ", conditionname='" + conditionname + '\'' +
                ", expense=" + expense +
                ", carConditionList=" + carConditionList +
                '}';
    }
}
