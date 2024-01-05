package com.example.carrentalbranch.service;

import com.example.carrentalbranch.model.Condition;
import com.example.carrentalbranch.repository.ConditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConditionService {

    @Autowired
    private ConditionRepository conditionRepository;

    public List<Condition> list(){
        return conditionRepository.findAll();
    }

    public Condition get(Integer id){
        Optional<Condition> conditionOptional = conditionRepository.findById(id);
        if(conditionOptional.isPresent()){
            return conditionOptional.get();
        }
        else {
            return null;
        }
    }
}
