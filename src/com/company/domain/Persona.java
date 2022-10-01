package com.company.domain;

import java.time.LocalDateTime;

public abstract class Persona {

    protected TipoIdentificacion tipoIdentificacion;
    protected String numeroIdentificacion;
    protected String nombres;
    protected String apellidos;
    protected LocalDateTime fechaNacimiento;

    protected Persona(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion, String nombres,
                      String apellidos, LocalDateTime fechaNacimiento) {
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }
}
