package algoritmo_estructura_de_datos.guia_seis.arreglos.busqueda;

import java.util.Scanner;

public class Ejercicio_ocho {
    public static void main(String[] args) {
        // Una escuela guarda los números de legajo de sus estudiantes en un vector.
        //1023 1045 1078 1102 1156
        //El usuario ingresa un legajo.
        //El programa debe:
        // Buscar el legajo.
        // Informar si existe.
        // Mostrar su posición.
        // Contar cuántas comparaciones realizó.

        int[] legajos = new int[5];
        legajos[0] = 1023;
        legajos[1] = 1045;
        legajos[2] = 1078;
        legajos[3] = 1102;
        legajos[4] = 1156;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el numero de legajo que desea buscar: ");
        int buscado = teclado.nextInt();

        int inicio = 0;
        int fin = legajos.length - 1;

        boolean encontrado = false;
        int posicion = -1;
        int comparaciones = 0;

        while (inicio <= fin) {

            int medio = (inicio + fin) / 2;

            comparaciones++;

            if (legajos[medio] == buscado) {
                encontrado = true;
                posicion = medio;
                break;
            } else if (buscado > legajos[medio]) {
                inicio = medio + 1;
            } else {
                fin = medio -1;
            }
        }
        System.out.println("-------------------------------------------");

        if (encontrado) {
            System.out.println("Legajo encontrado.");
            System.out.println("Posición: " + posicion);
        } else {
            System.out.println("El legajo no existe.");
        }

        System.out.println("Comparaciones realizadas: " + comparaciones);

        teclado.close();
    }
}
