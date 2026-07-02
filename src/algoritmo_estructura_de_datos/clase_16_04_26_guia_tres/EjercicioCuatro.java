package algoritmo_estructura_de_datos.clase_16_04_26_guia_tres;

import java.util.Scanner;

public class EjercicioCuatro {

    /*
    * Escribir un programa que pida al usuario un número entero y muestre por pantalla
un triángulo rectángulo como el de más abajo, de altura el número introducido.
*
**
***
****
*****
*/

    public static void main(String[] args) {

        int ingreseNumero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número");
        System.out.println("El mismo sera la altura del triangulo rectangulo.");

        ingreseNumero = teclado.nextInt();

        for (int i = 1; i <= ingreseNumero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
        }
            System.out.println("");
        }
    }
}

