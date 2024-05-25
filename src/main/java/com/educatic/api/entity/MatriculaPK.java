package com.educatic.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;

@Embeddable
public class MatriculaPK {

    @Column(name = "ID_USUARIO")
    @JsonProperty(value = "ID_USUARIO")
    private String idUsuario;

    @Column(name = "ID_MATERIA")
    @JsonProperty(value = "ID_MATERIA")
    private String idMateria;

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }
}
