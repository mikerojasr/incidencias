package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Equipo;

public interface EquipoRepository extends JpaRepository<Equipo, Integer> {
	Equipo findByIdEquipo(int idEquipo);

}
