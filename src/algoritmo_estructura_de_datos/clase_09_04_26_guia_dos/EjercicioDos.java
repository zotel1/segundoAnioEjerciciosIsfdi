package algoritmo_estructura_de_datos.clase_09_04_26_guia_dos;

import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {

        // Scanner utiliza la configuración regional del sistema,
        // en este caso la entrada de datos seria 1,70

        Scanner teclado = new Scanner(System.in);
        double personaA;
        double personaB;


        System.out.println("------------------------------------------------------------");
        System.out.println("Comparación de alturas");
        System.out.println("Ingrese su altura en metros");
        System.out.println("Por ejemplo 1,50");
        System.out.println("------------------------------------------------------------");

        System.out.println("Ingrese la altura de la primer persona en metros: ");
        personaA = teclado.nextDouble();

        // Volvemos a definir nuestro escaner asi liberamos memoria por las dudas
        teclado = new Scanner(System.in);

        System.out.println("Ingrese la altura de la segunda persona en metros: ");
        personaB = teclado.nextDouble();

        if (personaA > personaB) {
            System.out.println("La primer persona tiene mayor altura, su altura es: " + personaA + " metros.");
        } else
            System.out.println("La segunda persona tiene mayor altura, su altura es: " + personaB + " metros.");
        teclado.close();
    }

}
