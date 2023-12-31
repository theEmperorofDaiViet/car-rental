package com.example.carrentalbranch.repository;

import com.example.carrentalbranch.dto.ShopRevenueDTO;
import org.springframework.data.repository.CrudRepository;

public interface ShopRevenueDTORepository extends CrudRepository<ShopRevenueDTO, Integer>, ShopRevenueDTORepositoryCustom {

}
