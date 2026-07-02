package algoritmo_estructura_de_datos.clase_16_04_26_guia_tres;

import java.util.Scanner;

public class EjercicioCondicional {

    public static void main(String[] args) {

        // Identificar que persona de 3 personas tiene mayor edad

        int mayor;
        int edadUno;
        int edadDos;
        int edadTres;

        System.out.println("Primera persona, ingrese su edad... ¿Cuantos años tiene?: ");
        Scanner teclado = new Scanner(System.in);
        edadUno = teclado.nextInt();

        System.out.println("Segunda persona, ingrese su edad... ¿Cuantos años tiene?: ");
        edadDos = teclado.nextInt();

        System.out.println("Tercera persona, ingrese su edad... ¿Cuantos años tiene?: ");
        edadTres = teclado.nextInt();

        if ((edadUno > edadDos) && (edadUno > edadTres)) {
            mayor = edadUno;
        } else {
            if ((edadDos > edadTres) &&  (edadDos > edadUno)) {
                mayor = edadDos;
            } else  {
                mayor = edadTres;
            }
        }
        System.out.println("El mayor es: " + mayor);
    }
}
