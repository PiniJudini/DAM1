numeroletra = input("Introduce un número (EXIT para salir del programa): ")
contador=0
lista = []
if(numeroletra!="EXIT"):
    if(numeroletra.isdigit()==True):
        numeroint=int(numeroletra)
        lista.append(numeroint)
        if(numeroint>=1 and numeroint<=50):
            contador +=1


else:
    print("Terminando programa...")
while numeroletra!="EXIT":
    numeroletra = input("Introduce un número (EXIT para salir del programa): ")
    if(numeroletra!="EXIT"):
        if(numeroletra.isdigit()==True):
            numeroint=int(numeroletra)
            lista.append(numeroint)
            if(numeroint>=1 and numeroint<=50):
                contador +=1
    else:
        print("Terminando programa...")
lista.sort()
print("Has metido", contador, "numeros entre el 1 y el 50")
print("El mayor número es:", lista[len(lista)-1])
print("El menor número es:", lista[0])