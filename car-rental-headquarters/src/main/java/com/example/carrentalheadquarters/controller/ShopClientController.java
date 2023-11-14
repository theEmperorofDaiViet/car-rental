package com.example.carrentalheadquarters.controller;

import com.example.carrentalheadquarters.model.ShopClient;
import com.example.carrentalheadquarters.service.ShopClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/shopclient")
public class ShopClientController {

    @Autowired
    private ShopClientService shopClientService;

    @GetMapping
    public ResponseEntity<List<ShopClient>> list(){
        return new ResponseEntity<>(shopClientService.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShopClient> get(@PathVariable("id") Integer id){
        if(shopClientService.get(id) == null){
            return new ResponseEntity<>((ShopClient) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(shopClientService.get(id), HttpStatus.OK);
        }
    }
}
