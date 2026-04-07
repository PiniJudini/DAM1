let cadena = prompt("Introduce una cadena de texto")

let cadenaterminada = ""
for(let i=0; i<cadena.length; i++) {
    if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'A')
        cadenaterminada += "4"
    else if(cadena.charAt(i) == 'e' || cadena.charAt(i) == 'E')
        cadenaterminada += "3"
    else if(cadena.charAt(i) == 'i' || cadena.charAt(i) == 'I')
        cadenaterminada += "1"
    else if(cadena.charAt(i) == 'o' || cadena.charAt(i) == 'O')
        cadenaterminada += "0"
    else
        cadenaterminada += cadena.charAt(i)
}

document.writeln("Tu cadena encriptada es: " + cadenaterminada)