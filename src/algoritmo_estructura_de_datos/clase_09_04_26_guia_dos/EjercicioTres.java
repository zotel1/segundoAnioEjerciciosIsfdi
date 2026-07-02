package algoritmo_estructura_de_datos.clase_09_04_26_guia_dos;

import java.util.Scanner;

public class EjercicioTres {

    public static void main(String[] args) {
        int numeroIngresado;
        Scanner teclado = new Scanner(System.in);

        System.out.println("***************** Por favor ingrese un numero *****************");

        numeroIngresado = teclado.nextInt();

        if (numeroIngresado < 0) {
            System.out.println("El numero ingresado es negativo, su numero es: " + numeroIngresado);
        } else {
            if (numeroIngresado == 0) {
                System.out.println("El numero ingresado es cero");
            } else {
                System.out.println("El numero ingresado es positivo, su numero es: " + numeroIngresado);
            }
        }
    }



}
