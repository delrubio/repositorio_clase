package org.example;

import java.util.Scanner;

public class ejerciciosMetodos {
    public static void ejercicio1(){
        pedirNum();
        int num = numUsuario();
        calculos(num);
    }

    public static void pedirNum(){
        System.out.println("Dime un número: ");
    }

    public static int numUsuario(){
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();

        return num;
    }

    public static int calculos(int num){
        System.out.println("El número elevado al cubo es: " + (num * num * num));
        return num;
    }

    public static void ejercicio2(){
        String cadena = cadenaUsuario();
        String cadenaMayus = cadenaMayus(cadena);
        cadenaVocales(cadenaMayus);
    }

    public static String cadenaUsuario(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de letras: ");
        String cadena = teclado.next();

        return cadena;
    }

    public static String cadenaMayus(String cadena){
        String cadenaMayus = cadena.toUpperCase();

        System.out.println("La cadena en MAYÚSCULA es " + cadenaMayus);

        return cadenaMayus;
    }

    public static void cadenaVocales(String cadenaMayus){
        int contador = 0;
        for (int i = 0; i < cadenaMayus.length(); i++) {
            char caracter = cadenaMayus.charAt(i);
            String charString = Character.toString(caracter);

            if (charString.equals("A") || charString.equals("E") || charString.equals("I") || charString.equals("O") || charString.equals("U")){
                contador ++;
            }else {
                continue;
            }
        }
        System.out.println("Hay vocales " + contador);
    }
}
