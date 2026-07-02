package algoritmo_estructura_de_datos.guia_seis;

public class Actividad_dos {

    public static void main(String[] args) {
        int menorTiempo = 200;
        int[] tiemposCorredores = new int[5];
        tiemposCorredores[0] = 145;
        tiemposCorredores[1] = 132;
        tiemposCorredores[2] = 158;
        tiemposCorredores[3] = 127;
        tiemposCorredores[4] = 140;



        for (int i = 0; i < tiemposCorredores.length; i++) {
            if (tiemposCorredores[i] < menorTiempo) {
                menorTiempo = tiemposCorredores[i];
            }
        }

        System.out.println("El ganador es " + menorTiempo);
        // tiemposCorredores[145, 132, 158, 127, 140]

        //Ordenamos el vector para mostrar el ranking de los corredores
        for (int i = 0; i < tiemposCorredores.length; i++) {
            for (int j = 0; j < tiemposCorredores.length -1; j++) {
                int varAux = 0;
                if (tiemposCorredores[j] > tiemposCorredores[j + 1]) {
                    varAux = tiemposCorredores[j];
                    tiemposCorredores[j] = tiemposCorredores[j + 1];
                    tiemposCorredores[j + 1] = varAux;
                }
            }



        }
        System.out.println("El orden de llegada y tiempo de los corredores es: ");
        for (int i = 0; i < tiemposCorredores.length; i++) {
            System.out.println("El " + (i +1) + "° lugar es para el corredor que llego a los " + tiemposCorredores[i] + " segundos.");
        }
    }
}
