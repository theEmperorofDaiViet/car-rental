package com.example.carrentalbranch.controller;

import com.example.carrentalbranch.dto.ShopClientDTO;
import com.example.carrentalbranch.dto.ShopRevenueByMonthDTO;
import com.example.carrentalbranch.dto.ShopRevenueByYearDTO;
import com.example.carrentalbranch.dto.ShopRevenueDTO;
import com.example.carrentalbranch.model.Shop;
import com.example.carrentalbranch.service.ShopService;
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
