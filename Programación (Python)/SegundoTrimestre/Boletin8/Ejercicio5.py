from operator import concat

clientes = { "Chuletón, José": 35, "Tosidad, Rubén": 27, "Rupto, Francisco": 44, "Cotón, Carmelo": 56 }
nombre = input("Introduce el nombre: ")
apellido = input("Introduce el apellido: ")
edad = int(input("Introduce la edad: "))

apellido2 = concat(apellido, ", ")
nombreCompleto = concat(apellido2, nombre)

if nombreCompleto in clientes:
    print(nombre, apellido, "ya está en el diccionario de clientes")
else:
    clientes[nombreCompleto] = edad
    print(nombre, apellido + ".", edad, "años. Cliente agregado")
