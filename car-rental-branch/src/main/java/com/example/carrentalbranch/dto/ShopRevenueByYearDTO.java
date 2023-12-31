package com.example.carrentalbranch.dto;

import jakarta.persistence.*;

@Entity
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "getRevenueByYear",
                procedureName = "dbo.REVENUEBYYEAR",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "shopid", type = Integer.class)
                },
                resultSetMappings = {
                        "ShopRevenueByYear",
                }
        )
})
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ShopRevenueByYear",
                classes = {
                        @ConstructorResult(
                                targetClass = ShopRevenueByYearDTO.class,
                                columns = {
                                        @ColumnResult(name = "year", type = Integer.class),
                                        @ColumnResult(name = "revenue", type = Integer.class)
                                }
                        )
                }
        )
})
public class ShopRevenueByYearDTO {

    @Id
    private Integer id;

    @Column
    private Integer year;

    @Column
    private Integer revenue;

    public ShopRevenueByYearDTO() {

    }

    public ShopRevenueByYearDTO(Integer id, Integer year, Integer revenue) {
        this.id = id;
        this.year = year;
        this.revenue = revenue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getRevenue() {
        return revenue;
    }

    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "ShopRevenueByYearDTO{" +
                "id=" + id +
                ", year=" + year +
                ", revenue=" + revenue +
                '}';
    }
}
