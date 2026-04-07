let lista = []
let cadena = ""
function añadirTarea() {
    cadena += "· " + prompt("Introduce la tarea que quieres añadir") + "\n"
    document.getElementById("parrafo").innerText = cadena
}