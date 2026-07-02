package algoritmo_estructura_de_datos.clase_25_06_26_ordenamiento_vesctores;

public class ActividadUno {
    public static void main(String[] args) {

        int[] vectorEst = new int[6];
        int aux;

        vectorEst[0] = 7;
        vectorEst[1] = 9;
        vectorEst[2] = 5;
        vectorEst[3] = 10;
        vectorEst[4] = 8;
        vectorEst[5] = 6;

        System.out.println("------------------------- INICIO DE LA APLICACIÓN -------------------------");

        System.out.println("La nota de los alumnos es: ");
        for (int i = 0; i < 6; i++){
            System.out.print(vectorEst[i] + ", ");
        }

        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 5; j++){
                if (vectorEst[j] < vectorEst[j + 1]){
                    aux = vectorEst[j];
                    vectorEst[j] = vectorEst[j + 1];
                    vectorEst[j + 1] = aux;
                }

            }
        }

        System.out.println(" ");
        System.out.println("====================================");
        System.out.println("Ranking de notas ");
        System.out.println("====================================");
        System.out.println("Desde la nota más alta a la más baja");
        for (int i = 0; i < 6; i++){
            System.out.print(vectorEst[i] + ", ");
        }

        System.out.println("------------------------- FIN DE LA APLICACIÓN -------------------------");
    }
}
