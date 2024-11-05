package org.example;

import java.util.Random;
import java.util.Scanner;

public class vectores {
    public void vectores(){

        int vector[];
        vector = new int[7];

        vector[2] = 7;
        vector[5] = vector[2]+4;
        vector[1] = vector[5]-7;

        System.out.println(vector[2] + " " + vector[5]);

        for (int i=0; i<vector.length; i++){
            System.out.print(" " + vector[i] + ", ");
        }

        String palabras[] = new String[3];

        for (int i=0; i<palabras.length; i++){
            System.out.print(" " + palabras[i] + ", ");
        }
    }
    public void ejercicio1(){

        Random random = new Random();

        int numeros[] = new int[8];
        int suma=0;

        for (int i=0; i<numeros.length; i++){
            numeros[i] = random.nextInt(501);
            suma+=numeros[i];
        }

        System.out.println("La suma de todos los elementos es " + suma);
    }
    public void ejercicio2(){

        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[5];

        System.out.println("Dime un número para invertirlos: ");

        for (int i=0; i<numeros.length; i++){
            numeros[i] = teclado.nextInt();
        }

        for (int i=numeros.length-1; i>=0; i--){
            System.out.print(" " + numeros[i] + ", ");
        }
    }
    public void ejercicio3(){}
}
