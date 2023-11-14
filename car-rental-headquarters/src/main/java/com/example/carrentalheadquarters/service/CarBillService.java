package com.example.carrentalheadquarters.service;

import com.example.carrentalheadquarters.model.CarBill;
import com.example.carrentalheadquarters.repository.CarBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarBillService {

    @Autowired
    private CarBillRepository carBillRepository;

    public List<CarBill> list(){
        return carBillRepository.findAll();
    }

    public CarBill get(Integer id){
        Optional<CarBill> carBillOptional = carBillRepository.findById(id);
        if(carBillOptional.isPresent()){
            return carBillOptional.get();
        }
        else {
            return null;
        }
    }
}
