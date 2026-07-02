package algoritmo_estructura_de_datos.guia_seis.arreglos.busqueda;

import java.util.Random;

public class Ejercicio_uno {
    public static void main(String[] args) {
        // 1. Un profesor registra la asistencia de 30 estudiantes durante un día. En un vector se
        //almacena los datos de la siguiente manera:
        // 1 = presente
        // 0 = ausente
        //Determinar:
        // Cuántos estudiantes estuvieron presentes
        // Cuántos faltaron
        // En qué posiciones aparecen los ausentes
        // Existe algún estudiante ausente

        // 1 = presente
        // 0 = ausente

        int[] asistencia = new int[30];
        Random random = new Random();

        for (int i = 0; i < asistencia.length; i++) {
            asistencia[i] = random.nextInt(2);
        }

        int presentes = 0, ausentes = 0;

        System.out.println("Visualizamos cuantos estudiantes estuvieron presentes estos se representanm con un 1 y representamos a los estudiantes estuvieron ausentes 0");
        for (int i = 0; i < asistencia.length; i++) {
            System.out.print(asistencia[i] + " ");
        }
        System.out.println(" ");

        System.out.println("Posiciones de los estudiantes ausentes: ");
        for (int i = 0; i < asistencia.length; i++) {
            if (asistencia[i] == 1) {
                presentes++;
            } else {
                ausentes++;
                System.out.println("Estudiante ausente en la posición: " + i);
            }
        }

        System.out.println("-----------------------------");
        System.out.println("Cantidad de estudiantes presentes: " + presentes);
        System.out.println("Cantidad de estudiantes ausentes: " + ausentes);

        if (ausentes > 0) {
            System.out.println("Existe al menos un estudiante ausente.");
        } else {
            System.out.println("Todos los estudiantes estuvieron presentes.");
        }

    }
}
