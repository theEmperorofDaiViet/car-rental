package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.model.CarContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarContactRepository extends JpaRepository<CarContact, Integer> {
    
}
