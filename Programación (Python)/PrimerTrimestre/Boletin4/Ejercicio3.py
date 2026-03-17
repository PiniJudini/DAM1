import random

numeroRandom = random.randint(0,50)
numero = int(input("Dime un número: "))
if(numero>numeroRandom):
    print("Te has pasado animal")
elif(numero<numeroRandom):
    print("Te has quedado corto, como la pichula de Adrián")
else:
    print("Has acertado!!")
while (numeroRandom!=numero):
    numero = int(input("Dime un número: "))
    if(numero>numeroRandom):
        print("Te has pasado animal")
    elif(numero<numeroRandom):
        print("Te has quedado corto, como la pichula de Adrián")
    else:
        print("Has acertado!!")