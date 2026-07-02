# Este codigo ha sido generado por el modulo psexport 20230904-l64 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	# 1- Diseñar un algoritmo en pseint que trabaje en forma de calculadora ingrresando datos de tipo flotante.
	# 2- DIseñar el algoritmo del punto anterior en lenguaje python.
	# 3- Diseñar el algoritmo en lenguaje C.
	# 4- Explicar por bloque como funciona la calculadora.
	desicion = int()
	primernumero = float()
	segundonumero = float()
	sum = float()
	res = float()
	div = float()
	mult = float()
	eleccion = str()
	print("************************************************** INICIO DE LA APLICACIÓN **************************************************")
	print("------------------------------------------------- CALCULADORA -------------------------------------------------")
	print("Desea realizar una operación? [s/n]")
	eleccion = input()
	while (eleccion=="s"):
		
		print("Elija una de las siguientes operaciones: ")
		print("1- Suma.")
		print("2- Resta.")
		print("3- Multiplicacion.")
		print("4- División.")
		desicion = int(input())
		if desicion<1:
			print("Debe elegir una opcion entre 1 y 4")
		else:
			if desicion>4:
				print("Debe elegir una opcin entre 1 y 4")
			else:
				if desicion==1:
					print("Ingrese el primer numero a sumar:")
					primernumero = float(input())
					print("Ingrese el segundo numero a sumar: ")
					segundonumero = float(input())
					sum = primernumero+segundonumero
					print("La suma entre el número ",primernumero," y el número ",segundonumero," es: ",sum)
				if desicion==2:
					print("Ingrese el primer numero a restar:")
					primernumero = float(input())
					print("Ingrese el segundo numero a restar: ")
					segundonumero = float(input())
					res = primernumero-segundonumero
					print("La resta del número ",primernumero," al número ",segundonumero," es: ",res)
				if desicion==3:
					print("Ingrese el primer numero a multiplicar:")
					primernumero = float(input())
					print("Ingrese el segundo numero a multiplicar: ")
					segundonumero = float(input())
					mult = primernumero*segundonumero
					print("La multiplicación entre el número ",primernumero," y el número ",segundonumero," es: ",mult)
				if desicion==4:
					print("Ingrese el primer numero a dividir:")
					primernumero = float(input())
					print("Ingrese el segundo numero a dividir: ")
					segundonumero = float(input())
					if (primernumero==0) and (segundonumero==0):
						print("No se puede realizar la operacion de ",primernumero,"dividido ",segundonumero)
					else:
						if (segundonumero==0):
							print(" no existe un núero que multiplicado por 0 de ",primernumero)
						else:
							div = primernumero/segundonumero
							print("La divisin del número ",primernumero," al número ",segundonumero," es: ",div)
		print("-------------------------------------------------             -------------------------------------------------")
		print("Desea realizar una operación?")
		eleccion = input()
	print("************************************************** FIN DE LA APLICACIÓN **************************************************")

