package com.educatic.api.service;

import com.educatic.api.entity.Materia;
import com.educatic.api.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaService {
    @Autowired
    private MateriaRepository MateriaRepository;

    public List<Materia> getAll() {
        return (List<Materia>) MateriaRepository.findAll();
    }

    public Optional<Materia> getMateria(String idMateria) {
        return MateriaRepository.findById(idMateria);
    }

}
