def limpiar_inventario(inventario):
    # Creamos el diccionario que vamos a devolver.
    diccionarioFinal = {}
    for i in inventario:
        # En cada iteración del bucle, creamos un diccionario que obtenga los valores de nombre y precio.
        diccionario = {i["nombre"]:i["precio"]}
        # Añadimos ese diccionario a nuestro diccionarioFinal con la clave i["id"] siendo el número del id
        # de cada diccionario del inventario.
        diccionarioFinal[i["id"]] = diccionario
    return diccionarioFinal

def filtrar_precio_entre(diccionarioFinal, minimo, maximo):
    # Creamos una lista que elimine las keys (id), porque son innecesarias para el ejercicio.
    lista1 = []
    for i in diccionarioFinal:
        # En cada iteración, añadimos el diccionario correspondiente a la lista.
        lista1.append(diccionarioFinal[i])

    # Creamos una segunda lista, que será la que almacenará las tuplas.
    lista2 = []
    # Creas un bucle de inspección de la primera lista.
    for i in lista1:
        # Creas un segundo bucle para inspeccionar cada valor i, que es un diccionario.
        for j in i:
            # Comparas el mínimo y máximo con i[j], que son los precios de los productos.
            if(i[j]>=minimo and i[j]<=maximo):
                # Cada iteración creamos una tupla que retenga los valores.
                tupla = (j,i[j])
                # Añades la tupla a la lista final.
                lista2.append(tupla)
    return lista2

print("Compresor de Diccionario V 1.2")
inventario = [
    {"id": 101, "nombre": "Laptop Pro 16", "precio": 1450.00, "stock": 5},
    {"id": 102, "nombre": "Ratón Inalámbrico", "precio": 25.99, "stock": 50},
    {"id": 103, "nombre": "Monitor 4K 27\"", "precio": 380.50, "stock": 12},
    {"id": 104, "nombre": "Smartphone Alpha", "precio": 899.00, "stock": 8},
    {"id": 105, "nombre": "Teclado Mecánico RGB", "precio": 120.00, "stock": 20},
    {"id": 106, "nombre": "Tarjeta Gráfica RTX", "precio": 650.00, "stock": 4},
    {"id": 107, "nombre": "Auriculares Noise Cancelling", "precio": 210.00, "stock": 15},
    {"id": 108, "nombre": "Servidor NAS", "precio": 520.00, "stock": 2}
]

print(limpiar_inventario(inventario))
diccionarioFinal = limpiar_inventario(inventario)
# Hacemos un try except para cuando no metamos valores, se ejecute el programa con los máximos y mínimos
# impuestos en el enunciado.
try:
    print(filtrar_precio_entre(diccionarioFinal, 2, 300))
except TypeError:
    print(filtrar_precio_entre(diccionarioFinal, 0, 8000))