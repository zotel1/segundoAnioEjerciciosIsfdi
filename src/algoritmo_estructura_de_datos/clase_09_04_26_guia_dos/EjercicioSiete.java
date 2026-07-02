package algoritmo_estructura_de_datos.clase_09_04_26_guia_dos;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioSiete {

    public static void main(String[] args) {

        int a, b, c, d;
        Scanner teclado = new Scanner(System.in);


        System.out.println("Ingresa la medida de 4 lados y el programa determinara de que figura se trata: ");
        System.out.println("Lado a: ");
        a = teclado.nextInt();
        System.out.println("Lado b: ");
        b = teclado.nextInt();
        System.out.println("Lado c: ");
        c = teclado.nextInt();
        System.out.println("Lado d: ");
        d = teclado.nextInt();

        int[] lados = {a,b,c,d};

        // Ordena el arreglo de menor a mayor
        Arrays.sort(lados);

        // El último elemento es el mayor
        int ladoMayor = lados[lados.length - 1];

        //System.out.println("la medida mas grande es " + ladoMayor);

        int sumaLados = a + b + c + d;

        if (ladoMayor >= sumaLados) {
            System.out.println("No es un poligono cerrado!");
        } else {
            if (a == b && b == c && c == d) {
                System.out.println("La figura es un: Cuadrado (o Rombo con ángulos rectos, requiere ángulos para confirmar)");
            } else {
                if (a == b && c == d){
                    System.out.println("Rombo");
                } else {
                    if (a == c && d == b){
                        System.out.println("Paralelogramo");
                    }
                    else {
                        if ( a == b || b == c || c == d) {
                            System.out.println("Trapecio Isósceles");
                        } else
                            System.out.println("Poligono irregular (Cuadrilatero)");
                    }
                }
            }
        }

    }
}
