palabra1 = input("Introduce una palabra: ")
palabra2 = input("Introduce otra palabra: ")
lista1 = []
lista2 = []

for i in palabra1:
    lista1.append(i)
for i in palabra2:
    lista2.append(i)

lista1.sort()
lista2.sort()

if len(palabra1) == len(palabra2):
    contador = 0
    for i in palabra1:
        if i not in palabra2:
            contador += 1
    if contador == 0:
        print("La palabra introducida es un anagrama")