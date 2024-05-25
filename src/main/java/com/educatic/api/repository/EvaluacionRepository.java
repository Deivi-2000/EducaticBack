package com.educatic.api.repository;

import com.educatic.api.entity.Evaluacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvaluacionRepository extends JpaRepository<Evaluacion, Integer> {
    List<Evaluacion> findByModuloIdModulo(String idModulo);
}
