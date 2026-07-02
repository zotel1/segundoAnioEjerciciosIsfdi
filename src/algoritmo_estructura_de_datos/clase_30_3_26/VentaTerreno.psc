Algoritmo VentaTerreno
	Escribir "Primero calculamos el area del rectangulo"
	escribir "ingresar el lado B"
	leer B
	
	Escribir "Ingresa el lado C"
	
	leer C
	areaRectangulo = B * C
	
	escribir "Area rectangulo es ", areaRectangulo
	
	escribir "Area triangulo"
	
	escribir "Ingrese el valor de A"
	leer A
	areaTriangulo = B * (A - C) / 2
	
	Escribir "Area de triangulo es ", areaTriangulo
	escribir "El area del terreno es " areaRectangulo + areaTriangulo
FinAlgoritmo
