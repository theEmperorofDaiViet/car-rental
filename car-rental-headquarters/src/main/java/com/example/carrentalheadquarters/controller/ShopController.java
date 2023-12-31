package com.example.carrentalheadquarters.controller;

import com.example.carrentalheadquarters.dto.ShopClientDTO;
import com.example.carrentalheadquarters.dto.ShopRevenueByMonthDTO;
import com.example.carrentalheadquarters.dto.ShopRevenueByYearDTO;
import com.example.carrentalheadquarters.dto.ShopRevenueDTO;
import com.example.carrentalheadquarters.model.Shop;
import com.example.carrentalheadquarters.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping
    public ResponseEntity<List<Shop>> list(){
        return new ResponseEntity<>(shopService.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Shop> get(@PathVariable("id") Integer id){
        if(shopService.get(id) == null){
            return new ResponseEntity<>((Shop) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(shopService.get(id), HttpStatus.OK);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Shop> save(@RequestBody Shop shop){
        return new ResponseEntity<>(shopService.save(shop), HttpStatus.CREATED);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<Shop> update(@PathVariable("id") Integer id, @RequestBody Shop shop){
        if(shopService.get(id) == null){
            return new ResponseEntity<>((Shop) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(shopService.update(id, shop), HttpStatus.OK);
        }
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<String> delete(@PathVariable("id") Integer id){
        shopService.delete(id);
        return new ResponseEntity<>("Shop has been deleted!", HttpStatus.OK);
    }

    @GetMapping("/revenue")
    private ResponseEntity<List<ShopRevenueDTO>> getAllRevenue(){
        return new ResponseEntity<>(shopService.getAllRevenue(), HttpStatus.OK);
    }

    @GetMapping("/revenue/month/{shopid}")
    private ResponseEntity<List<ShopRevenueByMonthDTO>> getRevenueByMonth(@PathVariable("shopid") Integer shopid){
        return new ResponseEntity<>(shopService.getRevenueByMonth(shopid), HttpStatus.OK);
    }

    @GetMapping("/revenue/year/{shopid}")
    private ResponseEntity<List<ShopRevenueByYearDTO>> getRevenueByYear(@PathVariable("shopid") Integer shopid){
        return new ResponseEntity<>(shopService.getRevenueByYear(shopid), HttpStatus.OK);
    }

    @GetMapping("/client")
    private ResponseEntity<List<ShopClientDTO>> getAllClient(){
        return new ResponseEntity<>(shopService.getAllClient(), HttpStatus.OK);
    }
}
