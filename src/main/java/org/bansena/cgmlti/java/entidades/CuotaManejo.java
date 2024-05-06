package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class CuotaManejo <E extends Habilitante> {

        private LocalDate fechaInicio;
        private LocalDate fechaFin;
        private Double valor;
        private E habilitante;
   
       public CuotaManejo(E habilitante) {
        this.valor = habilitante.getValor();
        this.fechaInicio = habilitante.getFechaInicio();
        this.fechaFin = habilitante.getFechaFin();
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

    @Override
    public String toString() {
        return "CuotaManejo [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", valor=" + valor
                + ", habilitante=" + habilitante + "]";
    }

       
       
        

}
