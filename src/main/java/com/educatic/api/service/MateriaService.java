package com.educatic.api.service;

import com.educatic.api.entity.Comentario;
import com.educatic.api.entity.Materia;
import com.educatic.api.entity.Modulo;
import com.educatic.api.repository.ComentarioRepository;
import com.educatic.api.repository.MateriaRepository;
import com.educatic.api.repository.ModuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaService {
    @Autowired
    private MateriaRepository materiaRepository;

    @Autowired
    private ModuloRepository moduloRepository;

    @Autowired
    private ComentarioRepository comentarioRepository;

    public List<Materia> getAll() {
        return (List<Materia>) materiaRepository.findAll();
    }

    public Optional<Materia> getMateria(String idMateria) {
        return materiaRepository.findById(idMateria);
    }

    public List<Modulo> getModulosByMateria(String idMateria) {
        return moduloRepository.findByMateriaIdMateria(idMateria);
    }

    public List<Comentario> getComentariosByMateria(String idMateria) {
        return comentarioRepository.findByMateriaIdMateria(idMateria);
    }
}
