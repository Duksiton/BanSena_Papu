package org.bansena.cgmlti.java.pruebas;

public class PruebasMetodosGenericos {

    //METODO GENERICO
    //METODO QUE ACEPTA PARAMETROS AJUSTABLES
    //A CUALQUIER TIPO DE DATO
    static <T> T mostrarElemento(T item){
        return item;
    }

    public static void main(String[] args) {
        //INVOCAR EL METODO mostrarElemento
      System.out.println(mostrarElemento("Hola mundo"));
    }

}
