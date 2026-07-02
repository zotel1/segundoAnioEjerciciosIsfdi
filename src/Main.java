import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        String alumno = "";
        Scanner lecturaNombreApellido = new Scanner(System.in);
        Scanner EdadAlumnos = new Scanner(System.in);

        int opcion = 0;

        //int alumnos = 0;
       // opcion = lectura.nextInt();
       // for (int alumnos = 0; alumnos <= 5; alumnos++) {

        System.out.println("Ingrese el nombre del alumno: ");

        alumno = lecturaNombreApellido.nextLine();

        System.out.println("Ingrese la edad del alumno número" + opcion + ":"  );

        alumno = lecturaNombreApellido.nextLine();

        System.out.println("El primer alumno se llama: " + alumno);

           // opcion = lectura.nextInt();
        }
    }
//}