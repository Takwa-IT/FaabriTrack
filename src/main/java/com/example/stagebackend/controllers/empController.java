package com.example.stagebackend.controllers;
import com.example.stagebackend.services.EmpService;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.stagebackend.models.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "http://localhost:4200")

public class empController {
    @Autowired
    private EmpService empService;

    @GetMapping
    public List<employee> getAllEmployees() {
        return empService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Optional<employee> getEmployeeById(@PathVariable Integer id) {
        return empService.getEmployeeById(id);
    }

    @PostMapping
    public employee createEmployee(@RequestBody employee employee) {
        return empService.createEmployee(employee);
    }

    @PutMapping("/{id}")
    public employee updateEmployee(@PathVariable Integer id, @RequestBody employee employeeDetails) {
        return empService.updateEmployee(id, employeeDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        empService.deleteEmployee(id);
    }
}
