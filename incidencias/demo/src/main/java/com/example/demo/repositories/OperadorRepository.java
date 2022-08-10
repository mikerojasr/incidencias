package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Operador;

public interface OperadorRepository extends JpaRepository<Operador, Integer> {
	Operador findByIdOperador(int idOperador);

}
