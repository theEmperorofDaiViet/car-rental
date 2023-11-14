package com.example.carrentalheadquarters.service;

import com.example.carrentalheadquarters.model.ShopClient;
import com.example.carrentalheadquarters.repository.ShopClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopClientService {

    @Autowired
    private ShopClientRepository shopClientRepository;

    public List<ShopClient> list(){
        return shopClientRepository.findAll();
    }

    public ShopClient get(Integer id){
        Optional<ShopClient> shopClientOptional = shopClientRepository.findById(id);
        if(shopClientOptional.isPresent()){
            return shopClientOptional.get();
        }
        else {
            return null;
        }
    }
}
