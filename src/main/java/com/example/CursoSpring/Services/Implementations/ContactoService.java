package com.example.CursoSpring.Services.Implementations;

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
}
