package com.example.carrentalbranch.service;

import com.example.carrentalbranch.model.Contact;
import com.example.carrentalbranch.repository.ContactRepository;
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

    public Contact save(Contact contact){
        return contactRepository.save(contact);
    }

    public Contact update(Integer id, Contact contact){
        Optional<Contact> contactOptional = contactRepository.findById(id);
        if(contactOptional.isEmpty()){
            return null;
        }
        else {
            Contact existingContact = contactOptional.get();
            existingContact.setRentaldate(contact.getRentaldate());
            existingContact.setDeposit(contact.getDeposit());
            return contactRepository.save(existingContact);
        }
    }

    public void delete(Integer id){
        contactRepository.deleteById(id);
    }
}
