package com.example.stagebackend.services;

import com.example.stagebackend.models.client;
import com.example.stagebackend.repositories.clientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class clientService {

    @Autowired
    private clientRepository clientRepository;

    public List<client> getAllClients() {
        return clientRepository.findAll();
    }

    public Optional<client> getClientById(Integer id) {
        return clientRepository.findById(id);
    }

    public client createClient(client client) {
        return clientRepository.save(client);
    }

    public client updateClient(Integer id, client clientDetails) {
        return clientRepository.findById(id).map(client -> {
            client.setName(clientDetails.getName()); // Update client_name
            client.setPhone_number(clientDetails.getPhone_number());
            client.setCity(clientDetails.getCity());
            client.setStatus(clientDetails.getStatus());
            client.setEnter_time(clientDetails.getEnter_time());
            return clientRepository.save(client);
        }).orElseThrow(() -> new RuntimeException("Client not found with id " + id));
    }

    public void deleteClient(Integer id) {
        clientRepository.deleteById(id);
    }
}





































































































