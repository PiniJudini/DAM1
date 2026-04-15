import random


def generarPrimo(numero):
    lista = set()
    contador = 1
    while len(lista) < numero:
        contadorPrimos = 0
        for i in range(2,contador):
            if contador % i == 0:
                contadorPrimos += 1
        if contadorPrimos == 0:
            lista.add(contador)
        contador += 1

    return lista

print(generarPrimo(5))