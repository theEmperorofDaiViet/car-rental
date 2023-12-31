package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.dto.ShopRevenueByYearDTO;
import org.springframework.data.repository.CrudRepository;

public interface ShopRevenueByYearDTORepository extends CrudRepository<ShopRevenueByYearDTO, Integer>, ShopRevenueByYearDTORepositoryCustom {
}
