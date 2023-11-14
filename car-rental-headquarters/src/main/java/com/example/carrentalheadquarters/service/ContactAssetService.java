package com.example.carrentalheadquarters.service;

import com.example.carrentalheadquarters.model.ContactAsset;
import com.example.carrentalheadquarters.repository.ContactAssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactAssetService {

    @Autowired
    private ContactAssetRepository contactAssetRepository;

    public List<ContactAsset> list(){
        return contactAssetRepository.findAll();
    }

    public ContactAsset get(Integer id){
        Optional<ContactAsset> contactAssetOptional = contactAssetRepository.findById(id);
        if(contactAssetOptional.isPresent()){
            return contactAssetOptional.get();
        }
        else {
            return null;
        }
    }
}
