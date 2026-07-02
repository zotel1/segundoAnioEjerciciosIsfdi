Algoritmo vecNumEjercicioUno
	definir i Como Entero
	Dimensionar vecNumeroUno[5]
	Dimensionar vecNumeroDos[5]
	definir acumProm Como Real
	Definir  longitudArr Como Entero
	Definir prom Como Real
	acumProm = 0
	
	// Agregar un promedio
	//PAra  saber de promedios hay que agregar un acumulador y un contador
	
	
	
	//Para i = 1 Hasta 5 Hacer
		//Escribir "Posicion: ", vecNumero[i]
		vecNumeroUno[1] = 28
		vecNumeroUNo[2] = 10
		vecNumeroUno[3] = 30
		vecNumeroUno[4] = 7
		vecNumeroUno[5] = 9
		
		//FinPara
		
	
		
	Escribir "Cargar datos automatica: " 
	Para i = 1 Hasta 5 Hacer
		Escribir "Datos en la fila ", i
		Escribir vecNumeroUno[i]
		
		acumProm = acumProm + vecNumeroUno[i]
	FinPara
	
	longitudArr = Longitud(vecNumeroUno)
	
	prom = (acumProm / longitudArr)
	Escribir "El promedio es: ",prom
	
	
	
	Escribir "Carga de datos manual: "
	
	Para i = 1 hasta 5 Hacer
		
		Escribir "Agregue datos en la fila: ", i
		Leer vecNumeroDos[i]
	FinPara
	
	Escribir "************************************* Mostrar datos ******************************************" 
	
	Para i = 1 Hasta 5 Hacer
		Escribir "El dato ingresado en la fila: ", i, " es: "
		Escribir vecNumeroDos[i]
	FinPara
	
FinAlgoritmo
