package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cuadrado {
    static Scanner teclado;

    public static void main (String[] args){
        int mumero = pedirNum();
        boolean verdadero = validarNum(numero);
    }

    public static int pedirNum(){
        System.out.println("Dime un número: ");
        int num ;

        try {
            num = teclado.nextInt();
        }catch (InputMismatchException e){
            System.out.println("ERROR: Formato incorrecto");
            num = -1;
        }

        return num;
    }

    public static boolean validarNum(int num){
        if (Integer.toString(num).matches("\\d{1,8}") || Integer.toString(num).matches("-\\d{1,8}")){
            return true;
        }else {
            return false;
        }
    }

    public static int calcularNum(int num){
        return num * num;
    }
}
