package com.example.carrentalbranch.repository;

import com.example.carrentalbranch.model.CarContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarContactRepository extends JpaRepository<CarContact, Integer> {

}
