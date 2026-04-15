lista = [0,0,0,0,0]
palabra = input("Ingrese una palabra: ")
for i in palabra:
    if i == "a":
        lista[0] += 1
    elif i == "e":
        lista[1] += 1
    elif i == "i":
        lista[2] += 1
    elif i == "o":
        lista[3] += 1
    elif i == "u":
        lista[4] += 1
print("La a aparece", lista[0], "veces.")
print("La e aparece", lista[1], "veces.")
print("La i aparece", lista[2], "veces.")
print("La o aparece", lista[3], "veces.")
print("La u aparece", lista[4], "veces.")