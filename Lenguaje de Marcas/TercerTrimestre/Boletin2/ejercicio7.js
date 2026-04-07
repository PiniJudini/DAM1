let numero = 1
let numero2 = 5
let numero3 = 3
let numero4 = 4

document.writeln("El menor es: " + menor(numero, numero2, numero3, numero4))

function menor(numero, numero2, numero3, numero4) {
    let array = [numero, numero2, numero3, numero4]
    return Math.min(...array)
}