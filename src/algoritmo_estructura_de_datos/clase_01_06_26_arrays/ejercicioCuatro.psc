Algoritmo ejercicioCuatro
		// 4. Un sistema debe verificar si un número existe dentro de una lista. 
		// Cargar un array con 20 números. 
		// Solicitar un número al usuario.  
		// Informar:  
		// Si el número ingresado por el usuario existe en el array,  
		// posición donde se encuentra. 
	Dimension listaNumeros[20];
	Definir  numeroUsuario, i Como Entero;
	Definir encontrado Como Logico; // Variable bandera para saber si existió o no
	
	encontrado = Falso; // Al principio asumimos que no está
	Escribir "Actividad cuatro";
	Escribir "Un sistema debe verificar si un número existe dentro de una lista.";
	Escribir "------------------------------------------";
	// PASO 1: Cargamos el array primero
	Escribir "Cargando la lista de números aleatorios...";
	Para i <- 1 Hasta 20 Hacer
		listaNumeros[i]<-Azar(20) + 1;
		Escribir "El número ingresado en la posicion [", i, "]  es el número[", listaNumeros[i],"]";
		
		Escribir "------------------------------------------";
	FinPara 
	// PASO ": Ahora que la lista existe le pedimos al usuario que ingrese un numero
	Escribir "Por favor ingrese un número entero, del 1 al 20";
	Leer numeroUsuario;
	
	Escribir "**************************************************";
	escribir "Resultado de la búsqueda:";
	// PASO 3: Buscamos en la lista
	para i = 1 Hasta 20 Hacer
		si numeroUsuario = listaNumeros[i] Entonces
			Escribir "¡Existe! El número ", numeroUsuario ," se encuentra en la lista, en la posición ", i;
			encontrado = Verdadero; // Encendemos la bandera por que encontramos al menos uno
		FinSi
	FinPara
	
	// PASO 4: Si revisamos toda la lista y la bandera siguio en Falso informamos el error
	Si encontrado = Falso Entonces
		Escribir "El número ", numeroUsuario, "No existe en la lista.";
	FinSi
	Escribir "********************** FIN DE LA APLICACION ****************************";
FinAlgoritmo
