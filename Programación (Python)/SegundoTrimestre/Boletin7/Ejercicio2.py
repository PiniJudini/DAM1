tupla1 = (1,4,2,5,49,3,75,3)
tupla2 = (3,3,75, 75, 180, 9, 5)
conjunto = set()
for i in tupla1:
    if i not in tupla2:
        conjunto.add(i)
for i in tupla2:
    if i not in tupla1:
        conjunto.add(i)

conjunto = list(conjunto)
conjunto.reverse()
tupla3 = tuple(conjunto)
print("Los elementos que solo aparecen en una son:", tupla3)