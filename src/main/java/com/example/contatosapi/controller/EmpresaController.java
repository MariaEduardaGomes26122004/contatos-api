package com.example.contatosapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.contatosapi.domain.Empresa;
import com.example.contatosapi.model.AddEditEmpresaDto;
import com.example.contatosapi.service.EmpresaService;

@RestController
@RequestMapping(value = "/empresa")
public class EmpresaController {
	
	@Autowired
	private EmpresaService empresaService;
	
	@GetMapping
	public ResponseEntity<List<Empresa>> findAll() {
		
		List<Empresa> empresas = empresaService.findaAll();
		return ResponseEntity.ok().body(empresas);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Empresa> findById(@PathVariable Long id) {
		Empresa empresa = empresaService.findaById(id);
		return ResponseEntity.ok().body(empresa);
	}
	
	@PostMapping
	public ResponseEntity<Empresa> insert(@RequestBody AddEditEmpresaDto model) {
		Empresa empresa = new Empresa();
		
		empresa.setTipo(model.getTipo());
		empresa.setNome(model.getNome());
		empresa.setTelefone(model.getTelefone());
		empresa.setEndereco(model.getEndereco());
		empresa.setEnderecoLogradouro(model.getEnderecoLogradouro());
		empresa.setEnderecoNumero(model.getEnderecoNumero());
		empresa.setEnderecoBairro(model.getEnderecoBairro());
		empresa.setEnderecoCidade(model.getEnderecoCidade());
		empresa.setEnderecoUf(model.getEnderecoUf());
		empresa.setCreatedAt(model.getCreatedAt());
		
		empresa = empresaService.save(empresa);
		
		return ResponseEntity.ok().body(empresa);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Empresa> update(@PathVariable Long id, @RequestBody AddEditEmpresaDto model) {
		
		Empresa empresa = empresaService.findaById(id);
		
		empresa.setTipo(model.getTipo());
		empresa.setNome(model.getNome());
		empresa.setTelefone(model.getTelefone());
		empresa.setEndereco(model.getEndereco());
		empresa.setEnderecoLogradouro(model.getEnderecoLogradouro());
		empresa.setEnderecoNumero(model.getEnderecoNumero());
		empresa.setEnderecoBairro(model.getEnderecoBairro());
		empresa.setEnderecoCidade(model.getEnderecoCidade());
		empresa.setEnderecoUf(model.getEnderecoUf());
		empresa.setCreatedAt(model.getCreatedAt());
		
		empresa = empresaService.save(empresa);
		
		return ResponseEntity.ok().body(empresa);
	}
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete (@PathVariable Long id){
		empresaService.delete(id);
		return ResponseEntity.noContent().build();
	}

}


