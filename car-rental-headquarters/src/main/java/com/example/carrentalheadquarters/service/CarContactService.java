package com.example.carrentalheadquarters.service;

import com.example.carrentalheadquarters.model.CarContact;
import com.example.carrentalheadquarters.repository.CarContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarContactService {

    @Autowired
    private CarContactRepository carContactRepository;

    public List<CarContact> list(){
        return carContactRepository.findAll();
    }

    public CarContact get(Integer id){
        Optional<CarContact> carContactOptional = carContactRepository.findById(id);
        if(carContactOptional.isPresent()){
            return carContactOptional.get();
        }
        else {
            return null;
        }
    }
}
