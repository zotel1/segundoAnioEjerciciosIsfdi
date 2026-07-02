#include<stdio.h>
#include<string.h>

int main() {
	int desicion;
	float div;
	char opcion[8]="s";
	float mult;
	float primernumero;
	float res;
	float segundonumero;
	float sum;
	printf("************************************************** INICIO DE LA APLICACIÓN **************************************************\n");
	printf("------------------------------------------------- CALCULADORA -------------------------------------------------\n");
	while ((strcmp(opcion, "s")==0)) {
		printf("Elija una de las siguientes operaciones: \n");
		printf("1- Suma.\n");
		printf("2- Resta.\n");
		printf("3- Multiplicacion.\n");
		printf("4- División.\n");
		scanf("%i", &desicion);
		if (desicion<1) {
			printf("Debe elegir una opcion entre 1 y 4\n");
		} else {
			if (desicion>4) {
				printf("Debe elegir una opcin entre 1 y 4\n");
			} else {
				if (desicion==1) {
					printf("Ingrese el primer numero a sumar:\n");
					scanf("%f", &primernumero);
					printf("Ingrese el segundo numero a sumar: \n");
					scanf("%f", &segundonumero);
					sum = primernumero+segundonumero;
					printf("La suma entre el número %f y el número %f es: %f\n", primernumero, segundonumero, sum);
				}
				if (desicion==2) {
					printf("Ingrese el primer numero a restar:\n");
					scanf("%f", &primernumero);
					printf("Ingrese el segundo numero a restar: \n");
					scanf("%f", &segundonumero);
					res = primernumero-segundonumero;
					printf("La resta del número %f al número %f es: %f\n", primernumero, segundonumero, res);
				}
				if (desicion==3) {
					printf("Ingrese el primer numero a multiplicar:\n");
					scanf("%f", &primernumero);
					printf("Ingrese el segundo numero a multiplicar: \n");
					scanf("%f", &segundonumero);
					mult = primernumero*segundonumero;
					printf("La multiplicación entre el número %f y el número %f es: %f\n", primernumero, segundonumero, mult);
				}
				if (desicion==4) {
					printf("Ingrese el primer numero a dividir:\n");
					scanf("%f", &primernumero);
					printf("Ingrese el segundo numero a dividir: \n");
					scanf("%f", &segundonumero);
					if ((primernumero==0) && (segundonumero==0)) {
						printf("No se puede realizar la operacion de %fdividido %f\n", primernumero, segundonumero);
					} else {
						if ((segundonumero==0)) {
							printf(" no existe un núero que multiplicado por 0 de %f\n", primernumero);
						} else {
							div = primernumero/segundonumero;
							printf("La divisin del número %f al número %f es: %f\n", primernumero, segundonumero, div);
						}
					}
				}
			}
		}
		printf("---------------------------------------------------------------------------------------------------------------\n");
		printf("Desea realizar una operación? [s/n]\n");
		scanf("%s", opcion);
	}
	printf("************************************************** FIN DE LA APLICACIÓN **************************************************\n");
	return 0;
}
