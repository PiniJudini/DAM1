entradamala=bool
contador=0
entrada = input("Introduce un texto (FIN para terminar el programa): ")
while entrada!="FIN":
    entrada = input("Introduce un texto (FIN para terminar el programa): ")
    if entrada!="FIN":
        entradamala=True
        contador += 1
    else:
        entradamala=False
        print("Fin del programa")
if contador == 0:
    print("Has metido ", contador, " veces una entrada errónea")
else:
    print("Has metido ", contador + 1, " veces una entrada errónea")