tupla = (7,5,3,1,2)
numero = ""
for i in range(len(tupla)-1,-1,-1):
    numero += str(tupla[i])
numero = int(numero)
print(numero)