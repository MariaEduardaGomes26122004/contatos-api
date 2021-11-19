package com.example.contatosapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.contatosapi.domain.Empresa;
import com.example.contatosapi.repositories.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	public List<Empresa> findaAll() {
		return empresaRepository.findAll();
	}
	
	public Empresa findaById(Long id) {
		Optional<Empresa> empresa = empresaRepository.findById(id);
		return empresa.get();
	}
	
	public Empresa save(Empresa empresa) {
		return empresaRepository.save(empresa);
	}
	
	public void delete(Long id) {
		empresaRepository.deleteById(id);
	}
	
}
