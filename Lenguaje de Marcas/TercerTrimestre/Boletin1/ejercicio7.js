let numero = prompt("Introduce un número: ")
let operacion = numero*1.21
operacion = Math.round(operacion*100)/100
document.writeln("El precio con IVA es: " + operacion)