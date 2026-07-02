package algoritmo_estructura_de_datos.clase_23_04_26_guia_tres;

import java.util.Scanner;

public class EjercicioNueve {

    /*Escribir un programa que ingrese los datos de los competidores de una carrera de 100
mts: orden, NyA, género, edad, minutos. Siendo género: M=mujeres, V=varones. Calcular
a. El total de competidores.
b. Promedio de edad
c. Tiempo promedio de competencia (en minutos)
d. Cantidad de mujeres y de varones.*/

    public static void main(String[] args) {
        Scanner tecladoDatos = new  Scanner(System.in);
        Scanner tecladoNombres = new  Scanner(System.in);
        Scanner tecladoGenero = new  Scanner(System.in);
        Scanner tecladoEdad = new  Scanner(System.in);
        Scanner tecladoMinutos = new  Scanner(System.in);
        String nombreApellido = "";
        String genero;
        int edad;
        int edadTotal = 0;
        double minutos;
        double minutosTotal = 0;
        double minutosPromedio;
        // Comienzo de ciclo while
        String ingresoDatos;
        //contadores generos
        int genMasculino = 0;
        int genFemenino = 0;
        int competidoresTotal = 0;
        double promedioEdad;

        System.out.println("Desea ingresar datos? s/n");
        ingresoDatos = tecladoDatos.nextLine();

        while (ingresoDatos.equalsIgnoreCase("s")) {
            System.out.println("Ingrese el nombre y apellido del participante: ");
            nombreApellido = tecladoNombres.nextLine();

            competidoresTotal = competidoresTotal + 1;

            System.out.println("Ingrese el genero del participante [M=mujeres, V=varones]: ");
            genero = tecladoGenero.nextLine();
            if (genero.equalsIgnoreCase("M")) {
                genFemenino = genFemenino + 1;
            }
            else {
                if (genero.equalsIgnoreCase("V")){
                    genMasculino = genMasculino + 1;
            }
            }

            System.out.println("Ingrese el edad del participante: ");
            edad = tecladoEdad.nextInt();
            edadTotal = edadTotal + edad;

            System.out.println("Ingrese los minutos que corrio el participante: ");
            minutos = tecladoMinutos.nextDouble();
            minutosTotal = minutosTotal + minutos;

            System.out.println("Desea ingresar datos? s/n");
            ingresoDatos = tecladoDatos.nextLine();

        }

        promedioEdad = (double) edadTotal / competidoresTotal;
        minutosPromedio = minutosTotal / competidoresTotal;
        System.out.println("La cantidad de competidores es: " +  competidoresTotal);
        System.out.println("El promedio de edad de los competidores es: " +  promedioEdad);
        System.out.println("El tiempo promedio en minutos de competencia es: " + minutosPromedio);
        System.out.println("La cantidad de competidores varones es: " + genMasculino);
        System.out.println("La cantidad de competidores mujeres es: " + genFemenino);
        System.out.println("Fin de la aplicación...");

    }
}
