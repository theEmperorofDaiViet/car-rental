package com.example.carrentalheadquarters.controller;

import com.example.carrentalheadquarters.model.Asset;
import com.example.carrentalheadquarters.service.AssetService;
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

    @PostMapping("/save")
    public ResponseEntity<Asset> save(@RequestBody Asset asset){
        return new ResponseEntity<>(assetService.save(asset), HttpStatus.CREATED);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<Asset> update(@PathVariable("id") Integer id, @RequestBody Asset asset){
        if(assetService.get(id) == null){
            return new ResponseEntity<>((Asset) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(assetService.update(id, asset), HttpStatus.OK);
        }
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<String> delete(@PathVariable("id") Integer id){
        assetService.delete(id);
        return new ResponseEntity<>("Asset has been deleted!", HttpStatus.OK);
    }
}
