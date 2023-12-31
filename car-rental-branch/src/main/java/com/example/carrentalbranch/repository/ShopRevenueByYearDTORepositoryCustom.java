package com.example.carrentalbranch.repository;

import com.example.carrentalbranch.dto.ShopRevenueByYearDTO;

import java.util.List;

public interface ShopRevenueByYearDTORepositoryCustom {

    List<ShopRevenueByYearDTO> getRevenueByYear(Integer shopid);

}
