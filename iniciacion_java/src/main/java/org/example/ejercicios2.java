package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicios2 {
    public void ej1(){
        Scanner entrada = new Scanner(System.in);
        float num;

        System.out.println("Introduce un número");
        num = entrada.nextInt();

        if ( num == 0){
            System.out.println("El numero es natural");
        } else if ( num < 0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es positivo");
        }
    }

    public void ej3(){
        Scanner entrada = new Scanner(System.in);

        float num1 = 0;
        float num2 = 0;
        float resultado = 0;
        float aux = 0;

        while (aux == 0) {
            try {
                System.out.println("Introduce el dividendo");
                num1 = entrada.nextInt();
                System.out.println("Introduce el divisor");
                num2 = entrada.nextInt();
                aux = 1;
            } catch (InputMismatchException er) {
                //Que le valor que introduzca sea un numero y no una letra
                System.out.println("ERROR. Introduce un valor válido");
                entrada.nextLine();
            }
        }
        if (num2 == 0){
            System.out.println("El divisor no puede ser 0.");
        }else{
            resultado = (num1/num2);
            System.out.println(resultado);
        }
    }
}
