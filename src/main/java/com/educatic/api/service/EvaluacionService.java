package com.educatic.api.service;

import com.educatic.api.entity.Evaluacion;
import com.educatic.api.repository.EvaluacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EvaluacionService {
    @Autowired
    private EvaluacionRepository EvaluacionRepository;

    public List<Evaluacion> getAll() {
        return (List<Evaluacion>) EvaluacionRepository.findAll();
    }

    public Optional<Evaluacion> getEvaluacion(int idEvaluacion) {
        return EvaluacionRepository.findById(idEvaluacion);
    }

}
