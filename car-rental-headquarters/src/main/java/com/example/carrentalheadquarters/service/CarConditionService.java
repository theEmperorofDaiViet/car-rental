package com.example.carrentalheadquarters.service;

import com.example.carrentalheadquarters.model.CarCondition;
import com.example.carrentalheadquarters.repository.CarConditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarConditionService {

    @Autowired
    private CarConditionRepository conditionRepository;

    public List<CarCondition> list(){
        return conditionRepository.findAll();
    }

    public CarCondition get(Integer id){
        Optional<CarCondition> carConditionOptional = conditionRepository.findById(id);
        if(carConditionOptional.isPresent()){
            return carConditionOptional.get();
        }
        else {
            return null;
        }
    }
}
