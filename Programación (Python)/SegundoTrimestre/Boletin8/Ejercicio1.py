diccionario = {"Aguacate": 4.35, "Mandarina": 2.60, "Kiwi": 3.75, "Naranja": 1.80}
palabra = input("¿Qué fruta quieres comprar? ")
contador = 0
for i in diccionario:
    if palabra == i:
        contador += 1

if contador == 0:
    print("Lo siento mucho pero no vendemos esa fruta")
else:
    try:
        kilos = float(input("¿Cuantos kilos quieres? "))
    except ValueError:
        print("No has introducido bien la cantidad que quieres ")
    else:
        total = kilos * diccionario[palabra]
        print(kilos, "de Mandarina cuestan", total, "€")