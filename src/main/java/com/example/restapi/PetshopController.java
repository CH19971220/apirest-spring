package com.example.restapi;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.restapi.dto.PetshopDto;
import com.example.restapi.entity.Petshop;
import com.example.restapi.service.PetshopService;

@RestController
@RequestMapping(value = "/petshop")
public class PetshopController {

	@Autowired
	private PetshopService petshopService;
	@Autowired
    private ModelMapper modelMapper;
	
	@GetMapping
	public List<PetshopDto> obterPetshops() {
		return petshopService.listaPetshops().stream().map(p -> modelMapper.map(p, PetshopDto.class)).collect(Collectors.toList());
	}
	
	@PostMapping
	public Petshop salvar(@RequestBody Petshop petshop) {
		return petshopService.salvarPetshop(petshop);
	}
}
