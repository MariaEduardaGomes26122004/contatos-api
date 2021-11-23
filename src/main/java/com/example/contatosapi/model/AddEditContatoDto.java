package com.example.contatosapi.model;

import java.util.Date;

public class AddEditContatoDto {

	private String nomeCompleto;
	private String email;
	private String telefone;
	private Long empresa;
	private Date createdAt;
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Long getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Long empresa) {
		this.empresa = empresa;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}