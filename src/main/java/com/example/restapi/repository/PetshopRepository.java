package com.example.restapi.repository;

import org.springframework.stereotype.Repository;

import com.example.restapi.entity.Petshop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

@Repository
public interface PetshopRepository extends JpaRepository<Petshop, Long> {

}
