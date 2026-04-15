def verDuplicados(lista):
    lista2 = set()
    lista = list(lista)
    for i in lista:
        if(lista.count(i) > 1):
            lista2.add(i)
    for i in lista2:
        print("El elemento",i,"está repetido", lista.count(i),"veces")
lista = (20,"Elefante",7,True,"Pantera","Elefante",False,7,7)
verDuplicados(lista)