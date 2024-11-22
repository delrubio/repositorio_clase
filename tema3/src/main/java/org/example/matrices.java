package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class matrices {
    public static void matrices(){

        int matriz[][] = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }


        int matriz2[][] = {{2,3,8,6},{9,11,19}};

        for (int[] fila : matriz2){

            System.out.println(Arrays.toString(fila));
        }


        Scanner teclado = new Scanner(System.in);
        int matriz3[][] = new int[3][3];

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.println("Introduce la posicion (" + i + "," + j + ")");
                matriz3[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Tu matriz queda");
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {

                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void matrices2(){

        int m[][] = new int[3][3];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i==j){
                    m[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] == 1){
                    System.out.print("X ");
                }else {
                    System.out.print("- ");
                }
            }
            System.out.println(" ");
        }

        for (int i = 0; i < m.length; i++) {
            for (int j = m[i].length-1; j >=0; j--) {
                if (m[i][j] == 1){
                    System.out.print("X ");
                }else {
                    System.out.print("- ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void matriz(){
        Random random = new Random();

        int matriz[][] = new int[2][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(9)+1;
            }
        }

        for (int[] filas : matriz){
            for (int columnas : filas){
                System.out.print(columnas + " ");
            }
            System.out.println(" ");
        }

        final int numero = 8;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j]==numero){
                    System.out.println("Exixste.");
                    return;
                }
            }
        }
    }
    public static void ejercicio1(){
        Scanner teclado = new Scanner(System.in);

        int[][] m = new int[3][3];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                System.out.println("Dime números para rellenar");
                m[i][j] = teclado.nextInt();
            }
        }

        for (int[] linea : m) {
            for (int columna : linea) {

                System.out.print(columna + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Dime un número para buscar en la matriz");
        int numero = teclado.nextInt();

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j]==numero){
                    System.out.println("He encontrado el " + numero + " en la posición " + i + "," + j);
                    continue;
                }
            }
        }
    }
    public static void ejercicio2(){
        Random random = new Random();
         int filas = random.nextInt(5)+1;
         int columnas = random.nextInt(5)+1;
         int matriz[][] = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(50)+1;
            }
        }

        for (int[] vector : matriz){
            for (int valor : vector){
                System.out.print(valor + " ");
            }
            System.out.println(" ");
        }

        int suma = 0;
        System.out.println("Suma de filas");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma+=matriz[i][j];
            }
            System.out.println("Fila " + (i +1) + ": " + suma);
            suma = 0;
        }

        System.out.println("Suma columnas");
        int num = 0;

        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                suma+=matriz[j][i];
                num = j;
            }
            System.out.println("Columna " + (num +1) + ": " + suma);
            suma = 0;
        }
    }
    public static void ejercicio3(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuantos estudiantes tienes");
        int estudiantes = teclado.nextInt();
        System.out.println("Cuantas asignaturas hay");
        int asignaturas = teclado.nextInt();

        String tabla[][] = new String[estudiantes+1][asignaturas+1];

        tabla[0][0] = "ESTUDIANTES";

        for (int i = 1; i < tabla.length; i++) {
            System.out.println("Dime el nombre del alumno");
            tabla [i][0] = teclado.next();
        }

        for (int i = 1; i < tabla.length; i++) {
            System.out.println("Dime el nombre de la asignatura");
            tabla [0][i] = teclado.next();
        }

        for (int i = 1; i < tabla.length; i++) {
            for (int j = 1; j < tabla[i].length; j++) {
                System.out.println("Introduce la nota de " + tabla[i][0] + " para la asignatura " + tabla[0][j]);
                tabla[i][j] = Integer.toString(teclado.nextInt());
            }

        }

        for (String[] filas : tabla){
            for (String columnas : filas){
                System.out.print(columnas + " ");
            }
            System.out.println(" ");
        }

        int media_alumno = 0;
        for (int i = 1; i < tabla.length; i++) {
            for (int j = 1; j < tabla[i].length; j++) {
                media_alumno+=Integer.parseInt(tabla[i][j]);
            }
            System.out.println("La media del alumno " + tabla[i][0] + " : " + (media_alumno/asignaturas));
        }
    }
}
