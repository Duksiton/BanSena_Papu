package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class PruebaTarjetaDebito {
    public static void main(String[] args) {

        Campania c = new Campania(500.0, "ADSO");

        CuotaManejo<Campania> cm = new CuotaManejo<Campania>(c);

        //asignar la cuota de manejo a la tarjeta de debito
        TarjetaDebito<Campania> t1 = new TarjetaDebito<>(22432L, LocalDate.now(), 1000000.0);

        CuentaBancaria cb = new CuentaBancaria(null, 9277568522L, 200000.0, "COP");

        TarjetaDebito<CuentaBancaria> tDebito = new TarjetaDebito<>(74676861292L,LocalDate.now(),1000000.0);


        t1.setCuotaManejo(cm);
        cb.setTarjetaDebito(tDebito);

        System.out.println(cb.toString());
    }
}
