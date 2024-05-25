package com.educatic.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name="CALIFICACION")
public class Calificacion {

    @EmbeddedId
    @Column(name = "ID_CALIFICACION")
    private CalificacionPK id;

    @Column(name = "NOTA")
    @JsonProperty(value = "NOTA")
    private double nota;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", insertable = false, updatable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ID_EVALUACION", insertable = false, updatable = false)
    private Evaluacion evaluacion;

    public CalificacionPK getId() {
        return id;
    }

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
