frase = input("Ingrese una frase: ")
for i in frase:
    if(i=="a" or i=="e" or i=="i" or i=="o" or i=="u"):
        print("", end="")
    else:
        print(i, end="")