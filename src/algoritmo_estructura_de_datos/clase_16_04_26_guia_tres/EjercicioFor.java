package algoritmo_estructura_de_datos.clase_16_04_26_guia_tres;

import java.util.Scanner;

public class EjercicioFor {

    public static void main(String[] args) {
        int mayor;
        int edad;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la edad de 3 personas");

        mayor = 0;

        for (int i = 1; i <= 3; i++) {
            edad = teclado.nextInt();
            System.out.println("La eda de la persona es: " + edad);
            if (edad > mayor) {
                mayor = edad;
            }
        }
        System.out.println("El mayor de edad es: " + mayor);
    }
}
