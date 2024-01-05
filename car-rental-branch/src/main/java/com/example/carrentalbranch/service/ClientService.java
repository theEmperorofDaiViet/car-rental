package com.example.carrentalbranch.service;

import com.example.carrentalbranch.dto.ClientRevenueDTO;
import com.example.carrentalbranch.model.Client;
import com.example.carrentalbranch.repository.ClientRepository;
import com.example.carrentalbranch.repository.ClientRevenueDTORepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ClientRevenueDTORepositoryImpl clientRevenueDTORepository;

    public List<Client> list(){
        return clientRepository.findAll();
    }

    public Client get(Integer id){
        Optional<Client> clientOptional = clientRepository.findById(id);
        if(clientOptional.isPresent()){
            return clientOptional.get();
        }
        else {
            return null;
        }
    }

    public Client save(Client client){
        return clientRepository.save(client);
    }

    public Client update(Integer id, Client client){
        Optional<Client> clientOptional = clientRepository.findById(id);
        if(clientOptional.isEmpty()){
            return null;
        }
        else {
            Client existingClient = clientOptional.get();
            existingClient.setName(client.getName());
            existingClient.setPhone(client.getPhone());
            existingClient.setAddress(client.getAddress());
            existingClient.setNote(client.getNote());
            return clientRepository.save(existingClient);
        }
    }

    public List<ClientRevenueDTO> getRevenueByClient(){
        return  clientRevenueDTORepository.getRevenueByClient();
    }
}
