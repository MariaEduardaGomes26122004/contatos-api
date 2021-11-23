package com.example.contatosapi.controller;

import java.util.Date;
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

import com.example.contatosapi.domain.Contato;
import com.example.contatosapi.model.AddEditContatoDto;
import com.example.contatosapi.service.EmpresaService;
import com.example.contatosapi.service.ContatoService;

@RestController
@RequestMapping(value = "/contato")
public class ContatoController {

	@Autowired
	private ContatoService contatoService;

	@Autowired
	private EmpresaService empresaService;

	@GetMapping
	public ResponseEntity<List<Contato>> findAll() {

		List<Contato> empresas = contatoService.findaAll();
		return ResponseEntity.ok().body(empresas);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Contato> findById(@PathVariable Long id) {

		Contato contato = contatoService.findaById(id);
		return ResponseEntity.ok().body(contato);
	}

	@PostMapping
	public ResponseEntity<Contato> insert(@RequestBody AddEditContatoDto model) {

		Contato contato = new Contato();

		contato.setNomeCompleto(model.getNomeCompleto());
		contato.setEmail(model.getEmail());
		contato.setTelefone(model.getTelefone());
		contato.setEmpresa(empresaService.findaById(model.getEmpresa()));
		contato.setCreatedAt(new Date());

		contato = contatoService.save(contato);

		return ResponseEntity.ok().body(contato);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Contato> update(@PathVariable Long id, @RequestBody AddEditContatoDto model) {

		Contato contato = contatoService.findaById(id);

		contato.setNomeCompleto(model.getNomeCompleto());
		contato.setEmail(model.getEmail());
		contato.setTelefone(model.getTelefone());
		contato.setEmpresa(empresaService.findaById(model.getEmpresa()));
		contato.setCreatedAt(new Date());

		contato = contatoService.save(contato);

		return ResponseEntity.ok().body(contato);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		contatoService.delete(id);
		return ResponseEntity.noContent().build();
	}

}