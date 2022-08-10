package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Incidencia;
import com.example.demo.services.IncidenciaService;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@Autowired 
	IncidenciaService incidenciaService;
	
	@GetMapping("/incidencia/{idIncidencia}")
	public ResponseEntity<Incidencia> getIncidenciaById(@PathVariable("idIncidencia") int idIncidencia){
		return new ResponseEntity(incidenciaService.getById(idIncidencia), HttpStatus.OK);
	}
	
	@PostMapping("/incidencia/crear")
	public @ResponseBody void saveIncidencia(@RequestBody Incidencia incidencia){
		incidenciaService.insert(incidencia);
	}

}
