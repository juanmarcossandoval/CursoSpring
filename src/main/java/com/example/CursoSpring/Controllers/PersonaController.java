package com.example.CursoSpring.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping
	public ResponseEntity<?>cratePerson(@RequestBody Persona persona){
		Persona pNueva = personaService.guardarPersona(persona);
		if (pNueva == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		 return new ResponseEntity<>(pNueva,HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<?> putOne(@RequestBody Persona persona){
		Persona actualizado = personaService.guardarPersona(persona);
		return new ResponseEntity<>(actualizado,HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteOne(@PathVariable Long id){
		personaService.eliminar(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		List<Persona> lista = personaService.listarTodos();
		return new ResponseEntity<>(lista,HttpStatus.OK);
	}
}
