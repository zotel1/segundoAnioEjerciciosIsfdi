Algoritmo telescopioArreglado
	definir telescopio Como Entero
	telescopio = 0
	telescopioFundidos = 16
	Escribir "-------------------- INICIO DE LA APLICACIÓN --------------------"
	Escribir "Tenemos ", telescopioFundidos, " telescopios fundidos"
	Escribir "Vamos a arreglarlos uno por uno: "
	Escribir "--------------------------------------------------------------------"
	Mientras telescopio < 16 Hacer
		telescopio = telescopio + 1
		Escribir "Telescopios arreglados: " telescopio
		Escribir "Telescopios que faltan arreglar: ", (telescopioFundidos - telescopio)
		Escribir "--------------------------------------------------------------------"
	FinMientras
	
	si telescopio < 16 Entonces
		Escribir "Los telescopios estan rotos"
	SiNo
		Escribir "Los telescopios estan arreglados. Telescopios arreglados: " telescopio
	FinSi
	 Escribir "-------------------- FIN DE LA APLICACION --------------------"
	
FinAlgoritmo
