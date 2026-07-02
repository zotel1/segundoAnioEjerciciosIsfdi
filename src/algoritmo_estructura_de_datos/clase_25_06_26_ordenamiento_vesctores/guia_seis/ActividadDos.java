package algoritmo_estructura_de_datos.clase_25_06_26_ordenamiento_vesctores.guia_seis;
// 2. Los tiempos (en segundos) de los corredores son:
//[145, 132, 158, 127, 140]


public class ActividadDos {

    public static void main(String[] args) {

        int tiempos[] = new int[5];
        tiempos[0] = 145;
        tiempos[1] = 132;
        tiempos[2] = 158;
        tiempos[3] = 127;
        tiempos[4] = 140;

        for (int i=0; i<tiempos.length; i++){
            if (tiempos[i] == 127){
                System.out.println("El ganador es el corredor de la posicion " + i + " su tiempo fue " + tiempos[i]);
            }
        }
    }
}
