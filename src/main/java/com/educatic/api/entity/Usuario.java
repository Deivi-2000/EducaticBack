package com.educatic.api.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="USUARIO")
public class Usuario {

    @Id
    @Column(name = "ID_USUARIO")
    private String idUsuario;

    @Column(name = "ID_CARRERA")
    private String idCarrera;

    @Column(name = "GENERO")
    private String genero;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;

    @Column(name = "FECHA_REGISTRO")
    private String fechaRegistro;

    @Column(name = "FECHA_NACIMIENTO")
    private String fechaNacimiento;

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
