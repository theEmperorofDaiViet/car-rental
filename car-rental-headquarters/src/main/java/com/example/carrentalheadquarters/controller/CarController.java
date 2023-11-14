package com.example.carrentalheadquarters.controller;

import com.example.carrentalheadquarters.model.Car;
import com.example.carrentalheadquarters.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping
    public ResponseEntity<List<Car>> list(){
        return new ResponseEntity<>(carService.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> get(@PathVariable("id") Integer id){
        if(carService.get(id) == null){
            return new ResponseEntity<>((Car) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(carService.get(id), HttpStatus.OK);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Car> save(@RequestBody Car car){
        return new ResponseEntity<>(carService.save(car), HttpStatus.CREATED);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<Car> update(@PathVariable("id") Integer id, @RequestBody Car car){
        if(carService.get(id) == null){
            return new ResponseEntity<>((Car) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(carService.update(id, car), HttpStatus.OK);
        }
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<String> delete(@PathVariable("id") Integer id){
        carService.delete(id);
        return new ResponseEntity<>("Car has been deleted!", HttpStatus.OK);
    }
}
