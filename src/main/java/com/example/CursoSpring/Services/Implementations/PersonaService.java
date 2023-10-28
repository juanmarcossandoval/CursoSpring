package com.example.CursoSpring.Services.Implementations;

import java.util.List;
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
	public Persona guardarPersona(Persona nuevaPersona) {
		return personaRepository.save(nuevaPersona);
	}
	
	public void eliminar(Long id) {
		personaRepository.deleteById(id);
	}
	
	public List <Persona> listarTodos(){
		return personaRepository.findAll();
	}
	
}


