package algoritmo_estructura_de_datos.guia_seis.arreglos.ordenamiento;

public class Actividad_seis {

    public static void main(String[] args) {
        //  Los puntajes obtenidos son:
        //1200 800 1500 950 2000
        //Se desea mostrar el ranking de jugadores.

        int[] puntajesObtenidos = new int[5];
        puntajesObtenidos[0] = 1200;
        puntajesObtenidos[1] = 800;
        puntajesObtenidos[2] = 1500;
        puntajesObtenidos[3] = 950;
        puntajesObtenidos[4] = 2000;

        System.out.println("Los puntajes obtenidos son: ");
        for (int i = 0; i < puntajesObtenidos.length; i++) {
            System.out.println(puntajesObtenidos[i] + " ");
        }

        for (int i = 0; i < puntajesObtenidos.length; i++) {
            for (int j = 0; j < puntajesObtenidos.length -1; j++) {
                int varAux = 0;
                if (puntajesObtenidos[j] < puntajesObtenidos[j + 1]) {
                    varAux = puntajesObtenidos[j];
                    puntajesObtenidos[j] = puntajesObtenidos[j + 1];
                    puntajesObtenidos[j + 1] = varAux;
                }
            }
        }

        System.out.println("El ranking de los jugadores es: ");
        for (int i = 0; i < puntajesObtenidos.length; i++) {
            System.out.println("En " + (i + 1) + "° lugar el jugador con el puntaje " + puntajesObtenidos[i] + ".");
        }

    }
}
