frase = input("Ingrese una frase: ")
fraseimpares = ""
frasepares = ""
for i in range(0,len(frase)):
    if(i%2==0):
        frasepares += frase[i]
    else:
        fraseimpares += frase[i]
print(frasepares, end=" ")
print(fraseimpares)
