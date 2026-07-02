package algoritmo_estructura_de_datos.guia_seis.arreglos.busqueda;

public class Ejercicio_dos {
    public static void main(String[] args) {
        // Una estación meteorológica registra las temperaturas máximas de una semana.
        //28 31 35 30 29 33
        //Determinar:
        // ¿Se registró una temperatura de 35°C?
        // ¿Qué día tuvo la temperatura más alta?
        // ¿Cuántos días superaron los 30°C?
        // Declaramos los vectores

        String[] dias = new String[6];
        dias[0] = "Lunes";
        dias[1] = "Martes";
        dias[2] = "Miercoles";
        dias[3] = "Jueves";
        dias[4] = "Viernes";
        dias[5] = "Sabado";

        int[] temperaturas = new int[6];
        temperaturas[0] = 28;
        temperaturas[1] = 31;
        temperaturas[2] = 35;
        temperaturas[3] = 30;
        temperaturas[4] = 29;
        temperaturas[5] = 33;

        int diasMayores30 = 0;
        int mayorTemperatura = temperaturas[0];
        String diaMayorTemperatura = dias[0];
        boolean existe35 = false;

        for (int i = 0; i < temperaturas.length; i++) {

            // Existe una temperatura de 35°?
            if (temperaturas[i] == 35) {
                existe35 = true;

                System.out.println("Se registro una temperatura de 35°C el dia " + dias[i]);
            }

            // Cuantos dias superaron los 30°C?
            if (temperaturas[i] > 30) {
                diasMayores30++;
            }

            // Buscamos la temperatura maxima
            if (temperaturas[i] > mayorTemperatura) {
                mayorTemperatura = temperaturas[i];
                diaMayorTemperatura = dias[i];
            }
        }

        System.out.println("-----------------------------------");

        if (existe35) {
            System.out.println("Sí se registró una temperatura de 35°C.");
        } else {
            System.out.println("No se registró una temperatura de 35°C.");
        }

        System.out.println("La temperatura más alta fue de "
                + mayorTemperatura + "°C y ocurrió el "
                + diaMayorTemperatura + ".");

        System.out.println("Cantidad de días con más de 30°C: "
                + diasMayores30);
    }
}
