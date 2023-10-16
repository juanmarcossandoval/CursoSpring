package com.example.CursoSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CursoSpring.Entities.Persona;

@Repository
public interface PersonaRepository extends JpaRepository <Persona,Long>{

}
