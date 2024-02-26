package exercicio.numero2

/*
Escreva um programa que solicite ao usuário um número e determine se é primo ou não.
*/

print "Digite um número inteiro positivo: "
int numero = Integer.parseInt(System.in.newReader().readLine())

ehPrimo = true

if (numero <=1 ) {
    ehPrimo = false
} else {
    for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) {
            ehPrimo = false
            break
        }
    }
}

if (ehPrimo){
    println "$numero é um número primo."
} else {
    println "$numero não é um número primo."
}