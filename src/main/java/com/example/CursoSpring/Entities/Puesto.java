package com.example.CursoSpring.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "puestos")
public class Puesto {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id_cargo;
	
	@Column
	private String cargo;
	
}
