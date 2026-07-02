package algoritmo_estructura_de_datos.clase_08_06_26_matrices;

import java.util.Scanner;

public class EjemploMatrices {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        int j;
        String alumnos[];
        alumnos = new String[3];
        alumnos[0]  = "Juan";
        alumnos[1]  = "Maria";
        alumnos[2]  = "Pablo";
        int notas[][];
        double promedio[];
        double suma;
        notas = new int[3][4];
        promedio =  new double[3];
        // Carga matriz por fila
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.println("Ingrese la nota del alumno " + alumnos[i]);
                notas[i][j] = teclado.nextInt();
            }
        }
        for  (i = 0; i < 3; i++) {
            suma = 0;
            for(j = 0; j < 4; j++) {
                suma = suma + notas[i][j];
            }
            promedio[i] = suma /4;
        }
        for (i = 0; i < 3; i++) {
            System.out.println("El promedio del alumno n° " + i + " es " + promedio[i]);
        }
    }
}
