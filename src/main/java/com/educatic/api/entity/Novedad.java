package com.educatic.api.entity;

import jakarta.persistence.*;

@Entity
@Table(name="NOVEDAD")
public class Novedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_NOVEDAD")
    private int idNovedad;
    @Column(name = "ID_MATERIA")
    private String idMateria;
    @Column(name = "FECHA_PUBLICACION")
    private String fechaPublicacion;
    @Column(name = "RUTA_IMAGEN")
    private String rutaImagen;

    @ManyToOne
    @JoinColumn(name = "ID_MATERIA", insertable = false, updatable = false)
    private Materia materia;

    public int getIdNovedad() {
        return idNovedad;
    }

    public void setIdNovedad(int idNovedad) {
        this.idNovedad = idNovedad;
    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
}
