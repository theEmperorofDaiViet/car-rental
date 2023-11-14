package com.example.carrentalheadquarters.service;

import com.example.carrentalheadquarters.model.Condition;
import com.example.carrentalheadquarters.repository.ConditionRepository;
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

    public Condition save(Condition condition){
        return conditionRepository.save(condition);
    }

    public Condition update(Integer id, Condition condition){
        Optional<Condition> conditionOptional = conditionRepository.findById(id);
        if(conditionOptional.isEmpty()){
            return null;
        }
        else {
            Condition existingConditon = conditionOptional.get();
            existingConditon.setConditionname(condition.getConditionname());
            existingConditon.setExpense(condition.getExpense());
            return conditionRepository.save(existingConditon);
        }
    }

    public void delete(Integer id){
        conditionRepository.deleteById(id);
    }
}
