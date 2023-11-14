package com.example.carrentalheadquarters.service;

import com.example.carrentalheadquarters.model.StaffCar;
import com.example.carrentalheadquarters.repository.StaffCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffCarService {

    @Autowired
    private StaffCarRepository staffCarRepository;

    public List<StaffCar> list(){
        return staffCarRepository.findAll();
    }

    public StaffCar get(Integer id){
        Optional<StaffCar> staffCarOptional = staffCarRepository.findById(id);
        if(staffCarOptional.isPresent()){
            return staffCarOptional.get();
        }
        else {
            return null;
        }
    }
}
