package com.example.CursoSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CursoSpring.Entities.Materia;

@Repository
public interface MateriaRepository extends JpaRepository <Materia, Long>{

}
