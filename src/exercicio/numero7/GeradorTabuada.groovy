package exercicio.numero7

/*
Escreva um programa que solicite ao usuário um número e exiba a tabuada desse número até 10.
 */

print "Digite um número inteiro: "
numero = Integer.parseInt(System.in.newReader().readLine())

println "Tabuada do $numero: "
for (int i = 1; i <= 10; i++){
    resultado = numero * i
    println "$numero X $i = $resultado"
}