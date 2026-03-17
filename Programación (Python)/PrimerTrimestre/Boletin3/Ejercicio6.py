from curses.ascii import isdigit, isalpha
dni = input("Ingrese un DNI: ")
if(len(dni)==9):
    numDNI = dni[0:len(dni)-1]
    letraDNI = dni[len(dni)-1]
    if(numDNI.isdigit()==True):
        if(letraDNI.isalpha()==True):
            print("Formato correcto")
        else:
            print("Formato incorrecto")
else:
    print("ERROR 1033. Eres retrasado =)")