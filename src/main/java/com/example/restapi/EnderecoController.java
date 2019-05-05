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

import com.example.restapi.dto.EnderecoDto;
import com.example.restapi.entity.Endereco;
import com.example.restapi.service.EnderecoService;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping
	public List<EnderecoDto> obterEnderecos() {
		return enderecoService.listaEnderecos().stream().map(p -> modelMapper.map(p, EnderecoDto.class)).collect(Collectors.toList());
	}
	
	@PostMapping
	public Endereco salvar(@RequestBody Endereco endereco) {
		return enderecoService.salvarEndereco(endereco);
	}
}
