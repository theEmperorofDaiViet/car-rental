package com.example.carrentalheadquarters.repository;

import com.example.carrentalheadquarters.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {

}
