package com.example.carrentalbranch.repository;

import com.example.carrentalbranch.dto.ShopRevenueByMonthDTO;
import org.springframework.data.repository.CrudRepository;

public interface ShopRevenueByMonthDTORepository extends CrudRepository<ShopRevenueByMonthDTO, Integer>, ShopRevenueByMonthDTORepositoryCustom {

}
