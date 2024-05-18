package com.educatic.api.controller;

import com.educatic.api.entity.Pregunta;
import com.educatic.api.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("pregunta")
public class PreguntaController {
    @Autowired
    private PreguntaService preguntaService;

    @GetMapping("/all")
    public List<Pregunta> getPreguntaes() {
        return preguntaService.getAll();
    }

    @GetMapping("/getById/{idPregunta}")
    public Optional<Pregunta> getPreguntaById(@PathVariable Integer idPregunta) {
        return preguntaService.getPregunta(idPregunta);
    }

}
