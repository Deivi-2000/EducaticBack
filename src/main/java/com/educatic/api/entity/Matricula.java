package com.educatic.api.entity;

import jakarta.persistence.*;

@Entity
@Table(name="MATRICULA")
public class Matricula {

    @EmbeddedId
    private MatriculaPK id;

    @Column(name = "SEMESTRE")
    private String semestre;

    @Column(name = "ESTADO")
    private String estado;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", insertable = false, updatable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ID_MATERIA", insertable = false, updatable = false)
    private Materia materia;

    public MatriculaPK getId() {
        return id;
    }

    public void setId(MatriculaPK id) {
        this.id = id;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}