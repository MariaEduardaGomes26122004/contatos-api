package com.example.contatosapi.model;

import java.util.Date;

public class AddEditEmpresaDto {
	private String tipo;
	private String nome;
	private String telefone;
	private String endereco;
	private String enderecoLogradouro;
	private String enderecoNumero;
	private String enderecoBairro;
	private String enderecoCidade;
	private String enderecoUf;
	private String enderecoCep;
	private Date createdAt;
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
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
	
	
}
