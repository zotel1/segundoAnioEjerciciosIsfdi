package algoritmo_estructura_de_datos.clase_09_04_26_guia_dos;

import java.util.Scanner;

public class EjercicioSeis {

    public static void main(String[] args) {
        /*Pide los valores de dos números e imprime el mayor de ellos.
        Si los números son iguales, debe imprimir Números iguales*/

        int primerNumero, segundoNumero;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        primerNumero = teclado.nextInt();

        System.out.println("Ingrese el segundo número: ");
        segundoNumero = teclado.nextInt();

        if (primerNumero == segundoNumero) {
            System.out.println("Los números son iguales");
        } else {
            if (primerNumero > segundoNumero) {
                System.out.println("El primer numero es mayor que el segundo, el número es: " + primerNumero);
            } else {
                if (primerNumero < segundoNumero) {
                    System.out.println("El segundo número es mayor que el primer número: " + segundoNumero);
                }

            }
        }
        System.out.println("Finalizando aplicación...");
    }
}
