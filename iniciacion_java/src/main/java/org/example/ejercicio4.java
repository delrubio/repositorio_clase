package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio4 {
    public void ej4(){
        Scanner entrada = new Scanner(System.in);
        int mult1 = 0;
        int mult2 = 0;
        int result = 0;

        boolean error = false;

        while(error == false){
            try{
                System.out.println("Introduce el multiplicando (3 cifras)");
                mult1 = entrada.nextInt();
                System.out.println("Introduce el multiplicador (3 cifras)");
                mult2 = entrada.nextInt();
                error = true;
            }catch(InputMismatchException er) {
                System.out.println("ERROR. Introduce un valor válido");
            }
        }
        String numC = Integer.toString(mult2); //convertimos el número a carácter
        String numC_1 = numC.substring(0,1); //cogemos la primera cifra (desde posión 0 hasta 1)
        String numC_2 = numC.substring(1,2); //cogemos la primera cifra (desde posión 0 hasta 2)
        String numC_3 = numC.substring(2,3); //cogemos la primera cifra (desde posión 0 hasta 3)
        int num1 = Integer.parseInt(numC_1); //convertimos a entero la cifra que hemos cogido, con la que podríamos hacer algún cálculo que necesitemos
        int num2 = Integer.parseInt(numC_2);
        int num3 = Integer.parseInt(numC_3);
        result = mult1 * mult2;
        System.out.println("El producto de la multiplicación es " + result);
        System.out.println("El proceso es:");
        System.out.println("  " + mult1);
        System.out.println("x " + mult2);
        System.out.println("-------");
        System.out.println("  " + mult1 * num1);
        System.out.println(" " + mult1 * num2);
        System.out.println(mult1 * num3);
        System.out.println("-------");
        System.out.println(result);
    }
}
