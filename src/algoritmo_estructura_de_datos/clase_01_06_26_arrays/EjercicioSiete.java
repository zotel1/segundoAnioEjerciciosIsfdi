package algoritmo_estructura_de_datos.clase_01_06_26_arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioSiete {
    /* Este codigo ha sido generado por el modulo psexport 20230904-l64 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "EJERCICIOSIETE.java."

        public static void main(String args[]) throws IOException {
            BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
            boolean empate;
            boolean encontrado = true;
            int i;
            String nombrescandidatos[];
            double porcentaje;
            int posicionganador;
            int totalvotantes;
            double votoscandidatos[];
            int votosganador;
            int votousuario;
            // 7. En una elección participan 5 candidatos.
            // Registrar votos en un array.
            // Mostrar:
            // votos por candidato,
            // ganador,
            // porcentaje de votos.
            nombrescandidatos = new String[3];
            votoscandidatos = new double[3];
            // Cargamos los nombres de los candidatos
            nombrescandidatos[0] = "Candidato A";
            nombrescandidatos[1] = "Candidato B";
            nombrescandidatos[2] = "Candidato C";
            // Inicializamos los votos de cada uno en cero
            for (i=1; i<=3; ++i) {
                votoscandidatos[i-1] = 0;
            }
            System.out.println("=== SISTEMA DE ESCRUTINIO DE VOTOS ===");
            System.out.println("¿Cuántas personas van a votar en total?:");
            totalvotantes = Integer.parseInt(bufEntrada.readLine());
            System.out.println("--------------------------------------------------");
            System.out.println("OPCIONES DE VOTO:");
            System.out.println("1 - "+nombrescandidatos[0]);
            System.out.println("2 - "+nombrescandidatos[1]);
            System.out.println("3 - "+nombrescandidatos[2]);
            System.out.println("--------------------------------------------------");
            // Bucle para registrar los votos
            for (i=1; i<=totalvotantes; ++i) {
                // Opción A: Ingreso manual por teclado
                System.out.println("Votante N° "+i+", ingrese el número de su candidato: ");
                // Leer votoUsuario;
                votousuario = (int) (Math.random()*3)+1; // Casteamos el resultado a int
                // Validamos que el voto sea correcto (entre 1 y 3)
                if (votousuario>=1 && votousuario<=3) {
                    // Sumamos un voto al candidato elegido en su respectiva posición
                    votoscandidatos[votousuario-1] = votoscandidatos[votousuario-1]+1;
                } else {
                    System.out.println("Voto anulado. Opción no válida.");
                }
            }
            System.out.println("--------------------------------------------------");
            System.out.println("****************** RESULTADOS ******************");
            votosganador = -1;
            posicionganador = 0;
            empate = false;
            // Procesamos los resultados y buscamos al ganador
            for (i=1; i<=3; ++i) {
                // Calculamos el porcentaje (votos parciales / total * 100)
                if (totalvotantes>0) {
                    porcentaje = (votoscandidatos[i-1]/totalvotantes)*100;
                } else {
                    porcentaje = 0;
                }
                // Mostramos votos y porcentajes por candidato
                System.out.println(nombrescandidatos[i-1]+": "+votoscandidatos[i-1]+" votos ("+porcentaje+"%)");
                // Lógica para determinar el ganador (Mayor)
                if (votoscandidatos[i-1]>votosganador) {
                    votosganador = (int) votoscandidatos[i-1];
                    posicionganador = i;
                    empate = false;
                    // Hay un nuevo líder absoluto
                } else {
                    if (votoscandidatos[i-1]==votosganador) {
                        empate = true;
                        // Hay un empate en el primer puesto
                    }
                }
            }
            System.out.println("--------------------------------------------------");
            // Informamos el ganador o si hubo empate
            if (empate==encontrado || posicionganador==0) {
                System.out.println("Resultado: Hubo un EMPATE técnico o no hubo votos válidos.");
            } else {
                System.out.println("¡GANADOR!: "+nombrescandidatos[posicionganador-1]+" con "+votosganador+" votos.");
            }
            System.out.println("********************** FIN DE LA APLICACION ****************************");
        }


    }
