package com.educatic.api.controller;

import com.educatic.api.entity.Usuario;
import com.educatic.api.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/all")
    public List<Usuario> getUsuarios() {
        return usuarioService.getAll();
    }

    @GetMapping("/getById/{idUsuario}")
    public Optional<Usuario> getUsuarioById(@PathVariable String idUsuario) {
        return usuarioService.getUsuario(idUsuario);
    }

}
