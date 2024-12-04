package org.example;

public class PruebaVarargs {
    public static void principal(){

        String nombres[] = prueba("Pepe", "Miguel", "David", "Ismael", "Cesar", "Alejandra");
    }

    public static String[] prueba(String... nombres){
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Alumno " + i + ": " + nombres[i]);
        }

        return nombres;
    }
}
