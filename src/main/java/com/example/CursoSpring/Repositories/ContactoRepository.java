package com.example.CursoSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CursoSpring.Entities.Contacto;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto,Long>{
}
