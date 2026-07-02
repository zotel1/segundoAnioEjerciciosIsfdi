package algoritmo_estructura_de_datos.clase_23_04_26_guia_tres;

import java.util.Scanner;

public class EjercicioOcho {

    /*
    * Escribir un programa que dada una cantidad de artículos y el valor de un artículo, pueda
imprimir el valor de la compra. El valor final de compra es el impuesto de la compra 21% +
el valor de la compra. */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int cantidad;
        double precio;
        double impuestoUnitario;
        double precioFinalUnitario;
        double totalCompra;
        double totalVentas = 0;
        double impuesto = 0.21;

        String continuar;

        System.out.println("Desea ingresar una compra? (s/n)");
        continuar = teclado.nextLine();

        while (continuar.equalsIgnoreCase("s")) {


            System.out.println("Ingrese la cantidad de articulos: ");
            cantidad = teclado.nextInt();

            System.out.println("Ingrese el precio del articulo: ");
            precio = teclado.nextDouble();

            // Calculamos por productio
            impuestoUnitario = precio * impuesto;
            precioFinalUnitario = precio + impuestoUnitario;

            totalCompra = precioFinalUnitario * cantidad;

            System.out.println("El precio dinal por producto es: $" + precioFinalUnitario);
            System.out.println("El total de esta compra es: $" + totalCompra);

            totalVentas = totalVentas + totalCompra;

            teclado.nextLine(); // Limpiamos el scanner
            System.out.println("Desea ingresar una compra? (s/n)");
            continuar = teclado.nextLine();
        }
        System.out.println("El total general de ventas es: $" + totalVentas);
    }
}
