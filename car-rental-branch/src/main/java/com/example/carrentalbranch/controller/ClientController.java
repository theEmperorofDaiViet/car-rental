package com.example.carrentalbranch.controller;

import com.example.carrentalbranch.dto.ClientRevenueDTO;
import com.example.carrentalbranch.model.Client;
import com.example.carrentalbranch.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> list(){
        return new ResponseEntity<>(clientService.list(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> get(@PathVariable("id") Integer id){
        if(clientService.get(id) == null){
            return new ResponseEntity<>((Client) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(clientService.get(id), HttpStatus.OK);
        }
    }

    @PostMapping("/save")
    public ResponseEntity<Client> save(@RequestBody Client client){
        return new ResponseEntity<>(clientService.save(client), HttpStatus.CREATED);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<Client> update(@PathVariable("id") Integer id, @RequestBody Client client){
        if(clientService.get(id) == null){
            return new ResponseEntity<>((Client) null, HttpStatus.NOT_FOUND);
        }
        else {
            return new ResponseEntity<>(clientService.update(id, client), HttpStatus.OK);
        }
    }

    @GetMapping("/revenue")
    private ResponseEntity<List<ClientRevenueDTO>> getRevenueByClient(){
        return new ResponseEntity<>(clientService.getRevenueByClient(), HttpStatus.OK);
    }
}
