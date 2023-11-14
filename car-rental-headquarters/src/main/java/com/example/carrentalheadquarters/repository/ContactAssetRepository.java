package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.model.ContactAsset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactAssetRepository extends JpaRepository<ContactAsset, Integer> {

}
