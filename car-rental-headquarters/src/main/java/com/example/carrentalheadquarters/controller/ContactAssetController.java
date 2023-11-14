package com.example.carrentalheadquarters.controller;

import com.example.carrentalheadquarters.model.ContactAsset;
import com.example.carrentalheadquarters.service.ContactAssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/contactasset")
public class ContactAssetController {

    @Autowired
    private ContactAssetService contactAssetService;

    @GetMapping
    public ResponseEntity<List<ContactAsset>> list(){
        return new ResponseEntity<>(contactAssetService.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContactAsset> get(@PathVariable("id") Integer id){
        if(contactAssetService.get(id) == null){
            return new ResponseEntity<>((ContactAsset) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(contactAssetService.get(id), HttpStatus.OK);
        }
    }
}
