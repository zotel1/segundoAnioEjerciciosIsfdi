package algoritmo_estructura_de_datos.guia_seis;

public class Actividad_cinco {

    public static void main(String[] args) {


        //  Los títulos de los libros se almacenan en un vector:
        //Historia Matemática Arte Biología Psicología TIC
        //La bibliotecaria necesita organizarlos alfabéticamente.
        String[] titulosLibros = new String[6];

        titulosLibros[0] = "Historia";
        titulosLibros[1] = "Matemática";
        titulosLibros[2] = "Arte";
        titulosLibros[3] = "Biología";
        titulosLibros[4] = "Psicología";
        titulosLibros[5] = "TIC";

        // EN string tenemos el metodo compare to,
        // que nos dice que si tenemos una palabra que va antes que la segunda palabra y esta bien ordenada
        // nos devolveria un -1

        for (int i = 0; i < titulosLibros.length; i++) {
            System.out.println("Actualmente el orden de los libros es: " + titulosLibros[i]);
        }

        for (int i = 0; i < titulosLibros.length; i++) {
            for (int j = 0; j < titulosLibros.length - 1; j++) {
                String varAux = "";
                // En este caso si el primer valor es decir a esta en la primera posicion
                // y b en la segunda posicion seria un -1
                if (titulosLibros[j].compareToIgnoreCase(titulosLibros[j + 1]) > 0) {
                    varAux = titulosLibros[j];
                    titulosLibros[j] = titulosLibros[j + 1];
                    titulosLibros[j + 1] = varAux;
                }
            }
        }

        System.out.println("El orden de los libros alfabeticamenmte seria: ");
        for (int i = 0; i < titulosLibros.length; i++) {
            System.out.println(titulosLibros[i]);
        }
    }
}
