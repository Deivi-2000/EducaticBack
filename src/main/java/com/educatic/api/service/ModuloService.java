package com.educatic.api.service;

import com.educatic.api.entity.Evaluacion;
import com.educatic.api.entity.Modulo;
import com.educatic.api.repository.EvaluacionRepository;
import com.educatic.api.repository.ModuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModuloService {
    @Autowired
    private ModuloRepository ModuloRepository;

    @Autowired
    private EvaluacionRepository evaluacionRepository;

    public List<Modulo> getAll() {
        return (List<Modulo>) ModuloRepository.findAll();
    }

    public Optional<Modulo> getModulo(String idModulo) {
        return ModuloRepository.findById(idModulo);
    }

    public List<Evaluacion> getEvaluacionesByModulo(String idModulo) {
        return evaluacionRepository.findByModuloIdModulo(idModulo);
    }

}
