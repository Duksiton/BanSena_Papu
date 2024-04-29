package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class CuotaManejo <E> {

        private LocalDate fechaInicio;
        private LocalDate fechaFin;
        private Double valor;
       private E habilitante;
   
       public CuotaManejo(LocalDate fechaInicio, LocalDate fechaFin, Double valor, E habilitante) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.valor = valor;
        this.habilitante = habilitante;
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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public E getHabilitante() {
        return habilitante;
    }

    public void setHabilitante(E habilitante) {
        this.habilitante = habilitante;
    }

       
       
        

}
