nota1 = float(input("Introduce el primer nota: "))
nota2 = float(input("Introduce el segundo nota: "))
nota3 = float(input("Introduce el tercer nota: "))
notaponderada1 = nota1*0.1
notaponderada2 = nota2*0.2
notaponderada3 = nota3*0.7
notafinal = notaponderada1+notaponderada2+notaponderada3
notaredondeada = (int(round(notafinal)))
print("Tu nota final es un: ", notaredondeada)