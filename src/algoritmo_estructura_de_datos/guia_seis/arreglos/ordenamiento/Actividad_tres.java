package algoritmo_estructura_de_datos.guia_seis.arreglos.ordenamiento;

public class Actividad_tres {

    public static void main(String[] args) {
        // Un comercio registra las cantidades disponibles de distintos productos.
        //cantidadesProd[35, 12, 80, 5, 20, 50]
        //El encargado quiere visualizar primero los productos con menor stock.

        int[] cantidadesProd = new int[6];
        cantidadesProd[0] = 35;
        cantidadesProd[1] = 12;
        cantidadesProd[2] = 80;
        cantidadesProd[3] = 5;
        cantidadesProd[4] = 20;
        cantidadesProd[5] = 50;

        //cantidadesProd[35, 12, 80, 5, 20, 50]

        for (int i = 0; i < cantidadesProd.length; i++) {
            for (int j = 0; j < cantidadesProd.length - 1; j++) {
                int varAux = 0;
                if (cantidadesProd[j] > cantidadesProd[j + 1]) {
                    varAux = cantidadesProd[j];
                    cantidadesProd[j] = cantidadesProd[j + 1];
                    cantidadesProd[j + 1] = varAux;
                }
            }
        }

        System.out.println("Los productos con menor stock son: ");

        for (int i = 0; i < cantidadesProd.length; i++) {
            System.out.println("El " + (i + 1) + "° producto con menos stock, solo cuenta con " +cantidadesProd[i] + " productos. ");
        }
    }
}
