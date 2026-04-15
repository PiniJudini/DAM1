tupla1 = (1,4,2,5,49,3,75,3)
tupla2 = (3,3,75, 75, 180, 9, 5)
conjunto = set()
for i in tupla1:
    for j in tupla2:
        if i==j:
            conjunto.add(i)

conjunto = list(conjunto)
conjunto.sort()
tupla3 = tuple(conjunto)
print("Los elementos repetidos en ambas son:", tupla3)