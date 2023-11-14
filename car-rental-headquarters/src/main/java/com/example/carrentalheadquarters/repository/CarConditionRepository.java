package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.model.CarCondition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarConditionRepository extends JpaRepository<CarCondition, Integer> {

}
