package exercicio.numero6

/*
Escreva um programa que solicite ao usuário um número e determine se é par ou ímpar.
 */

print "Digite um número inteiro positivo: "
numero = Integer.parseInt(System.in.newReader().readLine())

if (numero % 2 == 0) {
    println "$numero é um número par."
} else {
    println "$numero é um número ímpar."
}