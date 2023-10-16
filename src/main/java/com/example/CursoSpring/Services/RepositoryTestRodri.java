package com.example.CursoSpring.Services;

import java.time.LocalDate;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.example.CursoSpring.Entities.Persona;
import com.example.CursoSpring.Repositories.PersonaRepository;

@Service
public class RepositoryTestRodri {
	
	private PersonaRepository repo;
	
	public RepositoryTestRodri(PersonaRepository personaRepository) {
		this.repo = personaRepository;
		
	}
	//TODO DECLARAR EL REPOSITORIO COMO ATRIBUTO DE CLASE
	//TODO INYECTAR POR CONTRUCTOR EL REPOSITORIO
	@EventListener(ApplicationReadyEvent.class)
	public void TesteandoRepo() {
		Persona p = new Persona();
		p.setName("carlos");
		p.setApe("marquez");
		p.setDni("33.333.333");
		p.setNaci(LocalDate.now());// llamo a calse localdate
		//que tiene metodo statico now que devuelve fecha de hoy
		//repo.save(p);
	}
}

