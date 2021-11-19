package com.example.contatosapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.contatosapi.domain.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
