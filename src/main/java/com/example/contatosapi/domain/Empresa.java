package com.example.contatosapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.contatosapi.enums.EmpresaTipo;

@Entity
public class Empresa {
	
	@Id
	@Column(name="empresa_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="tipo", nullable = false)
	@Enumerated(EnumType.ORDINAL)
	private EmpresaTipo tipo;
	
	@Column(name="nome", nullable = false)
	private String nome;
	
	@Column(name="telefone", nullable = false)
	private String telefone;
	
	@Column(name="endereco")
	private String endereco;
	
	@Column(name="enderecoLogradouro")
	private String enderecoLogradouro;
	
	@Column(name="enderecoNumero")
	private String enderecoNumero;
	
	@Column(name="enderecoBairro")
	private String enderecoBairro;
	
	@Column(name="enderecoCidade")
	private String enderecoCidade;
	
	@Column(name="enderecoUf")
	private String enderecoUf;
	
	@Column(name="enderecoCep")
	private String enderecoCep;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo.getValue();
	}

	public void setTipo(EmpresaTipo tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEnderecoLogradouro() {
		return enderecoLogradouro;
	}

	public void setEnderecoLogradouro(String enderecoLogradouro) {
		this.enderecoLogradouro = enderecoLogradouro;
	}

	public String getEnderecoNumero() {
		return enderecoNumero;
	}

	public void setEnderecoNumero(String enderecoNumero) {
		this.enderecoNumero = enderecoNumero;
	}

	public String getEnderecoBairro() {
		return enderecoBairro;
	}

	public void setEnderecoBairro(String enderecoBairro) {
		this.enderecoBairro = enderecoBairro;
	}

	public String getEnderecoCidade() {
		return enderecoCidade;
	}

	public void setEnderecoCidade(String enderecoCidade) {
		this.enderecoCidade = enderecoCidade;
	}

	public String getEnderecoUf() {
		return enderecoUf;
	}

	public void setEnderecoUf(String enderecoUf) {
		this.enderecoUf = enderecoUf;
	}

	public String getEnderecoCep() {
		return enderecoCep;
	}

	public void setEnderecoCep(String enderecoCep) {
		this.enderecoCep = enderecoCep;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name="createdAt", nullable = false)
	private Date createdAt;
	

}