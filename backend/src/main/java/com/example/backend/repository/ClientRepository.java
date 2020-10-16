package com.example.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.backend.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
}
