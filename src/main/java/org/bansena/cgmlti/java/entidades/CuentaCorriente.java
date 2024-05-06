package org.bansena.cgmlti.java.entidades;

import java.util.List;

public class CuentaCorriente extends CuentaBancaria{

    public CuentaCorriente(Double valor, Long numero, Double saldo, String divisa, List<CuotaManejo> lManejos,
            TarjetaDebito tarjetaDebito) {
        super(valor, numero, saldo, divisa);
    }

    
    

}
