package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Integer> {

}
