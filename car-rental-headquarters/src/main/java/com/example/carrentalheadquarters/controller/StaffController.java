package com.example.carrentalheadquarters.controller;

import com.example.carrentalheadquarters.model.Staff;
import com.example.carrentalheadquarters.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @GetMapping
    public ResponseEntity<List<Staff>> list(){
        return new ResponseEntity<>(staffService.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Staff> get(@PathVariable("id") Integer id){
        if(staffService.get(id) == null){
            return new ResponseEntity<>((Staff) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(staffService.get(id), HttpStatus.OK);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Staff> save(@RequestBody Staff staff){
        return new ResponseEntity<>(staffService.save(staff), HttpStatus.CREATED);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<Staff> update(@PathVariable("id") Integer id, @RequestBody Staff staff){
        if(staffService.get(id) == null){
            return new ResponseEntity<>((Staff) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(staffService.update(id, staff), HttpStatus.OK);
        }
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<String> delete(@PathVariable("id") Integer id){
        staffService.delete(id);
        return new ResponseEntity<>("Staff has been deleted!", HttpStatus.OK);
    }
}
