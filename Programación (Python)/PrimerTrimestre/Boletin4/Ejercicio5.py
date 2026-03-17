numeroletra = input("Introduce un número (EXIT para salir del programa): ")
contador=0
if(numeroletra!="EXIT"):
    if(numeroletra.isdigit()==True):
        numeroint=int(numeroletra)
        if(numeroint>=1 and numeroint<=50):
            contador +=1


else:
    print("Terminando programa...")
while numeroletra!="EXIT":
    numeroletra = input("Introduce un número (EXIT para salir del programa): ")
    if(numeroletra!="EXIT"):
        if(numeroletra.isdigit()==True):
            numeroint=int(numeroletra)
            if(numeroint>=1 and numeroint<=50):
                contador +=1
    else:
        print("Terminando programa...")
print("Has metido", contador, "numeros entre el 1 y el 50")