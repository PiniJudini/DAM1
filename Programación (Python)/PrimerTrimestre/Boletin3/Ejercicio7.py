dni = input("Ingrese un DNI: ")
numDNI = dni[0:len(dni) - 1]
letraDNI = dni[len(dni) - 1]
letraCIF = dni[0]
numCIF = dni[1:len(dni) - 1]
numNIE = dni[1:len(dni)-2]
letra1NIE = dni[0]
letra2NIE = dni[len(dni)-1]
if(len(dni)==9):
    if(numDNI.isdigit()==True):
        if(letraDNI.isalpha()==True):
            print("Es un DNI")
        else:
            print("Formato incorrecto")
    elif(letraCIF.isalpha()==True):
        if(numCIF.isdigit()==True and letra2NIE.isalpha()==False):
            print("Es un CIF")
        elif(letra1NIE=="X" or letra1NIE=="Y" or letra2NIE=="Z"):
            if(letra2NIE.isalpha()==True):
                if(numNIE.isdigit()==True):
                    print("Es un NIE")
                else:
                    print("Formato NIE incorrecto")
    else:
        print("No es ningún formato")
else:
    print("ERROR 1033. Eres retrasado =)")