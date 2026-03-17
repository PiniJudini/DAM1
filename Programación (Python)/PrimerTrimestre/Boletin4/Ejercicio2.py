numero = int(input("Introduce un número: "))
for i in range(1,numero+1):
    if(numero%i==0):
        if(i!=numero):
            print(i,",",end=" ")
        else:
            print(i)