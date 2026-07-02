package algoritmo_estructura_de_datos.clase_09_04_26_guia_dos;

import java.util.Scanner;

public class EjercicioOnce {

    public static void main(String[] args) {

        System.out.println("Este programa verifica que tipo de triangulo es: ");
        int lado1, lado2, lado3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la medida del lado 1: ");
        lado1 = teclado.nextInt();
        System.out.println("Ingrese la medida del lado 2: ");
        lado2 = teclado.nextInt();
        System.out.println("Ingrese la medida del lado 3: ");
        lado3 = teclado.nextInt();

        if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("Triángulo Equilátero");
        } else {
            if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("Triángulo Isósceles");
            } else {
                System.out.println("Triángulo Escaleno");
            }
        }

    }
}
