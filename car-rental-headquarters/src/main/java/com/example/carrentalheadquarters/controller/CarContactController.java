package com.example.carrentalheadquarters.controller;

import com.example.carrentalheadquarters.model.CarContact;
import com.example.carrentalheadquarters.service.CarContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/carcontact")
public class CarContactController {

    @Autowired
    private CarContactService carContactService;

    @GetMapping
    public ResponseEntity<List<CarContact>> list(){
        return new ResponseEntity<>(carContactService.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarContact> get(@PathVariable("id") Integer id){
        if(carContactService.get(id) == null){
            return new ResponseEntity<>((CarContact) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(carContactService.get(id), HttpStatus.OK);
        }
    }
}
