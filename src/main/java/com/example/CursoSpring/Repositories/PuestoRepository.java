package com.example.CursoSpring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CursoSpring.Entities.Puesto;

@Repository
public interface PuestoRepository extends JpaRepository<Puesto,Long> {

}
