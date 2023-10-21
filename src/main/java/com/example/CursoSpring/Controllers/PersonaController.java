package com.example.CursoSpring.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.CursoSpring.Entities.Persona;
import com.example.CursoSpring.Services.Implementations.PersonaService;

@Controller
@RequestMapping("/personas")
public class PersonaController {

	private PersonaService personaService;

	public PersonaController(PersonaService personaService) {
		this.personaService = personaService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?>byId(@PathVariable Long id){
		Persona buscado = personaService.buscarId(id);
		if (buscado == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(buscado,HttpStatus.OK);
	}
}
