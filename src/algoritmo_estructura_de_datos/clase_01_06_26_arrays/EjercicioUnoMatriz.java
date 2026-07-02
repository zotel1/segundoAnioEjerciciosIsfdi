package algoritmo_estructura_de_datos.clase_01_06_26_arrays;

import java.util.Arrays;

public class EjercicioUnoMatriz {

    public static void main(String args[]) {
        int i, j;
        double mesMayor;
        double mesMenor;
        double promedioMensual;
        double totalAnual;
        Double ventaAnual[];
        String meses[];
        // 1. Una tienda registra las ventas de 12 meses del año.
        // Guardar las ventas mensuales en un array.
        // Informar:
        // mes con mayores ventas,
        // mes con menores ventas,
        // total anual,
        // promedio mensual.
        // Creamos el Array
        meses = new String[12];
        ventaAnual = new Double[12];
        // Cargamos datos al Array de meses
        meses[0] = "Enero";
        meses[1] = "Febrero";
        meses[2] = "Marzo";
        meses[3] = "Abril";
        meses[4] = "Mayo";
        meses[5] = "Junio";
        meses[6] = "Julio";
        meses[7] = "Agosto";
        meses[8] = "Septiembre";
        meses[9] = "Octubre";
        meses[10] = "Noviembre";
        meses[11] = "Diciembre";
        System.out.println("Meses " +  Arrays.toString(meses));
        mesMayor = -99999;
        mesMenor = 999999;
        totalAnual = 0;
        // Definimos variables auxiliares
        System.out.println("Actividad uno");
        System.out.println("Una tienda registra las ventas de 12 meses del año.");
        System.out.println("Orden de meses");
        System.out.println("------------------------------------------");
        // Mostramos los meses cargados
        for (i=0; i < 12; ++i) {
            System.out.println(i+"- "+ meses[i]);
        }
        System.out.println("------------------------------------------");
        // Cargamos el array de ventas
        for (i=0; i < 12; ++i) {
                System.out.println("Ingrese la venta del mes de "+ meses[i]);
                ventaAnual[i] = Math.floor(Math.random()*20);
                if ((ventaAnual[i]) > mesMayor) {
                    mesMayor = ventaAnual[i];
                }
                if (ventaAnual[i]<mesMenor) {
                    mesMenor = ventaAnual[i];
                }
                totalAnual = totalAnual+ventaAnual[i];

        }
        System.out.println("------------------------------------------");
        // Mostramos los valores de los meses y lo que se vendio esos meses
        for (i=0; i<12; ++i) {
            System.out.println("En el mes de "+ meses[i]+" se vendieron "+ventaAnual[i]+" pesos.");
        }
        System.out.println("------------------------------------------");
        // Comparamos las ventas con las variables auxiliares y las mostramos junto a los meses
        for (i=0; i<12; ++i) {
            if (mesMayor==ventaAnual[i]) {
                System.out.println("El mes con mayor ventas fue "+ventaAnual[i]+", su venta fue de: "+mesMayor+" pesos.");
            }
            if (mesMenor==ventaAnual[i]) {
                System.out.println("EL mes con menor venta fue "+ventaAnual[i]+", su venta fue de: "+mesMenor+" pesos.");
            }
        }
        System.out.println("**************************************************");
        promedioMensual = (totalAnual/12);
        System.out.println("El total anual es: "+totalAnual);
        System.out.println("El promedio mensual es de: "+promedioMensual);

        System.out.println("-------------------------- ORDENAMIENTO DE ARRAYS --------------------------");
        i = 0;
        System.out.println("El valor de i es "+ i);



        System.out.println("********************** FIN DE LA APLICACION ****************************");


    }
}
