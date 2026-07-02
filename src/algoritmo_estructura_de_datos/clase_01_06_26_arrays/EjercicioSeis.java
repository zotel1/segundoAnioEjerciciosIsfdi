package algoritmo_estructura_de_datos.clase_01_06_26_arrays;

public class EjercicioSeis {
    /* Este codigo ha sido generado por el modulo psexport 20230904-l64 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "EJERCICIOSEIS.java."

        public static void main(String args[]) {
            int i;
            double mejortiempo;
            double minganador;
            double minpeor;
            double minutos;
            double peortiempo;
            int posicionganador;
            double segganador;
            double segpeor;
            double segundos;
            double segundostotales;
            double tiemposatletas[];
            // 6. En una carrera participan 25 atletas.
            // Registrar tiempos de cada atleta.
            // Mostrar:
            // mejor tiempo,
            // peor tiempo,
            // posición del ganador.
            tiemposatletas = new double[25];
            // Array donde vamos a guardar los segundos totales de cada atleta
            // Inicializamos las variables auxiliares con extremos medidos en SEGUNDOS
            mejortiempo = 99999;
            // Buscamos el menor tiempo en segundos
            peortiempo = 0;
            // Buscamos el mayor tiempo en segundos
            posicionganador = 0;
            System.out.println("En una carrera participan 25 Atletas");
            System.out.println("--------------------------------------------------");
            for (i=1; i<=25; ++i) {
                // Generamos con la macro Azar un tiempo aleatorio entre 540s (9m) y 959s (15m 59s)
                segundostotales = Math.floor(Math.random()*420)+540;
                // Guardamos el dato crudo en el array
                tiemposatletas[i-1] = segundostotales;
                // Convertimos a minutos y segundos SOLO para mostrárselo lindo al usuario en el bucle
                minutos = Math.floor(segundostotales/60);
                segundos = segundostotales%60;
                System.out.println("Atleta N° "+i+" - Tiempo: "+minutos+"m "+segundos+"s.");
                // EVALUAR MEJOR TIEMPO (El menor número de segundos es el más rápido)
                if (tiemposatletas[i-1]<mejortiempo) {
                    mejortiempo = tiemposatletas[i-1];
                    posicionganador = i;
                }
                // EVALUAR PEOR TIEMPO (El mayor número de segundos es el más lento)
                if (tiemposatletas[i-1]>peortiempo) {
                    peortiempo = tiemposatletas[i-1];
                }
            }
            System.out.println("--------------------------------------------------");
            System.out.println("****************** RESULTADOS ******************");
            // Convertimos el MEJOR tiempo de segundos a formato m y s
            minganador = Math.floor(mejortiempo/60);
            segganador = mejortiempo%60;
            // Convertimos el PEOR tiempo de segundos a formato m y s
            minpeor = Math.floor(peortiempo/60);
            segpeor = peortiempo%60;
            // Mostramos los resultados limpios y reales
            System.out.println("Ganador de la carrera: Atleta N° "+posicionganador);
            System.out.println("Mejor tiempo (Ganador): "+minganador+"m "+segganador+"s.");
            System.out.println("Peor tiempo: "+minpeor+"m "+segpeor+"s.");
            System.out.println("********************** FIN DE LA APLICACION ****************************");
        }


    }

