Algoritmo ejercicioUno
	// 1. Una tienda registra las ventas de 12 meses del año. 
	// Guardar las ventas mensuales en un array.  
	// Informar:  
	// mes con mayores ventas,  
	// mes con menores ventas,  
	// total anual,  
	// promedio mensual.  
	// Creamos el Array
	
	Definir promedioMensual, totalAnual, mesMayor, mesMenor Como Real
	Dimension meses[12], ventaAnual[12]
	// Cargamos datos al Array de meses
	meses(1) = "Enero"
	meses(2) = "Febrero"
	meses(3) = "Marzo"
	meses(4) = "Abril"
	meses(5) = "Mayo"
	meses(6) = "Junio"
	meses(7) = "Julio"
	meses(8) = "Agosto"
	meses(9) = "Septiembre"
	meses(10) = "Octubre"
	meses(11) = "Noviembre"
	meses(12) = "Diciembre"
	mesMayor = -99999
	mesMenor = 999999
	totalAnual = 0
	// Definimos variables auxiliares 
	
	Escribir "Actividad uno"
	Escribir "Una tienda registra las ventas de 12 meses del año."
	Escribir "Orden de meses"
	Escribir "------------------------------------------"
	// Mostramos los meses cargados
	para i = 1 Hasta 12 Hacer
		Escribir i, "- ", meses[i]
	FinPara
	Escribir "------------------------------------------"
	// Cargamos el array de ventas
	Para i <- 1 Hasta 12 Hacer
		Escribir "Ingrese la venta del mes ", meses[i]
		ventaAnual[i]<-Azar(20)
		si ventaAnual[i] > mesMayor Entonces
			mesMayor = ventaAnual[i]
		FinSi
		si ventaAnual[i] < mesMenor Entonces
			mesMenor = ventaAnual[i]
		FinSi
		
		totalAnual = totalAnual + ventaAnual[i]
	FinPara 
	Escribir "------------------------------------------"
	// Mostramos los valores de los meses y lo que se vendio esos meses
	para i = 1 Hasta 12 Hacer
		Escribir "En ", meses[i], " se vendieron ",ventaAnual[i], " pesos."
	FinPara
	Escribir "------------------------------------------"
	// Comparamos las ventas con las variables auxiliares y las mostramos junto a los meses
	para i = 1 Hasta 12 Hacer
		si mesMayor=ventaAnual[i] Entonces
			Escribir "El mes con mayor ventas fue ", meses[i] ,", su venta fue de: ", mesMayor, " pesos."
		FinSi
		si mesMenor=ventaAnual[i] Entonces
			Escribir "EL mes con menor venta fue ", meses[i] ,", su venta fue de: ", mesMenor, " pesos."
		FinSi
	FinPara
	Escribir "**************************************************"
	promedioMensual = (totalAnual / 12)
	Escribir "El total anual es: ", totalAnual
	Escribir "El promedio mensual es de: ", promedioMensual
	Escribir "********************** FIN DE LA APLICACION ****************************"
FinAlgoritmo

