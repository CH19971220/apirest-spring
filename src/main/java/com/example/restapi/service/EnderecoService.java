package com.example.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapi.entity.Endereco;
import com.example.restapi.repository.EnderecoRepository;


@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public Endereco salvarEndereco(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	public List<Endereco> listaEnderecos() {
		return enderecoRepository.findAll();
	}
}
