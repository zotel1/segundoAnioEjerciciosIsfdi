Algoritmo PerimetroPol
	// poligono rectangulo
	Escribir "ingrese medida de la base"
	leer b
	Si (b >= 0) o (b < 0) Entonces
		Escribir "ingrese la medida de la altura"
		leer h
		Si ( h >= 0) o (h < 0) Entonces
	
			perimetro = b * 2 + h * 2
			mostrar perimetro
		SiNo
			Escribir "la medida debe ser un numero"
		FinSi
		
	SiNo
		Escribir "la medida debe ser un numero"
	Fin Si
	

	
	
FinAlgoritmo
