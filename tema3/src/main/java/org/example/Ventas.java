package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ventas {

    static Scanner teclado;

    public static boolean casoDePrueba() {
        float dato = teclado.nextFloat();

        if (dato==-1)//es el caso que marca el final
            return false;
        else {
            float datos[]=introducirDatos(dato);
            System.out.println(Arrays.toString(datos));

            return true;
        }
    }

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

    public static float[] introducirDatos(float dato){

        float datos[] = new float[6];
        datos[0] = dato;

        for (int i = 0; i < datos.length; i++) {
            datos[i] = teclado.nextFloat();
        }

        return datos;
    }

}