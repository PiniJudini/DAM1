tupla1 = (1,4,2,5,49,3,75,3)
tupla2 = (2,2,75,180,9,5)
listaAux = []
for i in tupla1:
    for j in tupla2:
        contador = 0
        if i == j and contador <=0:
            listaAux.append(i)
            contador+=2
        else:
            print("Ya esta en la lista")
print(listaAux)