package com.example.carrentalheadquarters.controller;

import com.example.carrentalheadquarters.model.CarBill;
import com.example.carrentalheadquarters.service.CarBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/carbill")
public class CarBillController {

    @Autowired
    private CarBillService carBillService;

    @GetMapping
    public ResponseEntity<List<CarBill>> list(){
        return new ResponseEntity<>(carBillService.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarBill> get(@PathVariable("id") Integer id){
        if(carBillService.get(id) == null){
            return new ResponseEntity<>((CarBill) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(carBillService.get(id), HttpStatus.OK);
        }
    }
}
