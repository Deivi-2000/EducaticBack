package com.educatic.api.service;

import com.educatic.api.entity.Novedad;
import com.educatic.api.repository.NovedadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NovedadService {
    @Autowired
    private NovedadRepository novedadRepository;

    public List<Novedad> getAll() {
        return (List<Novedad>) novedadRepository.findAll();
    }

    public Optional<Novedad> getNovedad(int idNovedad) {
        return novedadRepository.findById(idNovedad);
    }

}
