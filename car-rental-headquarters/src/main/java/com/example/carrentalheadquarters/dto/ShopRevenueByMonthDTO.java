package com.example.carrentalheadquarters.dto;

import jakarta.persistence.*;

@Entity
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "getRevenueByMonth",
                procedureName = "dbo.REVENUEBYMONTH",
                parameters = {
                    @StoredProcedureParameter(mode = ParameterMode.IN, name = "shopid", type = Integer.class)
                },
                resultSetMappings = {
                        "ShopRevenueByMonth",
                }
        )
})
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ShopRevenueByMonth",
                classes = {
                        @ConstructorResult(
                                targetClass = ShopRevenueByMonthDTO.class,
                                columns = {
                                        @ColumnResult(name = "year", type = Integer.class),
                                        @ColumnResult(name = "month", type = Integer.class),
                                        @ColumnResult(name = "revenue", type = Integer.class)
                                }
                        )
                }
        )
})
public class ShopRevenueByMonthDTO {

    @Id
    private Integer id;

    @Column
    private Integer month;

    @Column
    private Integer year;

    @Column
    private Integer revenue;

    public ShopRevenueByMonthDTO() {

    }

    public ShopRevenueByMonthDTO(Integer id, Integer month, Integer year, Integer revenue) {
        this.id = id;
        this.month = month;
        this.year = year;
        this.revenue = revenue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
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
        return "ShopRevenueByMonthDTO{" +
                "id=" + id +
                ", month=" + month +
                ", year=" + year +
                ", revenue=" + revenue +
                '}';
    }
}
