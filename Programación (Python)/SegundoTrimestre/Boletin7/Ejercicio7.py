tupla = (5,3,4,2,1)

lista = list(tupla)
lista2 = list(tupla)
lista.sort()

contador = 0
for i in range(0,len(lista)):
    if lista[i] != lista2[i]:
        contador += 1

lista = list(tupla)
lista.sort(reverse=True)

contador2 = 0
for i in range(0,len(lista)):
    if lista[i] != lista2[i]:
        contador2 += 1

if contador == 0:
    print("La tupla está ordenada ascendentemente")
elif contador2 == 0:
    print("La tupla está ordenada descendentemente")
else:
    print("La lista está desordenada")
