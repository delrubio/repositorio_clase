package org.example;

import java.util.Random;
import java.util.Scanner;

public class CaraCruz {
    public static void principal(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cara o cruz?");
        String opcion = teclado.next();

        String resultado = sorteo();

        comprobarOpcion(resultado, opcion);
    }

    public static void comprobarOpcion(String resultado, String opcion){
        //NO IMPORTA QUE SE LE CAMBIEN EL NOMBRE A LAS VARIABLES, PERO EL ORDEN TIENE QUE SER EL CORRECTO
        if (resultado.equals(opcion)){
            System.out.println("Has ganado");
        }else{
            System.out.println("Has perdido");
        }
    }

    public static String sorteo(){
        Random random = new Random();
        String opciones[] = {"cara", "cruz"};

        String resultado = opciones[random.nextInt(2)];

        return resultado;
    }
}
