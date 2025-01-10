package org.example;

import java.io.IOException;
import java.util.Scanner;

public class ej_recursivos {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int base = 2;
        int exponente = 4;
        System.out.println(potencia(base, exponente));
//        int num = pedirNumero;
//        if(num == 0){
//            System.out.println("1");
//        }else{
//            digitos(num);
//        }
    }

    public static void borrar() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

    }

    public static int pedirNumero(){
        int numero = 0;

        try {
            System.out.println("Dime un número");
            numero = teclado.nextInt();
        }catch (NumberFormatException e1){
            System.out.println("ERROR");
        }
        return numero;
    }

    public static int digitos(int num){
        if (num < 10) {
            return 1;
        }

        return 1 + digitos(num/10);
    }

    public static int potencia(int base, int exponente){
        if (exponente==0){
            return 1;
        }

        return base*potencia(base, --exponente);
    }
}
