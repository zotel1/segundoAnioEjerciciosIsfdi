package algoritmo_estructura_de_datos.clase_04_06_26_ordenamiento_vectores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OrdenamientoBurbuja {
    public static void main(String args[]) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int aux;
        int i;
        double j;
        int vnumero[];
        vnumero = new int[5];
        System.out.println("Ingrese 5 números");
        System.out.println("Por ejemplo [5, 0, 8, 3, 20]");
        for (i=0; i < 5; ++i) {
            vnumero[i + 1] = teclado.nextInt();
        }
        for (j=1; j<=5; ++j) {
            // lee repeticion
            for (i=1; i < 4; ++i) {
                // lee vectores
                System.out.println("Vnumero[i + 1] vale: "+vnumero[i]+" en la posicion "+i+". Y Vnumero[i] vale:"+vnumero[i-1]+" en la posicion "+i+1);
                System.out.println("-------------------------------------");
                if (vnumero[i] < vnumero[i + 1]) {
                    aux = vnumero[i +1];
                    System.out.println("asignamos "+aux+" a la variable aux. Proveniente de Vnumero[i] ");
                    vnumero[i + 1] = vnumero[i];
                    System.out.println("asignamos "+vnumero[i]+" a la variable Vnumero[i]. Proveniente de Vnumero[i + 1]");
                    vnumero[i] = aux;
                    System.out.println("asignamos "+aux+" a la variable Vnumero[i + 1]. Proveniente de aux.");
                }
            }
            System.out.println("vuelta numero: "+j);
        }
        System.out.println("Vector ordenado");
        for (i=1; i< 5; ++i) {
            System.out.println(vnumero[i-1]);
        }
    }
    
}
