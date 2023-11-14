package com.example.carrentalheadquarters.controller;

import com.example.carrentalheadquarters.model.StaffCar;
import com.example.carrentalheadquarters.service.StaffCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staffcar")
public class StaffCarController {

    @Autowired
    private StaffCarService staffCarService;

    @GetMapping
    public ResponseEntity<List<StaffCar>> list(){
        return new ResponseEntity<>(staffCarService.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StaffCar> get(@PathVariable("id") Integer id){
        if(staffCarService.get(id) == null){
            return new ResponseEntity<>((StaffCar) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(staffCarService.get(id), HttpStatus.OK);
        }
    }
}
