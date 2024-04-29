package org.bansena.cgmlti.java.pruebas;

public class PruebaJaulas {

    public static void main(String[] args) {
        //priera jaula va a tener perros
        Dog perro1 = new Dog();
        Dog perro2 = new Dog();
        Cat gatico1 = new Cat();
        Cat gatico2 = new Cat();

        Cage<Dog> jaula1 = new Cage<Dog>();
        jaula1.setMascota1(perro1);
        jaula1.setMascota1(perro2);

        Cage<Cat> jaulaGatos = new Cage<Cat>();
        jaulaGatos.setMascota1(gatico1);
        jaulaGatos.setMascota1(gatico2);

    }

}
