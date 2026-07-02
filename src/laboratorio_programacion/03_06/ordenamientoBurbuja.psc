Algoritmo ordenamientoBurbuja
	Dimensionar Vnumero[5]
	Escribir "Ingrese 5 números"
	Escribir "Por ejemplo [5, 0, 8, 3, 20]"
	para i = 1 Hasta 5 Con Paso 1 Hacer
		Leer Vnumero[i]
	FinPara
	
	para j = 1 Hasta  5 Con Paso 1 // lee repeticion
		para i= 1 Hasta 4 Con Paso 1 // lee vectores
			Escribir"Vnumero[i + 1] vale: ", Vnumero[i + 1], " en la posicion ", i,". Y Vnumero[i] vale:", Vnumero[i], " en la posicion ", i +1
			Escribir "-------------------------------------"
			si Vnumero[i + 1] < Vnumero[i] Entonces
				
				aux = Vnumero[i]
				Escribir "asignamos ", aux, " a la variable aux. Proveniente de Vnumero[i] " 
				Vnumero[i] = Vnumero[i + 1]
				Escribir "asignamos ", Vnumero[i + 1], " a la variable Vnumero[i]. Proveniente de Vnumero[i + 1]"
				Vnumero[i + 1] = aux
				Escribir "asignamos ", aux, " a la variable Vnumero[i + 1]. Proveniente de aux."
				
			FinSi
		FinPara
		Escribir "vuelta numero: ", j
	FinPara
	escribir "Vector ordenado"
	para i = 1 Hasta 5 Con Paso 1
		Escribir Vnumero[i]
	FinPara
	
FinAlgoritmo
