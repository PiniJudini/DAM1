import random
primo = False
while primo==False:
    numero = random.randint(5000000, 20000000)
    primo = True
    for i in range (2,int((numero**0.5))):
        if numero%i==0:
            primo = False
if (primo == True):
    print("Tu número primo es: ", numero)