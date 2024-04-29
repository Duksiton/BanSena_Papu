package org.bansena.cgmlti.java.entidades;

import java.time.LocalDate;

public class Prueba {

    public static void main(String[] args) {
        //CREAR UNA CAMPANIA

        Campania ca = new Campania(500.0, "Dia de la madre", LocalDate.of(2024, 5, 12), LocalDate.of(2024, 5, 30));

        //CREAR UNA CUOTA DE MANEJO ESPECIFICA PARA CAMPAÑAS

        CuotaManejo<Campania> cm1 = new CuotaManejo<Campania>(ca.getFechaInicio(), ca.getFechaFin(), ca.getValor(), ca);

        //CREAR CUENTA BANCARIA
        CuentaBancaria cuentica = new CuentaBancaria(234L, 12000.0, "COP");

        cuentica.lManejos.add(cm1);

    }

}
