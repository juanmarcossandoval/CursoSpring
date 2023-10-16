package com.example.CursoSpring.Services;

import java.time.LocalDate;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.example.CursoSpring.Entities.ExampleEntity;
import com.example.CursoSpring.Repositories.ExampleRepository;

@Service
public class RepositoryTestExample {
	
	//declaramos el/los repositorio que utilizara el servicio
	private ExampleRepository repository;
	
	//inyectamos los repositorios por constructor 
	public RepositoryTestExample(ExampleRepository exampleRepositroy) {
		this.repository = exampleRepositroy;
	}
	
	@EventListener(ApplicationReadyEvent.class)
	//esta notacion hace que el void se ejecute una vez que la aplicacion levante
	public void TesteandoRepo() {
		System.out.println(ExampleEntity.msg);
		ExampleEntity ee = new ExampleEntity();
		//ee.setComent("mi primer post");
		//ee.setDate(LocalDate.now());
		//repository.save(ee);
	}
}
