package com.actividad.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.actividad.demo.models.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}