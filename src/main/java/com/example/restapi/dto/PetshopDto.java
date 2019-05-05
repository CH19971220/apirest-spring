package com.example.restapi.dto;

import java.io.Serializable;

public class PetshopDto implements Serializable {
	
	private static final long SerialVersionUID = 1L;
	
	private String Nome;
	private EnderecoDto endereco;

	public PetshopDto() {
		
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	public EnderecoDto getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDto endereco) {
		this.endereco = endereco;
	}
}
