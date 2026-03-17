import random

numero = 0
repetido = True
lista = []
contador = 0
while contador < 6:
    numero = random.randint(1,49)
    print(numero)
    for i in range (0,6):
        if numero in lista:
            repetido = True
        else:
            contador+=1
            lista.append(numero)
print(lista)