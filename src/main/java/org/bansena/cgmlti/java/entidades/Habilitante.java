package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public abstract class Habilitante  {

    protected Double valor;
    protected LocalDate fechaInicio;
    protected LocalDate fechaFin;

    public Habilitante(Double valor) {
        this.valor = valor;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    


    
}
