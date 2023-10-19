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

import com.example.CursoSpring.Entities.ExampleEntity;
import com.example.CursoSpring.Services.Implementations.ExampleService;

@Controller
@RequestMapping("/examples")
public class ExampleController {
	
	private ExampleService exampleService;
	
	public ExampleController(ExampleService exampleService) {
		this.exampleService = exampleService;
	}
	
	@GetMapping
	public ResponseEntity<?> getAll(){
		List<ExampleEntity> lista = exampleService.listarTodos();
		return new ResponseEntity<>(lista,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> postOne(@RequestBody ExampleEntity ejemplo){
		ExampleEntity nuevo = exampleService.guardar(ejemplo);
		return new ResponseEntity<>(nuevo,HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<?> putOne(@RequestBody ExampleEntity ejemplo){
		ExampleEntity actualizado = exampleService.guardar(ejemplo);
		return new ResponseEntity<>(actualizado,HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteOne(@PathVariable Long id){
		exampleService.eliminar(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findOne(@PathVariable Long id) {
		ExampleEntity encontrado = exampleService.buscarPorId(id);
		if (encontrado == null) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(encontrado,HttpStatus.OK);
	}
}
