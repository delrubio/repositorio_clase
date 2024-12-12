package org.example;

import java.util.Scanner;

public class TerenDelAmor {

    static Scanner teclado;

    public static boolean casoDePrueba() {

        if (!teclado.hasNext())
        return false;
    else {
            // CÓDIGO PRINCIPAL AQUÍ
            teclado.nextLine();
            System.out.println("Hola");

            return true;
        }

    } // casoDePrueba

    public static void main(String[] args) {

        teclado = new Scanner(System.in);
        while(casoDePrueba()) {
        }
    }
}
