package com.example.carrentalheadquarters.controller;

import com.example.carrentalheadquarters.model.Bill;
import com.example.carrentalheadquarters.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bill")
public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping
    public ResponseEntity<List<Bill>> list(){
        return new ResponseEntity<>(billService.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bill> get(@PathVariable("id") Integer id){
        if(billService.get(id) == null){
            return new ResponseEntity<>((Bill) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(billService.get(id), HttpStatus.OK);
        }
    }
}
