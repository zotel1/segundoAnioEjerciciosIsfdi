Algoritmo aprobarMATERIAS
	definir nota1, nota2 Como Entero
	Definir asistencia, promedio Como Real
	escribir "ingrese la nota del primer parcial"
	leer nota1
	Escribir "Ingrese la nota del segundo"
	leer nota2
	Escribir "Omgrese el porcentaje de asistencia"
	leer asistencia
	promedio = redon( (nota1 + nota2) /2)
	DEFINIR asi Como Caracter
	Si expresion_logica Entonces
		acciones_por_verdadero
	SiNo
		acciones_por_falso
	Fin Si
FinAlgoritmo
