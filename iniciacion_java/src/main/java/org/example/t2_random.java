package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class t2_random {
    public void ejercicio1(){
        Random random = new Random();

        int num1 = random.nextInt();
        int num2 = random.nextInt();

        num1 = random.nextInt(6) + 1;
        num2 = random.nextInt(6) + 1;

        System.out.println(num1);
        System.out.println(num2);

        System.out.println(num1 + num2);
    }
    public void ejercicio2(){
        Random random = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String pass = "";

        for(int i = 0; i < 8; i++){
            int valor = random.nextInt(caracteres.length()) ;
            pass += caracteres.charAt(valor);
        }
        System.out.println("La contraseña generadas es: "+ pass);
    }
    public void ejercicio3(){
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        int max = 1;
        int min = 0;
        int nums =0;
        int num = 0;

        boolean error = true;

        while (error = true){
            try {
                while (max <= min) {
                    System.out.println("Introduce un número máximo: ");
                    max = entrada.nextInt();
                    System.out.println("Introduce el número mínimo: ");
                    min = entrada.nextInt();
                }
                System.out.println("Cuantos número aleatorios quieres: ");
                nums = entrada.nextInt();
                for (int i = 0; i < nums; i++){
                    num = random.nextInt((max - min) + 1) + min;
                    System.out.println(num);
                }
            }catch (InputMismatchException e1){
                System.out.println("ERROR. Has introducido un carácter mal." + e1);
                entrada.nextLine();
            }
        }
    }
    public void ejercicio4(){
        Random random = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int longitud = random.nextInt(3) + 6;

        String pass = "";

        for(int i = 0; i<longitud; i++){
            int valor = random.nextInt(caracteres.length()) ;
            pass += caracteres.charAt(valor);

        }
        System.out.println("La contraseña generadas es: "+ pass);
    }
}
