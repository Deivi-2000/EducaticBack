package com.educatic.api.repository;

import com.educatic.api.entity.Matricula;
import com.educatic.api.entity.MatriculaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, MatriculaPK> {
}
