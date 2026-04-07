let cadena = prompt("Introduce una cadena de texto")
let contador = 0
let cadenasinespacios = ""
for(let i=0; i<cadena.length; i++) {
    if(cadena.charAt(i) == ' ')
        contador+=1
    else
        cadenasinespacios = cadenasinespacios + cadena.charAt(i)
}

document.writeln("Tu cadena sin espacios es: " + cadenasinespacios + "<br>")
document.writeln("He eliminado " + contador + " espacios.")