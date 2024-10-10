package org.example;

import com.sun.source.util.SourcePositions;

import java.util.SortedMap;

public class CosasJava {
    public void caracteres(){
        String frase = "Me porto mal en clase y no lo reconozco.";

        int tamanyo = frase.length();
        System.out.println("El tamaño de la frase es " + tamanyo);

        char letra = frase.charAt(33);
        System.out.println("La letra en la posición 33 es " + letra);

        String palabra = frase.substring(9,12);
        System.out.println("La palabra con substring es " + palabra);

        String palabra2 = "Parte.";
        String concatenacion = frase.concat(palabra2);
        System.out.printf("La concatenación de la frase con la palabra " + palabra2 + "es " + concatenacion);

        int posicion = concatenacion.indexOf(palabra2);
        System.out.println("La palabra " + palabra2 + "está en la posición" + posicion);

        int posicion2 = concatenacion.indexOf("no",8);
        System.out.println("La posición de la palabra -no- si no tenemos en cuenta las primero 8 posiciones está en la posicion " + posicion2);

        int posicion3 = concatenacion.lastIndexOf(" no ");
        System.out.println("La posición de la ultima aparición de la palabra -no- está en la posición " + posicion3);

        String mayusculas = frase.toUpperCase();
        String minusculas = frase.toLowerCase();
        System.out.println("La frase en mayusculas es: " + mayusculas + "la frase en minusculas es: " + minusculas);

        String nombre = "David                    ";
        nombre = nombre.trim();
        System.out.println("Tu nombre sin espacios es " + nombre);

        String reemplazar = frase.replace("mal", "bien");
        System.out.println("La frase nueva queda asi: " + reemplazar);

        String palabra3 = "hola";
        String palabra4 = "Hola";
        if (palabra3.equals(palabra4)==true){
            System.out.println("Las palabras " + palabra3 + " y " + palabra4 + " son iguales");
        }else{
            System.out.println("Las palabras " + palabra3 + " y " + palabra4 + " son diferentes");
        }

        if (palabra3.equalsIgnoreCase(palabra4)==true){
            System.out.println("Las palabras " + palabra3 + " y " + palabra4 + " son iguales");
        }else{
            System.out.println("Las palabras " + palabra3 + " y " + palabra4 + " son diferentes");
        }

    }
}
