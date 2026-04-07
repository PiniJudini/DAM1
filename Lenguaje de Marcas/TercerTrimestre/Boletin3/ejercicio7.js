function generarNuevo() {
    let numero = parseInt(Math.random()*(10-1+1)+1)
    document.getElementById("numero").innerText = numero
}

function elevar() {
    let numero = parseInt(document.getElementById("numero").innerText)
    numero = numero**2 + 1
    document.getElementById("numero").innerText = numero
}