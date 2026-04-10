const boton = document.getElementById("add-btn")
const texto = document.getElementById("guest-name")
const lista = document.getElementById("guest-list")
const parrafo = document.getElementById("error-msg")

boton.addEventListener('click', () => {
    var invitado = texto.value
    if(invitado.length < 3)
        parrafo.innerText = "Incorrecto"
    else {
        parrafo.innerText = ""
        texto.value = ""
        let elemento = document.createElement("li")
        let text = document.createTextNode(invitado)
        elemento.appendChild(text)

        let elemento2 = document.createElement("button")
        let texto2 = document.createTextNode("Eliminar")
        elemento2.appendChild(texto2)

        lista.appendChild(elemento)
        lista.appendChild(elemento2)

        let button = elemento2
        button.addEventListener("click", () => {
            button.remove()
            elemento.remove()
        })
    }
})