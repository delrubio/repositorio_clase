package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class sopa_letras() {
    public static void ej_sopa() {
        Scanner teclado = new Scanner(System.in);

        boolean trycath = true;
        int filas = 0;
        int columnas = 0;

        while (trycath) {
            try {
                System.out.println("Dime el número de fila");
                filas = teclado.nextInt();
                System.out.println("Dime el número de columnas");
                columnas = teclado.nextInt();
                trycath = false;
            } catch (InputMismatchException e1) {
                System.out.println("Introduce los datos bien");
                continue;
            }
        }

        String sopa[][] = new String[filas][columnas];
    }
}
