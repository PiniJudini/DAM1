let cadena = prompt("Introduce una cadena de texto")

let cadenalreves = ""
for(let i=cadena.length-1; i>=0; i--) {
    cadenalreves = cadenalreves + cadena.charAt(i)
}

document.writeln("La cadena introducida al revés es: " + cadenalreves)