package algoritmo_estructura_de_datos.clase_01_06_26_arrays;

public class EjercicioDos {
    public class ejerciciodos {

        public static void main(String args[]) {
            int edadmaxima;
            int i;
            int mayoresedad;
            int menoresedad;
            int personas[];
            double promedioedad;
            double totaledad;
            // 2. Se realiza una encuesta a 50 personas sobre la edad.
            // Guardar las edades en un array.
            // Determinar:
            // cuántos son mayores de edad,
            // cuántos son menores,
            // edad máxima,
            // edad promedio.
            personas = new int[50];
            menoresedad = 0;
            mayoresedad = 0;
            edadmaxima = 0;
            totaledad = 0;
            System.out.println("Actividad dos");
            System.out.println("Se realiza una encuesta a 50 personas sobre la edad.");
            System.out.println("------------------------------------------");
            for (i=1; i<=50; ++i) {
                personas[i] = (int) (Math.random()*130)+1;;
                System.out.println("La persona "+i+" ah ingresado su edad.");
                if (personas[i-1]>edadmaxima) {
                    edadmaxima = personas[i-1];
                }
                if (personas[i-1]<18) {
                    menoresedad = menoresedad+1;
                }
                if (personas[i-1]>=18) {
                    mayoresedad = mayoresedad+1;
                }
                totaledad = totaledad+personas[i-1];
                System.out.println("Tiene "+personas[i-1]+" años.");
            }
            System.out.println("------------------------------------------");
            System.out.println("**************************************************");
            promedioedad = totaledad/50;
            System.out.println(mayoresedad+" personas son mayores de edad.");
            System.out.println(menoresedad+" personas son menores de edad.");
            System.out.println("La edad maxima es "+edadmaxima);
            System.out.println("La edad promedio es de: "+promedioedad);
            System.out.println("********************** FIN DE LA APLICACION ****************************");
        }
    }
}
