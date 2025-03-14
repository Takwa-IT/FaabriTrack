package com.example.stagebackend.services;

import com.example.stagebackend.models.client;
import com.example.stagebackend.models.employee;
import com.example.stagebackend.repositories.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;
@Service
public class EmpService {

    @Autowired
    private employeeRepository employeeRepository;

    public List<employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<employee> getEmployeeById(Integer id) {
        return employeeRepository.findById(id);
    }
    @Transactional

    public employee createEmployee(employee employee) {
        return employeeRepository.save(employee);
    }

    public employee updateEmployee(Integer id, employee employeeDetails) {
        return employeeRepository.findById(id).map(employee -> {
            employee.setName(employeeDetails.getName()); // Update client_name
            employee.setPhone_number(employeeDetails.getPhone_number());
            employee.setCity(employeeDetails.getCity());
            employee.setEmail(employeeDetails.getEmail());
            return employeeRepository.save(employee);
        }).orElseThrow(() -> new RuntimeException("Employee not found with id " + id));
    }

    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }

}
