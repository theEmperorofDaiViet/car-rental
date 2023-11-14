package com.example.carrentalheadquarters.service;

import com.example.carrentalheadquarters.model.Contact;
import com.example.carrentalheadquarters.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> list(){
        return contactRepository.findAll();
    }

    public Contact get(Integer id){
        Optional<Contact> contactOptional = contactRepository.findById(id);
        if(contactOptional.isPresent()){
            return contactOptional.get();
        }
        else {
            return null;
        }
    }
}
