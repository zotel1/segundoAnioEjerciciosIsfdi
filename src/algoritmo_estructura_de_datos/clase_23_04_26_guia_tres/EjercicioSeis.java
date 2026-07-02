package algoritmo_estructura_de_datos.clase_23_04_26_guia_tres;

import java.util.Scanner;

public class EjercicioSeis {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numeroIngresado;
        int factorial = 1;

        System.out.println("Ingrese un numero: ");
        numeroIngresado = teclado.nextInt();

        for (int i = 1; i <= numeroIngresado; i++) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numeroIngresado + " es: " + factorial);
    }
}
