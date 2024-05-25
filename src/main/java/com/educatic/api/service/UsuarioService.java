package com.educatic.api.service;

import com.educatic.api.entity.Usuario;
import com.educatic.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAll() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public Optional<Usuario> getUsuario(String idUsuario) {
        return usuarioRepository.findById(idUsuario);
    }

    public void saveOrUpdate(Usuario usuario){
        usuarioRepository.save(usuario);
    }

}
