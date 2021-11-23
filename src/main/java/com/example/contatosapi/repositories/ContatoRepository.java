package com.example.contatosapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.contatosapi.domain.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}