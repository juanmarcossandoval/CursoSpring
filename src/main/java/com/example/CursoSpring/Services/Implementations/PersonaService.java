package com.example.CursoSpring.Services.Implementations;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.CursoSpring.Entities.Persona;
import com.example.CursoSpring.Repositories.PersonaRepository;

@Service
public class PersonaService {

	private PersonaRepository personaRepository;
	
	public PersonaService(PersonaRepository personaRepository) {
		this.personaRepository = personaRepository;
	}
	
	public Persona buscarId(Long id) {
		Optional<Persona> encontrado = personaRepository.findById(id);
		return encontrado.orElse(null);
	}
}


