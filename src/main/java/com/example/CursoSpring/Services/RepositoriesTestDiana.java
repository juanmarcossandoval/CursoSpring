package com.example.CursoSpring.Services;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.example.CursoSpring.Entities.Contacto;
import com.example.CursoSpring.Repositories.ContactoRepository;
@Service
public class RepositoriesTestDiana {

	// TODO DECLARAR EL REPOSITORIO COMO ATRIBUTO DE CLASE
	
	private ContactoRepository repository;
	
	// TODO INYECTAR POR CONTRUCTOR EL REPOSITORIO
	
	public RepositoriesTestDiana(ContactoRepository contactoRepository) {
		this.repository = contactoRepository;
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void TesteandoRepo() {
		Contacto c = new Contacto ();
		c.setCiudad("Rosario");
		c.setDireccion("calle 2 y 50");
		c.setEmail("dianerrecalde@gmail.com");
		c.setProvincia("Santa Fe");
		//repository.save(c);
	}
}
