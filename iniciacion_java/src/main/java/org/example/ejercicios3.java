package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicios3 {
    public void ej3(){
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        int voto = 18;
        int resto = 0;

        System.out.println("Introduce tu nombre");
        nombre = entrada.nextLine();
        System.out.println("Hola " + nombre + " dime tu edad");
        edad = entrada.nextInt();
        if (edad >= voto){
            System.out.println("Enhorabuena " + nombre + ". Puedes votar");
        }else{
            resto = voto - edad;
            System.out.println("Lo siento " + nombre + ". No puedes votar");
            System.out.println("Te faltan " + resto + " años para ser ,mayor de edad");
        }
    }
}
