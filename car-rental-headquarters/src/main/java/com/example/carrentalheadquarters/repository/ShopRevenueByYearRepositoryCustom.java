package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.dto.ShopRevenueByYearDTO;

import java.util.List;

public interface ShopRevenueByYearRepositoryCustom {

    List<ShopRevenueByYearDTO> getRevenueByYear(Integer shopid);
}
