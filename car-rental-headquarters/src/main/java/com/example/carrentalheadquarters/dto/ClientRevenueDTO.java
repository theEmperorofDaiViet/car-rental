package com.example.carrentalheadquarters.dto;

import jakarta.persistence.*;

@Entity
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "getRevenueByClient",
                procedureName = "dbo.REVENUEFROMEACHCLIENT",
                resultSetMappings = {
                        "ClientRevenue",
                }
        )
})
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ClientRevenue",
                classes = {
                        @ConstructorResult(
                                targetClass = ClientRevenueDTO.class,
                                columns = {
                                        @ColumnResult(name = "id", type = Integer.class),
                                        @ColumnResult(name = "name", type = String.class),
                                        @ColumnResult(name = "revenue", type = Integer.class)
                                }
                        )
                }
        )
})
public class ClientRevenueDTO {

    @Id
    private Integer shopid;

    @Column
    private String name;

    @Column
    private Integer revenue;

    public ClientRevenueDTO() {

    }

    public ClientRevenueDTO(Integer shopid, String name, Integer revenue) {
        this.shopid = shopid;
        this.name = name;
        this.revenue = revenue;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRevenue() {
        return revenue;
    }

    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "ClientRevenueDTO{" +
                "shopid=" + shopid +
                ", name='" + name + '\'' +
                ", revenue=" + revenue +
                '}';
    }
}
