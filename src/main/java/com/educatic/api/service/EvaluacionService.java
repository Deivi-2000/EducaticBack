package com.educatic.api.service;

import com.educatic.api.entity.Evaluacion;
import com.educatic.api.entity.Pregunta;
import com.educatic.api.repository.EvaluacionRepository;
import com.educatic.api.repository.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvaluacionService {
    @Autowired
    private EvaluacionRepository EvaluacionRepository;
    @Autowired
    private PreguntaRepository preguntaRepository;

    public List<Evaluacion> getAll() {
        return (List<Evaluacion>) EvaluacionRepository.findAll();
    }

    public Optional<Evaluacion> getEvaluacion(int idEvaluacion) {
        return EvaluacionRepository.findById(idEvaluacion);
    }

    public List<Pregunta> getPreguntasbyEvaluacion(int idEvaluacion) {
        return preguntaRepository.findByEvaluacionIdEvaluacion(idEvaluacion);
    }

}
