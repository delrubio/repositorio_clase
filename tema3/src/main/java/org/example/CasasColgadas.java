package org.example;

import java.util.Scanner;

public class CasasColgadas {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){
        numeroEntradas();
    }

    public static void numeroEntradas(){
        int entradasInt = 0;

        do {
            String entradas = teclado.nextLine();
            entradasInt = Integer.parseInt(entradas);

            if (entradasInt != 0){
                int[] sumaCap = new int[2];
                int suma = 0;
                int resultado = 0;

                for (int i = 0; i < entradasInt; i++) {
                    String capturados = teclado.nextLine();

                    String[] capString = capturados.split(" ");

                    for (int j = 0; j < capString.length; j++) {
                        sumaCap[j] = Integer.parseInt(capString[j]);
                        sumaCap[j +1] = Integer.parseInt(capString[j +1]);
                        suma = (sumaCap[j] - sumaCap[j +1]);
                        break;
                    }

                    resultado += suma;
                }System.out.println(resultado);
            }

        }while (entradasInt != 0);
    }
}