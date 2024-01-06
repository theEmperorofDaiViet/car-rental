package com.example.carrentalbranch.controller;

import com.example.carrentalbranch.model.Contact;
import com.example.carrentalbranch.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/save")
    public ResponseEntity<Contact> save(@RequestBody Contact contact){
        return new ResponseEntity<>(contactService.save(contact), HttpStatus.CREATED);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<Contact> update(@PathVariable("id") Integer id, @RequestBody Contact contact){
        if(contactService.get(id) == null){
            return new ResponseEntity<>((Contact) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(contactService.update(id, contact), HttpStatus.OK);
        }
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<String> delete(@PathVariable("id") Integer id){
        contactService.delete(id);
        return new ResponseEntity<>("Contact has been deleted!", HttpStatus.OK);
    }
}
