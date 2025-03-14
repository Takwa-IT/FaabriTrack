package com.example.stagebackend.services;

import com.example.stagebackend.models.Acc;
import com.example.stagebackend.repositories.AccRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccService {
    @Autowired
    private AccRepository accRepository;

    public List<Acc> getAllAccountants() {
        return accRepository.findAll();
    }

    public Optional<Acc> getAccountantById(Integer id) {
        return accRepository.findById(id);
    }

    public Acc createAccountant(Acc acc) {
        return accRepository.save(acc);
    }

    public Acc updateAccountant(Integer id, Acc accDetails) {
        return accRepository.findById(id).map(acc -> {
            acc.setName(accDetails.getName());
            acc.setEmail(accDetails.getEmail());
            acc.setPhone(accDetails.getPhone());
            acc.setCity(accDetails.getCity());
            return accRepository.save(acc);
        }).orElse(null);
    }

    public void deleteAccountant(Integer id) {
        accRepository.deleteById(id);
    }
}
