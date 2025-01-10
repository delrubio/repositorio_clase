package org.example;

import java.util.Scanner;

public class Olimpiada2 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        int entradas = numeroEntradas();
        verificacionEntradas(entradas);
    }

    public static int numeroEntradas(){

        int entradas = teclado.nextInt();

        return entradas;
    }

    public static void verificacionEntradas(int entradas){
        for (int i = 0; i < entradas; i++) {
            String palabra = teclado.next();
            comprobarPalabra(palabra);
        }
    }

    public static String comprobarPalabra(String palabra){

        String palabraOk = palabra.toUpperCase();

        if (palabraOk.matches("COLGADAS")){
            System.out.println("Bien");
        }else {
            System.out.println("Mal");
        }

        return palabraOk;
    }
}
