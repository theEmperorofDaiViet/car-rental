package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.dto.ShopRevenueByYearDTO;
import org.springframework.data.repository.CrudRepository;

public interface ShopRevenueByYearRepository extends CrudRepository<ShopRevenueByYearDTO, Integer>, ShopRevenueByYearRepositoryCustom {
}
