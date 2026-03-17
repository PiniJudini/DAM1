palabra = input("Dime una palabra: ")
for i in palabra:
    if (i=="a"):
        print("4", end="")
    elif (i=="e"):
        print("3", end="")
    elif (i=="i"):
        print("1", end="")
    elif (i=="o"):
        print("0", end="")
    else:
        print(i, end="")