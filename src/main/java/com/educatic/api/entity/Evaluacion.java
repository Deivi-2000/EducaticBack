package com.educatic.api.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="EVALUACION")
public class Evaluacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EVALUACION")
    private int idEvaluacion;

    @Column(name = "ID_MODULO")
    private String idModulo;

    @Column(name = "DIFICULTAD")
    private String dificultad;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "CONTENIDO")
    private String contenido;

    @Column(name = "PUNTAJE_MAXIMO")
    private int puntajeMaximo;

    @Column(name = "FECHA_CREACION")
    private String fechaCreacion;

    @Column(name = "FECHA_ACTUALIZADO")
    private String fechaActualizado;

    @ManyToOne
    @JoinColumn(name = "ID_MODULO", insertable = false, updatable = false)
    private Modulo modulo;

    @OneToMany(mappedBy = "evaluacion")
    private List<Calificacion> calificacions;

    @OneToMany(mappedBy = "evaluacion")
    private List<Pregunta> preguntas;


    public int getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(int idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public String getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(String idModulo) {
        this.idModulo = idModulo;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getPuntajeMaximo() {
        return puntajeMaximo;
    }

    public void setPuntajeMaximo(int puntajeMaximo) {
        this.puntajeMaximo = puntajeMaximo;
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
}
