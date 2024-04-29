package org.bansena.cgmlti.java.pruebas;

public class Dog  implements IComportamientoAnimal{

    //COMPORTAMIENTO:
    public void alimentarse(){
        System.out.println("Guau... Me estoy alimenetando");
    }

    @Override
    public void alimentarse(String comida) {
       System.out.println("Wouf... He comido" + comida);
    }
    

}
