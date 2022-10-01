package com.company.domain;

import java.time.LocalDateTime;

public class Paciente extends Persona{

    private String ocupacion;
    private String aseguradora;

    public Paciente(TipoIdentificacion tipoIdentificacion, String numeroIdentificacion, String nombres,
                       String apellidos, LocalDateTime fechaNacimiento, String ocupacion,String aseguradora) {
        super(tipoIdentificacion, numeroIdentificacion, nombres, apellidos, fechaNacimiento);
        this.aseguradora=aseguradora;
        this.ocupacion=ocupacion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getAseguradora() {
        return aseguradora;
    }
}
