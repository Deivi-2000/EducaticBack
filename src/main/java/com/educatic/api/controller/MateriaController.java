package com.educatic.api.controller;

import com.educatic.api.entity.Comentario;
import com.educatic.api.entity.Materia;
import com.educatic.api.entity.Modulo;
import com.educatic.api.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("materia")
public class MateriaController {
    @Autowired
    private MateriaService materiaService;

    @GetMapping("/all")
    public List<Materia> getMateriaes() {
        return materiaService.getAll();
    }

    @GetMapping("/getById/{idMateria}")
    public Optional<Materia> getMateriaById(@PathVariable String idMateria) {
        return materiaService.getMateria(idMateria);
    }

    @GetMapping("/{idMateria}/modulos")
    public List<Modulo> getModulosById(@PathVariable String idMateria) {
        return materiaService.getModulosByMateria(idMateria);
    }

    @GetMapping("/{idMateria}/comentarios")
    public List<Comentario> getComentariosById(@PathVariable String idMateria) {
        return materiaService.getComentariosByMateria(idMateria);
    }

}
