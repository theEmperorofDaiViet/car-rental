package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.model.ShopClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopClientRepository extends JpaRepository<ShopClient, Integer> {

}
