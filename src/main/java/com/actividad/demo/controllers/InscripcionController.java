package com.actividad.demo.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.actividad.demo.models.Inscripcion;
import com.actividad.demo.repositories.InscripcionRepository;


@RestController 
@RequestMapping("/api/v1/inscripciones")
public class InscripcionController {

    @Autowired
    private InscripcionRepository repo;
public InscripcionController(InscripcionRepository repo){
        this.repo = repo;
    }


    @GetMapping 
    public List<Inscripcion> getInscripciones() {
        return repo.findAll();
    }

    @PostMapping 
    public Inscripcion createInscripcion(@RequestBody Inscripcion inscripcion) {
        return repo.save(inscripcion);
    }
}