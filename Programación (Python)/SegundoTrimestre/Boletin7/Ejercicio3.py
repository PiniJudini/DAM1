tupla1 = (1,4,2,5,49,3,75,3)
tupla2 = (3,3,75, 75, 180, 9, 5)
tupla3 = (9,3,71,75,2,9)
conjunto = set()
for i in tupla1:
    if i not in tupla2 and i not in tupla3:
        conjunto.add(i)
for i in tupla2:
    if i not in tupla1 and i not in tupla3:
        conjunto.add(i)
for i in tupla3:
    if i not in tupla1 and i not in tupla2:
        conjunto.add(i)

conjunto = list(conjunto)
conjunto.reverse()
tupla4 = tuple(conjunto)
print("Los elementos que solo aparecen en una son:", tupla4)