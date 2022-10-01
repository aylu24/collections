package com.company.domain;

public class Solicitud {
    private int prioridad;
    private String nombreSolicitante;

    public Solicitud(int prioridad, String nombreSolicitante) {
        this.prioridad = prioridad;
        this.nombreSolicitante = nombreSolicitante;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    @Override
    public String toString() {
        return "Solicitud{" +
                "prioridad=" + prioridad +
                ", nombreSolicitante='" + nombreSolicitante + '\'' +
                '}';
    }
}
