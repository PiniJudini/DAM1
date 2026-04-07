let array = []
for (let i=0; i<100; i++) {
    let numero = parseInt(Math.random()*1000-1+1)
    array[i] = numero
}

for(let i=0; i<array.length; i++) {
    if(array[i] >= 500)
        document.writeln(array[i])
}