package com.educatic.api.entity;

import jakarta.persistence.*;

@Entity
@Table(name="CALIFICACION")
public class Calificacion {

    @EmbeddedId
    @Column(name = "ID_CALIFICACION")
    private CalificacionPK id;

    @Column(name = "NOTA")
    private double nota;

    public CalificacionPK getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", insertable = false, updatable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ID_EVALUACION", insertable = false, updatable = false)
    private Evaluacion evaluacion;

    public void setId(CalificacionPK id) {
        this.id = id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
