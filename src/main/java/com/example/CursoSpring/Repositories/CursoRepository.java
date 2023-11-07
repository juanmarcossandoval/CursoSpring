package com.example.CursoSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CursoSpring.Entities.Curso;

@Repository
public interface CursoRepository extends JpaRepository <Curso,Long>{ 

}
