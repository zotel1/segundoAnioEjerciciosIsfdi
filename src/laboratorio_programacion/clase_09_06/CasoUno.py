
if __name__ == '__main__':

    nota = int(input(f"Ingrese calificación del examen (1-10): "))

    if (nota >= 8) :
        print("Promocionado")
    elif (nota >= 6) :
            print("Regular")
    else :
         print("Desaprobado / Recuperatorio")
