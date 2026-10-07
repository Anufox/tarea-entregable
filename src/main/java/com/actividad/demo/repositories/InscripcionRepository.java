package com.actividad.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.actividad.demo.models.Inscripcion;

public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {
}