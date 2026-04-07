const caracteres = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;:,.<>?¿¡€¥£§©®†‡∞≈≠≤≥✓✗★☆♠♣♥♦♪♫☠👻🎃💀😵‍💫';
    
    // Obtener elementos
    const titular = document.getElementById('titulo');
    const parrafo = document.getElementById('parrafo');
    
    // Variable para controlar velocidad de escritura
    let puedeEscribir = true;
    
    // Función para obtener caracter aleatorio
    function caracterAleatorio() {
        return caracteres[Math.floor(Math.random() * caracteres.length)];
    }
    
    // Función para escribir un caracter
    function escribirCaracter() {
        if (puedeEscribir) {
            puedeEscribir = false;
            
            // Añadir caracter aleatorio al párrafo
            parrafo.textContent += caracterAleatorio();
            
            // Esperar antes de permitir otro caracter (velocidad de escritura)
            setTimeout(() => {
                puedeEscribir = true;
            }, 50);
        }
    }
    
    // Evento: al mover ratón sobre el titular
    titular.addEventListener('mouseenter', escribirCaracter());s