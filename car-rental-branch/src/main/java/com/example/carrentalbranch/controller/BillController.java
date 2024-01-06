package com.example.carrentalbranch.controller;

import com.example.carrentalbranch.model.Bill;
import com.example.carrentalbranch.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/save")
    public ResponseEntity<Bill> save(@RequestBody Bill bill){
        return new ResponseEntity<>(billService.save(bill), HttpStatus.CREATED);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<Bill> update(@PathVariable("id") Integer id, @RequestBody Bill bill){
        if(billService.get(id) == null){
            return new ResponseEntity<>((Bill) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(billService.update(id, bill), HttpStatus.OK);
        }
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<String> delete(@PathVariable("id") Integer id){
        billService.delete(id);
        return new ResponseEntity<>("Bill has been deleted!", HttpStatus.OK);
    }
}
