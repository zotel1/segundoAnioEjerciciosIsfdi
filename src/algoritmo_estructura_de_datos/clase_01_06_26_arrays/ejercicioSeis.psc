Algoritmo ejercicioSeis
	// 6. En una carrera participan 25 atletas. 
	// Registrar tiempos de cada atleta.  
	// Mostrar:  
	// mejor tiempo,  
	// peor tiempo,  
	// posición del ganador. 
	
	Dimension tiemposAtletas[25]; // Array donde vamos a guardar los segundos totales de cada atleta
	Definir i, posicionGanador, segundosTotales Como Entero;
	Definir mejorTiempo, peorTiempo Como Entero;
	Definir minGanador, segGanador, minPeor, segPeor Como Entero;
	
	// Inicializamos las variables auxiliares con extremos medidos en SEGUNDOS
	mejorTiempo = 99999; // Buscamos el menor tiempo en segundos
	peorTiempo = 0;      // Buscamos el mayor tiempo en segundos
	posicionGanador = 0;
	
	Escribir "En una carrera participan 25 Atletas";
	Escribir "--------------------------------------------------";
	
	Para i <- 1 Hasta 25 Hacer
		// Generamos con la macro Azar un tiempo aleatorio entre 540s (9m) y 959s (15m 59s)
		segundosTotales <- Azar(420) + 540;
		
		// Guardamos el dato crudo en el array
		tiemposAtletas[i] <- segundosTotales;
		
		// Convertimos a minutos y segundos SOLO para mostrárselo lindo al usuario en el bucle
		minutos <- Trunc(segundosTotales / 60);
		segundos <- segundosTotales Mod 60;
		Escribir "Atleta N° ", i, " - Tiempo: ", minutos, "m ", segundos, "s.";
		
		// EVALUAR MEJOR TIEMPO (El menor número de segundos es el más rápido)
		Si tiemposAtletas[i] < mejorTiempo Entonces
			mejorTiempo <- tiemposAtletas[i];
			posicionGanador <- i;
		FinSi
		
		// EVALUAR PEOR TIEMPO (El mayor número de segundos es el más lento)
		Si tiemposAtletas[i] > peorTiempo Entonces
			peorTiempo <- tiemposAtletas[i];
		FinSi
	FinPara
	
	Escribir "--------------------------------------------------";
	Escribir "****************** RESULTADOS ******************";
	
	// Convertimos el MEJOR tiempo de segundos a formato m y s
	minGanador <- Trunc(mejorTiempo / 60);
	segGanador <- mejorTiempo Mod 60;
	
	// Convertimos el PEOR tiempo de segundos a formato m y s
	minPeor <- Trunc(peorTiempo / 60);
	segPeor <- peorTiempo Mod 60;
	
	// Mostramos los resultados limpios y reales
	Escribir "Ganador de la carrera: Atleta N° ", posicionGanador;
	Escribir "Mejor tiempo (Ganador): ", minGanador, "m ", segGanador, "s.";
	Escribir "Peor tiempo: ", minPeor, "m ", segPeor, "s.";
	Escribir "********************** FIN DE LA APLICACION ****************************";
	
FinAlgoritmo