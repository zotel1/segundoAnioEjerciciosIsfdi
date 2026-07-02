package algoritmo_estructura_de_datos.guia_seis.arreglos.ordenamiento;

public class Actividad_siete {

    public static void main(String[] args) {
        // Una empresa registra las ventas de sus vendedores.
        //45000 32000 60000 28000 52000
        //La gerencia quiere identificar rápidamente a los mejores vendedores.

        int[] ventaVendedores = new int[5];
        ventaVendedores[0] = 45000;
        ventaVendedores[1] = 32000;
        ventaVendedores[2] = 60000;
        ventaVendedores[3] = 28000;
        ventaVendedores[4] = 52000;

        for (int i = 0; i < ventaVendedores.length; i++) {
            System.out.println("Las ventas registradas fueron: "+ ventaVendedores[i]);
        }

        System.out.println("El ranking de los vendedores es: ");

        for (int i = 0; i < ventaVendedores.length; i++) {
            for (int j = 0; j < ventaVendedores.length - 1; j++) {
                int varAux = 0;
                if (ventaVendedores[j] < ventaVendedores[j + 1]) {
                    varAux = ventaVendedores[j];
                    ventaVendedores[j] = ventaVendedores[j + 1];
                    ventaVendedores[j + 1] = varAux;
                }
            }
        }

        for (int i = 0; i < ventaVendedores.length; i++) {
            System.out.println("El " + (i + 1) + "° vendedor vendio: " + ventaVendedores[i]);
        }
    }
}
