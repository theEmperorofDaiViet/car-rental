package com.example.carrentalheadquarters.service;

import com.example.carrentalheadquarters.model.Shop;
import com.example.carrentalheadquarters.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopService {

    @Autowired
    private ShopRepository shopRepository;

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

    public Shop save(Shop shop){
        return shopRepository.save(shop);
    }

    public Shop update(Integer id, Shop shop){
        Optional<Shop> shopOptional = shopRepository.findById(id);
        if(shopOptional.isEmpty()){
            return null;
        }
        else{
            Shop existingShop = shopOptional.get();
            existingShop.setShopname(shop.getShopname());
            existingShop.setFacilityname(shop.getFacilityname());
            existingShop.setAddress(shop.getAddress());
            existingShop.setEmail(shop.getEmail());
            existingShop.setDescribes(shop.getDescribes());
            return shopRepository.save(existingShop);
        }
    }

    public void delete(Integer id){
        shopRepository.deleteById(id);
    }
}
