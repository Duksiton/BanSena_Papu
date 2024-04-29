package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class ReglaNegocio extends Habilitante {

    private LocalDate fechaInicio;
    private String descripcion;
    public ReglaNegocio(Double valor, LocalDate fechaInicio, String descripcion) {
        super(valor);
        this.fechaInicio = fechaInicio;
        this.descripcion = descripcion;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    

}
