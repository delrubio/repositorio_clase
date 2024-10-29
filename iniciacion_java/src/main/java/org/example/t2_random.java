package org.example;

import java.util.Random;

public class t2_random {
    public void ejercicio1(){
        Random random = new Random();

        int num1 = random.nextInt();
        int num2 = random.nextInt();

        num1 = random.nextInt(6) + 1;
        num2 = random.nextInt(6) + 1;

        System.out.println(num1);
        System.out.println(num2);

        System.out.println(num1 + num2);
    }
    public void ejercicio2(){
        
    }
}
