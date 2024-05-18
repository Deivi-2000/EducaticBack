package com.educatic.api.service;

import com.educatic.api.entity.Comentario;
import com.educatic.api.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComentarioService {
    @Autowired
    private ComentarioRepository comentarioService;

    public List<Comentario> getAll() {
        return (List<Comentario>) comentarioService.findAll();
    }

    public Optional<Comentario> getComentario(int idComentario) {
        return comentarioService.findById(idComentario);
    }

}
