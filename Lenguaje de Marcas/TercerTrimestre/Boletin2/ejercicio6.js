let array = []
for (let i=0; i<100; i++) {
    let numero = parseInt(Math.random()*1000-1+1)
    array[i] = numero
}

let mayor = 0
array.sort()
for(let i=0; i<array.length-1; i++) {
    if(array[i+1] >= array[i])
        mayor = array[i+1]
}

document.writeln("Mayor: " + mayor + "<br>")
document.writeln("Menor: " + array[0])