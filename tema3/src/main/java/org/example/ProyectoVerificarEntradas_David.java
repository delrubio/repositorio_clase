package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ProyectoVerificarEntradas_David {

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
            int[] codEntrada = {teclado.nextInt()};
            int sumaPares = comprobarPares(codEntrada);
            int sumaImpares = comprobarImpares(codEntrada);
            System.out.println(sumaImpares + sumaPares);
        }
    }

    public static int comprobarPares(int[] pares){
        int numMayor = 0;
        int sumaPar = 0;

        for (int i = 0; i < pares.length; i++) {
            if (numMayor < pares[i]) {
                numMayor = pares[i];
            }
        }

        for (int i = 0; i < pares.length; i++) {
            if ((i + 1) % 2 == 0) {
                sumaPar = (sumaPar + (pares[i] * 2) + numMayor);
            }
        }

        return sumaPar;
    }

    public static int comprobarImpares(int[] impares){
        int numMenor = 0;
        int sumaImpar = 0;

        for (int i = 0; i < impares.length; i++) {

            numMenor = impares[i];

            for (int j = 0; j < i; j++) {
                if (numMenor > impares[j]){
                    numMenor = impares[j];
                }
            }

            if ((i + 1) % 2 != 0) {
                sumaImpar = (sumaImpar + (impares[i] * 3) + numMenor);
            }
        }

        return sumaImpar;
    }
}
