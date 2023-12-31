package com.example.carrentalbranch.repository;

import com.example.carrentalbranch.dto.ShopRevenueByMonthDTO;

import java.util.List;

public interface ShopRevenueByMonthDTORepositoryCustom {

    List<ShopRevenueByMonthDTO> getRevenueByMonth(Integer shopid);

}
