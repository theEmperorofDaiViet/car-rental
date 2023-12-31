package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Integer> {

}
