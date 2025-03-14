package com.example.stagebackend.controllers;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.stagebackend.models.Acc;
import com.example.stagebackend.services.AccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/accountants")
@CrossOrigin(origins = "http://localhost:4200")
public class AccController {
    @Autowired
    private AccService accService;

    @GetMapping
    public List<Acc> getAllAccountants() {
        return accService.getAllAccountants();
    }

    @GetMapping("/{id}")
    public Optional<Acc> getAccountantById(@PathVariable Integer id) {
        return accService.getAccountantById(id);
    }

    @PostMapping
    public Acc createAccountant(@RequestBody Acc acc) {
        return accService.createAccountant(acc);
    }

    @PutMapping("/{id}")
    public Acc updateAccountant(@PathVariable Integer id, @RequestBody Acc accDetails) {
        return accService.updateAccountant(id, accDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteAccountant(@PathVariable Integer id) {
        accService.deleteAccountant(id);
    }
}
