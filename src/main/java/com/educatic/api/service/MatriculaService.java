package com.educatic.api.service;

import com.educatic.api.entity.Matricula;
import com.educatic.api.entity.MatriculaPK;
import com.educatic.api.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaService {
    @Autowired
    private MatriculaRepository MatriculaRepository;

    public List<Matricula> getAll() {
        return (List<Matricula>) MatriculaRepository.findAll();
    }

    public Optional<Matricula> getMatricula(MatriculaPK idMatricula) {
        return MatriculaRepository.findById(idMatricula);
    }

}
