package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class navidad {
    public void ej_navidad(){
        Scanner teclado = new Scanner(System.in);

        final String palabra = "NAVIDAD";

        System.out.println("Introduce la cantidad de letras");
        String cantidad = teclado.nextLine();

        String cantidades[] = cantidad.split(" ");
        String letras[] = palabra.split("");

        String resultado = "";

        for (int i=0; i<letras.length; i++){
            for (int j=0; j<Integer.parseInt(cantidades[i]); j++){
                resultado = resultado + letras[i];
            }
        }
        System.out.println(resultado);
    }
    public static void rule(){
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        String colores[] = {"rojo", "negro"};
        Integer numeros[] = new Integer[37];

        for (int i=0; i < numeros.length; i++){
            numeros[i] = i;
        }

        String pares[] = {"par", "impar"};

        System.out.println("Numero (0 - 36)");
        int num = teclado.nextInt();

        boolean numero_existe = Arrays.asList(numeros).contains(num);
        String color = "";
        String tipo = "";

        if (!numero_existe){
            System.out.println("ERROR. El número no es válido.");
            return;
        }else {
            if (num != 0) {
                System.out.println("Dime un color (rojo / negro)");
                color = teclado.next();

                boolean color_existe = Arrays.asList(colores).contains(color);

                if (!color_existe) {
                    System.out.println("ERROR. EL color cno es válido.");
                    return;
                } else {
                    System.out.println("Elige el tipo de número (par / impar)");
                    tipo = teclado.next();

                    boolean tipo_existe = Arrays.asList(pares).contains(tipo);

                    if (!tipo_existe) {
                        System.out.println("ERROR. El número no es correcto");
                        return;
                    }
                }
            }
        }

        int numero_sorteo = numeros[random.nextInt(37)];
        String color_sorteo = colores[random.nextInt(2)];
        String pares_sorteo = "";
        if (numero_sorteo%2 == 0){
            pares_sorteo = "par";
        }else {
            pares_sorteo = "impar";
        }

        if(num != 0 && numero_sorteo == num && color_sorteo.equals(color) && pares_sorteo.equals(pares)){
            System.out.println("HAS GANADO");
        } else if (num != 0 && color_sorteo.equals(color)){
            System.out.println("HAS ACERTADO EL COLOR");
        } else if (num != 0 && pares_sorteo.equals(pares)){
            System.out.println("HAS ACERTADO EL TIPO");
        } else if (num==numero_sorteo && num != 0) {
            System.out.println("HAS ACERTADO SOLO EL NÚMERO");
        } else if (num == 0 && numero_sorteo == 0) {
            System.out.println("HAS GANADO Y LOS DEMÁS USUARIOS PIERDEN");
        }else {
            System.out.println("HAS PERDIDO");
        }
    }
    public static void ordenar(){

        int numeros[] = {1,6,6,8,15,1,10,8,15,7};
        int numeros_aux[] = new int[numeros.length];

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        int num = 34;
        int num_igual = 0;

        int posicion = Arrays.binarySearch(numeros, num);

        System.out.println(posicion);

//MI SOLUCIÓN
//        for (int i = 0; i < numeros.length; i ++){
//           if (num_igual != numeros[i]){
//               numeros_aux[i] = numeros[i];
//           }else {
//               continue;
//           }
//            num_igual = numeros[i];
//        }
        for (int i = 0; i < numeros.length; i ++){
            if (i!=numeros.length -1 && numeros[i] == numeros[i +1]){
                System.out.println("DUPLICADO " + numeros[i]);
            }else {
                numeros_aux[i] = numeros[i];
            }
        }
        System.out.println(Arrays.toString(numeros_aux));
    }
    public static void duplicado(){

        int numeros[] = {1,6,6,8,15,1,10,8,15,7};

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        int num = 34;
        int num_igual = 0;
        int tamanyo = 0;

        int posicion = Arrays.binarySearch(numeros, num);

        System.out.println(posicion);

//MI SOLUCIÓN
//        for (int i = 0; i < numeros.length; i ++){
//           if (num_igual != numeros[i]){
//               numeros_aux[i] = numeros[i];
//           }else {
//               continue;
//           }
//            num_igual = numeros[i];
//        }

        for (int i = 0; i < numeros.length; i ++){
            if (i!=numeros.length -1 && numeros[i] == numeros[i +1]){
                System.out.println("DUPLICADO " + numeros[i]);
                numeros[i] = 0;
            }else {
                tamanyo ++;
            }
        }

        int[] limpio = new int[tamanyo];
        int pos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != 0){
                limpio[pos] = numeros[i];
                pos ++;
            }
        }

        System.out.println(Arrays.toString(numeros));
    }
    public static void duplicado2(){
        Random random = new Random();

        int numeros[] = {1,6,6,8,15,1,10,8,15,7};

        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        boolean repetir = true;

        while (repetir){
            repetir = false;
            for (int i = 0; i < numeros.length; i++){
                if (i!=numeros.length -1 && numeros[i] == numeros[i +1]){
                    System.out.println("DUPLICADO " + numeros[i]);
                    numeros[i] = random.nextInt(49) +1;
                    repetir = true;
                }
            }
        }

        System.out.println(Arrays.toString(numeros));

    }
    public static void duplicados_district(){
        int numeros[] = {1,6,6,8,15,1,10,8,15,7};
        System.out.println(Arrays.toString(numeros));
        int limpio[] = Arrays.stream(numeros).distinct().toArray();
        System.out.println(Arrays.toString(limpio));
    }
    public static void tablas(){

    }
    public static void primos(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime un numero");
        int n = teclado.nextInt();

        antonio:
        for (int i = 2; i <= n; i++) {
            for (int j = i-1; j >= 2; j--) {
                if (i % j == 0){
                    continue antonio;
                }
            }
            System.out.print(i + " ");
        }
    }
}