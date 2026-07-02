Algoritmo ejercicioOcho
	// 8. Dos cursos rindieron el mismo examen. 
	// Guardar notas de ambos cursos.  
	// Determinar:  
	// cuál tuvo mejor promedio,  
	// cuántos aprobaron en cada curso.
	
	// Definimos variables para los tamaños
	Definir cantAlumnosA, cantAlumnosB, i Como Entero;
	
	// Variables para cálculos del Curso A
	Definir totalNotasA, promedioA Como Real;
	Definir aprobadosA, desaprobadosA Como Entero;
	
	// Variables para cálculos del Curso B
	Definir totalNotasB, promedioB Como Real;
	Definir aprobadosB, desaprobadosB Como Entero;
	
	// Inicializamos variables
	totalNotasA <- 0; aprobadosA <- 0;
	totalNotasB <- 0; aprobadosB <- 0;
	
	Escribir "=== SISTEMA DE COMPARACIÓN DE NOTAS ===";
	
	// 1. Pedimos los tamaños de los cursos
	Escribir "¿Cuántos alumnos rindieron en el CURSO A?:";
	Leer cantAlumnosA;
	Escribir "¿Cuántos alumnos rindieron en el CURSO B?:";
	Leer cantAlumnosB;
	
	// 2. Dimensionamos los arrays dinámicamente con los datos del usuario
	Dimension notasCursoA[cantAlumnosA];
	Dimension notasCursoB[cantAlumnosB];
	
	Escribir "--------------------------------------------------";
	Escribir "PROCESANDO CURSO A...";
	// 3. Cargamos y procesamo el Curso A
	Para i <- 1 Hasta cantAlumnosA Hacer
		notasCursoA[i] <- Azar(10) + 1; // Notas del 1 al 10
		totalNotasA <- totalNotasA + notasCursoA[i];
		
		Si notasCursoA[i] >= 6 Entonces
			aprobadosA <- aprobadosA + 1;
		FinSi
	FinPara
	Escribir "¡Notas del Curso A cargadas con éxito!";
	
	Escribir "--------------------------------------------------";
	Escribir "PROCESANDO CURSO B...";
	// 4. Cargamos y procesamos el Curso B
	Para i <- 1 Hasta cantAlumnosB Hacer
		notasCursoB[i] <- Azar(10) + 1;
		totalNotasB <- totalNotasB + notasCursoB[i];
		
		Si notasCursoB[i] >= 6 Entonces
			aprobadosB <- aprobadosB + 1;
		FinSi
	FinPara
	Escribir "¡Notas del Curso B cargadas con éxito!";
	
	Escribir "--------------------------------------------------";
	Escribir "****************** REPORTE GENERAL ******************";
	
	// 5. Calculamos promedios (validando que no sea división por cero)
	Si cantAlumnosA > 0 Entonces promedioA <- totalNotasA / cantAlumnosA; Sino promedioA <- 0; FinSi
		Si cantAlumnosB > 0 Entonces promedioB <- totalNotasB / cantAlumnosB; Sino promedioB <- 0; FinSi
			
			// Mostramos datos individuales pedidos por la consigna
			Escribir "CURSO A: ", aprobadosA, " alumnos aprobados. Promedio del curso: ", promedioA;
			Escribir "CURSO B: ", aprobadosB, " alumnos aprobados. Promedio del curso: ", promedioB;
			Escribir "--------------------------------------------------";
			
			// 6. Determinamos cuál tuvo mejor promedio
			Si promedioA > promedioB Entonces
				Escribir "Resultado: El CURSO A tuvo un mejor promedio general (", promedioA, ").";
			Sino
				Si promedioB > promedioA Entonces
					Escribir "Resultado: El CURSO B tuvo un mejor promedio general (", promedioB, ").";
				Sino
					Escribir "Resultado: Ambos cursos obtuvieron exactamente el mismo promedio (", promedioA, ").";
				FinSi
			FinSi
			
			Escribir "********************** FIN ****************************";
			
FinAlgoritmo
