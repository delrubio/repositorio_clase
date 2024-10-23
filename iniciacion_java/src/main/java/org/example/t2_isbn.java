package org.example;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class t2_isbn {
    public void practica3() {
        Scanner teclado = new Scanner(System.in);

        int resultado = 0;
        int num = 0;
        int mult = 10;
        int ten = 0;


        System.out.println("Dime el ISBN del libro");
        String isbn = teclado.next();
        System.out.println(isbn.length());

        for (int i=0; i<10; i++) {//hacemos un bucle for para contar caracter por caracter del 1 al 10
            String num_tmp = String.valueOf(isbn.charAt(i)); //comprobamos el valor del número actual
            char c = isbn.charAt(i); //convrtimos a caracter el numero actual
            if (i == 9 && c == 'X'){ //comprobamos si el contador va por el último número y si es una x
                ten = 10; //convertimos esa X en un 10
            }else {
                num =  parseInt(num_tmp); //convertimos el String en número int
            }
            if (mult >= 0){ //si el multiplicador que es una cuenta atrás de 10 es mayor a 0
                if (ten == 10){ //si la variable 10 es = 10, es decir que el último númro es una X
                    resultado = (resultado + (mult * ten)); //multiplicamos el contador por el número 10
                }else {
                    resultado = (resultado + (mult * num)); //si no multiplicamos el número por el multiplicador
                }
                mult--; // restamos 1 al multiplicador
            }
        }
        if (resultado%11 == 0){ //comprobamos que el resultado es multiplo de 11
            System.out.println("ISBN es correcto"); //si es correcto
        }else{
            System.out.println("ISBN Incorrecto!"); //si es incorrecto
        }
    }
}
