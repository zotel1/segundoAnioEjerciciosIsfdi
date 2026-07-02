package algoritmo_estructura_de_datos.clase_18_06_26;

import java.util.Scanner;

public class BusquedaBinaria {

    public static void main(String[] args) {
        int Vnumeros[] = new int[10];
        Scanner teclado = new Scanner(System.in);
        int dato;
        int indiceInicial = 0;
        int indiceFinal = 9;
        int encuentra = 0;
        int medio = 0;


        Vnumeros[0] = 8;
        Vnumeros[1] = 7;
        Vnumeros[2] = 10;
        Vnumeros[3] = 2;
        Vnumeros[4] = 50;
        Vnumeros[5] = 13;
        Vnumeros[6] = 26;
        Vnumeros[7] = 89;
        Vnumeros[8] = 17;
        Vnumeros[9] = 36;

        System.out.println("El vector tiene los siguientes datos:  ");
        for (int i = 0; i < Vnumeros.length; i++) {

            System.out.print( Vnumeros[i] + ", ");
        }

        int aux;
        int i;
        double j;
        //int vnumero[];
        //vnumero = new int[5];
        //System.out.println("Ingrese 5 números");
        //System.out.println("Por ejemplo [5, 0, 8, 3, 20]");
        //for (i=0; i < 5; ++i) {
          //  vnumero[i + 1] = teclado.nextInt();
        //}
        for (j=0; j<10; ++j) {
            // lee repeticion
            for (i=0; i < 9; ++i) {
                // lee vectores
                System.out.println("Vnumero[i + 1] vale: "+Vnumeros[i]+" en la posicion "+i+". Y Vnumero[i] vale:"+Vnumeros[i]+" en la posicion "+i+1);
                System.out.println("-------------------------------------");
                if (Vnumeros[i] > Vnumeros[i + 1]) {
                    aux = Vnumeros[i];
                    System.out.println("asignamos "+aux+" a la variable aux. Proveniente de Vnumero[i] ");
                    Vnumeros[i] = Vnumeros[i + 1];
                    System.out.println("asignamos "+Vnumeros[i]+" a la variable Vnumero[i]. Proveniente de Vnumero[i + 1]");
                    Vnumeros[i + 1] = aux;
                    System.out.println("asignamos "+aux+" a la variable Vnumero[i + 1]. Proveniente de aux.");
                }
            }
            System.out.println("vuelta numero: "+j);
        }
        System.out.println("Vector ordenado");
        for (i=0; i < 10; ++i) {
            System.out.println(Vnumeros[i]);
        }

        System.out.print("Vector[");
        for (i=0; i < 10; ++i) {
            System.out.print(Vnumeros[i] + ", ");
        }
        System.out.println("]");

        System.out.println("Ingrese un número para que busquemos en el vector y le dijeramos en que posicion se encuentra: ");
        dato = teclado.nextInt();

        while ( indiceInicial <= indiceFinal && encuentra == 0) {
            medio = (int) ((indiceInicial + indiceFinal) / 2);
            if (Vnumeros[medio] == dato) {
                System.out.println("El dato esta en la posición: " + medio);
                encuentra = 1;
            } else {
                if (Vnumeros[medio] > dato) {
                    indiceFinal = medio -1;
                } else {
                    indiceInicial =  medio + 1;
                }
            }
        }
        if (encuentra == 0) {
            System.out.println("El número " + dato + " no se encuentra en el vector.");
        }
    }


}
