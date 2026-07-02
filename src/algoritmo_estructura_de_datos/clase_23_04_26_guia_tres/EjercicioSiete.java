package algoritmo_estructura_de_datos.clase_23_04_26_guia_tres;

import java.util.Scanner;

public class EjercicioSiete {
    /*Escribir un programa para una empresa que tiene salas de juegos para todas las edades y
quiere calcular de forma automática el precio que debe cobrar a sus clientes por entrar y
el monto de la venta. El programa debe preguntar al usuario la edad del cliente y mostrar
el precio de la entrada. Si el cliente es menor de 4 años puede entrar gratis, si tiene entre
4 y 18 años debe pagar $500 y si es mayor de 18 años, $1000. Al final obtener el monto
total de la venta de entradas. */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int edad;
        int precio;
        int totalVentas = 0;
        String continuar;

        System.out.println("¿Desea ingresar un cliente? (s/n)");
        continuar = teclado.nextLine();

        while (continuar.equalsIgnoreCase("s")) {

            System.out.println("Ingrese la edad del cliente: ");
            edad = teclado.nextInt();

            // Determinamos los precios
            if (edad < 4){
                precio = 0;
            } else if (edad <= 18) {
                precio = 500;
            } else {
                precio = 1000;
            }

            System.out.println("El precio de la entrada es: $" + precio);

            totalVentas = totalVentas + precio;

            teclado.nextLine(); // Limpiamos a teclado
            System.out.println("Desea ingresar otro cliente? (s/n)");
            continuar = teclado.nextLine();
        }

        System.out.println("El total de venyas es: $" + totalVentas);
    }

}
