package com.example.carrentalheadquarters.service;

import com.example.carrentalheadquarters.model.Bill;
import com.example.carrentalheadquarters.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillService {

    @Autowired
    private BillRepository billRepository;

    public List<Bill> list(){
        return billRepository.findAll();
    }

    public Bill get(Integer id){
        Optional<Bill> billOptional = billRepository.findById(id);
        if(billOptional.isPresent()){
            return billOptional.get();
        }
        else {
            return null;
        }
    }
}
