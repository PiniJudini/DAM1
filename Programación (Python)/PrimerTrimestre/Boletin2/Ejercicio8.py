contraseña1 = input("Introduce una contraseña: ")
contraseña2 = input("Introduce de nuevo la contraseña: ")
while contraseña1 != contraseña2:
    contraseña1 = input("Introduce una contraseña: ")
    contraseña2 = input("Introduce de nuevo la contraseña: ")
    if(contraseña1!=contraseña2):
        print("ERROR 1033. Eres retrasado =)")
    else:
        print("Cerrando programa...")