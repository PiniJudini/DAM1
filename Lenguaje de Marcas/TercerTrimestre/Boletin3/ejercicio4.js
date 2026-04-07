function barajar() {
    var par1 = document.getElementById("par1").innerText
    var par2 = document.getElementById("par2").innerText
    var par3 = document.getElementById("par3").innerText
    var par4 = document.getElementById("par4").innerText

    let set = new Set()
    while(set.size < 4) {
        let numero = parseInt(Math.random()*(4)+1)
        set.add(numero)
    }

    let textos = []
    let array = [...set]

    textos[array[2]-1] = par1
    textos[array[0]-1] = par2
    textos[array[1]-1] = par3
    textos[array[3]-1] = par4
    
    document.getElementById("par1").innerText = textos[0]
    document.getElementById("par2").innerText = textos[1]
    document.getElementById("par3").innerText = textos[2]
    document.getElementById("par4").innerText = textos[3]
}