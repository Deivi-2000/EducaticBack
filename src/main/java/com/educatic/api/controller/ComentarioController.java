package com.educatic.api.controller;

import com.educatic.api.entity.Comentario;
import com.educatic.api.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("comentario")
public class ComentarioController {
    @Autowired
    private ComentarioService comentarioService;

    @GetMapping("/all")
    public List<Comentario> getComentarios() {
        return comentarioService.getAll();
    }

    @GetMapping("/getById/{idComentario}")
    public Optional<Comentario> getComentarioBydId(@PathVariable Integer idComentario) {
        return comentarioService.getComentario(idComentario);
    }

}
