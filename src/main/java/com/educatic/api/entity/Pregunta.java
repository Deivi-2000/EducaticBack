package com.educatic.api.entity;

import jakarta.persistence.*;

@Entity
@Table(name="PREGUNTA")
public class Pregunta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PREGUNTA")
    private int idPregunta;

    @Column(name = "ID_EVALUACION")
    private int idEvaluacion;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "OPCION_UNO")
    private String opcionUno;

    @Column(name = "OPCION_DOS")
    private String opcionDos;

    @Column(name = "OPCION_TRES")
    private String opcionTres;

    @Column(name = "OPCION_CUATRO")
    private String opcionCuatro;

    @Column(name = "RESPUESTA_CORRECTA")
    private String respuestaCorrecta;

    @Column(name = "RUTA_IMAGEN")
    private String rutaImagen;

    @ManyToOne
    @JoinColumn(name = "ID_EVALUACION", insertable = false, updatable = false)
    private Evaluacion evaluacion;


    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public int getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(int idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getOpcionUno() {
        return opcionUno;
    }

    public void setOpcionUno(String opcionUno) {
        this.opcionUno = opcionUno;
    }

    public String getOpcionDos() {
        return opcionDos;
    }

    public void setOpcionDos(String opcionDos) {
        this.opcionDos = opcionDos;
    }

    public String getOpcionTres() {
        return opcionTres;
    }

    public void setOpcionTres(String opcionTres) {
        this.opcionTres = opcionTres;
    }

    public String getOpcionCuatro() {
        return opcionCuatro;
    }

    public void setOpcionCuatro(String opcionCuatro) {
        this.opcionCuatro = opcionCuatro;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
}
