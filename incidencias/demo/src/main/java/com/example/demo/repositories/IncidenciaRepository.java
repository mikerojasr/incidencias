package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Incidencia;

public interface IncidenciaRepository extends JpaRepository<Incidencia, Integer> {
	Incidencia findByIdIncidencia(int idIncidencia);

}
