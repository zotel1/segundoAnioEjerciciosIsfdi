Algoritmo ejercicioCinco
	// 5. Un laboratorio registra temperaturas durante 7 días. 
	// Guardar temperaturas diarias.  
	// Informar:  
	// temperatura máxima,  
	// mínima,  
	// promedio,  
	// días con temperatura superior al promedio.  
	Dimensionar diasSemana[7];
	Dimension temperaturaSemanal[7];
	Definir i Como Entero;
	definir tempMax, tempMin, tempProm, tempSup, tempTotal  Como Real;
	tempTotal = 0;
	tempMax = -100;
	tempMin = 100;
	
	diasSemana[1] = "Lunes";
	diasSemana[2] = "Martes";
	diasSemana[3] = "Miercoles";
	diasSemana[4] = "Jueves";
	diasSemana[5] = "Viernes";
	diasSemana[6] = "Sabado";
	diasSemana[7] = "Domingo";
	Escribir "Actividad cinco";
	Escribir "Un laboratorio registra temperaturas durante 7 dias.";
	Escribir "------------------------------------------";
	
	Para i <- 1 Hasta 7 Hacer
		
		Escribir "Ingresa la temperatura del dia ", diasSemana[i];
		leer temperaturaSemanal[i];
		
		si temperaturaSemanal[i] > tempMax Entonces
			tempMax = temperaturaSemanal[i];
		FinSi
		si temperaturaSemanal[i] < tempMin Entonces
			tempMin = temperaturaSemanal[i];
		FinSi
		
		tempTotal = tempTotal + temperaturaSemanal[i];
		Escribir "------------------------------------------";
		
	FinPara
	tempProm = tempTotal / 7;
	Escribir "**************************************************";
	Escribir "La temperatura maxima es: ", tempMax;
	Escribir "La temperatura minima es: ", tempMin;
	Escribir "La temperatura promedio es: ", tempProm;
	
	para i <- 1 Hasta 7 Hacer
		si tempProm < temperaturaSemanal[i] Entonces
			Escribir "La temperatura del dia ", diasSemana[i], ", supero con ", temperaturaSemanal[i]," grados la temperatura promedio de ", tempProm, " grados.";
		FinSi
	FinPara

	Escribir "********************** FIN DE LA APLICACION ****************************";
	
FinAlgoritmo
