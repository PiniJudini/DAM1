def invitadosBuenos(lista):
    mitad = int(len(lista)/2)+1
    for i in range(mitad, len(lista)-2):
        print(lista[i])

lista = ('Jorge', 'Alba', 'Nadia', 'Héctor', 'Óscar','Carlos','Eustaquio', 'Ricardo', 'Kevin')
invitadosBuenos(lista)