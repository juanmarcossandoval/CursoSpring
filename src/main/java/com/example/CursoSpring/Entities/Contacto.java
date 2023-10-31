package com.example.CursoSpring.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Contactos")
@Data 
@AllArgsConstructor
@NoArgsConstructor
public class Contacto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_contacto;
	
	@Column (name = "Provincia" , nullable = false, unique = false, length = 50)
	private String provincia;
	
	@Column (name = "Direccion", nullable = false, unique = false, length = 50)
	private String direccion;
	
	@Column (name = "Ciudad", nullable = false, unique = false, length = 50)
	private String ciudad;
	
	@Column (name = "Email", nullable = false, unique = true, length = 256)
	private String email;
	
	@OneToOne(mappedBy="contacto")
	@JsonIgnore
	Persona persona;
}
