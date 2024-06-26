package com.educatic.api.controller;

import com.educatic.api.entity.Novedad;
import com.educatic.api.service.NovedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("novedad")
public class NovedadController {
    @Autowired
    private NovedadService novedadService;

    @GetMapping("/all")
    public List<Novedad> getNovedades() {
        return novedadService.getAll();
    }

    @GetMapping("/getById/{idNovedad}")
    public Optional<Novedad> getNovedadById(@PathVariable Integer idNovedad) {
        return novedadService.getNovedad(idNovedad);
    }

}
