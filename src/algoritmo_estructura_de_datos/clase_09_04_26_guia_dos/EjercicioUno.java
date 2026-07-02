package algoritmo_estructura_de_datos.clase_09_04_26_guia_dos;

import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numeroUno;
        int numeroDos;
        int numeroTres;
        int numeroCuatro;
        int promedio;

        System.out.println("------------------------------------------------------------------------------");

        System.out.println("Vamos a determinar si el promedio de los numeros ingresados es mayor a 30.");

        System.out.println("Ingrese el valor del numero uno: ");
        numeroUno = teclado.nextInt();

        System.out.println("Ingrese el valor del numero dos: ");
        numeroDos = teclado.nextInt();

        System.out.println("Ingrese el valor del numero tres: ");
        numeroTres = teclado.nextInt();

        System.out.println("Ingrese el valor del numero cuatro: ");
        numeroCuatro = teclado.nextInt();

        System.out.println("------------------------------------------------------------------------------");

        promedio = (numeroUno + numeroDos + numeroTres + numeroCuatro) / 4;
        if (promedio > 30) {
            System.out.println("El promedio es mayor a 30. El promedio es: " + "[" + promedio + "]");
        } else
            System.out.println("El promedio es menor a 30. El promedio es: " + "[" + promedio + "]");

    }
}
