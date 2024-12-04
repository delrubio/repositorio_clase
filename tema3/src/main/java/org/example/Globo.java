package org.example;


import java.util.Scanner;

public class Globo {
    public static void glovo(){

        imprimirMenu();
        int opcion = elecionUsuario();
        comprobarOpcion(opcion);

    }

    public static void imprimirMenu(){
        System.out.println("Bienvenido a GLOVO APP");
        System.out.println("¿Que quieres comprar?");
        System.out.println("  1. Comida");
        System.out.println("  2. Bebida");
        System.out.println("  0. Salir");
    }

    public static int elecionUsuario(){

        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();

        return opcion;
    }

    public static void comprobarOpcion(int opcion){
        String pedido = "";

        if (opcion == 1){
            pedido = comida();
        } else if (opcion == 2) {
            pedido = bebida();
        } else if (opcion == 0) {
            System.exit(0);
        }else {
            System.out.println("Opción no VÁLIDA");
            System.exit(0);
        }
        System.out.println("Has pedido " + pedido);
    }

    public static String comida(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Que quieres para comer?");
        String eleccion = teclado.next();

        return eleccion;
    }

    public static String bebida(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Que edad tienes?: ");
        int edad = elecionUsuario();

        String eleccion = "";

        if (edad >= 18){
            eleccion = comida();
        }else {
            System.out.println("No puedes beber alchol");
        }

        return eleccion;
    }
}