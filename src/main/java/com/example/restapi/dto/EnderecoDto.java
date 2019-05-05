package com.example.restapi.dto;

import java.io.Serializable;

import javax.persistence.Column;

public class EnderecoDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String Rua;
	private String Numero;
	
	public EnderecoDto() {
		
	}

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		Rua = rua;
	}

	public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	}
}
