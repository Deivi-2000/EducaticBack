package com.educatic.api.repository;

import com.educatic.api.entity.Calificacion;
import com.educatic.api.entity.CalificacionPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalificacionRepository extends JpaRepository<Calificacion, CalificacionPK> {
}
