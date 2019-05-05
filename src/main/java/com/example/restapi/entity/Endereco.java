package com.example.restapi.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Endereco implements Serializable {
	
	private static final long SerialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	@Column(length=30, nullable=true)
	private String Rua;
	@Column(length=6, nullable=true)
	private String Numero;
	@OneToMany(mappedBy="endereco",  fetch=FetchType.LAZY)
	private List<Petshop> petshops;
	
	public Endereco() {
		
	}
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
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
	public List<Petshop> getPetshops() {
		return petshops;
	}
	public void setPetshops(List<Petshop> petshops) {
		this.petshops = petshops;
	} 
}
