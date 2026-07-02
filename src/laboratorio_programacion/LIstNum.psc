Algoritmo LIstNum
	Definir listaNumeros, i Como Entero
	definir i Como Real
	Dimension listaNumeros[5]
	
	Para i = 1 Hasta 5 con paso 1 Hacer
		Escribir "Ingrese el numero para la posicion ", i, ":"
		Leer listaNumeros[i]
	FinPara
	Escribir "-------------------------------"
	Escribir "La lista de numeros guardadas en el vector es: "
	Escribir "-------------------------------"
	
	Para i = 1 Hasta 5 con paso 1 Hacer
		Escribir "Posicion ", i, ":", listaNumeros[i]
		
	FinPara
	
FinAlgoritmo
