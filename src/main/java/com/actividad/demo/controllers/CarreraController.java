package com.actividad.demo.controllers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.actividad.demo.models.Carrera;
import com.actividad.demo.repositories.CarreraRepository;

@RestController
@RequestMapping("/api/v1/carreras")
public class CarreraController {

    @Autowired
    private CarreraRepository repo;
public CarreraController(CarreraRepository repo){
        this.repo = repo;
    }


    @GetMapping
    public List<Carrera> getCarreras() {
        return repo.findAll();
    }

    @PostMapping 
    public Carrera createCarrera(@RequestBody Carrera carrera) {
        return repo.save(carrera);
    }
}