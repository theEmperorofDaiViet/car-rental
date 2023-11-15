package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.dto.ShopRevenueByMonthDTO;
import org.springframework.data.repository.CrudRepository;

public interface ShopRevenueByMonthRepository extends CrudRepository<ShopRevenueByMonthDTO, Integer>, ShopRevenueByMonthRepositoryCustom{
}
