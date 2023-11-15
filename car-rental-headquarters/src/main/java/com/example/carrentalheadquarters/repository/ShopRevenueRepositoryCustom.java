package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.dto.ShopRevenueByMonthDTO;
import com.example.carrentalheadquarters.dto.ShopRevenueDTO;

import java.util.List;

public interface ShopRevenueRepositoryCustom {

    List<ShopRevenueDTO> getAllRevenue();

}
