package com.educatic.api.controller;

import com.educatic.api.entity.Novedad;
import com.educatic.api.service.NovedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("novedad")
public class NovedadController {
    @Autowired
    private NovedadService novedadService;

    @GetMapping("/novedades")
    public List<Novedad> getNovedades() {
        return novedadService.getAll();
    }

}
