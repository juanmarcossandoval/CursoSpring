package com.example.CursoSpring.Entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ejemplo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExampleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_ejemplo;
	
	@Column(name = "comentario", nullable = false, unique = false, length = 50)
	private String coment;
	
	@Column(name = "fecha", nullable = false, unique = false)
	private LocalDate date;
	
	@Transient /* con esta notacion le decimos a la entidad 
	que esto no va a formar parte de la base de datos */
	public static final String msg = "Hola mundo";
	
}
