package algoritmo_estructura_de_datos.clase_01_06_26_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioCinco {
    /* Este codigo ha sido generado por el modulo psexport 20230904-l64 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "EJERCICIOCINCO.java."

        public static void main(String args[]) throws IOException {
            BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
            String diassemana[];
            int i;
            double temperaturasemanal[];
            double tempmax;
            double tempmin;
            double tempprom;
            double tempsup;
            double temptotal;
            // 5. Un laboratorio registra temperaturas durante 7 días.
            // Guardar temperaturas diarias.
            // Informar:
            // temperatura máxima,
            // mínima,
            // promedio,
            // días con temperatura superior al promedio.
            diassemana = new String[7];
            temperaturasemanal = new double[7];
            temptotal = 0;
            tempmax = -100;
            tempmin = 100;
            diassemana[0] = "Lunes";
            diassemana[1] = "Martes";
            diassemana[2] = "Miercoles";
            diassemana[3] = "Jueves";
            diassemana[4] = "Viernes";
            diassemana[5] = "Sabado";
            diassemana[6] = "Domingo";
            System.out.println("Actividad cinco");
            System.out.println("Un laboratorio registra temperaturas durante 7 dias.");
            System.out.println("------------------------------------------");
            for (i=1; i<=7; ++i) {
                System.out.println("Ingresa la temperatura del dia "+diassemana[i-1]);
                temperaturasemanal[i-1] = Double.parseDouble(bufEntrada.readLine());
                if (temperaturasemanal[i-1]>tempmax) {
                    tempmax = temperaturasemanal[i-1];
                }
                if (temperaturasemanal[i-1]<tempmin) {
                    tempmin = temperaturasemanal[i-1];
                }
                temptotal = temptotal+temperaturasemanal[i-1];
                System.out.println("------------------------------------------");
            }
            tempprom = temptotal/7;
            System.out.println("**************************************************");
            System.out.println("La temperatura maxima es: "+tempmax);
            System.out.println("La temperatura minima es: "+tempmin);
            System.out.println("La temperatura promedio es: "+tempprom);
            for (i=1; i<=7; ++i) {
                if (tempprom<temperaturasemanal[i-1]) {
                    System.out.println("La temperatura del dia "+diassemana[i-1]+", supero con "+temperaturasemanal[i-1]+" grados la temperatura promedio de "+tempprom+" grados.");
                }
            }
            System.out.println("********************** FIN DE LA APLICACION ****************************");
        }


    }

