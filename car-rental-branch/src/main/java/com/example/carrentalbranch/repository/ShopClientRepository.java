package com.example.carrentalbranch.repository;

import com.example.carrentalbranch.model.ShopClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopClientRepository extends JpaRepository<ShopClient, Integer> {

}
