package com.example.carrentalheadquarters.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

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

    public Condition() {

    }

    public Condition(Integer id, String conditionname, Integer expense) {
        this.id = id;
        this.conditionname = conditionname;
        this.expense = expense;
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

    @Override
    public String toString() {
        return "Condition{" +
                "id=" + id +
                ", conditionname='" + conditionname + '\'' +
                ", expense=" + expense +
                '}';
    }
}
