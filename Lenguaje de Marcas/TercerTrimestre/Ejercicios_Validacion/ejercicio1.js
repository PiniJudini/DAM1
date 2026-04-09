const inputEdad = document.getElementById("edad")
const inputNombre = document.getElementById("nombre")

function validar() {
    if(comprobarNombre() == true && comprobarEdad() == true)
        return true
    else {
        alert("Datos incorrectos")
        return false
    }
}

function comprobarEdad() {
    let numero = parseInt(inputEdad.value)
    if(numero < 18) {
        return false
    } else
        return true
}

function comprobarNombre() {
    let lista = inputNombre.value.split(" ")
    if(lista[0].length < 2 && lista[1].length < 10)
        return false
    else
        return true;
}