package com.educatic.api.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="MATERIA")
public class Materia {

    @Id
    @Column(name = "ID_MATERIA")
    private String idMateria;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "FECHA_CREACION")
    private String fechaCreacion;

    @Column(name = "FECHA_ACTUALIZADO")
    private String fechaActualizado;

    @Column(name = "RUTA_IMAGEN")
    private String rutaImagen;

    @OneToMany(mappedBy = "materia")
    private List<Matricula> matriculas;

    @OneToMany(mappedBy = "materia")
    private List<Comentario> comentarios;

    @OneToMany(mappedBy = "materia")
    private List<Novedad> novedads;

    @OneToMany(mappedBy = "materia")
    private List<Modulo> modulos;


    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaActualizado() {
        return fechaActualizado;
    }

    public void setFechaActualizado(String fechaActualizado) {
        this.fechaActualizado = fechaActualizado;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
}
