package com.example.carrentalbranch.repository;

import com.example.carrentalbranch.model.StaffCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffCarRepository extends JpaRepository<StaffCar, Integer> {

}
