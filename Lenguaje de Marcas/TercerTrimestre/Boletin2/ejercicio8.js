let numero = 1
let numero2 = 5
let numero3 = 3
let numero4 = 4

document.writeln("El mayor es: " + mayor(numero, numero2, numero3, numero4))

function mayor(numero, numero2, numero3, numero4) {
    let array = [numero, numero2, numero3, numero4]
    return Math.max(...array)
}