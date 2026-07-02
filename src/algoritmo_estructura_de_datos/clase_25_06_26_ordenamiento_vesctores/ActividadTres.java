package algoritmo_estructura_de_datos.clase_25_06_26_ordenamiento_vesctores;
/**
 * Un comercio registra las cantidades disponibles de distintos productos.
 * [35, 12, 80, 5, 20, 50]*/
public class ActividadTres {
    public static void main(String[] args) {
        int productos[] = new int[6];
        productos[0] = 35;
        productos[1] = 12;
        productos[2] = 80;
        productos[3] = 5;
        productos[4] = 20;
        productos[5] = 50;
        // producttos[35, 12, 80, 5, 20, 50]

        // Primero irdenamos en este caso de menor a mayor
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Actualmente este es el orden de los productos: " + productos[i]);
        }
        System.out.println("-----------------------------------------");
        for (int i = 0; i < productos.length; i++) {

            for (int j = 0; j < productos.length -1; j++) {
                int varAux = 0;
                if (productos[j] > productos[j + 1]) {
                    varAux = productos[j];
                    productos[j + 1] = varAux;
                    productos[j] = productos[j + 1];
                  //  productos[j + 1] = varAux;
                }
            }
        }
        for (int i = 0; i < productos.length; i++) {
            System.out.println("El orden de los productos con menos stock serian: " + productos[i]);
        }

        System.out.println("Actualizamos el repo");


    }
}
