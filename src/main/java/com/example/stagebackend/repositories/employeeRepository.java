package com.example.stagebackend.repositories;

import com.example.stagebackend.models.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepository extends JpaRepository<employee, Integer> {
}
