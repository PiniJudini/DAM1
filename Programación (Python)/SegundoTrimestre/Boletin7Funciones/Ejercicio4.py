def esCapicua(numero):
    contador = 0
    lista1 = []
    lista2 = []
    numero = str(numero)
    for i in numero:
        lista1.append(i)
    for i in range (len(lista1)-1,-1,-1):
        lista2.append(lista1[i])

    for i in range(len(lista1)):
        if lista1[i] != lista2[i]:
            contador += 1
    if contador == 0:
        print("El numero es capicua")
    else:
        print("El numero no es capicua")
numero = 334
esCapicua(numero)