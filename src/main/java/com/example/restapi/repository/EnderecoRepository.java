package com.example.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restapi.entity.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
