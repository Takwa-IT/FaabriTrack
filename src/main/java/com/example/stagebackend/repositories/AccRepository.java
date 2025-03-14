package com.example.stagebackend.repositories;

import com.example.stagebackend.models.Acc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccRepository extends JpaRepository<Acc, Integer> {
}
