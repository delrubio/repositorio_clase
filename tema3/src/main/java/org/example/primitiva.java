package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class primitiva {
    public static void ej_primitiva(){
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);

        int numeros_int[] = new int[7];
        int sorteo[] = new int[7];
        int[] limpio = new int[7];
        int[] limpio_random = new int[6];
        int [] numeros_finales = new int[6];
        int reintegro = 0;
        int complementario = 0;
        int categoria = 0;
        int reintegro_ok = 0;

        boolean num = true;
        boolean num_sorteo = true;

        while (num) {
            try {
                System.out.println("LA PRIMITIVA: Loterías y Apuestas del Estado");
                System.out.println("Introduce los datos de tu boleto");
                String apuesta = teclado.nextLine();
                num = apuesta.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d");

                if (!num) {
                    System.out.println("Algo no ha ido bien... Corrige el formato");
                    num = true;
                    continue;
                }

                String[] numeros = apuesta.split("[-/]");

                for (int i = 0; i < numeros_int.length; i++) {
                    numeros_int[i] = Integer.parseInt(numeros[i]);
                }

                limpio = Arrays.stream(numeros_int).distinct().toArray();
                if (limpio.length != numeros_int.length) {
                    System.out.println("No puedes duplicar números.");
                    continue;
                }
            } catch (NumberFormatException e1) {
                System.out.println("Error. Introduce un valor correcto." + e1);
                continue;
            }

            for (int i = 0; i < limpio.length; i++) {
                if (i == limpio.length -1 && limpio[i] < 0) {
                    System.out.println("Algo no ha ido bien... Vuelve a introducir bien los numeros.");
                    break;
                } else if (i == limpio.length -1 && limpio[i] > 9) {
                    System.out.println("Algo no ha ido bien... Vuelve a introducir bien los numeros.");
                    break;
                } else if (limpio[i] < 1 || limpio[i] > 49) {
                    System.out.println("Algo no ha ido bien... Vuelve a introducir bien los numeros.");
                    break;
                } else {
                    num = false;
                }
            }
        }
        while(!num){
            for (int i=0; i < sorteo.length; i++) {

                int numero_random = random.nextInt(49) + 1;
                sorteo[i] = numero_random;

                if (i < sorteo.length -1){
                    limpio_random[i] = sorteo[i];
                }else {
                    complementario = sorteo[i];
                }
            }

            numeros_finales = Arrays.stream(limpio_random).distinct().toArray();
            if (numeros_finales.length != limpio_random.length) {
                continue;
            }

            reintegro = random.nextInt(11);
            num = true;

            System.out.println("SORTEO: ");
            System.out.println(Arrays.toString(limpio_random));
            System.out.println("Complementario: " + complementario);
            System.out.println("Reintegro: " + reintegro);
            System.out.println(" ");

            for (int i = 0; i < limpio.length; i++){
                for (int j = 0; j < limpio_random.length; j++) {
                    if (i < limpio_random.length && limpio[i] == limpio_random[j]){
                        categoria ++;
                        continue;
                    }else if (i < limpio_random.length && limpio[i] == complementario){
                        categoria ++;
                        continue;
                    }else if (limpio[limpio.length-1] == reintegro){
                        reintegro_ok = 1;
                        continue;
                    }
                }
            }

            if (categoria == 6 && reintegro_ok == 1){
                System.out.println("Categoría Especial: Has acertado todos números y el reintegro.");
            }else if (categoria == 6){
                System.out.println("1º Categoría: Has acertado 6 números.");
            }else if (categoria == 5 && reintegro_ok == 1){
                System.out.println("2º Categoría: Has acertado 5 números y el reintegro.");
            }else if (categoria == 5){
                System.out.println("3º Categoría: Has acertado 5 números.");
            }else if (categoria == 4){
                System.out.println("4º Categoría: Has acertado 4 números.");
            }else if (categoria == 3){
                System.out.println("5º Categoría: Has acertado 3 números.");
            }else if (reintegro_ok == 1){
                System.out.println("Has acertado el reintegro.");
            }else {
                System.out.println("Pringao.");
            }
        }
    }
}
