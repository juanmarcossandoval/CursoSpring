package com.example.CursoSpring.Entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "cursos")
public class Curso {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id_curso;
	@Column
	private String nombre;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_curso")
	private Set<Materia>materias;
	
}
