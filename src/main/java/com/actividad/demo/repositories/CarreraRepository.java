package com.actividad.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.actividad.demo.models.Carrera;

public interface CarreraRepository extends JpaRepository<Carrera, Long> {
}

