package algoritmo_estructura_de_datos.guia_seis.arreglos.ordenamiento;

public class Ejercicio_ocho {
    public static void main(String[] args) {
        //Los pacientes tienen asignado un nivel de prioridad.
        //3 1 5 2 4
        //Donde:
        // 1 = atención urgente
        // 5 = menor prioridad
        int[] prioridadPacientes = new int[5];
        prioridadPacientes[0] = 3;
        prioridadPacientes[1] = 1;
        prioridadPacientes[2] = 5;
        prioridadPacientes[3] = 2;
        prioridadPacientes[4] = 4;

        System.out.println("Actualmente se registro el siguiente orden de los pacientes: ");
        for (int i = 0; i < prioridadPacientes.length; i++) {
            System.out.println(prioridadPacientes[i]);
        }
        System.out.println("El orden de prioridad de los pacientes es: ");

        for (int i = 0; i < prioridadPacientes.length; i++) {
            for (int j = 0; j < prioridadPacientes.length - 1; j++) {
                int varAux = 0;
                if (prioridadPacientes[j] > prioridadPacientes[j + 1]) {
                    varAux =  prioridadPacientes[j];
                    prioridadPacientes[j] = prioridadPacientes[j + 1];
                    prioridadPacientes[j + 1] = varAux;
                }
            }
        }

        for (int i = 0; i < prioridadPacientes.length; i++) {
            System.out.println(prioridadPacientes[i]);
        }
    }
}
