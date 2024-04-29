package org.bansena.cgmlti.java.pruebas;

//<E>: un tipo de dato generico
// puede ser cualquier tipo que sean
public class Cage<E extends IComportamientoAnimal> {

    // Una jaula solo puede tener dos mascotas
    // las mascotas pueden ser del tipo que quieran
    // pero ambas tienen que ser del mismo tipo

    private E mascota1;
    private E mascota2;

    public E getMascota1() {
        return mascota1;
    }

    public void setMascota1(E mascota1) {
        this.mascota1 = mascota1;
    }

    public E getMascota2() {
        return mascota2;
    }

    public void setMascota2(E mascota2) {
        this.mascota2 = mascota2;
    }

    public Cage(E mascota1, E mascota2) {
        this.mascota1 = mascota1;
        this.mascota2 = mascota2;
    }

    public Cage() {

    }

    // COMPORTAMIENTO PARA ALIMENTAR ANIMALES

    public void alimentarMascotas() {
        this.mascota1.alimentarse("Purina");
    }

}
