package com.educatic.api.controller;

import com.educatic.api.entity.Matricula;
import com.educatic.api.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
