texto = input("Ingrese una frase: ")
for i in range(len(texto), 0, -1):
    print(texto[i-1], end="")