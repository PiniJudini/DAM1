let cadena = prompt("Introduce una cadena de texto")

let cadena1 = ""
let cadena2 = ""
for(let i=0; i<cadena.length; i++) {
    if(i%2==0)
        cadena1 = cadena1 + cadena.charAt(i)
    else
        cadena2 = cadena2 + cadena.charAt(i)
}

document.writeln("Tu cadena dividida es: " + cadena1 + cadena2)
