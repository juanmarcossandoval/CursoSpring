package com.example.CursoSpring.Services.Implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.CursoSpring.Entities.ExampleEntity;
import com.example.CursoSpring.Repositories.ExampleRepository;

@Service
public class ExampleService {
	
	private ExampleRepository exampleRepository;
	
	public ExampleService(ExampleRepository exampleRepository) {
		this.exampleRepository = exampleRepository;
	}
	
	public ExampleEntity guardar(ExampleEntity example) {
		return exampleRepository.save(example);
	}
	
	public ExampleEntity buscarPorId(Long id){
		Optional<ExampleEntity> encontrado = exampleRepository.findById(id);
		return encontrado.orElse(null);
	}
	
	public void eliminar(Long id) {
		exampleRepository.deleteById(id);
	}
	
	public List<ExampleEntity> listarTodos(){
		return exampleRepository.findAll();
	}
	
}
