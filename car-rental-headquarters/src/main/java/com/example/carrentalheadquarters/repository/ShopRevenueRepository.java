package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.dto.ShopRevenueDTO;
import org.springframework.data.repository.CrudRepository;

public interface ShopRevenueRepository extends CrudRepository<ShopRevenueDTO, Integer>, ShopRevenueRepositoryCustom {


}
