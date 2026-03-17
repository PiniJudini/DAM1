palabra = input("Introduce la palabra que quieres cifrar: ")
clave = ""

while clave.isdigit()==False:
    clave = input("Introduce la clave de cifrado:")

palabramin = palabra.lower()
palabramay= palabra.upper()
palabraclave = ""

for i in range (len(palabra),0,-1):
    if(palabramin[i-1]=="a" or palabramin[i-1]=="e" or palabramin[i-1]=="i" or palabramin[i-1]=="o" or palabramin[i-1]=="u"):
        palabraclave += clave
    else:
        palabraclave += palabra[i-1]
print(palabraclave)

if(int(clave)%2==0):
    palabraclave = palabraclave.upper()
else:
    palabraclave = palabraclave.lower()
print(palabraclave)