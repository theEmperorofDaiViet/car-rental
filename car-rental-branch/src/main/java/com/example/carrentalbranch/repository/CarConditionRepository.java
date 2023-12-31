package com.example.carrentalbranch.repository;

import com.example.carrentalbranch.model.CarCondition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarConditionRepository extends JpaRepository<CarCondition, Integer> {

}
