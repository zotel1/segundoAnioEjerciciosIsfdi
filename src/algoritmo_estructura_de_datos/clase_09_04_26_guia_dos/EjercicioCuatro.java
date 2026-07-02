package algoritmo_estructura_de_datos.clase_09_04_26_guia_dos;


import java.util.Scanner;

public class EjercicioCuatro {

    public static void main(String[] args) {

        System.out.println("------------------ Ingrese el color que desee que tenga el semaforo ------------------");
        System.out.println("rojo - amarillo - verde");

        String colorRojo = "rojo";
        String colorAmarillo = "amarillo";
        String colorVerde = "verde";

        Scanner teclado = new Scanner(System.in);

        String colorIngresado;

        colorIngresado = teclado.nextLine();

        if (colorIngresado.equals(colorRojo)) {
            System.out.println("El color del semaforo es: [" + colorRojo + "] Cuando el semáforo está en rojo," +
                    "los vehículos deben hacer una detención completa antes de la línea de alto. " +
                    "Esta señalización es crucial para evitar accidentes y permitir el paso seguro de peatones. " +
                    "Ignorar esta luz puede resultar en multas severas y pone en riesgo la vida de las personas en la vía.");
        }
        else {
            if (colorIngresado.equals(colorAmarillo)) {
                System.out.println("El color del semaforo ingresado es: [" + colorAmarillo + "]  El amarillo advierte a los conductores que deben prepararse para detenerse, " +
                        "ya que la luz roja está a punto de encenderse. " +
                        "Esta señal es especialmente importante, " +
                        "pues indica que el semáforo está cambiando. " +
                        "Los conductores deben evaluar su proximidad al semáforo y decidir si pueden detenerse de manera segura o si deben continuar. " +
                        "Pasar un semáforo en amarillo puede ser riesgoso, " +
                        "por lo que se recomienda siempre proceder con precaución.");
            }
            else {
                if (colorIngresado.equals(colorVerde)) {
                    System.out.println("El color del semaforo ingresado es: [" + colorVerde + "] El verde significa que es seguro avanzar. " +
                            "Los vehículos pueden atravesar la intersección, " +
                            "pero deben continuar con la atención debida, " +
                            "especialmente en intersecciones donde los peatones pueden estar cruzando.");
                }
                else
                    System.out.println("¡ERROR! *********** El color ingresado es incorrecto ***********");
                System.out.println("Finalizando aplicación...");
            }
        }
    }
}
