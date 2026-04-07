let contador = 0
let array = []
let textos = []

function cambiarVisibilidad() {
    if(contador == 4 || contador == 0) {
    contador = 0
    let set = new Set()
        while (set.size < 3) {
        let numero = parseInt(Math.random()*(3-1+1)+1)
        set.add(numero)
    }
        
    array = [...set]
    textos = [document.getElementById("par1"), document.getElementById("par2"), document.getElementById("par3")]
    document.getElementById("par1").style.visibility = "visible"
    document.getElementById("par2").style.visibility = "visible"
    document.getElementById("par3").style.visibility = "visible"
}
    if(contador == 1)
        textos[array[0]-1].style.visibility = "hidden"
    else if (contador == 2)
        textos[array[1]-1].style.visibility = "hidden"
    else if(contador == 3)
        textos[array[2]-1].style.visibility = "hidden"

    contador+=1
}