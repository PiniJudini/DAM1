clientes = { "Chuletón, José": 35, "Tosidad, Rubén": 27, "Rupto, Francisco": 44, "Cotón, Carmelo": 56 }
nombre = []
apellidos = []
edad = []
for i in clientes:
    apellidos.append(i.split(", ")[0])
    nombre.append(i.split(", ")[-1])
    edad.append(clientes[i])

for i in range(0, len(apellidos)):
    edadPrint = "(" + str(edad[i]) + ")"
    print(nombre[i],apellidos[i], edadPrint)