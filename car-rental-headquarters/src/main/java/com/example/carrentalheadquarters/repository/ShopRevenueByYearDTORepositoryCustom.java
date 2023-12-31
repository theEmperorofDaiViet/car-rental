package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.dto.ShopRevenueByYearDTO;

import java.util.List;

public interface ShopRevenueByYearDTORepositoryCustom {

    List<ShopRevenueByYearDTO> getRevenueByYear(Integer shopid);
}
