package com.educatic.api.repository;

import com.educatic.api.entity.Pregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PreguntaRepository extends JpaRepository<Pregunta, Integer> {
    List<Pregunta> findByEvaluacionIdEvaluacion(int idEvaluacion);
}
