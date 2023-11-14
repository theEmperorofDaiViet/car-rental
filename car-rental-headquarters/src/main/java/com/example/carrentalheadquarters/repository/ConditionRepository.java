package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.model.Condition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConditionRepository extends JpaRepository<Condition, Integer> {

}
