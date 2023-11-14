package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.model.StaffCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffCarRepository extends JpaRepository<StaffCar, Integer> {

}
