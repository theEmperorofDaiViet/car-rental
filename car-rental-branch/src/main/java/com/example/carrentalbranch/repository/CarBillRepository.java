package com.example.carrentalbranch.repository;

import com.example.carrentalbranch.model.CarBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarBillRepository extends JpaRepository<CarBill, Integer> {

}
