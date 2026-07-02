package algoritmo_estructura_de_datos.clase_01_06_26_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCuatro {
    /* Este codigo ha sido generado por el modulo psexport 20230904-l64 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "EJERCICIOCUATRO.java."

        public static void main(String args[]) throws IOException {
            BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
            boolean encontrado;
            int i;
            double listanumeros[];
            int numerousuario;
            // 4. Un sistema debe verificar si un número existe dentro de una lista.
            // Cargar un array con 20 números.
            // Solicitar un número al usuario.
            // Informar:
            // Si el número ingresado por el usuario existe en el array,
            // posición donde se encuentra.
            listanumeros = new double[20];
            // Variable bandera para saber si existió o no
            encontrado = false;
            // Al principio asumimos que no está
            System.out.println("Actividad cuatro");
            System.out.println("Un sistema debe verificar si un número existe dentro de una lista.");
            System.out.println("------------------------------------------");
            // PASO 1: Cargamos el array primero
            System.out.println("Cargando la lista de números aleatorios...");
            for (i=1; i<=20; ++i) {
                listanumeros[i-1] = Math.floor(Math.random()*20)+1;
                System.out.println("El número ingresado en la posicion ["+i+"]  es el número["+listanumeros[i-1]+"]");
                System.out.println("------------------------------------------");
            }
            // PASO ": Ahora que la lista existe le pedimos al usuario que ingrese un numero
            System.out.println("Por favor ingrese un número entero, del 1 al 20");
            numerousuario = Integer.parseInt(bufEntrada.readLine());
            System.out.println("**************************************************");
            System.out.println("Resultado de la búsqueda:");
            // PASO 3: Buscamos en la lista
            for (i=1; i<=20; ++i) {
                if (numerousuario==listanumeros[i-1]) {
                    System.out.println("¡Existe! El número "+numerousuario+" se encuentra en la lista, en la posición "+i);
                    encontrado = true;
                    // Encendemos la bandera por que encontramos al menos uno
                }
            }
            // PASO 4: Si revisamos toda la lista y la bandera siguio en Falso informamos el error
            if (encontrado==false) {
                System.out.println("El número "+numerousuario+"No existe en la lista.");
            }
            System.out.println("********************** FIN DE LA APLICACION ****************************");
        }


    }