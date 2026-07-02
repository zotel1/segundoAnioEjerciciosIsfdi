package algoritmo_estructura_de_datos.clase_23_04_26_guia_tres;

import java.util.Scanner;

public class EjercicioCinco {

    //Pedir a un usuario que ingrese un numero e identifique si es primo o no.

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int ingresoNumerico;
        int contadorDivisores = 0;

        System.out.println("Ingrese un numero: ");
        ingresoNumerico = teclado.nextInt();

        if (ingresoNumerico <= 1) {
            System.out.println("No es un numero primo.");
        } else {
            for (int i = 1; i <= ingresoNumerico; i++) {
                if (ingresoNumerico % i == 0) {
                    contadorDivisores = contadorDivisores + 1;
                }
            }

            if (contadorDivisores == 2) {
                System.out.println("El numero " + ingresoNumerico + " es primo");
            } else {
                System.out.println("El numero " + ingresoNumerico + " es compuesto");
            }
        }
    }
}