package algoritmo_estructura_de_datos.clase_09_04_26_guia_dos;

import java.util.Scanner;

public class EjercicioDiez {

    public static void main(String[] args) {
        /*Crear un programa para completar en la columna RESULTADOS DEL GRUPO 1.
        Se debe colocar:
        "Ganó" si la cantidad de goles es mayor a la del equipo del grupo 2
        "Empató", si la cantidad de goles es igual a la del equipo del grupo 2
        "Perdió", si la cantidad de goles es menor a la del equipo del grupo 2
*/
        int opcion;
        Scanner teclado  = new Scanner(System.in);
        String resultadoGrupoUno;

        System.out.println("--------- Resultados de los partidos del campeonato inter- barrial de fin de semana ---------");
        System.out.println("Villa Pineral vs Loma Hermosa");
        System.out.println("Villa Parque vs Martin Conorado");
        System.out.println("Villa Bosch vs Caseros");
        System.out.println("Ciuad Jardin vs El Palomar");
        System.out.println("Pablo Podestá vs Ciudadela");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("Ingrese una opcion [del 1 al 5] para ver los resultados del GRUPO 1 en el campeonato inter-barrial: ");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1: resultadoGrupoUno = "¡Perdío!";
            break;
            case 2: resultadoGrupoUno = "¡Empato";
            break;
            case 3: resultadoGrupoUno = "¡Ganó!";
            break;
            case 4: resultadoGrupoUno = "¡Empató!";
            break;
            case 5: resultadoGrupoUno = "¡Empató!";
            break;
            default: resultadoGrupoUno= "***Error*** ELIGIO UNA OPCION INCORRECTA";

        }
        System.out.println("Resultado del Grupo 1: " + resultadoGrupoUno);
    }
}
