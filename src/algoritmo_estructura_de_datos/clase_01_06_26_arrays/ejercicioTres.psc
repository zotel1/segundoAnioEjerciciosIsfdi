Algoritmo ejercicioTres
	
	// 3. Un docente necesita analizar las notas de un curso. 
	// Ingresar las notas de 40 estudiantes.  
	// Mostrar:  
	// cantidad de estudiantes aprobados y desaprobados,
	// nota más alta,  
	// nota más baja,  
	// promedio de notas del curso.
	
	Dimension estudiantes[40]
	Definir promedioNotas, totalNotas Como Real
	Definir  notaMasAlta, notaMasBaja, desaprobados, aprobados Como Entero
	notaMasAlta = 0
	notaMasBaja = 10
	aprobados = 0
	desaprobados = 0
	totalNotas = 0
	Escribir "Actividad tres"
	Escribir "Un docente necesita analizar las notas de un curso de 40 estudiantes."
	Escribir "------------------------------------------"
	Para i <- 1 Hasta 40 Hacer
		estudiantes[i]<-Azar(10) + 1
		Escribir "La profesora ah ingresado la nota del estudiante: ", i
		si estudiantes[i] > notaMasAlta Entonces
			notaMasAlta = estudiantes[i]
		FinSi
		si estudiantes[i] < notaMasBaja Entonces
			notaMasBaja = estudiantes[i]
		FinSi
		si estudiantes[i] < 6 Entonces
			desaprobados = desaprobados + 1
		FinSi
		si estudiantes[i] >= 6 Entonces
			aprobados = aprobados + 1
		FinSi
		
		totalNotas = totalNotas + estudiantes[i]
		Escribir "La nota del estudiante ", i ," es un ", estudiantes[i], "."
		Escribir "------------------------------------------"
	FinPara 
	
	Escribir "**************************************************"
	promedioNotas = totalNotas / 40
	Escribir aprobados, " alumnos aprobaron la materia."
	Escribir desaprobados, " alumnos desaprobaron la materia."
	Escribir "La nota más alta es: ", notaMasAlta
	Escribir "La nota más baja es: ", notaMasBaja
	Escribir "El promedio de notas es de: ", promedioNotas
	Escribir "********************** FIN DE LA APLICACION ****************************"
	
FinAlgoritmo
