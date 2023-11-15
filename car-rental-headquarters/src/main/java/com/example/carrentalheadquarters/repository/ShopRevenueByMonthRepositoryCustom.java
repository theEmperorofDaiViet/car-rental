package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.dto.ShopRevenueByMonthDTO;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ShopRevenueByMonthRepositoryCustom  {

    List<ShopRevenueByMonthDTO> getRevenueByMonth(Integer shopid);
}
