package com.educatic.api.controller;

import com.educatic.api.entity.Evaluacion;
import com.educatic.api.entity.Modulo;
import com.educatic.api.service.ModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("modulo")
public class ModuloController {
    @Autowired
    private ModuloService moduloService;

    @GetMapping("/all")
    public List<Modulo> getModulos() {
        return moduloService.getAll();
    }

    @GetMapping("/getById/{idModulo}")
    public Optional<Modulo> getModuloById(@PathVariable String idModulo) {
        return moduloService.getModulo(idModulo);
    }

    @GetMapping("/{idModulo}/evaluaciones")
    public List<Evaluacion> getEvaluacionesByModulo(@PathVariable String idModulo) {
        return moduloService.getEvaluacionesByModulo(idModulo);
    }
}
