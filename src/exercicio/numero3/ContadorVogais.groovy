package exercicio.numero3

/*
Escreva um programa que solicite ao usuário uma frase e conte o número de vogais (a, e, i, o, u) nela.
 */

print "Digite uma frase: "
frase = System.in.newReader().readLine()

contadorVogais = 0

vogais = ['a', 'e', 'i', 'o', 'u']

frase.each {caractere ->
    if (caractere.toLowerCase() in vogais){
        contadorVogais++
    }
}

println "Número de vogais na frase: $contadorVogais"