package com.example.carrentalbranch.repository;

import com.example.carrentalbranch.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends JpaRepository<Asset, Integer> {

}
