package com.example.carrentalbranch.service;

import com.example.carrentalbranch.model.Bill;
import com.example.carrentalbranch.repository.BillRepository;
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

    public Bill save(Bill bill){
        return billRepository.save(bill);
    }

    public Bill update(Integer id, Bill bill){
        Optional<Bill> billOptional = billRepository.findById(id);
        if(billOptional.isEmpty()){
            return null;
        }
        else {
            Bill existingBill = billOptional.get();
            existingBill.setPayday(bill.getPayday());
            return billRepository.save(existingBill);
        }
    }

    public void delete(Integer id){
        billRepository.deleteById(id);
    }
}
