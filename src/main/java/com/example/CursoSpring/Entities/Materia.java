package com.example.CursoSpring.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="materias")
public class Materia {
	
	@Id
	private Long id_materia;
	
	@Column
	private String nombre;
}
