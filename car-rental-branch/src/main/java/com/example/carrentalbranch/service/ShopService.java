package com.example.carrentalbranch.service;

import com.example.carrentalbranch.dto.ShopClientDTO;
import com.example.carrentalbranch.dto.ShopRevenueByMonthDTO;
import com.example.carrentalbranch.dto.ShopRevenueByYearDTO;
import com.example.carrentalbranch.dto.ShopRevenueDTO;
import com.example.carrentalbranch.model.Shop;
import com.example.carrentalbranch.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

    @Autowired
    private ShopRevenueDTORepositoryImpl shopRevenueDTORepository;

    @Autowired
    private ShopRevenueByMonthDTORepositoryImpl shopRevenueByMonthDTORepository;

    @Autowired
    private ShopRevenueByYearDTORepositoryImpl shopRevenueByYearDTORepository;

    @Autowired
    private ShopClientDTORepositoryImpl shopClientDTORepository;

    public List<Shop> list(){
        return shopRepository.findAll();
    }

    public Shop get(Integer id){
        Optional<Shop> shopOptional = shopRepository.findById(id);
        if(shopOptional.isPresent()){
            return shopOptional.get();
        }
        else{
            return null;
        }
    }

    public List<ShopRevenueDTO> getAllRevenue(){
        return  shopRevenueDTORepository.getAllRevenue();
    }

    public List<ShopRevenueByMonthDTO> getRevenueByMonth(Integer shopid){
        return shopRevenueByMonthDTORepository.getRevenueByMonth(shopid);
    }

    public List<ShopRevenueByYearDTO> getRevenueByYear(Integer shopid){
        return shopRevenueByYearDTORepository.getRevenueByYear(shopid);
    }

    public List<ShopClientDTO> getAllClient(){
        return  shopClientDTORepository.getAllClient();
    }
}
