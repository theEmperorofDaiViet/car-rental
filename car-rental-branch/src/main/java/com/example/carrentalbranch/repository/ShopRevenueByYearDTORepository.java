package com.example.carrentalbranch.repository;

import com.example.carrentalbranch.dto.ShopRevenueByYearDTO;
import org.springframework.data.repository.CrudRepository;

public interface ShopRevenueByYearDTORepository extends CrudRepository<ShopRevenueByYearDTO, Integer>, ShopRevenueByYearDTORepositoryCustom {

}
