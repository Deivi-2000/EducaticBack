package com.educatic.api.controller;

import com.educatic.api.entity.Calificacion;
import com.educatic.api.entity.Materia;
import com.educatic.api.entity.Matricula;
import com.educatic.api.service.CalificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("calificacion")
public class CalificacionController {
    @Autowired
    private CalificacionService calificacionService;

    @GetMapping("/all")
    public List<Calificacion> getCalificaciones() {
        return calificacionService.getAll();
    }

    @GetMapping("/getCalificacionByUsuarioAndEvaluacion/{idUsuario}/{idEvaluacion}")
    public Optional<Calificacion> getCalificacionByUsuarioAndEvaluacion(@PathVariable String idUsuario, @PathVariable int idEvaluacion) {
        return calificacionService.getCalificacionByIdUsuarioAndByIdEvaluacion(idUsuario, idEvaluacion);
    }

    @PostMapping("/set")
    public void saveCalificacion(@RequestBody Calificacion calificacion) {
        calificacionService.saveOrUpdate(calificacion);
    }

}
