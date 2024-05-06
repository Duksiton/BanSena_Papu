package org.bansena.cgmlti.java.entidades;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria extends Habilitante{

    Long numero;
    Double saldo;
    String divisa;

    List<CuotaManejo> lManejos= new ArrayList<>();

    TarjetaDebito tarjetaDebito;

    public void setTarjetaDebito(TarjetaDebito tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    public CuentaBancaria(Double valor, Long numero, Double saldo, String divisa) {
        super(valor);
        this.numero = numero;
        this.saldo = saldo;
        this.divisa = divisa;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getDivisa() {
        return divisa;
    }

    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [numero=" + numero + ", saldo=" + saldo + ", divisa=" + divisa + ", lManejos=" + lManejos
                + ", tarjetaDebito=" + tarjetaDebito + "]";
    }

    


}
