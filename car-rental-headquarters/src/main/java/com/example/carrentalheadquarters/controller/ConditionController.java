package com.example.carrentalheadquarters.controller;

import com.example.carrentalheadquarters.model.Condition;
import com.example.carrentalheadquarters.service.ConditionService;
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

    @PostMapping("/save")
    public ResponseEntity<Condition> save(@RequestBody Condition condition){
        return new ResponseEntity<>(conditionService.save(condition), HttpStatus.CREATED);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<Condition> update(@PathVariable("id") Integer id, @RequestBody Condition condition){
        if(conditionService.get(id) == null){
            return new ResponseEntity<>((Condition) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(conditionService.update(id, condition), HttpStatus.OK);
        }
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<String> delete(@PathVariable("id") Integer id){
        conditionService.delete(id);
        return new ResponseEntity<>("Condition has been deleted!", HttpStatus.OK);
    }
}
