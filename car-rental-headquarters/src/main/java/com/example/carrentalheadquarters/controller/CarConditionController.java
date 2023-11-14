package com.example.carrentalheadquarters.controller;

import com.example.carrentalheadquarters.model.CarCondition;
import com.example.carrentalheadquarters.service.CarConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/carcondition")
public class CarConditionController {

    @Autowired
    private CarConditionService carConditionService;

    @GetMapping
    public ResponseEntity<List<CarCondition>> list(){
        return new ResponseEntity<>(carConditionService.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarCondition> get(@PathVariable("id") Integer id){
        if(carConditionService.get(id) == null){
            return new ResponseEntity<>((CarCondition) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(carConditionService.get(id), HttpStatus.OK);
        }
    }
}
