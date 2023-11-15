package com.example.carrentalheadquarters.dto;

import jakarta.persistence.*;

@Entity
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "getAllClient",
                procedureName = "dbo.ALL_CLIENT",
                resultSetMappings = {
                        "ShopClient",
                }
        )
})
@SqlResultSetMappings({
        @SqlResultSetMapping(
                name = "ShopClient",
                classes = {
                        @ConstructorResult(
                                targetClass = ShopClientDTO.class,
                                columns = {
                                        @ColumnResult(name = "id", type = Integer.class),
                                        @ColumnResult(name = "shopname", type = String.class),
                                        @ColumnResult(name = "num_of_client", type = Integer.class)
                                }
                        )
                }
        )
})
public class ShopClientDTO {

    @Id
    private Integer shopid;

    @Column
    private String shopname;

    @Column
    private Integer num_of_client;

    public ShopClientDTO() {

    }

    public ShopClientDTO(Integer shopid, String shopname, Integer num_of_client) {
        this.shopid = shopid;
        this.shopname = shopname;
        this.num_of_client = num_of_client;
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

    public Integer getNum_of_client() {
        return num_of_client;
    }

    public void setNum_of_client(Integer num_of_client) {
        this.num_of_client = num_of_client;
    }

    @Override
    public String toString() {
        return "ShopClientDTO{" +
                "shopid=" + shopid +
                ", shopname='" + shopname + '\'' +
                ", num_of_client=" + num_of_client +
                '}';
    }
}
