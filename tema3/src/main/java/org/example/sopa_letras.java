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
                                for (int k = j +1; k < sopa[i].length ; k++) {
                                    if (sopa[i][k].equals(letras_palabra[k])){
                                        acierto = k;
                                        continue;
                                    }else {
                                        break columnas;
                                    }
                                }
                                if (acierto == sopa[i].length -1);{
                                    System.out.println("Tu palabra está en la fila " +i);
                                    break;
                                }
                            } else{
                                if (j - sopa[i].length >= palabra.length() - 1 || sopa.length >= palabra.length() - 1) {
                                    boolean lado = (j - sopa[i].length >= palabra.length() - 1) ? true : false;
                                    boolean abajo = (sopa.length >= palabra.length() - 1) ? true : false;

                                    if (lado) {
                                        for (int g = 1; g < letras_palabra.length; g++) {
                                            if (sopa[i][j + g].equals(letras_palabra[g])) {
                                                si++;
                                                System.out.println(sopa[i][j + g] + letras_palabra[g]);
                                                if (si == letras_palabra.length - 1) {
                                                    System.out.println("Palabra encontrada. En la posición: " + i + ", " + j);
                                                }
                                            }
                                        }
                                    }else if (abajo) {
                                        si = 0;
                                    }

                                    for (int x = 1; x < letras_palabra.length - 1; x++) {
                                        if (sopa[i + x][j].equals(letras_palabra[x])) {
                                            si++;
                                            System.out.println(sopa[i + x][j] + letras_palabra[x]);
                                            if (si == letras_palabra.length - 1) {
                                                System.out.println("Palabra encontrada. En la posición: " + i + ", " + j);
                                            }
                                        }
                                    }
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
