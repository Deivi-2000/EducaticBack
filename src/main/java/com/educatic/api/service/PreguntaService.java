package com.educatic.api.service;

import com.educatic.api.entity.Pregunta;
import com.educatic.api.repository.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PreguntaService {
    @Autowired
    private PreguntaRepository PreguntaRepository;

    public List<Pregunta> getAll() {
        return (List<Pregunta>) PreguntaRepository.findAll();
    }

    public Optional<Pregunta> getPregunta(int idPregunta) {
        return PreguntaRepository.findById(idPregunta);
    }

}
