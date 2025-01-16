package org.example;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Recursividad {

    static Scanner teclado = new Scanner(System.in);
    static char palabraChar[] = null;
    static int numero;
    static String palabra;

    public static void main (String[] args) throws IOException, InterruptedException {

        imprimirMenu();
    }

    public static void borrar() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }

    public static void imprimirMenu(){

        System.out.flush();
        System.out.println("*** Batería de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieras ejecutar");
        System.out.println("    1 - Dígitos");
        System.out.println("    2 - Potencias");
        System.out.println("    3 - Del Revés");
        System.out.println("    4 - Número Binario");
        System.out.println("    5 - Conversión a Binario");
        System.out.println("    6 - Orden Alfabético");
        System.out.println("    7 - Suma de Números");
        int opc = teclado.nextInt();

        eleccionUsuario(opc);
    }

    public static void eleccionUsuario (int opc){
        switch (opc){
            case 1:
                System.out.println("\n1 - Dígitos");
                System.out.println("Dime un número: ");

                try{
                    numero = teclado.nextInt();
                }catch (InputMismatchException e1){
                    System.out.println("ERROR");
                    System.exit( 1);
                }

                System.out.println(digitos(numero));

                eleccionUsuario2();
                break;
            case 2:
                System.out.println("\n2 - Potencias");
                System.out.println("Dime la base: ");
                int base = 0;

                try{
                    base = teclado.nextInt();
                }catch (InputMismatchException e1){
                    System.out.println("ERROR");
                    System.exit( 1);
                }

                System.out.println("Dime el exponente: ");
                int expo = 0;

                try{
                    expo = teclado.nextInt();
                }catch (InputMismatchException e1){
                    System.out.println("ERROR");
                    System.exit( 1);
                }

                System.out.println(elevarNum(base, expo));

                eleccionUsuario2();
                break;
            case 3:
                System.out.println("\n3 - Del Revés");
                System.out.println("[1] - Palabra | [2] - Número");
                int eleccion = teclado.nextInt();

                if (eleccion==1){

                    System.out.println("Dime una palabra: ");
                    palabra = teclado.next();
                    palabraChar = palabra.toCharArray();
                    textdelReves(palabraChar.length -1);

                } else if (eleccion==2){

                    System.out.println("Dime un número: ");
                    try{
                        numero = teclado.nextInt();
                    }catch (InputMismatchException e1){
                        System.out.println("ERROR");
                        System.exit( 1);
                    }
                    numdelReves(numero);

                }else break;

                eleccionUsuario2();
                break;
            case 4:
                System.out.println("\n4 - Número Binario");
                System.out.println("Dime un número binario");
                try{
                    numero = teclado.nextInt();
                }catch (InputMismatchException e1){
                    System.out.println("ERROR");
                    System.exit( 1);
                }

                boolean binario = numBinario(numero);

                if (binario){
                    System.out.println("Correcto!");
                }else{
                    System.out.println("No es binario");
                }

                eleccionUsuario2();
                break;
            case 5:
                System.out.println("\n5 - Conversión a Binario");
                System.out.println("Dime un número");
                try{
                    numero = teclado.nextInt();
                }catch (InputMismatchException e1){
                    System.out.println("ERROR");
                    System.exit( 1);
                }

                if (numero == 0 || numero == 1){
                    System.out.println(numero);
                }else{
                    System.out.println(numBinario2(numero));
                }

                eleccionUsuario2();
                break;
            case 6:
                System.out.println("\n6 - Orden Alfabético");
                System.out.println("Dime una palabra");
                palabra = teclado.next();
                palabraChar = palabra.toCharArray();

                if (ordenada(0)){
                    System.out.println("Tu palabra está ordenada!");
                }else{
                    System.out.println("Tu palabra está desordenada!");
                }

                eleccionUsuario2();
                break;
            case 7:
                System.out.println("\n7 - Suma de Números");
                System.out.println("Dime un número");
                try{
                    numero = teclado.nextInt();
                }catch (InputMismatchException e1){
                    System.out.println("ERROR");
                    System.exit( 1);
                }

                System.out.println(sumar(numero));

                eleccionUsuario2();
                break;
        }
    }

    public static void eleccionUsuario2(){

        System.out.println("\nElige una opción:");
        System.out.println("    1 - Menú Principal");
        System.out.println("    2 - Salir");

        int opc = teclado.nextInt();

        if (opc == 1){
            imprimirMenu();
        }else if (opc == 2){
            System.exit(0);
        }else {
            System.out.println("ERROR");
            System.exit(1);
        }

    }

    public static int digitos(int numero){

        if(numero<10 && numero>=0){
            return 1;
        }
        return 1 + digitos(numero/10);
    }

    public static int elevarNum(int base, int exponente){

        if(exponente==0){
            return 1;
        }
        return base*elevarNum(base,--exponente);
    }

    public static void numdelReves(int numero){

        if(numero>= 0 && numero<10){
            System.out.print(numero);
        }else{
            System.out.print(numero%10);
            numdelReves(numero/10);
        }
    }

    public static void textdelReves(int posicion){

        if (posicion==0){
            System.out.print(palabraChar[posicion]);
        }else{
            System.out.print(palabraChar[posicion]);
            textdelReves(posicion-1);
        }
    }

    public static boolean numBinario(long numero){

        if(numero > 9){
            if(numero%10==0 || numero%10==1){
                return numBinario(numero/10);
            }else{
                return false;
            }
        }

        if(numero==0 || numero==1){
            return true;
        }else{
            return false;
        }
    }

    public static String numBinario2(int numero){

        if(numero==0 || numero==1){
            return Integer.toString(numero);
        }else{
            return numBinario2(numero/2)+numero%2;
        }
    }

//    public static int numBinario3(int numero){
//
//        if(numero==0 || numero==1){
//            return numero;
//        }else{
//            return numero%2+10*numBinario3(numero/2);
//        }
//    }

    public static boolean ordenada(int posicion){

        if (posicion<palabraChar.length-1){
            if(palabraChar[posicion]<=palabraChar[posicion+1]){
                return ordenada(posicion+1);
            }else{
                return false;
            }
        }
        return true;
    }

    public static int sumar(int numero){
        if(numero==0) {
            return 0;
        }else{
            return numero+sumar(numero-1);
        }
    }
}