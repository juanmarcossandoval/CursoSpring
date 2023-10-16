package com.example.CursoSpring.Entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "personas")
@Data // trae getter setter y demas
@AllArgsConstructor
@NoArgsConstructor
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_persona;
	
	@Column(name = "nombre", nullable = false, unique = false, length = 50)
	private String name;
	
	@Column(name = "apellido", nullable = false, unique = false, length = 50)
	private String ape;
	
	@Column(name = "nacimiento", nullable = false, unique = false)
	private LocalDate naci;
	
	@Column(name = "documento", nullable = false, unique = true, length = 10)
	private String dni;
}
