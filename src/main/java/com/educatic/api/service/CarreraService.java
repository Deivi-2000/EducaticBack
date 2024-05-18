package com.educatic.api.service;

import com.educatic.api.entity.Carrera;
import com.educatic.api.repository.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarreraService {
    @Autowired
    private CarreraRepository carreraRepository;

    public List<Carrera> getAll() {
        return (List<Carrera>) carreraRepository.findAll();
    }

    public Optional<Carrera> getCarrera(String idCarrera) {
        return carreraRepository.findById(idCarrera);
    }

}
