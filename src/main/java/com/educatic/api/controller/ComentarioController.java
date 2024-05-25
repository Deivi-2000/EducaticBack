package com.educatic.api.controller;

import com.educatic.api.entity.Comentario;
import com.educatic.api.entity.Usuario;
import com.educatic.api.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/set")
    public void saveComentario(@RequestBody Comentario comentario) {
        comentarioService.saveOrUpdate(comentario);
    }

}
