package algoritmo_estructura_de_datos.clase_01_06_26_arrays;

public class EjercicioTres {
    /* Este codigo ha sido generado por el modulo psexport 20230904-l64 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "EJERCICIOTRES.java."

        public static void main(String args[]) {
            int aprobados;
            int desaprobados;
            double estudiantes[];
            int i;
            double notamasalta;
            double notamasbaja;
            double promedionotas;
            double totalnotas;
            // 3. Un docente necesita analizar las notas de un curso.
            // Ingresar las notas de 40 estudiantes.
            // Mostrar:
            // cantidad de estudiantes aprobados y desaprobados,
            // nota más alta,
            // nota más baja,
            // promedio de notas del curso.
            estudiantes = new double[40];
            notamasalta = 0;
            notamasbaja = 10;
            aprobados = 0;
            desaprobados = 0;
            totalnotas = 0;
            System.out.println("Actividad tres");
            System.out.println("Un docente necesita analizar las notas de un curso de 40 estudiantes.");
            System.out.println("------------------------------------------");
            for (i=1; i<=40; ++i) {
                estudiantes[i-1] = Math.floor(Math.random()*10)+1;
                System.out.println("La profesora ah ingresado la nota del estudiante: "+i);
                if (estudiantes[i-1]>notamasalta) {
                    notamasalta = estudiantes[i-1];
                }
                if (estudiantes[i-1]<notamasbaja) {
                    notamasbaja = estudiantes[i-1];
                }
                if (estudiantes[i-1]<6) {
                    desaprobados = desaprobados+1;
                }
                if (estudiantes[i-1]>=6) {
                    aprobados = aprobados+1;
                }
                totalnotas = totalnotas+estudiantes[i-1];
                System.out.println("La nota del estudiante "+i+" es un "+estudiantes[i-1]+".");
                System.out.println("------------------------------------------");
            }
            System.out.println("**************************************************");
            promedionotas = totalnotas/40;
            System.out.println(aprobados+" alumnos aprobaron la materia.");
            System.out.println(desaprobados+" alumnos desaprobaron la materia.");
            System.out.println("La nota más alta es: "+notamasalta);
            System.out.println("La nota más baja es: "+notamasbaja);
            System.out.println("El promedio de notas es de: "+promedionotas);
            System.out.println("********************** FIN DE LA APLICACION ****************************");
        }


    }
