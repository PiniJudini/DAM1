frase = input("Ingrese una frase: ")
contador = 1
for i in range (0,len(frase)):
    if (frase[i] == " "):
        contador += 1
        print("", end="")
    elif (i != len(frase)-1):
        print(frase[i], end="")
    else:
        print(frase[i])
print("He tenido que eliminar", contador, "espacios")