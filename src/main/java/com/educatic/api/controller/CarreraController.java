package com.educatic.api.controller;

import com.educatic.api.entity.Carrera;
import com.educatic.api.service.CarreraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("carrera")
public class CarreraController {
    @Autowired
    private CarreraService carreraService;

    @GetMapping("/all")
    public List<Carrera> getCarreras() {
        return carreraService.getAll();
    }

    @GetMapping("/getById/{idCarrera}")
    public Optional<Carrera> getCarreraBydId(@PathVariable String idCarrera) {
        return carreraService.getCarrera(idCarrera);
    }

}
