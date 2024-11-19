package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class primitiva {
    public static void ej_primitiva(){
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);

        int numeros2[] = new int[7];
        int sorteo[] = new int[6];

        boolean num = true;

//        while (num) {
//            try {
//                System.out.println("LA PRIMITIVA: Loterías y Apuestas del Estado");
//                System.out.println("Introduce los datos de tu boleto");
//                String entrada = teclado.nextLine();
//                num = entrada.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d");
//                if (num) {
//                    String[] numeros = entrada.split("[-/]");
//                } else {
//                    System.out.println("Algo no ha ido bien... Corrige el formato");
//                    continue;
//                }
//                for (int i = 0; i < numeros2.length; i++) {
//                    numeros2[i] = Integer.parseInt(numeros[i]);
//                    if (i == numeros2.length-1 ||numeros2[i] < 0 || numeros2[i] > 9){
//                        System.out.println("Algo no ha ido bien... Vuelve a introducir bien los numeros.");
//                        break;
//                        num = true;
//                    }else if (numeros2[i] < 1 || numeros2[i] > 49){
//                        System.out.println("Algo no ha ido bien... Vuelve a introducir bien los numeros.");
//                        break;
//                        num = true;
//                    }else {
//                        num = false;
//                    }
//                }
//            }catch (NumberFormatException e1){
//                System.out.println("Error. Introduce un valor correcto." + e1);
//                continue;
//            }

            for (int i=0; i< sorteo.length + 1; i++) {
                int numero_random = random.nextInt(49)+1;
                if (i == sorteo.length-2){
                    int reintegro = random.nextInt(11);
                }else if (i == sorteo.length -1){
                    sorteo[i] = numero_random;
                }else{
                    int complementario = numero_random;
                }
            }
            Arrays.sort(sorteo);
//            int limpio[] = Arrays.stream(numeros).distinct().toArray();
            System.out.println(Arrays.toString(sorteo));
        }
    }
//}
