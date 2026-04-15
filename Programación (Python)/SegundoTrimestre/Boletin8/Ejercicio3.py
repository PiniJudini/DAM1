diccionario = {}
entrada = ""
cobro = 0
recaudacion = 0
while entrada != "T":
    print("Recaudado:", recaudacion)
    print("Pendiente de cobro", cobro)
    entrada = input("¿Quieres añadir una nueva factura (A), pagarla(P) o terminar (T)? ")
    if entrada == "A":
        numero = int(input("Introduce el número de la factura a pagar: "))
        if numero not in diccionario:
            numero2 = float(input("Introduce el coste de la factura: "))
            diccionario[numero] = numero2
            cobro += numero2
        else:
            print("Ya existe esa factura")
    elif entrada == "P":
        numero = int(input("Introduce el número de la factura a pagar: "))
        if numero not in diccionario:
            print("No existe esa factura")
        else:
            recaudacion += diccionario[numero]
            cobro -= diccionario[numero]
            diccionario.pop(numero)
    elif entrada == "T":
        print("Fin del programa")
    print("")