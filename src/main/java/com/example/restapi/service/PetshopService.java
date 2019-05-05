package com.example.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapi.entity.Petshop;
import com.example.restapi.repository.PetshopRepository;

@Service
public class PetshopService {
	
	@Autowired
	private PetshopRepository petshopRepository;
	
	public Petshop salvarPetshop(Petshop petshop) {
		return petshopRepository.save(petshop);
	}
	
	public List<Petshop> listaPetshops() {
		return petshopRepository.findAll();
	}
}
