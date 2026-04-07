let tamaño = window.innerWidth
const imagen = document.getElementById("imagen").width
function aumentarTamaño() {
    let doble = document.getElementById("imagen").width*2
    if(doble < tamaño) {
        document.getElementById("imagen").style.width = doble + "px"
    }
}

function disminuirTamaño() {
    document.getElementById("imagen").style.width = imagen + "px"
}