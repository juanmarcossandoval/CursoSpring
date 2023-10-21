package com.example.CursoSpring.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
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
}
