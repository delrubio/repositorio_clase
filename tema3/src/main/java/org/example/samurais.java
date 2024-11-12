package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class samurais {
    public static void ej_samurais(){
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);

        int batalla = random.nextInt(7);
        int equipo1[] = new int[7];
        int equipo2[] = new int[7];
        int suma = 0;
        int puntos1 = 0;
        int puntos2 = 0;

        while (suma != 30) {
            try {
                System.out.println("Equipo1: Introduce la potencia de los samurais: ");
                String entrada = teclado.nextLine();
                String[] equipo1_st = entrada.split(" ");
                suma = 0;

                for (int i = 0; i < 7; i++) {
                    equipo1[i] = Integer.parseInt(equipo1_st[i]);
                    suma = suma + equipo1[i];
                }

                if (suma != 30) {
                    System.out.println("La potencia total tiene que ser 30");
                    continue;
                }
                System.out.println("Equipo2: Introduce la potencia de los samurais: ");
                String entrada2 = teclado.nextLine();
                String[] equipo2_st = entrada2.split(" ");
                suma = 0;

                for (int i = 0; i < 7; i++) {
                    equipo2[i] = Integer.parseInt(equipo2_st[i]);
                    suma = suma + equipo2[i];
                }

                if (suma != 30) {
                    System.out.println("La potencia total tiene que ser 30");
                    continue;
                }
            }
            catch (NumberFormatException e1){
                System.out.println("Error. Introduce un valor correcto." + e1);
                continue;
            }
        }
        for (int i = 0; i < equipo1.length; i++){
            if (batalla == 6 && equipo1[batalla] > equipo2[batalla]){
                System.out.println("Batalla " + i + " samurais " + batalla + ". Ganador el equipo1");
                System.out.println("Resultado " + equipo1[batalla] + "vs" + equipo2[batalla]);
                batalla = 0;
                puntos1 ++;
                continue;
            }else if (batalla == 6 && equipo1[batalla] < equipo2[batalla]){
                System.out.println("Batalla " + i + " samurais " + batalla + ". Ganador el equipo2");
                System.out.println("Resultado " + equipo1[batalla] + "vs" + equipo2[batalla]);
                batalla = 0;
                puntos2 ++;
                continue;
            }else if (batalla == 6 && equipo1[batalla] == equipo2[batalla]){
                System.out.println("Batalla " + i + " samurais " + batalla + ". Empate");
                System.out.println("Resultado " + equipo1[batalla] + "vs" + equipo2[batalla]);
                batalla = 0;
                continue;
            }else if (batalla < 6 && equipo1[batalla] > equipo2[batalla]){
                System.out.println("Batalla " + i + " samurais " + batalla + ". Ganador el equipo1");
                System.out.println("Resultado " + equipo1[batalla] + "vs" + equipo2[batalla]);
                batalla ++;
                puntos1 ++;
                continue;
            }else if (batalla < 6 && equipo1[batalla] < equipo2[batalla]){
                System.out.println("Batalla " + i + " samurais " + batalla + ". Ganador el equipo2");
                System.out.println("Resultado " + equipo1[batalla] + "vs" + equipo2[batalla]);
                batalla ++;
                puntos2 ++;
                continue;
            }else {
                System.out.println("Batalla " + i + " samurais " + batalla + ". Empate");
                System.out.println("Resultado " + equipo1[batalla] + "vs" + equipo2[batalla]);
                batalla ++;
                continue;
            }
        }

        if (puntos1 > puntos2){
            System.out.println("Ganador equipo 1");
        }else {
            System.out.println("Ganador equipo 2");
        }
    }
}
