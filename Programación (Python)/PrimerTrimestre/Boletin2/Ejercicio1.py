numero1 = int(input("Introduce un número: "))
numero2 = int(input("Introduce otro número: "))
numero3 = int(input("Introduce el último número: "))
lista = [numero1, numero2, numero3]
lista.sort(reverse=True)
print(lista)