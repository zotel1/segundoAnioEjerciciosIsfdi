package algoritmo_estructura_de_datos.clase_25_06_26_ordenamiento_vesctores;

public class ActividadUnoConFunciones {

        public static void main(String[] args) {
            // Declaración e inicialización del vector
            int[] vectorEst = new int[6];
            vectorEst[0] = 7;
            vectorEst[1] = 9;
            vectorEst[2] = 5;
            vectorEst[3] = 10;
            vectorEst[4] = 8;
            vectorEst[5] = 6;

            System.out.println("------------------------- INICIO DE LA APLICACIÓN -------------------------");

            // 1. Mostrar notas originales
            System.out.println("La nota de los alumnos es: ");
            mostrarVector(vectorEst);

            // 2. Llamada a la función de ordenamiento (Método Burbuja Descendente)
            ordenarBurbujaDescendente(vectorEst);

            // 3. Mostrar el ranking de notas ordenadas
            System.out.println("\n ");
            System.out.println("====================================");
            System.out.println("Ranking de notas ");
            System.out.println("====================================");
            System.out.println("Desde la nota más alta a la más baja");
            mostrarVector(vectorEst);

            System.out.println("\n------------------------- FIN DE LA APLICACIÓN -------------------------");
        }

        /**
         * Función encargada de imprimir en pantalla los elementos de un vector.
         * @param vector Arreglo de enteros a mostrar.
         */
        public static void mostrarVector(int[] vector) {
            for (int i = 0; i < vector.length; i++) {
                System.out.print(vector[i] + ", ");
            }
        }

        /**
         * Función que ordena un vector de enteros de mayor a menor
         * utilizando el algoritmo de Ordenamiento Burbuja.
         * @param vector Arreglo de enteros que se modificará por referencia.
         */
        public static void ordenarBurbujaDescendente(int[] vector) {
            int aux;
            // El bucle externo recorre todo el vector
            for (int i = 0; i < vector.length; i++) {
                // El bucle interno compara elementos adyacentes hasta la penúltima posición
                for (int j = 0; j < vector.length - 1; j++) {
                    // Si el elemento actual es menor que el siguiente, se intercambian (descendente)
                    if (vector[j] < vector[j + 1]) {
                        aux = vector[j];
                        vector[j] = vector[j + 1];
                        vector[j + 1] = aux;
                    }
                }
            }
        }
    }

