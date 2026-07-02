package algoritmo_estructura_de_datos.clase_01_06_26_arrays;
/* Este codigo ha sido generado por el modulo psexport 20230904-l64 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "EJERCICIOOCHO.java."

import java.io.*;

public class ejercicioOcho {

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int aprobadosa;
        int aprobadosb;
        int cantalumnosa;
        int cantalumnosb;
        int desaprobadosa;
        int desaprobadosb;
        int i;
        double notascursoa[];
        double notascursob[];
        double promedioa;
        double promediob;
        double totalnotasa;
        double totalnotasb;
        // 8. Dos cursos rindieron el mismo examen.
        // Guardar notas de ambos cursos.
        // Determinar:
        // cuál tuvo mejor promedio,
        // cuántos aprobaron en cada curso.
        // Definimos variables para los tamaños
        // Variables para cálculos del Curso A
        // Variables para cálculos del Curso B
        // Inicializamos variables
        totalnotasa = 0;
        aprobadosa = 0;
        totalnotasb = 0;
        aprobadosb = 0;
        System.out.println("=== SISTEMA DE COMPARACIÓN DE NOTAS ===");
        // 1. Pedimos los tamaños de los cursos
        System.out.println("¿Cuántos alumnos rindieron en el CURSO A?:");
        cantalumnosa = Integer.parseInt(bufEntrada.readLine());
        System.out.println("¿Cuántos alumnos rindieron en el CURSO B?:");
        cantalumnosb = Integer.parseInt(bufEntrada.readLine());
        // 2. Dimensionamos los arrays dinámicamente con los datos del usuario
        notascursoa = new double[cantalumnosa];
        notascursob = new double[cantalumnosb];
        System.out.println("--------------------------------------------------");
        System.out.println("PROCESANDO CURSO A...");
        // 3. Cargamos y procesamo el Curso A
        for (i=1; i<=cantalumnosa; ++i) {
            notascursoa[i-1] = Math.floor(Math.random()*10)+1;
            // Notas del 1 al 10
            totalnotasa = totalnotasa+notascursoa[i-1];
            if (notascursoa[i-1]>=6) {
                aprobadosa = aprobadosa+1;
            }
        }
        System.out.println("¡Notas del Curso A cargadas con éxito!");
        System.out.println("--------------------------------------------------");
        System.out.println("PROCESANDO CURSO B...");
        // 4. Cargamos y procesamos el Curso B
        for (i=1; i<=cantalumnosb; ++i) {
            notascursob[i-1] = Math.floor(Math.random()*10)+1;
            totalnotasb = totalnotasb+notascursob[i-1];
            if (notascursob[i-1]>=6) {
                aprobadosb = aprobadosb+1;
            }
        }
        System.out.println("¡Notas del Curso B cargadas con éxito!");
        System.out.println("--------------------------------------------------");
        System.out.println("****************** REPORTE GENERAL ******************");
        // 5. Calculamos promedios (validando que no sea división por cero)
        if (cantalumnosa>0) {
            promedioa = totalnotasa/cantalumnosa;
        } else {
            promedioa = 0;
        }
        if (cantalumnosb>0) {
            promediob = totalnotasb/cantalumnosb;
        } else {
            promediob = 0;
        }
        // Mostramos datos individuales pedidos por la consigna
        System.out.println("CURSO A: "+aprobadosa+" alumnos aprobados. Promedio del curso: "+promedioa);
        System.out.println("CURSO B: "+aprobadosb+" alumnos aprobados. Promedio del curso: "+promediob);
        System.out.println("--------------------------------------------------");
        // 6. Determinamos cuál tuvo mejor promedio
        if (promedioa>promediob) {
            System.out.println("Resultado: El CURSO A tuvo un mejor promedio general ("+promedioa+").");
        } else {
            if (promediob>promedioa) {
                System.out.println("Resultado: El CURSO B tuvo un mejor promedio general ("+promediob+").");
            } else {
                System.out.println("Resultado: Ambos cursos obtuvieron exactamente el mismo promedio ("+promedioa+").");
            }
        }
        System.out.println("********************** FIN ****************************");
    }


}

