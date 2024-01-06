package com.example.carrentalbranch.controller;

import com.example.carrentalbranch.model.Condition;
import com.example.carrentalbranch.service.ConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/condition")
public class ConditionController {

    @Autowired
    private ConditionService conditionService;

    @GetMapping
    public ResponseEntity<List<Condition>> list(){
        return new ResponseEntity<>(conditionService.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Condition> get(@PathVariable("id") Integer id){
        if(conditionService.get(id) == null){
            return new ResponseEntity<>((Condition) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(conditionService.get(id), HttpStatus.OK);
        }
    }
}
