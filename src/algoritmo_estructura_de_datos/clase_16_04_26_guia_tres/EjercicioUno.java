package algoritmo_estructura_de_datos.clase_16_04_26_guia_tres;

import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {
        // Escribir un programa que pida al usuario un número entero positivo y muestre por
        //pantalla todos los números impares desde 1 hasta ese número separados por comas.

        Scanner teclado = new Scanner(System.in);
        int numeroEntero;
        System.out.println("Ingrese un numero entero positivo");
        numeroEntero  = teclado.nextInt();

        if (numeroEntero < 1) {
            System.out.println("El numero ingresado debe ser mayor a 0");
        } else {
            for (int i = 0; i < numeroEntero; i++) {
                if (i % 2 == 1) {
                    System.out.println("Los numeros impares antes que tu numero ingresados son: " + i);
                }

            }
        }

        System.out.println("Fin de la aplicación...");
    }
}
