Algoritmo ejercicioSiete
	
	// 7. En una elección participan 5 candidatos. 
	// Registrar votos en un array.  
	// Mostrar:  
	// votos por candidato,  
	// ganador,  
	// porcentaje de votos. 
	Dimension nombresCandidatos[3];
	Dimension votosCandidatos[3];
	
	Definir i, totalVotantes, votoUsuario, votosGanador, posicionGanador Como Entero;
	Definir porcentaje Como Real;
	Definir empate Como Logico;
	
	// Cargamos los nombres de los candidatos
	nombresCandidatos[1] <- "Candidato A";
	nombresCandidatos[2] <- "Candidato B";
	nombresCandidatos[3] <- "Candidato C";
	
	// Inicializamos los votos de cada uno en cero
	Para i <- 1 Hasta 3 Hacer
		votosCandidatos[i] <- 0;
	FinPara
	
	Escribir "=== SISTEMA DE ESCRUTINIO DE VOTOS ===";
	Escribir "¿Cuántas personas van a votar en total?:";
	Leer totalVotantes;
	
	Escribir "--------------------------------------------------";
	Escribir "OPCIONES DE VOTO:";
	Escribir "1 - ", nombresCandidatos[1];
	Escribir "2 - ", nombresCandidatos[2];
	Escribir "3 - ", nombresCandidatos[3];
	Escribir "--------------------------------------------------";
	
	// Bucle para registrar los votos
	Para i <- 1 Hasta totalVotantes Hacer
		// Opción A: Ingreso manual por teclado
		Escribir "Votante N° ", i, ", ingrese el número de su candidato: ";
		// Leer votoUsuario;
		
		votoUsuario <- Azar(3) + 1; 
		
		// Validamos que el voto sea correcto (entre 1 y 3)
		Si votoUsuario >= 1 Y votoUsuario <= 3 Entonces
			// Sumamos un voto al candidato elegido en su respectiva posición
			votosCandidatos[votoUsuario] <- votosCandidatos[votoUsuario] + 1;
		Sino
			Escribir "Voto anulado. Opción no válida.";
		FinSi
	FinPara
	
	Escribir "--------------------------------------------------";
	Escribir "****************** RESULTADOS ******************";
	
	votosGanador <- -1;
	posicionGanador <- 0;
	empate <- Falso;
	
	// Procesamos los resultados y buscamos al ganador
	Para i <- 1 Hasta 3 Hacer
		// Calculamos el porcentaje (votos parciales / total * 100)
		Si totalVotantes > 0 Entonces
			porcentaje <- (votosCandidatos[i] / totalVotantes) * 100;
		Sino
			porcentaje <- 0;
		FinSi
		
		// Mostramos votos y porcentajes por candidato
		Escribir nombresCandidatos[i], ": ", votosCandidatos[i], " votos (", porcentaje, "%)";
		
		// Lógica para determinar el ganador (Mayor)
		Si votosCandidatos[i] > votosGanador Entonces
			votosGanador <- votosCandidatos[i];
			posicionGanador <- i;
			empate <- Falso; // Hay un nuevo líder absoluto
		Sino
			Si votosCandidatos[i] = votosGanador Entonces
				empate <- Verdadero; // Hay un empate en el primer puesto
			FinSi
		FinSi
	FinPara
	
	Escribir "--------------------------------------------------";
	
	// Informamos el ganador o si hubo empate
	Si empate = Encontrado O posicionGanador = 0 Entonces
		Escribir "Resultado: Hubo un EMPATE técnico o no hubo votos válidos.";
	Sino
		Escribir "¡GANADOR!: ", nombresCandidatos[posicionGanador], " con ", votosGanador, " votos.";
	FinSi
	
	Escribir "********************** FIN DE LA APLICACION ****************************";
	
FinAlgoritmo
