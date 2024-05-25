package com.educatic.api.controller;

import com.educatic.api.entity.Comentario;
import com.educatic.api.entity.Materia;
import com.educatic.api.entity.Matricula;
import com.educatic.api.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("matricula")
public class MatriculaController {
    @Autowired
    private MatriculaService matriculaService;

    @GetMapping("/all")
    public List<Matricula> getMatriculaes() {
        return matriculaService.getAll();
    }

    @GetMapping("/getMateriasByIdUsuario/{idUsuario}")
    public List<Materia> getMateriasByIdUsuario(@PathVariable String idUsuario) {
        return matriculaService.getMateriasByUsuario(idUsuario);
    }

    @PostMapping("/set")
    public void saveMatricula(@RequestBody Matricula matricula) {
        matriculaService.saveOrUpdate(matricula);
    }

}
