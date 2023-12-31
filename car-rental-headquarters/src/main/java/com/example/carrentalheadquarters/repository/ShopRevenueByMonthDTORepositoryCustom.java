package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.dto.ShopRevenueByMonthDTO;

import java.util.List;

public interface ShopRevenueByMonthDTORepositoryCustom {

    List<ShopRevenueByMonthDTO> getRevenueByMonth(Integer shopid);
}
