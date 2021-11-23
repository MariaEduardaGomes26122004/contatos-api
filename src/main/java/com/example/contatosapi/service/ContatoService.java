package com.example.contatosapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.contatosapi.domain.Contato;
import com.example.contatosapi.repositories.ContatoRepository;

@Service
public class ContatoService {

	@Autowired
	private ContatoRepository contatoRepository;

	public List<Contato> findaAll() {
		return contatoRepository.findAll();
	}

	public Contato findaById(Long id) {
		Optional<Contato> contato = contatoRepository.findById(id);
		return contato.get();
	}

	public Contato save(Contato contato) {
		return contatoRepository.save(contato);
	}

	public void delete(Long id) {
		contatoRepository.deleteById(id);
	}

}