let numero = prompt("Introduce un número: ")
let primo = true
for(let i=2; i<numero; i++) {
    if(numero%i==0)
        primo = false
}

if(primo == true)
    document.writeln("El número es primo")
else
    document.writeln("El número no es primo")