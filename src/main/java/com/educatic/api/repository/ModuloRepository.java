package com.educatic.api.repository;

import com.educatic.api.entity.Modulo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModuloRepository extends JpaRepository<Modulo, String> {
    List<Modulo> findByMateriaIdMateria(String idMateria);
}
