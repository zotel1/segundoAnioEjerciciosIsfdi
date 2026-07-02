package algoritmo_estructura_de_datos.guia_seis.arreglos.ordenamiento;

public class Actividad_cuatro {

    public static void main(String[] args) {


        //Las temperaturas de una semana fueron:
        //tempSemanal[28, 35, 22, 31, 26, 38, 24]
        //Ordenar las temperaturas en orden descendente.

        int[] tempsemanal = new int[7];
        tempsemanal[0] = 28;
        tempsemanal[1] = 35;
        tempsemanal[2] = 22;
        tempsemanal[3] = 31;
        tempsemanal[4] = 26;
        tempsemanal[5] = 38;
        tempsemanal[6] = 24;

        for (int i = 0; i < tempsemanal.length; i++) {
            System.out.println("Las temperaturas de la semana fueron: " + tempsemanal[i]);
        }

        // Ordenamos de menor a mayor
        for (int i = 0; i < tempsemanal.length; i++) {
            for (int j = 0; j < tempsemanal.length - 1; j++) {
                int varAux = 0;
                // supongamos que tenemos 35, 28
                if (tempsemanal[j] > tempsemanal[j + 1]) {
                    varAux = tempsemanal[j];
                    tempsemanal[j] = tempsemanal[j + 1];
                    tempsemanal[j + 1] = varAux;
                }
            }
        }
        System.out.println("Las temperaturas mas bajas de la semana se dieron en este orden:");
        for (int i = 0; i < tempsemanal.length; i++) {
            System.out.println("El " + (i + 1) + "° dia frio se dio con una temperatura de " + tempsemanal[i] + " grados.");
        }

    }
}
