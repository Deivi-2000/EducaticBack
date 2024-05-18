package com.educatic.api.entity;

import jakarta.persistence.*;

@Entity
@Table(name="NOVEDAD")
public class Novedad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_NOVEDAD")
    private Long idNovedad;
    @Column(name = "ID_MATERIA")
    private Long idMateria;
    @Column(name = "FECHA_PUBLICACION")
    private String fechaPublicacion;
    @Column(name = "RUTA_IMAGEN")
    private String rutaImagen;

    public Long getIdNovedad() {
        return idNovedad;
    }

    public void setIdNovedad(Long idNovedad) {
        this.idNovedad = idNovedad;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Long getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(Long idMateria) {
        this.idMateria = idMateria;
    }
}
