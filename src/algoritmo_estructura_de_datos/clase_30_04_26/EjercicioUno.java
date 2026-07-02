package algoritmo_estructura_de_datos.clase_30_04_26;

import java.util.Scanner;

public class EjercicioUno {
    /*1. Un sistema pide una contraseña. El usuario tiene máximo 3 intentos.
 Si acierta, muestra “Acceso concedido”.
 Si falla 3 veces, muestra “Cuenta bloqueada”. */
    public static void main(String[] args) {

        System.out.println("----------------------Inicio de programa ------------------------------");

        int contrasenia = 1234;
        int contadorContra = 3;
        Scanner teclado = new Scanner(System.in);
        int ingresoContra;
        System.out.println("Ingrese su contraseña: ");
        System.out.println("¡La contraseña debe tener 4 digitos!");

        ingresoContra = teclado.nextInt();

        if (ingresoContra == contrasenia) {
            System.out.println("Acceso concebido");
        } else
            while (contrasenia != ingresoContra && contadorContra !=0 ) {
                    System.out.println("Ingrese su contraseña nuevamente. Le quedan " + (contadorContra- 1) + " Intentos de inicio.");
                    ingresoContra = teclado.nextInt();
                    contadorContra--;

        }
            if (contadorContra < 1) {
                System.out.println("Cuenta bloqueada");
            } else if (contadorContra > 0) {
                System.out.println("Acceso concedido");
            }


        System.out.println("------------------------Fin de la aplicacion----------------------------");
    }
}
