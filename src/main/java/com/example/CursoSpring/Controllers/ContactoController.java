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

import com.example.CursoSpring.Entities.Contacto;
import com.example.CursoSpring.Services.Implementations.ContactoService;

@Controller
@RequestMapping("/contactos")
public class ContactoController {
	
	private ContactoService contactoService;
	
	public ContactoController (ContactoService contactoService ) {
		this.contactoService = contactoService;		
	}
	
	@PostMapping
	public ResponseEntity <?> postOne(@RequestBody Contacto contacto){
		Contacto nuevo = contactoService.guardar(contacto);
		return new ResponseEntity<>(nuevo,HttpStatus.CREATED);
	}
	
	@GetMapping 
	public ResponseEntity <?> getAll() {
		List<Contacto> lista = contactoService.listarTodos();
		return new ResponseEntity<>(lista,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> finOne(@PathVariable Long id){
		Contacto encontrado = contactoService.buscarPorId(id);
		if (encontrado == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(encontrado,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteOne(@PathVariable Long id){
		contactoService.eliminar(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<?> putOne(@RequestBody Contacto contacto ){
		Contacto actualizado = contactoService.guardar(contacto);
		return new ResponseEntity<>(actualizado,HttpStatus.OK);
	}
}

