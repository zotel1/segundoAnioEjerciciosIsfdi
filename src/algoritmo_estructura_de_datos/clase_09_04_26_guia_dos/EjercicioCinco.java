package algoritmo_estructura_de_datos.clase_09_04_26_guia_dos;

import java.util.Scanner;

public class EjercicioCinco {

    /*Determinar si un número es mayor que 5 y en caso de que sea menor,
        determinar si es positivo o no.
        */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numeroIngresado;

        System.out.println("Ingrese un numero: ");
        numeroIngresado = teclado.nextInt();

        if (numeroIngresado > 5) {
            System.out.println("El número ingresado es mayor a 5! El número ingresado es: " + numeroIngresado);
        } else {
            if (numeroIngresado < 5 && numeroIngresado > 0) {
                System.out.println("El número ingresado es positivo, su numero es: " + numeroIngresado);
            } else {
                if (numeroIngresado < 5 && numeroIngresado < 0) {
                    System.out.println("El número ingresado es negativo,  su numero es: " + numeroIngresado);
                } else {
                    System.out.println("Ingrese un número por favor.");
                }
            }
        }
    }
}
