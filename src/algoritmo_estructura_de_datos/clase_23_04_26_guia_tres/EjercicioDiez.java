package algoritmo_estructura_de_datos.clase_23_04_26_guia_tres;

import java.util.Scanner;

public class EjercicioDiez {

    /*Escribir un programa que calcule cual tiene la mayor edad de un grupo de 50 personas. */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int edad;
        int mayorEdad = 0;

        for (int i = 1; i <= 50; i++) {

            System.out.println("Ingrese la edad de la persona: " + i + ":");
            edad = teclado.nextInt();
            if (edad > mayorEdad) {
                mayorEdad = edad;
            }
        }
        System.out.println("La mayor edad es: " + mayorEdad);
    }
}
