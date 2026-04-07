function generarNumero() {
    var parrafo = document.getElementById("parrafo")
    let numero = parseInt(Math.random()*(100-1+1)+1)
    document.writeln(parrafo.innerText + "<br>")
    document.writeln(numero)
}