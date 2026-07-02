/* Este codigo ha sido generado por el modulo psexport 20230904-l64 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CALCULADORAPSEINT.java."

import java.io.*;

public class calculadoraPseintjava {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int desicion;
		double div;
		String eleccion;
		double mult;
		double primernumero;
		double res;
		double segundonumero;
		double sum;
		// 1- Diseñar un algoritmo en pseint que trabaje en forma de calculadora ingrresando datos de tipo flotante.
		// 2- DIseñar el algoritmo del punto anterior en lenguaje python.
		// 3- Diseñar el algoritmo en lenguaje C.
		// 4- Explicar por bloque como funciona la calculadora.
		System.out.println("************************************************** INICIO DE LA APLICACIÓN **************************************************");
		System.out.println("------------------------------------------------- CALCULADORA -------------------------------------------------");
		System.out.println("Desea realizar una operación? [s/n]");
		eleccion = bufEntrada.readLine();
		while ((eleccion.equals("s"))) {
			System.out.println("Elija una de las siguientes operaciones: ");
			System.out.println("1- Suma.");
			System.out.println("2- Resta.");
			System.out.println("3- Multiplicacion.");
			System.out.println("4- División.");
			desicion = Integer.parseInt(bufEntrada.readLine());
			if (desicion<1) {
				System.out.println("Debe elegir una opcion entre 1 y 4");
			} else {
				if (desicion>4) {
					System.out.println("Debe elegir una opcin entre 1 y 4");
				} else {
					if (desicion==1) {
						System.out.println("Ingrese el primer numero a sumar:");
						primernumero = Double.parseDouble(bufEntrada.readLine());
						System.out.println("Ingrese el segundo numero a sumar: ");
						segundonumero = Double.parseDouble(bufEntrada.readLine());
						sum = primernumero+segundonumero;
						System.out.println("La suma entre el número "+primernumero+" y el número "+segundonumero+" es: "+sum);
					}
					if (desicion==2) {
						System.out.println("Ingrese el primer numero a restar:");
						primernumero = Double.parseDouble(bufEntrada.readLine());
						System.out.println("Ingrese el segundo numero a restar: ");
						segundonumero = Double.parseDouble(bufEntrada.readLine());
						res = primernumero-segundonumero;
						System.out.println("La resta del número "+primernumero+" al número "+segundonumero+" es: "+res);
					}
					if (desicion==3) {
						System.out.println("Ingrese el primer numero a multiplicar:");
						primernumero = Double.parseDouble(bufEntrada.readLine());
						System.out.println("Ingrese el segundo numero a multiplicar: ");
						segundonumero = Double.parseDouble(bufEntrada.readLine());
						mult = primernumero*segundonumero;
						System.out.println("La multiplicación entre el número "+primernumero+" y el número "+segundonumero+" es: "+mult);
					}
					if (desicion==4) {
						System.out.println("Ingrese el primer numero a dividir:");
						primernumero = Double.parseDouble(bufEntrada.readLine());
						System.out.println("Ingrese el segundo numero a dividir: ");
						segundonumero = Double.parseDouble(bufEntrada.readLine());
						if ((primernumero==0) && (segundonumero==0)) {
							System.out.println("No se puede realizar la operacion de "+primernumero+"dividido "+segundonumero);
						} else {
							if ((segundonumero==0)) {
								System.out.println(" no existe un núero que multiplicado por 0 de "+primernumero);
							} else {
								div = primernumero/segundonumero;
								System.out.println("La divisin del número "+primernumero+" al número "+segundonumero+" es: "+div);
							}
						}
					}
				}
			}
			System.out.println("-------------------------------------------------             -------------------------------------------------");
			System.out.println("Desea realizar una operación?");
			eleccion = bufEntrada.readLine();
		}
		System.out.println("************************************************** FIN DE LA APLICACIÓN **************************************************");
	}


}

