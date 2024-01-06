package com.example.carrentalbranch.controller;

import com.example.carrentalbranch.model.Asset;
import com.example.carrentalbranch.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asset")
public class AssetController {

    @Autowired
    private AssetService assetService;

    @GetMapping
    public ResponseEntity<List<Asset>> list(){
        return new ResponseEntity<>(assetService.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Asset> get(@PathVariable("id") Integer id){
        if(assetService.get(id) == null){
            return new ResponseEntity<>((Asset) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(assetService.get(id), HttpStatus.OK);
        }
    }
}
