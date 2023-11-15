package com.example.carrentalheadquarters.dto;

import jakarta.persistence.*;
import org.springframework.context.annotation.Bean;

@Entity
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "getAllRevenue",
                procedureName = "dbo.ALL_REVENUE",
                resultSetMappings = {
                        "ShopRevenue",
                }
        )
})
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ShopRevenue",
                classes = {
                        @ConstructorResult(
                                targetClass = ShopRevenueDTO.class,
                                columns = {
                                        @ColumnResult(name = "id", type = Integer.class),
                                        @ColumnResult(name = "shopname", type = String.class),
                                        @ColumnResult(name = "revenue", type = Integer.class)
                                }
                        )
                }
        )
})
public class ShopRevenueDTO {

    @Id
    private Integer shopid;

    @Column
    private String shopname;

    @Column
    private Integer revenue;

    public ShopRevenueDTO() {

    }

    public ShopRevenueDTO(Integer shopid, String shopname, Integer revenue) {
        this.shopid = shopid;
        this.shopname = shopname;
        this.revenue = revenue;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public Integer getRevenue() {
        return revenue;
    }

    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "ShopRevenueDTO{" +
                "shopid=" + shopid +
                ", shopname='" + shopname + '\'' +
                ", revenue=" + revenue +
                '}';
    }
}
