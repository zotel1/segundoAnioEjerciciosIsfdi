Algoritmo CalculoIMC
	escribir "ingresar el peso en kg."
	leer peso
	escribir "Ingrese su altura en m"
	leer altura
	IMC = peso / (altura * altura) 
	Escribir "el imc es ", IMC
	Si (IMC < 18) Entonces
		Escribir "el peso es BAJO"
	SiNo
		Escribir "Su peso no esta bajo"
	Fin Si
	
FinAlgoritmo
