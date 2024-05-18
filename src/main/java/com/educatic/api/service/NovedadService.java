package com.educatic.api.service;

import com.educatic.api.entity.Novedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NovedadService {
    @Autowired
    private com.educatic.api.repository.NovedadRepository novedadCrudRepository;

    public List<Novedad> getAll() {
        System.out.println((List<Novedad>) novedadCrudRepository.findAll());
        return (List<Novedad>) novedadCrudRepository.findAll();
    }
}
