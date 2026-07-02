package laboratorio_programacion;

import java.io.IOException;
import java.util.Scanner;

public class EjercicioCalculadora {

        public static void main(String args[]) throws IOException {
            Scanner tecladoDes = new Scanner(System.in);
            Scanner tecladoElec = new Scanner(System.in);
            Scanner tecladoNum = new Scanner(System.in);

            int desicion;
            double div;
            String eleccion;
            double mult;
            double primernumero;
            double res;
            double segundonumero;
            double sum;
            // 1- Diseñar un algoritmo en pseint que trabaje en forma de calculadora ingrresando datos de tipo flotante.
            // 2- DIseñar el algoritmo del punto anterior en lenguaje python.
            // 3- Diseñar el algoritmo en lenguaje C.
            // 4- Explicar por bloque como funciona la calculadora.
            System.out.println("************************************************** INICIO DE LA APLICACIÓN **************************************************");
            System.out.println("------------------------------------------------- CALCULADORA -------------------------------------------------");
            System.out.println("Desea realizar una operación? [s/n]");
            eleccion = tecladoElec.nextLine();
            while ((eleccion.equals("s"))) {
                System.out.println("Elija una de las siguientes operaciones: ");
                System.out.println("1- Suma.");
                System.out.println("2- Resta.");
                System.out.println("3- Multiplicacion.");
                System.out.println("4- División.");
                desicion = tecladoDes.nextInt();
                if (desicion<1) {
                    System.out.println("Debe elegir una opcion entre 1 y 4");
                } else {
                    if (desicion>4) {
                        System.out.println("Debe elegir una opcin entre 1 y 4");
                    } else {
                        if (desicion==1) {
                            System.out.println("Ingrese el primer numero a sumar:");
                            primernumero = tecladoNum.nextDouble();
                            System.out.println("Ingrese el segundo numero a sumar: ");
                            segundonumero = tecladoNum.nextDouble();
                            sum = primernumero+segundonumero;
                            System.out.println("La suma entre el número "+primernumero+" y el número "+segundonumero+" es: "+sum);
                        }
                        if (desicion==2) {
                            System.out.println("Ingrese el primer numero a restar:");
                            primernumero = tecladoNum.nextDouble();
                            System.out.println("Ingrese el segundo numero a restar: ");
                            segundonumero = tecladoNum.nextDouble();
                            res = primernumero-segundonumero;
                            System.out.println("La resta del número "+primernumero+" al número "+segundonumero+" es: "+res);
                        }
                        if (desicion==3) {
                            System.out.println("Ingrese el primer numero a multiplicar:");
                            primernumero = tecladoNum.nextDouble();
                            System.out.println("Ingrese el segundo numero a multiplicar: ");
                            segundonumero = tecladoNum.nextDouble();
                            mult = primernumero*segundonumero;
                            System.out.println("La multiplicación entre el número "+primernumero+" y el número "+segundonumero+" es: "+mult);
                        }
                        if (desicion==4) {
                            System.out.println("Ingrese el primer numero a dividir:");
                            primernumero = tecladoNum.nextDouble();
                            System.out.println("Ingrese el segundo numero a dividir: ");
                            segundonumero = tecladoNum.nextDouble();
                            if ((primernumero==0) && (segundonumero==0)) {
                                System.out.println("No se puede realizar la operacion de "+primernumero+"dividido "+segundonumero);
                            } else {
                                if ((segundonumero==0)) {
                                    System.out.println(" no existe un núero que multiplicado por 0 de "+primernumero);
                                } else {
                                    div = primernumero/segundonumero;
                                    System.out.println("La divisin del número "+primernumero+" al número "+segundonumero+" es: "+div);
                                }
                            }
                        }
                    }
                }
                System.out.println("-------------------------------------------------             -------------------------------------------------");
                System.out.println("Desea realizar una operación? [s/n]");
                eleccion = tecladoElec.nextLine();
            }
            System.out.println("************************************************** FIN DE LA APLICACIÓN **************************************************");
        }
    }
