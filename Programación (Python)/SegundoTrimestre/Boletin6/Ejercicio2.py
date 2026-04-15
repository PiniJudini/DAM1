numeros = []
numero = 1
contador = 0
suma = 0
while numero>0:
    numero = float(input("Ingrese un numero: "))
    if numero > 0:
        numeros.append(numero)
        contador += 1
        suma += numero
    else:
        print("Finalizando programa")

print("Los numeros que has introducido son: ", numeros)
operacion = suma/contador
print(operacion)