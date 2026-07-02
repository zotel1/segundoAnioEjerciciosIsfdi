package algoritmo_estructura_de_datos.guia_seis.arreglos.ordenamiento;

public class Ejercicio_nueve {
    public static void main(String[] args) {
        // Un campeonato escolar registra los puntos obtenidos por cada equipo:
        //Equipos:
        //Rojo Azul Verde Amarillo
        //Puntos:
        //15 22 18 10
        //La organización necesita publicar automáticamente la tabla de
        //posiciones.

        String[] colorEquipos = new String[4];
        colorEquipos[0] = "Rojo";
        colorEquipos[1] = "Azul";
        colorEquipos[2] = "Verde";
        colorEquipos[3] = "Amarillo";

        int[] ordenEquipos = new int[4];
        ordenEquipos[0] = 0;
        ordenEquipos[1] = 1;
        ordenEquipos[2] = 2;
        ordenEquipos[3] = 3;

        int[] puntos = new int[4];
        puntos[0] = 15;
        puntos[1] = 22;
        puntos[2] = 18;
        puntos[3] = 10;

        System.out.println("Los puntos de los equipos son: ");
        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Equipo " + colorEquipos[i] + " hizo " + puntos[i] + " puntos.");
        }

        System.out.println("----------------------------------------");
        System.out.println("La tabla de posiciones actual es: ");
        for (int i = 0; i < puntos.length; i++) {
            for (int j = 0; j < puntos.length - 1; j++) {
                int auxPuntos = 0;
                int auxOrden = 0;
                if (puntos[j] < puntos[j + 1]) {
                    auxPuntos = puntos[j];
                    puntos[j] = puntos[j + 1];
                    puntos[j + 1] = auxPuntos;

                    auxOrden = ordenEquipos[j];
                    ordenEquipos[j] = ordenEquipos[j + 1];
                    ordenEquipos[j + 1] = auxOrden;
                }
            }
        }

        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Equipo " + colorEquipos[ordenEquipos[i]] + " hizo " + puntos[i] + " puntos.");
        }
    }
}
