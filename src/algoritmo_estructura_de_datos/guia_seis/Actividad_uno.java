package algoritmo_estructura_de_datos.guia_seis;

public class Actividad_uno {

    // Ordenamiento burbuja invertido
    public static void main(String[] args) {
        int notasfinales[] = new int[6];

        notasfinales[0] = 7;
        notasfinales[1] = 9;
        notasfinales[2] = 5;
        notasfinales[3] = 10;
        notasfinales[4] = 8;
        notasfinales[5] = 6;

        // notasfinales[7, 9, 5, 10, 8, 6]
        for (int i = 0; i < notasfinales.length; i++) {
            for (int j = 0; j < notasfinales.length -1; j++) {
                int varAux = 0;
                if (notasfinales[j] < notasfinales[j + 1]) {
                    varAux = notasfinales[j];
                    notasfinales[j] = notasfinales[j + 1];
                    notasfinales[j + 1] = varAux;
                }
            }
        }

        for (int i = 0; i < notasfinales.length; i++) {
            System.out.println("Ranking de las notas mas altas a mas bajas: " +  notasfinales[i]);
        }
    }
}
