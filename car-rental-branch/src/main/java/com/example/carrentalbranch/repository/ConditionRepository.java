package com.example.carrentalbranch.repository;

import com.example.carrentalbranch.model.Condition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConditionRepository extends JpaRepository<Condition, Integer> {

}
