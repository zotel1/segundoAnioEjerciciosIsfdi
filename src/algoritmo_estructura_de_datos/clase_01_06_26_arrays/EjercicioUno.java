package algoritmo_estructura_de_datos.clase_01_06_26_arrays;

public class EjercicioUno {

        public static void main(String args[]) {
            int i;
            String meses[];
            double mesmayor;
            double mesmenor;
            double promediomensual;
            double totalanual;
            double ventaanual[];
            // 1. Una tienda registra las ventas de 12 meses del año.
            // Guardar las ventas mensuales en un array.
            // Informar:
            // mes con mayores ventas,
            // mes con menores ventas,
            // total anual,
            // promedio mensual.
            // Creamos el Array
            meses = new String[12];
            ventaanual = new double[12];
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
            mesmayor = -99999;
            mesmenor = 999999;
            totalanual = 0;
            // Definimos variables auxiliares
            System.out.println("Actividad uno");
            System.out.println("Una tienda registra las ventas de 12 meses del año.");
            System.out.println("Orden de meses");
            System.out.println("------------------------------------------");
            // Mostramos los meses cargados
            for (i=1; i<=12; ++i) {
                System.out.println(i+"- "+meses[i-1]);
            }
            System.out.println("------------------------------------------");
            // Cargamos el array de ventas
            for (i=1; i<=12; ++i) {
                System.out.println("Ingrese la venta del mes "+meses[i-1]);
                ventaanual[i-1] = Math.floor(Math.random()*20);
                if (ventaanual[i-1]>mesmayor) {
                    mesmayor = ventaanual[i-1];
                }
                if (ventaanual[i-1]<mesmenor) {
                    mesmenor = ventaanual[i-1];
                }
                totalanual = totalanual+ventaanual[i-1];
            }
            System.out.println("------------------------------------------");
            // Mostramos los valores de los meses y lo que se vendio esos meses
            for (i=1; i<=12; ++i) {
                System.out.println("En "+meses[i-1]+" se vendieron "+ventaanual[i-1]+" pesos.");
            }
            System.out.println("------------------------------------------");
            // Comparamos las ventas con las variables auxiliares y las mostramos junto a los meses
            for (i=1; i<=12; ++i) {
                if (mesmayor==ventaanual[i-1]) {
                    System.out.println("El mes con mayor ventas fue "+meses[i-1]+", su venta fue de: "+mesmayor+" pesos.");
                }
                if (mesmenor==ventaanual[i-1]) {
                    System.out.println("EL mes con menor venta fue "+meses[i-1]+", su venta fue de: "+mesmenor+" pesos.");
                }
            }
            System.out.println("**************************************************");
            promediomensual = (totalanual/12);
            System.out.println("El total anual es: "+totalanual);
            System.out.println("El promedio mensual es de: "+promediomensual);
            System.out.println("********************** FIN DE LA APLICACION ****************************");
        }
}
