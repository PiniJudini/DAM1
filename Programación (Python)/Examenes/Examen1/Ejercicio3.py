
numeros = []
palabra = ""
contador = 0
while palabra!="END":
    palabra = input("Introduce un número (END para terminar el programa): ")
    if (palabra.isdigit()==True):
        palabraint= int(palabra)
        if(palabraint>10):
            print("Error, has introducido un valor erroneo")
        else:
            contador +=1
            numeros.append(palabraint)

operacion = sum(numeros)/contador
print("Tu media de números es:", round(operacion,2))