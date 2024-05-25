package com.educatic.api.service;

import com.educatic.api.entity.*;
import com.educatic.api.repository.CalificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CalificacionService {
    @Autowired
    private CalificacionRepository calificacionRepository;

    public List<Calificacion> getAll() {
        return (List<Calificacion>) calificacionRepository.findAll();
    }

    public Optional<Calificacion> getCalificacion(CalificacionPK idCalificacion) {
        return calificacionRepository.findById(idCalificacion);
    }

    public Optional<Calificacion> getCalificacionByIdUsuarioAndByIdEvaluacion(String idUsuario, int idEvaluacion) {
        return  calificacionRepository.findCalificacionByUsuarioIdUsuarioAndEvaluacionIdEvaluacion(idUsuario, idEvaluacion);
    }

    public void saveOrUpdate(Calificacion calificacion){
        calificacionRepository.save(calificacion);
    }

}
