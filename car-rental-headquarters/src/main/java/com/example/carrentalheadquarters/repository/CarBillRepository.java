package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.model.CarBill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarBillRepository extends JpaRepository<CarBill, Integer> {

}
