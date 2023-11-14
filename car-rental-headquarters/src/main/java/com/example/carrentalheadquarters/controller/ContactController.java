package com.example.carrentalheadquarters.controller;

import com.example.carrentalheadquarters.model.Contact;
import com.example.carrentalheadquarters.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping
    public ResponseEntity<List<Contact>> list(){
        return new ResponseEntity<>(contactService.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contact> get(@PathVariable("id") Integer id){
        if(contactService.get(id) == null){
            return new ResponseEntity<>((Contact) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(contactService.get(id), HttpStatus.OK);
        }
    }
}
