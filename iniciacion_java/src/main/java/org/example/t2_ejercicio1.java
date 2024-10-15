package org.example;

import java.util.Scanner;

public class t2_ejercicio1 {
    public void practica1(){

        Scanner entrada = new Scanner(System.in);//Para poder coger lo que el usuario introduzca en una variable
        String date;
        int dd = 0;
        int mm = 0;
        int yy = 0;
        int suma = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/yyyy)");
        date = entrada.nextLine();
        while (date.length() != 10 || date.charAt(2) != '/'|| date.charAt(5) != '/') { //El total de los caracteres tiene que ser 10 y tiene que tenr 1 / en la posición 2 y 5
            System.out.println("Introduce tu fecha de nacimiento (dd/mm/yyyy)"); //Si algo no es correcto lo vuelvo a pedir hasta que no falle
            date = entrada.nextLine();
        }

        String dd_tmp = date.substring(0, 2); //Separo el dia
        String mm_tmp = date.substring(3, 5); //Separo el mes
        String yy_tmp = date.substring(6, 10); //Separo el año
        dd = Integer.parseInt(dd_tmp); //Converto en variable int
        mm = Integer.parseInt(mm_tmp); //Converto en variable int
        yy = Integer.parseInt(yy_tmp); //Converto en variable int

        while (dd < 1 || dd > 31) { //Hago un bucle para comprobar que el día sea correcto
            System.out.println("Introduce el día que naciste (dd)");
            dd = entrada.nextInt();
        }while (mm < 1 || mm > 12) { //Hago otro bucle para comprobar que el mes sea correcto
            System.out.println("Introduce el mes que naciste (mm)");
            mm = entrada.nextInt();
        }while (yy < 1800 || yy > 2024) {//El ultimo bucle para comprobar que el año sea correcto
            System.out.println("Introduce el año que naciste (yyyy)");
            yy = entrada.nextInt();
        }

        System.out.println("Tu fecha es: " + dd + "/" + mm + "/" + yy); //Muestro la fecha introducida por el usuario
        suma = (dd + mm + yy); //Sumamos la fecha
        System.out.println("La suma de tu fecha es: " + dd + "+" + mm + "+" + yy + "=" + suma); //Muestro el resultado de la suma de la fecha
        String suma_tmp = Integer.toString(suma); //Converto el resultado a string
        String num1_tmp = suma_tmp.substring(0, 1); //Sacamos cada caracter del resultado en una variable _tmp
        String num2_tmp = suma_tmp.substring(1, 2);
        String num3_tmp = suma_tmp.substring(2, 3);
        String num4_tmp = suma_tmp.substring(3, 4);
        num1 = Integer.parseInt(num1_tmp); //Convierto los _tmp en int en cada variable que corresponde
        num2 = Integer.parseInt(num2_tmp);
        num3 = Integer.parseInt(num3_tmp);
        num4 = Integer.parseInt(num4_tmp);
        int suma2 = (num1 + num2 + num3 + num4); //Sumo los número para saber el número de la suerte
        System.out.println("La suma es: " + num1 + "+" + num2 + "+" + num3 + "+" + num4 + "=" + suma2); //Muestro el orden de la suma de los números
        System.out.println("Tu numero de la suerte es: " + suma2); //Por último enseñamos el número de la suerte
    }
}
