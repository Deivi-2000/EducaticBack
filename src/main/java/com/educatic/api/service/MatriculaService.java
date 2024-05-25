package com.educatic.api.service;

import com.educatic.api.entity.Comentario;
import com.educatic.api.entity.Materia;
import com.educatic.api.entity.Matricula;
import com.educatic.api.entity.MatriculaPK;
import com.educatic.api.repository.MatriculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MatriculaService {
    @Autowired
    private MatriculaRepository matriculaRepository;

    public List<Matricula> getAll() {
        return (List<Matricula>) matriculaRepository.findAll();
    }

    public Optional<Matricula> getMatricula(MatriculaPK idMatricula) {
        return matriculaRepository.findById(idMatricula);
    }

    public void saveOrUpdate(Matricula matricula){
        matriculaRepository.save(matricula);
    }

    public List<Materia> getMateriasByUsuario(String idUsuario) {
        List<Matricula> matriculas = matriculaRepository.findById_IdUsuario(idUsuario);
        return matriculas.stream().map(Matricula::getMateria).collect(Collectors.toList());
    }
}
