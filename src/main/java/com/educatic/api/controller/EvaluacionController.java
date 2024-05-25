package com.educatic.api.controller;

import com.educatic.api.entity.Evaluacion;
import com.educatic.api.entity.Pregunta;
import com.educatic.api.service.EvaluacionService;
import com.educatic.api.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("evaluacion")
public class EvaluacionController {
    @Autowired
    private EvaluacionService evaluacionService;
    @Autowired
    private PreguntaService preguntaService;

    @GetMapping("/all")
    public List<Evaluacion> getEvaluaciones() {
        return evaluacionService.getAll();
    }

    @GetMapping("/getById/{idEvaluacion}")
    public Optional<Evaluacion> getEvaluacionById(@PathVariable Integer idEvaluacion) {
        return evaluacionService.getEvaluacion(idEvaluacion);
    }

    @GetMapping("/{idEvaluacion}/preguntas")
    public List<Pregunta> getPreguntasByEvaluacion(@PathVariable int idEvaluacion) {
        return evaluacionService.getPreguntasbyEvaluacion(idEvaluacion);
    }

}
