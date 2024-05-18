package com.educatic.api.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="CARRERA")
public class Carrera {

    @Id
    @Column(name = "ID_CARRERA")
    private String idCarrera;

    @Column(name = "NOMBRE")
    private String nombre;

    @OneToMany(mappedBy = "carrera")
    private List<Usuario> usuarios;


    public String getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(String idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
