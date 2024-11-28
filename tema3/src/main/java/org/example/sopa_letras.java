package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class sopa_letras {
    public static void ej_sopa() {
        Scanner teclado = new Scanner(System.in);

        boolean trycath = true;
        int filas = 0;
        int columnas = 0;
        int acierto = 0;

        while (trycath) {
            try {
                System.out.println("Dime el número de filas");
                filas = teclado.nextInt();
                System.out.println("Dime el número de columnas");
                columnas = teclado.nextInt();
                trycath = false;

                String sopa[][] = new String[filas][columnas];

                for (int i = 0; i < sopa.length; i++) {
                    System.out.println("Introduce la fila " + i + ": ");
                    String valor_fila[] = teclado.next().split("");

                    for (int j = 0; j < sopa[i].length; j++) {
                        sopa[i][j] = valor_fila[j];
                    }
                }

                for (String[] vector : sopa) {
                    for (String vector2 : vector) {
                        System.out.print(vector2 + " ");
                    }
                    System.out.println(" ");
                }

                System.out.println("Que palabra quieres buscar: ");
                String palabra = teclado.next();

                if (!palabra.matches("[a-zA-Z]")){
                    continue;
                }else {
                    int si = 0;

                    String[] letras_palabra = palabra.split("");

                    filas:
                    for (int i = 0; i < sopa.length; i++) {
                        columnas:
                        for (int j = 0; j < sopa[i].length; j++) {
                            if (sopa[i][j].equals(letras_palabra[j])) {
                                do {
                                    if (acierto == sopa[i].length - 1){
                                        System.out.println("Tu palabra está en la fila " + i);
                                        break;
                                    }
                                    acierto++;
                                    continue;
                                } while (sopa[i][j + 1].equals(letras_palabra[j + 1]));
                                do {
                                    if (acierto == sopa[i].length - 1){
                                        System.out.println("Tu palabra está en la columna " + j);
                                        break;
                                    }
                                    acierto++;
                                    continue;
                                } while (sopa[i + 1][j].equals(letras_palabra[i + 1]));

                                if (acierto == 0){
                                    System.out.println("No he encontrado nada");
                                }
                            }
                        }
                    }
                }
            }catch (NumberFormatException e1){
                continue;
            }
        }
    }
}
