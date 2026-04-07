let suma = 0
function generarNuevo() {
    let numero = parseInt(Math.random()*(10-1+1)+1)
    suma+=numero
    document.getElementById("numero").innerText = suma

    if(suma >=500) {
        document.getElementById("numero").innerText = 0
        suma = 0
    }
}