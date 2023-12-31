package com.example.carrentalbranch.repository;

import com.example.carrentalbranch.model.ContactAsset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactAssetRepository extends JpaRepository<ContactAsset, Integer> {

}
