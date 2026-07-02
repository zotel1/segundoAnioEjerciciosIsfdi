package clase_26_05;
//Constantes de linea(metodos), como se define la estructuras, caracteristicas,

import java.util.Scanner;

public class ejercicioUno {

    public static void main(String[] args) {
        // Declaracion de variables
        float num1, num2, num3;
        float suma, promedio;
        Scanner teclado = new Scanner(System.in);

        // Entrada de datos
        System.out.printf("Ingrese el primer número: ");
        num1 = teclado.nextInt();

        System.out.printf("Ingrese el segundo número: ");
        num2 = teclado.nextInt();

        System.out.printf("Ingrese el primer número: ");
        num3 = teclado.nextInt();

        // Operaciones matemáticas
        suma = num1 + num2 + num3;
        promedio = suma/ 3;

        // Mostrar resultados
        System.out.println("La suma de los tres numeros es: " + suma);
        System.out.println("El promedio de los tres numeros es: " + promedio);

    }
}
