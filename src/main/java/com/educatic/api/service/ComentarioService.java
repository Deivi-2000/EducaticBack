package com.educatic.api.service;

import com.educatic.api.entity.Comentario;
import com.educatic.api.entity.Usuario;
import com.educatic.api.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComentarioService {
    @Autowired
    private ComentarioRepository comentarioRepository;

    public List<Comentario> getAll() {
        return (List<Comentario>) comentarioRepository.findAll();
    }

    public Optional<Comentario> getComentario(int idComentario) {
        return comentarioRepository.findById(idComentario);
    }

    public void saveOrUpdate(Comentario comentario){
        comentarioRepository.save(comentario);
    }

}
