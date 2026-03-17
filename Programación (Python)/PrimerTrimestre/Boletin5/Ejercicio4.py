numero = 0
while (numero>12 or numero<=0):
    numero = int(input("Introduce un mes: "))

lista = [31,28,31,30,31,30,31,31,30,31,30,31]
meses = ["Enero","Febero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"]
año = int(input("Introduce un año: "))
if(año%4==0):
    lista[1]=29

for i in range (0,13):
    if(numero==i):
        print("El mes",meses[i-1] ,"tiene",lista[i-1], "dias")
