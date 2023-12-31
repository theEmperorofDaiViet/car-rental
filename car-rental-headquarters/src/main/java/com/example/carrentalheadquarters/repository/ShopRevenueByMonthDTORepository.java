package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.dto.ShopRevenueByMonthDTO;
import org.springframework.data.repository.CrudRepository;

public interface ShopRevenueByMonthDTORepository extends CrudRepository<ShopRevenueByMonthDTO, Integer>, ShopRevenueByMonthDTORepositoryCustom {
}
