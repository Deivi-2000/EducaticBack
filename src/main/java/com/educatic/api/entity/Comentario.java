package com.educatic.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name="COMENTARIO")
public class Comentario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID_COMENTARIO")
    private int idComentario;

    @Column(name = "ID_USUARIO")
    @JsonProperty(value = "ID_USUARIO")
    private String idUsuario;

    @Column(name = "ID_MATERIA")
    @JsonProperty(value = "ID_MATERIA")
    private String idMateria;

    @Column(name = "TEXTO")
    @JsonProperty(value = "TEXTO")
    private String texto;

    @Column(name = "FECHA_CREACION")
    @JsonProperty(value = "FECHA_CREACION")
    private String fechaCreacion;

    @Column(name = "HORA_CREACION")
    @JsonProperty(value = "HORA_CREACION")
    private String horaCreacion;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO", insertable = false, updatable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ID_MATERIA", insertable = false, updatable = false)
    private Materia materia;


    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

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

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getHoraCreacion() {
        return horaCreacion;
    }

    public void setHoraCreacion(String horaCreacion) {
        this.horaCreacion = horaCreacion;
    }
}
