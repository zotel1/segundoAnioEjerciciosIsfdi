package algoritmo_estructura_de_datos.clase_09_04_26_guia_dos;

import java.util.Scanner;

public class EjercicioOcho {

    public static void main(String[] args) {
        /*Escribir un programa que,
        dado un color en la variable color escriba por pantalla:
        bonito color, si el color es azul; mi favorito,
        si el color es naranja y no me gusta ese color,
*/
        Scanner teclado = new Scanner(System.in);
        String colorIngresado;
        System.out.println("Ingresa un color: ");
        colorIngresado = teclado.nextLine();

        if (colorIngresado.equals("azul")) {
            System.out.println(colorIngresado + " Es mi color favorito!");
        } else {
            if (colorIngresado.equals("naranja")) {
                System.out.println(colorIngresado + ", no me gusta ese color.");
            }
            else {
                System.out.println("El color "+ colorIngresado + ", es un bonito color.");
            }
        }
    }
}
