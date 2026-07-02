Algoritmo ejercicioDos
	// 2. Se realiza una encuesta a 50 personas sobre la edad. 
	// Guardar las edades en un array.  
	// Determinar:  
	// cuántos son mayores de edad,  
	// cuántos son menores,  
	// edad máxima,  
	// edad promedio. 
	Dimension personas[50]
	Definir promedioEdad, totalEdad Como Real
	Definir  edadMaxima, menoresEdad, mayoresEdad Como Entero
	menoresEdad = 0
	mayoresEdad = 0
	edadMaxima = 0
	totalEdad = 0
	Escribir "Actividad dos"
	Escribir "Se realiza una encuesta a 50 personas sobre la edad."
	Escribir "------------------------------------------"
	Para i <- 1 Hasta 50 Hacer
		personas[i]<-Azar(130) + 1
		Escribir "La persona ", i, " ah ingresado su edad."
		si personas[i] > edadMaxima Entonces
			edadMaxima = personas[i]
		FinSi
		si personas[i] < 18 Entonces
			menoresEdad = menoresEdad + 1
		FinSi
		si personas[i] >= 18 Entonces
			mayoresEdad = mayoresEdad + 1
		FinSi
		
		totalEdad = totalEdad + personas[i]
		Escribir "Tiene ", personas[i], " años."
	FinPara 
	Escribir "------------------------------------------"
	Escribir "**************************************************"
	promedioEdad = totalEdad / 50
	Escribir mayoresEdad, " personas son mayores de edad."
	Escribir menoresEdad, " personas son menores de edad."
	Escribir "La edad maxima es ", edadMaxima
	Escribir "La edad promedio es de: ", promedioEdad
	Escribir "********************** FIN DE LA APLICACION ****************************"
FinAlgoritmo
