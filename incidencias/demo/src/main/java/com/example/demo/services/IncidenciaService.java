package com.example.demo.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Incidencia;
import com.example.demo.repositories.IncidenciaRepository;

@Service
@Transactional
public class IncidenciaService {
	
	@Autowired
	IncidenciaRepository incidenciaRepository;
	
	public Incidencia getById(int idIncidencia) {
		return incidenciaRepository.findByIdIncidencia(idIncidencia);
	}
	
	public void insert(Incidencia incidencia) {
		incidenciaRepository.save(incidencia);
	}

}
