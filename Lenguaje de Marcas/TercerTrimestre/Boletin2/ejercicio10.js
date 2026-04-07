function sinvocales(cadena) {
    let cadenaterminada = ""
    for(let i=0; i<cadena.length; i++) {
        if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u')
            cadenaterminada += ""
        else
            cadenaterminada += cadena.charAt(i)
    }

    return cadenaterminada
}

document.writeln("La cadena sin vocales es: " + sinvocales("Hola Mundo"))