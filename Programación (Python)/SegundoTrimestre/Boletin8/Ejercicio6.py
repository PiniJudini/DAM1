from operator import concat

clientes = { "Chuletón, José": 35, "Tosidad, Rubén": 27, "Rupto, Francisco": 44, "Cotón, Carmelo": 56 }
nombre = input("Introduce el nombre: ")
apellido = input("Introduce el apellido: ")

apellido2 = concat(apellido, ", ")
nombreCompleto = concat(apellido2, nombre)

if nombreCompleto in clientes:
    clientes[nombreCompleto] += 1
    print("Felicidades por tu", clientes[nombreCompleto], "cumpleaños",
          nombre + ". Edad actualizada en el diccionario")
else:
    print(nombre, apellido, "no es un cliente nuestro. Feliz cumpleaños en cualquier caso!")