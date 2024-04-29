package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class Decreto extends Habilitante{

    private Integer numero;
    private LocalDate anio;
    
    public Decreto(Double valor, Integer numero, LocalDate anio) {
        super(valor);
        this.numero = numero;
        this.anio = anio;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getAnio() {
        return anio;
    }

    public void setAnio(LocalDate anio) {
        this.anio = anio;
    }

    

}
