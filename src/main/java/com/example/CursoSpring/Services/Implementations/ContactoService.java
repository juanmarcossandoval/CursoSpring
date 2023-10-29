package com.example.CursoSpring.Services.Implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.CursoSpring.Entities.Contacto;
import com.example.CursoSpring.Repositories.ContactoRepository;

@Service
public class ContactoService {
	
	private ContactoRepository contactoRepository;
		
	public ContactoService(ContactoRepository contactoRepository){
		this.contactoRepository = contactoRepository;
	}
	
	public Contacto guardar (Contacto contacto) {
		return contactoRepository.save(contacto);		
	}
	
	public List<Contacto>listarTodos(){
		return contactoRepository.findAll();
	}
	
	public Contacto buscarPorId (Long id) {
		Optional<Contacto>encontrado = contactoRepository.findById(id);
		return encontrado.orElse(null);
	}
	
	public void eliminar(Long id) {
		contactoRepository.deleteById(id);
	}
}
