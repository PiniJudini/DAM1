lista = [0,0,0,0,0]
palabra = input("Ingrese una palabra: ")
palabra = palabra.lower()
for i in palabra:
    if i == "a" or i=="á":
        lista[0] += 1
    elif i == "e" or i=="é":
        lista[1] += 1
    elif i == "i" or i=="í":
        lista[2] += 1
    elif i == "o" or i=="ó":
        lista[3] += 1
    elif i == "u" or i=="ú":
        lista[4] += 1
print("La a aparece", lista[0], "veces.")
print("La e aparece", lista[1], "veces.")
print("La i aparece", lista[2], "veces.")
print("La o aparece", lista[3], "veces.")
print("La u aparece", lista[4], "veces.")