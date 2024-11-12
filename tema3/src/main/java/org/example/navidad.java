package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class navidad {
    public void ej_navidad(){
        Scanner teclado = new Scanner(System.in);

        final String palabra = "NAVIDAD";

        System.out.println("Introduce la cantidad de letras");
        String cantidad = teclado.nextLine();

        String cantidades[] = cantidad.split(" ");
        String letras[] = palabra.split("");

        String resultado = "";

        for (int i=0; i<letras.length; i++){
            for (int j=0; j<Integer.parseInt(cantidades[i]); j++){
                resultado = resultado + letras[i];
            }
        }
        System.out.println(resultado);
    }
    public void rule(){
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        String colores[] = {"rojo", "negro"};
        Integer numeros[] = new Integer[37];

        for (int i=0; i < numeros.length; i++){
            numeros[i] = i;
        }

        String pares[] = {"par", "impar"};

        System.out.println("Numero (0 - 36)");
        int num = teclado.nextInt();

        boolean numero_existe = Arrays.asList(numeros).contains(num);
        String color = "";
        String tipo = "";

        if (!numero_existe){
            System.out.println("ERROR. El número no es válido.");
            return;
        }else {
            if (num != 0){
                System.out.println("Dime un color (rojo / negro)");
                color = teclado.next();
            }

            boolean color_existe = Arrays.asList(colores).contains(color);

            if (!color_existe){
                System.out.println("ERROR. EL color cno es válido.");
                return;
            }else {
                System.out.println("Elige el tipo de número (par / impar)");
                tipo = teclado.next();

                boolean tipo_existe = Arrays.asList(pares).contains(tipo);

                if (!tipo_existe){
                    System.out.println("ERROR. El número no es correcto");
                    return;
                }
            }
        }

        int numero_sorteo = numeros[random.nextInt(37)];
        String color_sorteo = colores[random.nextInt(2)];
        String pare_sorteo = "";
        if (numero_sorteo%2 == 0){
            pare_sorteo = "par";
        }else {
            pare_sorteo = "impar";
        }
    }
}
