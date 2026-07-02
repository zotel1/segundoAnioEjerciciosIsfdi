package algoritmo_estructura_de_datos.clase_16_04_26_guia_tres;

import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {

        //Escribir un programa que pida al usuario un número entero positivo y muestre por
        //pantalla la cuenta atrás desde ese número hasta cero separados por comas.

        Scanner teclado = new Scanner(System.in);
        int numeroIngresado;
        System.out.println("Ingrese un numero entero positivo: ");
        numeroIngresado = teclado.nextInt();

        if (numeroIngresado < 1) {
            System.out.println("¡Debe ingresar un número mayor a 1!");
        } else {
            System.out.println("Los numeros anteriores al número: " +  numeroIngresado + " son: ");
            for (int i = 1 ; i <= numeroIngresado ; i++) {
                int numerosAnt = i -1;
                System.out.println(numerosAnt);

            }
        }
    }
}
