package org.example;

import com.sun.source.util.SourcePositions;

import java.time.LocalDateTime;
import java.util.Scanner;
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
    public void excepciones(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Dividendo: ");
        int dividendo = 0; //InputMismatchException

        if (entrada.hasNextInt()){
            dividendo = entrada.nextInt();
        }else{
            System.out.println("Has introducido un formato incorrecto. No es un número");
        }

        System.out.println("Divisor: ");
        String divisor = entrada.next();
        int divisor_entero = 0;
        try{
            divisor_entero = Integer.parseInt(divisor);
        }catch (NumberFormatException e2){
            System.out.println("EL divisor introducido no es un número" + e2.getMessage());
        }

        System.out.println("Resultado: " + dividendo + divisor);
    }
    public static void modos(){

        System.out.println("BIENVENIDO A LA CLASIFICACIÓN DE GENERACIONES!!");
        System.out.println("Elige un modo (1) - año de nacimiento y (2) - edad");

        Scanner teclado = new Scanner(System.in);
        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();
        boolean error = false;

        String modo = teclado.next();
        int anyo_nacimiento = 1800;

        if (modo.equals("1")){

            System.out.println("Introduce tu año de nacimiento: ");
            String anyo = teclado.next();

            try{
                anyo_nacimiento = Integer.parseInt(anyo);
            }catch(NumberFormatException e1){
                System.out.println("El formato del año no es correcto. " + e1.getMessage());
            }

            if (anyo_nacimiento < 1900 || anyo_nacimiento > anyo_actual){
                System.out.println("El año introducido no es correcto.");
                error=true;
            }

        }else if (modo.equals("2")) {

            System.out.println("Introduce tu edad: ");
            int edad = 0;

            if(teclado.hasNextInt()){
                edad = teclado.nextInt();
            }else{
                System.out.println("El formato de la edad es incorrecto.");
                error=true;
            }

            if (edad < 0){
                System.out.println("La edad introducida no es correcta.");
                error=true;
            }else{
                anyo_nacimiento = anyo_actual-edad;
            }

        }else{
            System.out.println("El modo no existe.");
            error=true;
        }

        if (!error) {
            if (anyo_nacimiento >= 1900 && anyo_nacimiento <= 1927) {
                System.out.println("Eres de la generación sin bautizar");
            } else if (anyo_nacimiento >= 1928 && anyo_nacimiento <= 1944) {
                System.out.println("Eres de la generación silent");
            } else if (anyo_nacimiento >= 1945 && anyo_nacimiento <= 1964) {
                System.out.println("Eres de la generación BABY BOOMERS");
            } else if (anyo_nacimiento >= 1965 && anyo_nacimiento <= 1981) {
                System.out.println("Eres de la generación MILLENIAL");
            } else if (anyo_nacimiento >= 1982 && anyo_nacimiento <= 1994) {
                System.out.println("Eres de la generación CENTENIALS");
            } else if (anyo_nacimiento >= 1995 && anyo_nacimiento <= anyo_actual){
                System.out.println("La mejor generación! ZZZZZ");
            } else {
                System.out.println("NO TIENES GENERACIÓN!!");
            }
        }
    }
    public void modos2(){

        System.out.println("BIENVENIDO A LA CLASIFICACIÓN DE GENERACIONES");
        System.out.println("Elige un modo: ");
        System.out.println("1. Año nacimiento");
        System.out.println("2. Edad");

        Scanner teclado = new Scanner(System.in);

        String modo = teclado.next();

        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();

        int anyo_nacimiento = 1800;

        boolean error = false;

        switch (modo){
            case "1":
                System.out.println("Introduce tu año de nacimiento: ");
                String anyo = teclado.next();

                try{
                    anyo_nacimiento = Integer.parseInt(anyo);
                }catch(NumberFormatException e1) {
                    System.out.println("El formato del año no es correcto. " + e1.getMessage());
                }

                if (anyo_nacimiento < 1900 || anyo_nacimiento > anyo_actual){
                    System.out.println("El año introducido no es correcto.");
                    error=true;
                }
                break;

            case "2":
                System.out.println("Introduce tu edad: ");
                int edad = 0;

                if (teclado.hasNextInt()){
                    edad = teclado.nextInt();
                }else{
                    System.out.println("El formato de la edad es incorrecto.");
                    error=true;
                }

                if (edad < 0){
                    System.out.println("La edad introducida no es correcta.");
                    error=true;
                }else{
                    anyo_nacimiento = anyo_actual-edad;
                }
                break;
            default:
                System.out.println("El modo no existe.");
                error=true;
        }

        if (!error){
            if (anyo_nacimiento>=1900 && anyo_nacimiento<=1927){
                System.out.println("Eres de la generación sin bautizar.");
            } else if (anyo_nacimiento>=1928 && anyo_nacimiento<=1944) {
                System.out.println("Eres de la generación Silent.");
            } else if (anyo_nacimiento>=1945 && anyo_nacimiento<=1964) {
                System.out.println("Eres de la genración Baby Boomers");
            } else if (anyo_nacimiento>=1965 && anyo_nacimiento<=1981) {
                System.out.println("Eres de la generación X");
            } else if (anyo_nacimiento>=1982 && anyo_nacimiento<=1994) {
                System.out.println("Eres de la mejor generación, MILLENIAL!! :)");
            } else if (anyo_nacimiento>=1995 && anyo_nacimiento<=anyo_actual) {
                System.out.println("Eres de la generación Centenial");
            }else{
                System.out.println("No tienes generación.");
            }
        }
    }
}