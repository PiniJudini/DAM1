function alternarTexto() {
            // Obtener el elemento por su ID
            var parrafo = document.getElementById("miParrafo");
            
            // Comprobar el texto actual y cambiarlo
            if (parrafo.innerText == "Abierto") {
                parrafo.innerText = "Cerrado";
            } else {
                parrafo.innerText = "Abierto";
            }
        }