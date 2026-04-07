function importepormes(importe, meses) {
    let operacion = importe/meses
    operacion = Math.round(operacion*100)/100
    return operacion
}

document.writeln("El importe por mes es: " + importepormes(1200, 7))