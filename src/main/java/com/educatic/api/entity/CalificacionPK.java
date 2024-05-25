package com.educatic.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class CalificacionPK implements Serializable {

    @Column(name = "ID_USUARIO")
    @JsonProperty(value = "ID_USUARIO")
    private String idUsuario;

    @Column(name = "ID_EVALUACION")
    @JsonProperty(value = "ID_EVALUACION")
    private int idEvaluacion;

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(int idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }
}
