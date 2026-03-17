# Para poner datos variables he decidido que reciba una lista.
def analizar_lecturas(lista):
    listaSuma = []
    contadorPromedio = 0
    contador = 0

    # El try que coge la excepción SensorError (la inventada)
    try:
        for i in lista:
            # El try que coge la excepción value error. Si falla el traspaso de int(i), soltará la
            # excepción ValueError que nos interesa.
            try:
                listaSuma.append(int(i))
                contadorPromedio +=1
                # Si el valor de la lista es mayor a 100, sumamos al contador.
                if i >=100:
                    contador += 1
            except ValueError:
                print("Dato omitido: tipo no valido")
                pass
        # Si el contador es mayor a dos salta la excepción SensorError.
        if(contador > 2):
            raise Exception ("SensorError")
    except Exception:
        print("SensorError")
    finally:
        # A través de la lista de los números obtenemos las operaciones máximo, mínimo, suma y promedio
        # Como hay que devolver un diccionario necesariamente, ponemos el return y las operaciones en el finally porque siempre
        # se va a ejecutar esta parte del código.
        suma = calcularSuma(listaSuma)
        print("La suma de las temperaturas registradas ha sido:", suma)
        print("El promedio de temperatura es:", calcularPromedio(suma,contadorPromedio), "ºC")
        print("El máximo de las temperaturas ha sido:", calcularMaximo(listaSuma), "ºC")
        print("El mínimo de las temperaturas ha sido:", calcularMinimo(listaSuma), "ºC")

        #Creamos el diccionario que devolveremos en la función y le asignamos las claves con sus valores.   
        diccionario = {"suma":suma, "promedio":calcularPromedio(suma,contadorPromedio), "maximo":calcularMaximo(listaSuma), "minimo":calcularMinimo(listaSuma)}
        print("Cierre de conexión con el sensor")
        return diccionario

# La función de operación de la suma
def calcularSuma(lista):
    suma = 0
    for i in lista:
        suma += i
    return suma

# La función de operación del promedio
def calcularPromedio(suma, contador):
    promedio = suma/contador
    return round(promedio,2)

# La función de operación del máximo
def calcularMaximo(lista):
    return max(lista)

# La función de operación del mínimo
def calcularMinimo(lista):
    return min(lista)

# Creación de la lista para añadir los valores que queremos en la función
lista = [33, 80, "error", 690]
try:
    # Si la lista está vacía, significa que no hay valores que recibe la función, por lo que
    # hacemos un raise de dicha excepción.
    if len(lista) == 0:
        raise TypeError
    else:
        print(analizar_lecturas(lista))
except TypeError:
    # Si la lista no recibe ningún valor, significa que no hay registros de temperatura. Por tanto
    # creamos una lista con un único 0.
    lista = [0]
    print(analizar_lecturas(lista))