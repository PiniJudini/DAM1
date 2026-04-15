numeros = [42,74,34,42,51]
numero = 0
try:
    numero = int(input("Ingrese un numero para eliminar del array: "))
except ValueError:
    print("Solo trabajo con números enteros.")
else:
    contador = 0
    for i in numeros:
        if numero == i:
            contador += 1

    for i in range (0,contador):
        numeros.remove(numero)

    print(numeros)