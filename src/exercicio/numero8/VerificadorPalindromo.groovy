package exercicio.numero8

/*
 Escreva um programa que solicite ao usuário uma palavra e determine se é um palíndromo (ou seja, se pode ser lida da mesma forma da esquerda para a direita e da direita para a esquerda).
 */

void verificaPalindromo () {

    print "Digite uma palavra: "
    palavra = System.in.newReader().readLine()

    palavraSemEspacos = palavra.replaceAll("\\s+", "").toLowerCase()

    palindromo = true
    i = 0
    j = palavraSemEspacos.length() - 1

    while (i < j) {
        if (palavraSemEspacos[i++] != palavraSemEspacos[j--]) {
            palindromo = false
            break
        }
    }

    if (palindromo) {
        println "$palavra é um palíndromo."
    } else {
        println "$palavra não é um palíndromo."
    }
}

verificaPalindromo()