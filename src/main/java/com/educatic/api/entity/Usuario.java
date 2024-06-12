package com.educatic.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.springframework.lang.Nullable;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="USUARIO")
public class Usuario implements Serializable {

    @Id
    @Column(name = "ID_USUARIO")
    @JsonProperty(value = "ID_USUARIO")
    private String idUsuario;

    @Column(name = "ID_CARRERA")
    @JsonProperty(value = "ID_CARRERA")
    private String idCarrera;


    @Column(name = "NOMBRE")
    @JsonProperty(value = "NOMBRE")
    private String nombre;

    @Column(name = "FECHA_REGISTRO")
    @JsonProperty(value = "FECHA_REGISTRO")
    private String fechaRegistro;


    @ManyToOne
    @JoinColumn(name = "ID_CARRERA", insertable = false, updatable = false)
    private Carrera carrera;

    @OneToMany(mappedBy = "usuario")
    private List<Matricula> matriculas;

    @OneToMany(mappedBy = "usuario")
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "usuario")
    private List<Calificacion> calificacions;


    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

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

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}
