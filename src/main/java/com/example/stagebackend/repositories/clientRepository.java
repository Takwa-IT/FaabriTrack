package com.example.stagebackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.stagebackend.models.client;
import org.springframework.stereotype.Repository;

@Repository
public interface clientRepository extends JpaRepository<client, Integer> {
}
