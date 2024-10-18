package org.example;

import java.util.Scanner;

public class t2_bucles {
    public void ejercicio2(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numero = teclado.nextInt();

        for (int i=numero; i>=1; i--){
            if (i%2 == 0){
                System.out.println(i);
            }

        }


    }
}
